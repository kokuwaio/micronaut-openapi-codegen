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
		assert200(() -> client.body(model()));
	}

	@Test
	@Override
	public void body400() {
		assert400(() -> client.body(model().name(null)));
		assert400(() -> client.body(model().name("abcdef")));
		assert400(() -> client.body(model().embedded(null)));
		assert400(() -> client.body(model().embedded(new Embedded())));
	}

	@Test
	@Override
	public void bodyWithCollection204() {
		assert200(() -> client.bodyWithCollection(new ModelWithCollection()));
		assert200(() -> client.bodyWithCollection(new ModelWithCollection().list(List.of(model()))));
	}

	@Test
	@Override
	public void bodyWithCollection400() {
		assert400(() -> client.bodyWithCollection(new ModelWithCollection().list(List.of(new Model()))));
		assert400(() -> client.bodyWithCollection(new ModelWithCollection().list(List.of(model().name(null)))));
		assert400(() -> client.bodyWithCollection(new ModelWithCollection().list(List.of(model().name("abcdef")))));
		assert400(() -> client.bodyWithCollection(new ModelWithCollection().list(List.of(model().embedded(null)))));
		assert400(() -> client.bodyWithCollection(new ModelWithCollection().list(List.of(model().embedded(new Embedded())))));
	}

	@Test
	@Override
	public void queryParam200() {
		assert200(() -> client.queryParam(1));
	}

	@Test
	@Override
	public void queryParam400() {
		assert400(() -> client.queryParam(0));
		assert400(() -> client.queryParam(3));
	}

	private Model model() {
		return new Model().name("foo").embedded(new Embedded().name("bar"));
	}
}
