package codegen;

import static codegen.HttpResponseAssertions.assert200;
import static codegen.HttpResponseAssertions.assert201;
import static codegen.HttpResponseAssertions.assert204;
import static codegen.HttpResponseAssertions.assert404;
import static codegen.HttpResponseAssertions.assert409;
import static codegen.HttpResponseAssertions.getLocationHeaderValue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.inject.Inject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import codegen.model.Model;
import codegen.model.ModelStore;
import io.micronaut.test.annotation.MicronautTest;

@MicronautTest
class ModelControllerTest implements ModelApiTestSpec {

	@Inject
	ModelApiTestClient client;
	@Inject
	ModelStore store;

	@BeforeEach
	void reset() {
		store.clear();
	}

	@Test
	@Override
	public void findAll200() {
		store.add(new Model().id(1).name(UUID.randomUUID().toString()));
		store.add(new Model().id(2).name(UUID.randomUUID().toString()));
		store.add(new Model().id(3).name(UUID.randomUUID().toString()));
		var response = assert200(() -> client.findAll().blockingGet());
		assertEquals(3, response.getBody().get().size(), "response body");
	}

	@Test
	@Override
	public void findById200() {
		var expected = store.add(new Model().id(1).name(UUID.randomUUID().toString()));
		var actual = assert200(() -> client.findById(1)).getBody().get();
		assertEquals(expected, actual, "response body");
	}

	@Test
	@Override
	public void findById404() {
		assert404(() -> client.findById(-1));
	}

	@Test
	@Override
	public void create201() {
		var model = new Model().id(1).name(UUID.randomUUID().toString());
		var response = assert201(() -> client.create(model));
		assertEquals("1", getLocationHeaderValue(response, "/model/([0-9]*)"));
		assertEquals(Set.of(model), store.stream().collect(Collectors.toSet()), "response body");
	}

	@Test
	@Override
	public void create409() {
		var model = store.add(new Model().id(1).name(UUID.randomUUID().toString()));
		assert409(() -> client.create(model));
	}

	@Test
	@Override
	public void delete204() {
		var model = store.add(new Model().id(1).name(UUID.randomUUID().toString()));
		assert204(() -> client.delete(model.getId()));
		assertEquals(0, store.stream().count(), "model not deleted");
	}

	@Test
	@Override
	public void delete404() {
		assert404(() -> client.delete(-1));
	}
}
