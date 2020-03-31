package codegen;

import static codegen.HttpResponseAssertions.assert200;
import static codegen.HttpResponseAssertions.assert400;

import java.util.List;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.micronaut.test.annotation.MicronautTest;

@MicronautTest
class ValidationControllerTest implements ValidationApiTestSpec {

	@Inject
	ValidationApiTestClient client;

	@Test
	@Override
	public void body204() {
		assert200(() -> client.body(new Model().name("test")));
	}

	@Test
	@Override
	public void body400() {
		assert400(() -> client.body(new Model()));
		assert400(() -> client.body(new Model().name("abcdef")));
	}

	@Test
	@Override
	public void bodyWithCollection204() {
		assert200(() -> client.bodyWithCollection(new ModelWithCollection()));
		assert200(() -> client.bodyWithCollection(new ModelWithCollection().list(List.of(new Model().name("test")))));
	}

	@Test
	@Override
	public void bodyWithCollection400() {
		assert400(() -> client.bodyWithCollection(new ModelWithCollection().list(List.of(new Model()))));
	}

	@Test
	@Override
	public void queryParam200() {
		assert200(() -> client.queryParam(1));
	}

	@Test
	@Override
	public void queryParam404() {
		assert400(() -> client.queryParam(0));
		assert400(() -> client.queryParam(3));
	}
}
