package codegen.client;

import static codegen.HttpResponseAssertions.assert200;
import static codegen.HttpResponseAssertions.assert204;
import static codegen.HttpResponseAssertions.assert300;
import static codegen.HttpResponseAssertions.assert404;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;

import jakarta.inject.Inject;

import org.junit.jupiter.api.Test;

import codegen.NumberModel;
import codegen.StringModel;
import codegen.server.ResponseApiTestSpec;
import codegen.server.ResponseController;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@MicronautTest
public class ResponseClientTest implements ResponseApiTestSpec {

	@Inject
	ResponseApiClient client;

	@Test
	@Override
	public void voidFound204() {
		assertNull(assert204(() -> client.voidFound()).body());
	}

	@Test
	@Override
	public void voidNotFound204() {
		assertNull(assert204(() -> client.voidNotFound(true)).body());
	}

	@Test
	@Override
	public void voidNotFound404() {
		assertNull(assert404(() -> client.voidNotFound(false)).body());
	}

	@Test
	@Override
	public void single200() {
		assertEquals(ResponseController.STRING1, assert200(() -> client.single()).body());
	}

	@Test
	@Override
	public void optional200() {
		assertEquals(ResponseController.STRING1, assert200(() -> client.optional(true)).body());
	}

	@Test
	@Override
	public void optional404() {
		assertNull(assert404(() -> client.optional(false)).body());
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
		assertEquals(ResponseController.ARRAY_SIMPLE, assert200(() -> client.arraySimple()).body());
	}

	@Test
	@Override
	public void arraySimpleEmpty200() {
		assertEquals(List.of(), assert200(() -> client.arraySimpleEmpty()).body());
	}

	@Test
	@Override
	public void arraySimpleNotFound200() {
		assertEquals(ResponseController.ARRAY_SIMPLE, assert200(() -> client.arraySimpleNotFound(true)).body());
	}

	@Test
	@Override
	public void arraySimpleNotFound404() {
		assertNull(assert404(() -> client.arraySimpleNotFound(false)).body());
	}

	@Test
	@Override
	public void arrayComplex200() {
		assertEquals(ResponseController.ARRAY_COMPLEX, assert200(() -> client.arrayComplex()).body());
	}

	@Test
	@Override
	public void arrayComplexNotFound200() {
		assertEquals(ResponseController.ARRAY_COMPLEX, assert200(() -> client.arrayComplexNotFound(true)).body());
	}

	@Test
	@Override
	public void arrayComplexNotFound404() {
		assertNull(assert404(() -> client.arrayComplexNotFound(false)).body());
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
		assertNull(assert404(() -> client.multipleDataTypesNotFound(false, false)).body());
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
		assertNull(assert404(() -> client.multipleResponseCodesNotFound(false, false)).body());
	}

	@Test
	@Override
	public void withDefault204() {
		assertNull(assert204(() -> client.withDefault()).body());
	}
}
