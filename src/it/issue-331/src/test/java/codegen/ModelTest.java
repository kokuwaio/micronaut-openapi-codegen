package codegen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

import io.micronaut.validation.validator.Validator;

public class ModelTest {

	private final Validator validator = Validator.getInstance();

	@Test
	void arrayNull() {
		assertValid(new ModelPage());
	}

	@Test
	void arrayEmpty() {
		assertValid(new ModelPage().array(List.of()));
	}

	@Test
	void arrayValid() {
		var model = new ModelComplex().string("aaa");
		assertValid(model);
		assertValid(new ModelPage().array(List.of(model)));
	}

	@Test
	void arrayInvalid() {
		var model = new ModelComplex().string("avvvv");
		assertInvalid(model, "string");
		assertInvalid(new ModelPage().array(List.of(model)), "array[0].string");
	}

	@Test
	void stringValid() {
		assertValid(new ModelString().withMaximum(List.of("aaa")));
	}

	@Test
	void stringInvalid() {
		assertInvalid(new ModelString().withMaximum(List.of("avvvv")), "withMaximum[0]<list element>");
	}

	private void assertValid(Object object) {
		var violations = validator.validate(object);
		assertTrue(violations.isEmpty(), "violations: " + violations);
	}

	private void assertInvalid(Object object, String invalidValue) {
		var violations = validator.validate(object);
		assertFalse(violations.isEmpty(), "no violation found");
		assertEquals(1, violations.size(), "found multiple violations: " + violations);
		var violation = violations.iterator().next();
		assertEquals(invalidValue, violation.getPropertyPath().toString(), "invalid value mismatches");
	}
}
