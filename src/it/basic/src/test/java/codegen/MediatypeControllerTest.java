package codegen;

import static codegen.HttpResponseAssertions.assert200;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import codegen.model.InlineResponse2001;
import codegen.model.InlineResponse2002;
import codegen.model.InlineResponse2003;
import codegen.model.MediaModel;
import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpMethod;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.MediaType;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

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
	public void mediatypeMultipleContentTypesDifferentModel200() {
		var response = client.mediatypeMultipleContentTypesDifferentModel(false);
		assertEquals(MediaType.APPLICATION_JSON_TYPE, response.getContentType().orElse(null), "type");
		assertEquals(new MediaModel().setData("json"), response.getBody(MediaModel.class).orElse(null), "body");
	}

	@Test
	public void mediatypeMultipleContentTypesDifferentModel200Plain() {
		var response = client.mediatypeMultipleContentTypesDifferentModel(true);
		assertEquals(MediaType.TEXT_PLAIN_TYPE, response.getContentType().orElse(null), "type");
		assertEquals("plain", response.getBody(String.class).orElse(null), "body");
	}

	@Test
	@Override
	public void mediatypeMultipleContentTypesSameModel200() {
		var request = HttpRequest
				.GET("/mediatype/multiple-contenttypes-with-same-model")
				.accept(MediaType.APPLICATION_JSON);
		var response = HttpResponseAssertions
				.assert200(() -> rawClient.toBlocking().exchange(request, MediaModel.class));
		assertEquals(MediaType.APPLICATION_JSON, response.header(HttpHeaders.CONTENT_TYPE));
		assertEquals(new MediaModel().setData("test"), response.body());
	}

	@Test
	public void mediatypeMultipleContentTypesSameModel200Xml() {
		var request = HttpRequest
				.GET("/mediatype/multiple-contenttypes-with-same-model")
				.accept(MediaType.APPLICATION_XML);
		var response = HttpResponseAssertions
				.assert200(() -> rawClient.toBlocking().exchange(request, MediaModel.class));
		assertEquals(MediaType.APPLICATION_XML, response.header(HttpHeaders.CONTENT_TYPE));
		assertEquals(new MediaModel().setData("test"), response.body());
	}
}
