package codegen;

import static codegen.HttpResponseAssertions.assert200;
import static codegen.HttpResponseAssertions.assert400;

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
