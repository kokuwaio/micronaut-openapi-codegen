package codegen.client;

import static codegen.HttpResponseAssertions.assert200;
import static codegen.HttpResponseAssertions.assert300;
import static codegen.HttpResponseAssertions.assert404;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import codegen.NumberModel;
import codegen.StringModel;
import codegen.server.ResponseApiTestSpec;
import codegen.server.ResponseController;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;

@MicronautTest
public class ResponseClientTest implements ResponseApiTestSpec {

	@Inject
	ResponseApiClient client;

	@Test
	@Override
	public void voidFound204() {
		client.voidFound();
	}

	@Test
	@Override
	public void voidNotFound204() {
		client.voidNotFound(true);
	}

	@Test
	@Disabled
	@Override
	public void voidNotFound404() {
		assertThrows(HttpStatusException.class, () -> client.voidNotFound(false));
	}

	@Test
	@Override
	public void single200() {
		assertEquals(ResponseController.STRING1, client.single());
	}

	@Test
	@Override
	public void optional200() {
		assertEquals(ResponseController.STRING1, client.optional(true).orElse(null));
	}

	@Test
	@Override
	public void optional404() {
		assertTrue(client.optional(false).isEmpty());
	}

	@Test
	@Override
	public void header200() {
		assertEquals(ResponseController.DOUBLE, assert200(
				() -> client.header()).getHeaders().get("foo", Double.class).orElse(null));
	}

	@Test
	@Override
	public void arraySimple200() {
		assertEquals(ResponseController.ARRAY_SIMPLE, client.arraySimple());
	}

	@Test
	@Override
	public void arraySimpleEmpty200() {
		assertEquals(List.of(), client.arraySimpleEmpty());
	}

	@Test
	@Override
	public void arraySimpleNotFound200() {
		assertEquals(ResponseController.ARRAY_SIMPLE, client.arraySimpleNotFound(true).orElse(null));
	}

	@Test
	@Override
	public void arraySimpleNotFound404() {
		assertTrue(client.arraySimpleNotFound(false).isEmpty());
	}

	@Test
	@Override
	public void arrayComplex200() {
		assertEquals(ResponseController.ARRAY_COMPLEX, client.arrayComplex());
	}

	@Test
	@Override
	public void arrayComplexNotFound200() {
		assertEquals(ResponseController.ARRAY_COMPLEX, client.arrayComplexNotFound(true).orElse(null));
	}

	@Test
	@Override
	public void arrayComplexNotFound404() {
		assertTrue(client.arrayComplexNotFound(false).isEmpty());
	}

	@Test
	@Override
	public void multipleDataTypes200() {
		assertEquals(ResponseController.MODEL_STRING1, assert200(
				() -> client.multipleDataTypes(false)).getBody(StringModel.class).orElse(null));
	}

	@Test
	@Override
	public void multipleDataTypes300() {
		assertEquals(ResponseController.MODEL_NUMBER, assert300(
				() -> client.multipleDataTypes(true)).getBody(NumberModel.class).orElse(null));
	}

	@Test
	@Override
	public void multipleDataTypesNotFound200() {
		assertEquals(ResponseController.MODEL_STRING1, assert200(
				() -> client.multipleDataTypesNotFound(false, true)).getBody(StringModel.class).orElse(null));
	}

	@Test
	@Override
	public void multipleDataTypesNotFound300() {
		assertEquals(ResponseController.MODEL_NUMBER, assert300(
				() -> client.multipleDataTypesNotFound(true, true)).getBody(NumberModel.class).orElse(null));
	}

	@Test
	@Override
	public void multipleDataTypesNotFound404() {
		assert404(() -> client.multipleDataTypesNotFound(false, false));
	}

	@Test
	@Override
	public void multipleResponseCodes200() {
		assertEquals(ResponseController.MODEL_STRING1, assert200(() -> client.multipleResponseCodes(false)).body());
	}

	@Test
	@Override
	public void multipleResponseCodes300() {
		assertEquals(ResponseController.MODEL_STRING2, assert300(() -> client.multipleResponseCodes(true)).body());
	}

	@Test
	@Override
	public void multipleResponseCodesNotFound200() {
		assertEquals(ResponseController.MODEL_STRING1, assert200(
				() -> client.multipleResponseCodesNotFound(false, true)).body());
	}

	@Test
	@Override
	public void multipleResponseCodesNotFound300() {
		assertEquals(ResponseController.MODEL_STRING2, assert300(
				() -> client.multipleResponseCodesNotFound(true, true)).body());
	}

	@Test
	@Override
	public void multipleResponseCodesNotFound404() {
		assert404(() -> client.multipleResponseCodesNotFound(false, false));
	}

	@Test
	@Override
	public void withDefault204() {
		client.withDefault();
	}
}
