package codegen;

import static codegen.HttpResponseAssertions.assert200;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@MicronautTest
class UriControllerTest implements UriApiTestSpec {

	@Inject
	UriApiTestClient client;

	@Test
	@Override
	public void uriWithString200() {
		var response = assert200(() -> client.uriWithString("meh"));
		assertEquals("uriWithString_meh", response.body());
	}

	@Test
	@Override
	public void uriWithUuid200() {
		var uuid = UUID.randomUUID();
		var response = assert200(() -> client.uriWithUuid(uuid));
		assertEquals("uriWithUuid_" + uuid, response.body());
	}

	@Test
	@Override
	public void uriWithMultipleUuids200() {
		var uuid1 = UUID.randomUUID();
		var uuid2 = UUID.randomUUID();
		var response = assert200(() -> client.uriWithMultipleUuids(uuid1, uuid2));
		assertEquals("uriWithMultipleUuids_" + uuid1 + "_" + uuid2, response.body());
	}
}
