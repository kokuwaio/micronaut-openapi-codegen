package codegen.client;

import static codegen.HttpResponseAssertions.assert200;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;
import java.util.UUID;

import jakarta.inject.Inject;

import org.junit.jupiter.api.Test;

import codegen.Multipart;
import codegen.StringModel;
import codegen.server.MediatypeApiTestSpec;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@MicronautTest
public class MediatypeClientTest implements MediatypeApiTestSpec {

	private final String STRING = UUID.randomUUID().toString();
	private final byte[] BYTES = STRING.getBytes();

	@Inject
	MediatypeApiClient client;

	@Test
	@Override
	public void mediatypeConsumesAndProduces200() {
		assertEquals(STRING, client.mediatypeConsumesAndProduces(BYTES).blockingGet().getFoo());
	}

	@Test
	@Override
	public void mediatypeConsumesMultipartWithFileUpload200() {
		var expected = new Multipart().orderId(1).userId(2).fileName("uuid.txt").file(BYTES);
		var body = MultipartBody.builder()
				.addPart("orderId", String.valueOf(expected.getOrderId()))
				.addPart("userId", String.valueOf(expected.getUserId()))
				.addPart("file", expected.getFileName(), BYTES)
				.build();
		assertEquals(expected, client.mediatypeConsumesMultipartWithFileUpload(body).blockingGet());
	}

	@Test
	@Override
	public void mediatypeConsumesMultipartWithoutFileUpload200() {
		var expected = new Multipart().orderId(1).userId(2);
		var body = MultipartBody.builder()
				.addPart("orderId", String.valueOf(expected.getOrderId()))
				.addPart("userId", String.valueOf(expected.getUserId()))
				.build();
		assertEquals(expected, client.mediatypeConsumesMultipartWithoutFileUpload("p", body).blockingGet());
	}

	@Test
	@Override
	public void mediatypeConsumesOctetStream200() {
		assertEquals(STRING, client.mediatypeConsumesOctetStream(BYTES).blockingGet().getFoo());
	}

	@Test
	@Override
	public void mediatypeConsumesPlain200() {
		assertEquals(STRING, client.mediatypeConsumesPlain(STRING).blockingGet().getFoo());
	}

	@Test
	@Override
	public void mediatypeProducesSameModel200() {
		assertEquals(STRING, client.mediatypeProducesSameModel(STRING).blockingGet().getFoo());
	}

	@Test
	@Override
	public void mediatypeProducesDifferentModel200() {
		assertEquals(Optional.of(STRING), assert200(
				() -> client.mediatypeProducesDifferentModel(STRING, true).blockingGet()).getBody(String.class));
		assertEquals(Optional.of(new StringModel().foo(STRING)), assert200(
				() -> client.mediatypeProducesDifferentModel(STRING, false).blockingGet()).getBody(StringModel.class));
	}
}
