package codegen.client;

import static codegen.HttpResponseAssertions.assert200;
import static codegen.HttpResponseAssertions.assert300;
import static codegen.HttpResponseAssertions.assert404;
import static codegen.HttpResponseAssertions.assertStatus;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import jakarta.inject.Inject;

import org.junit.jupiter.api.Test;

import codegen.NumberModel;
import codegen.StringModel;
import codegen.server.ResponseApiTestSpec;
import codegen.server.ResponseController;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.exceptions.HttpClientResponseException;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@MicronautTest
public class ResponseClientTest implements ResponseApiTestSpec {

	@Inject
	ResponseApiClient client;

	@Test
	@Override
	public void voidFound204() {
		assertTrue(client.voidFound().blockOptional().isEmpty());
	}

	@Test
	@Override
	public void voidNotFound204() {
		assertTrue(client.voidNotFound(true).blockOptional().isEmpty());
	}

	@Test
	@Override
	public void voidNotFound404() {
		var exception = assertThrows(HttpClientResponseException.class, () -> client.voidNotFound(false).block());
		assertStatus(exception.getResponse(), HttpStatus.NOT_FOUND);
	}

	@Test
	@Override
	public void single200() {
		assertEquals(ResponseController.STRING1, client.single().block());
	}

	@Test
	@Override
	public void optional200() {
		assertEquals(ResponseController.STRING1, client.optional(true).block());
	}

	@Test
	@Override
	public void optional404() {
		var exception = assertThrows(HttpClientResponseException.class, () -> client.optional(false).block());
		assertStatus(exception.getResponse(), HttpStatus.NOT_FOUND);
	}

	@Test
	@Override
	public void header200() {
		assertEquals(ResponseController.DOUBLE, assert200(
				() -> client.header().block()).getHeaders().get("foo", Double.class).orElse(null));
	}

	@Test
	@Override
	public void arraySimple200() {
		assertEquals(ResponseController.ARRAY_SIMPLE, client.arraySimple().block());
	}

	@Test
	@Override
	public void arraySimpleEmpty200() {
		assertEquals(List.of(), client.arraySimpleEmpty().block());
	}

	@Test
	@Override
	public void arraySimpleNotFound200() {
		assertEquals(ResponseController.ARRAY_SIMPLE, client.arraySimpleNotFound(true).block());
	}

	@Test
	@Override
	public void arraySimpleNotFound404() {
		var exception = assertThrows(HttpClientResponseException.class,
				() -> client.arraySimpleNotFound(false).block());
		assertStatus(exception.getResponse(), HttpStatus.NOT_FOUND);
	}

	@Test
	@Override
	public void arrayComplex200() {
		assertEquals(ResponseController.ARRAY_COMPLEX, client.arrayComplex().block());
	}

	@Test
	@Override
	public void arrayComplexNotFound200() {
		assertEquals(ResponseController.ARRAY_COMPLEX, client.arrayComplexNotFound(true).block());
	}

	@Test
	@Override
	public void arrayComplexNotFound404() {
		var exception = assertThrows(HttpClientResponseException.class,
				() -> client.arrayComplexNotFound(false).block());
		assertStatus(exception.getResponse(), HttpStatus.NOT_FOUND);
	}

	@Test
	@Override
	public void multipleDataTypes200() {
		assertEquals(ResponseController.MODEL_STRING1, assert200(
				() -> client.multipleDataTypes(false).block()).getBody(StringModel.class).orElse(null));
	}

	@Test
	@Override
	public void multipleDataTypes300() {
		assertEquals(ResponseController.MODEL_NUMBER, assert300(
				() -> client.multipleDataTypes(true).block()).getBody(NumberModel.class).orElse(null));
	}

	@Test
	@Override
	public void multipleDataTypesNotFound200() {
		assertEquals(ResponseController.MODEL_STRING1, assert200(
				() -> client.multipleDataTypesNotFound(false, true).block()).getBody(StringModel.class).orElse(null));
	}

	@Test
	@Override
	public void multipleDataTypesNotFound300() {
		assertEquals(ResponseController.MODEL_NUMBER, assert300(
				() -> client.multipleDataTypesNotFound(true, true).block()).getBody(NumberModel.class).orElse(null));
	}

	@Test
	@Override
	public void multipleDataTypesNotFound404() {
		assertNull(assert404(() -> client.multipleDataTypesNotFound(false, false).block()).body());
	}

	@Test
	@Override
	public void multipleResponseCodes200() {
		assertEquals(ResponseController.MODEL_STRING1,
				assert200(() -> client.multipleResponseCodes(false).block()).body());
	}

	@Test
	@Override
	public void multipleResponseCodes300() {
		assertEquals(ResponseController.MODEL_STRING2,
				assert300(() -> client.multipleResponseCodes(true).block()).body());
	}

	@Test
	@Override
	public void multipleResponseCodesNotFound200() {
		assertEquals(ResponseController.MODEL_STRING1, assert200(
				() -> client.multipleResponseCodesNotFound(false, true).block()).body());
	}

	@Test
	@Override
	public void multipleResponseCodesNotFound300() {
		assertEquals(ResponseController.MODEL_STRING2, assert300(
				() -> client.multipleResponseCodesNotFound(true, true).block()).body());
	}

	@Test
	@Override
	public void multipleResponseCodesNotFound404() {
		assertNull(assert404(() -> client.multipleResponseCodesNotFound(false, false).block()).body());
	}

	@Test
	@Override
	public void withDefault204() {
		assertTrue(client.withDefault().blockOptional().isEmpty());
	}

}
