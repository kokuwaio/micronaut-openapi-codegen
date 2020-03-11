package codegen;

import static codegen.HttpResponseAssertions.assert200;
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.micronaut.test.annotation.MicronautTest;

@MicronautTest
class FooControllerTest implements FooApiTestSpec {

	@Inject
	FooApiTestClient client;

	@Test
	@Override
	public void get200() {
		var model = assert200(() -> client.get()).body();
		assertEquals(new Model().a("a").b("b"), model);
	}
}
