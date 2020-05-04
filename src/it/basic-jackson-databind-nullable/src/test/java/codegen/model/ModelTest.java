package codegen.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ModelTest {

	final Model model = new Model();

	@Test
	@DisplayName("non nullable with default value")
	void nonNullable() {
		assertNull(model.getName());
	}

	@Test
	@DisplayName("non nullable with default value")
	void nonNullableDefault() {
		assertEquals("defaultStringValue", model.getDefaultString());
	}

	@Test
	@DisplayName("nullable without default value")
	void nullable() {
		assertFalse(model.getNullable().isPresent());
	}

	@Test
	@DisplayName("nullable with default value")
	void nullableDefault() {
		assertTrue(model.getDefaultNullable().isPresent());
		assertEquals("defaultNullableValue", model.getDefaultNullable().get());
	}
}
