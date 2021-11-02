package codegen;

import static codegen.HttpResponseAssertions.assert200;
import static org.junit.jupiter.api.Assertions.assertThrows;

import codegen.model.*;

import javax.inject.Inject;
import javax.validation.ConstraintViolationException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@MicronautTest
class NullableValidationTest {

	@Inject
	ModelApiClient validatingClient;

	@Test
	@DisplayName("client side validation with JsonNullable")
	public void nullableObjectValidation() {
		assert200(() -> validatingClient.create(new Model()
				.name("validation test")));
	}

	@Test
	@DisplayName("client side validation without JsonNullable")
	public void nonNullObjectValidation() {
		assert200(() -> validatingClient.create(new Model()
				.name("validation test")
				.addRequiredObjArrayItem(new SimpleObject()
						.someString("fit"))));
	}

	@Test
	@DisplayName("client side validation failure with JsonNullable")
	public void nullableObjectValidationViolation() {
		assertThrows(ConstraintViolationException.class, () -> validatingClient.create(new Model()
				.name("1234567890123456789012345678901234567890"))); // length violation
	}

	@Test
	@DisplayName("client side validation failure without JsonNullable")
	public void nonNullObjectValidationViolation() {
		assertThrows(ConstraintViolationException.class, () -> validatingClient.create(new Model()
				.name("is required")
				.addRequiredObjArrayItem(new SimpleObject()
						.someString("does not fit")))); // length violation
	}
}
