package codegen;

import static codegen.HttpResponseAssertions.assert200;
import static codegen.HttpResponseAssertions.assert204;
import static codegen.HttpResponseAssertions.assert300;
import static codegen.HttpResponseAssertions.assert404;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import codegen.model.ResponseMultiple200;
import codegen.model.ResponseMultiple300;
import io.micronaut.test.annotation.MicronautTest;

@MicronautTest
class ResponseControllerTest implements ResponseApiTestSpec {

	@Inject
	ResponseApiTestClient client;

	@Test
	@Override
	public void array200() {
		var response = assert200(() -> client.array());
		assertEquals(ResponseController.ARRAY, response.body());
	}

	@Test
	@Override
	public void arrayNotFound200() {
		var response = assert200(() -> client.arrayNotFound(true));
		assertEquals(ResponseController.ARRAY, response.body());
	}

	@Test
	@Override
	public void arrayNotFound404() {
		var response = assert404(() -> client.arrayNotFound(false));
		assertNull(response.body());
	}

	@Test
	@Override
	public void multiple200() {
		var response = assert200(() -> client.multiple(false));
		assertEquals(
				new ResponseMultiple200().setFoo(ResponseController.STRING),
				response.getBody(ResponseMultiple200.class).orElse(null));
	}

	@Test
	@Override
	public void multiple300() {
		var response = assert300(() -> client.multiple(true));
		assertEquals(
				new ResponseMultiple300().setBar(ResponseController.DOUBLE),
				response.getBody(ResponseMultiple300.class).orElse(null));
	}

	@Test
	@Override
	public void multipleNotFound200() {
		var response = assert200(() -> client.multipleNotFound(false, true));
		assertEquals(
				new ResponseMultiple200().setFoo(ResponseController.STRING),
				response.getBody(ResponseMultiple200.class).orElse(null));
	}

	@Test
	@Override
	public void multipleNotFound300() {
		var response = assert300(() -> client.multipleNotFound(true, true));
		assertEquals(
				new ResponseMultiple300().setBar(ResponseController.DOUBLE),
				response.getBody(ResponseMultiple300.class).orElse(null));
	}

	@Test
	@Override
	public void multipleNotFound404() {
		assert404(() -> client.multipleNotFound(false, false));
	}

	@Test
	@Override
	public void optional200() {
		var response = assert200(() -> client.optional(true));
		assertEquals(ResponseController.STRING, response.body());
	}

	@Test
	@Override
	public void optional404() {
		assert404(() -> client.optional(false));
	}

	@Test
	@Override
	public void single200() {
		var response = assert200(() -> client.single());
		assertEquals(ResponseController.STRING, response.body());
	}

	@Test
	@Override
	public void voidNormal204() {
		var response = assert204(() -> client.voidNormal());
		assertNull(response.body());
	}

	@Test
	@Override
	public void voidNotFound204() {
		var response = assert204(() -> client.voidNotFound(true));
		assertNull(response.body());
	}

	@Test
	@Override
	public void voidNotFound404() {
		var response = assert404(() -> client.voidNotFound(false));
		assertNull(response.body());
	}

	@Override
	public void header200() {
		var response = assert200(() -> client.header());
		assertEquals(ResponseController.DOUBLE, response.getHeaders().get("foo", Double.class));
	}

	@Test
	@Override
	public void defaultWithNoContent204() {
		assert204(() -> client.defaultWithNoContent());
	}

	@Test
	@Override
	public void defaultWithOk200() {
		assert200(() -> client.defaultWithOk());
	}
}
