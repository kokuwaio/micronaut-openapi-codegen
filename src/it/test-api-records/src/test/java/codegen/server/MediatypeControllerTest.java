package codegen.server;

import static codegen.HttpResponseAssertions.assert200;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;
import java.util.UUID;

import org.junit.jupiter.api.Test;

import codegen.Multipart;
import codegen.StringModel;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.MediaType;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;

@MicronautTest
public class MediatypeControllerTest implements MediatypeApiTestSpec {

	private final String STRING = UUID.randomUUID().toString();
	private final byte[] BYTES = STRING.getBytes();

	@Inject
	MediatypeApiTestClient client;
	@Inject
	@Client("/")
	HttpClient rawClient;

	@Test
	@Override
	public void mediatypeConsumesAndProduces200() {
		var expected = new StringModel(STRING);
		assertEquals(expected, assert200(() -> client.mediatypeConsumesAndProduces(BYTES)).body());
		var response = assert200(() -> rawClient.toBlocking().exchange(HttpRequest
				.POST(MediatypeApi.PATH_MEDIATYPE_CONSUMES_AND_PRODUCES, BYTES)
				.contentType(MediaType.APPLICATION_OCTET_STREAM)
				.accept(MediaType.APPLICATION_XML), StringModel.class));
		assertEquals(MediaType.APPLICATION_XML_TYPE, response.getContentType().get(), "content");
		assertEquals(expected, response.body(), "body");
		assertEquals("<StringModel>\n  <foo>" + STRING + "</foo>\n</StringModel>\n",
				response.getBody(String.class).get(), "raw");
	}

	@Test
	@Override
	public void mediatypeConsumesMultipartWithFileUpload200() {
		var expected = new Multipart(1, 2, "uuid.txt", BYTES);
		var body = MultipartBody.builder()
				.addPart("orderId", String.valueOf(expected.orderId()))
				.addPart("userId", String.valueOf(expected.userId()))
				.addPart("file", expected.fileName(), BYTES)
				.build();
		var actual = assert200(() -> client.mediatypeConsumesMultipartWithFileUpload(body)).body();
		assertEquals(expected.orderId(), actual.orderId());
		assertEquals(expected.userId(), actual.userId());
		assertEquals(expected.fileName(), actual.fileName());
		assertArrayEquals(expected.file(), actual.file());
	}

	@Test
	@Override
	public void mediatypeConsumesMultipartWithoutFileUpload200() {
		var expected = new Multipart(1, 2, null, null);
		var body = MultipartBody.builder()
				.addPart("orderId", String.valueOf(expected.orderId()))
				.addPart("userId", String.valueOf(expected.userId()))
				.build();
		assertEquals(expected, assert200(() -> client.mediatypeConsumesMultipartWithoutFileUpload("p", body)).body());
	}

	@Test
	@Override
	public void mediatypeConsumesOctetStream200() {
		assertEquals(STRING, assert200(() -> client.mediatypeConsumesOctetStream(BYTES)).body().foo());
	}

	@Test
	@Override
	public void mediatypeConsumesPlain200() {
		assertEquals(STRING, assert200(() -> client.mediatypeConsumesPlain(STRING)).body().foo());
	}

	@Test
	@Override
	public void mediatypeProducesSameModel200() {
		assertEquals(STRING, assert200(() -> client.mediatypeProducesSameModel(STRING)).body().foo());
	}

	@Test
	@Override
	public void mediatypeProducesDifferentModel200() {
		assertEquals(Optional.of(STRING), assert200(
				() -> client.mediatypeProducesDifferentModel(STRING, true)).getBody(String.class));
		assertEquals(Optional.of(new StringModel(STRING)), assert200(
				() -> client.mediatypeProducesDifferentModel(STRING, false)).getBody(StringModel.class));
	}
}
