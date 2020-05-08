package codegen.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ModelTest {

	final Model model = new Model();

	@Test
	@DisplayName("non nullable string without default value")
	void nonNullableString() {
		assertNull(model.getName());
	}

	@Test
	@DisplayName("non nullable string with default value")
	void nonNullableDefault() {
		assertEquals("defaultStringValue", model.getDefaultString());
	}

	@Test
	@DisplayName("non nullable array with default value")
	void nonNullableArray() {
		assertNotNull(model.getArray());
	}

	@Test
	@DisplayName("nullable string without default value")
	void nullableString() {
		assertFalse(model.getNullableString().isPresent());
	}

	@Test
	@DisplayName("nullable string with default value")
	void nullableStringDefault() {
		assertTrue(model.getDefaultNullable().isPresent());
		assertEquals("defaultNullableValue", model.getDefaultNullable().get());
	}

	@Test
	@DisplayName("nullable array without default value")
	void nullableArray() {
		assertFalse(model.getNullableArray().isPresent());
	}
}
