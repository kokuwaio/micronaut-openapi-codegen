package codegen;

import static codegen.HttpResponseAssertions.assert200;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import codegen.model.InlineResponse2001;
import codegen.model.InlineResponse2002;
import codegen.model.InlineResponse2003;
import codegen.model.InlineResponse2004;
import io.micronaut.http.HttpMethod;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.MediaType;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.test.annotation.MicronautTest;

@MicronautTest
public class MediatypeControllerTest implements MediatypeApiTestSpec {

	@Inject
	MediatypeApiTestClient client;
	@Inject
	@Client("/")
	HttpClient rawClient;

	@Test
	@Override
	public void mediatypePostPlain200() {
		var string = UUID.randomUUID().toString();
		var response = assert200(() -> client.mediatypePostPlain(string)).body();
		assertEquals(new InlineResponse2001().setString(string), response);
	}

	@Test
	@Override
	public void mediatypePostOctetStream200() {
		var bytes = UUID.randomUUID().toString().getBytes();
		var response = assert200(() -> client.mediatypePostOctetStream(bytes)).body();
		assertEquals(new InlineResponse2002().setBinary(bytes), response);
	}

	@Test
	@Override
	public void mediatypePostMultipart200() {
		var expected = new InlineResponse2003()
				.setOrderId(123)
				.setUserId(456)
				.setFileName("test.txt")
				.setFile("test-data".getBytes());
		var request = HttpRequest.create(HttpMethod.POST, "/mediatype/post-multipart")
				.contentType(MediaType.MULTIPART_FORM_DATA)
				.body(MultipartBody.builder()
						.addPart("orderId", String.valueOf(expected.getOrderId()))
						.addPart("userId", String.valueOf(expected.getUserId()))
						.addPart("fileName", expected.getFileName(), expected.getFile())
						.build());
		var actual = assert200(() -> rawClient.toBlocking().exchange(request, InlineResponse2003.class)).body();
		assertEquals(expected, actual);
	}

	@Test
	@Override
	public void mediatypeMultipleContentTypes200() {
		var response = client.mediatypeMultipleContentTypes(false);
		assertEquals(MediaType.APPLICATION_JSON_TYPE, response.getContentType().orElse(null), "type");
		assertEquals(new InlineResponse2004().setValue("json"),
				response.getBody(InlineResponse2004.class).orElse(null), "body");
	}

	@Test
	public void mediatypeMultipleContentTypes200Plain() {
		var response = client.mediatypeMultipleContentTypes(true);
		assertEquals(MediaType.TEXT_PLAIN_TYPE, response.getContentType().orElse(null), "type");
		assertEquals("plain", response.getBody(String.class).orElse(null), "body");
	}
}
