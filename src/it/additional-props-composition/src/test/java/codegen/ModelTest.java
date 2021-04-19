package codegen;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Map;

import org.junit.jupiter.api.Test;

class ModelTest {

	@Test
	void defaultType() {
		assertFalse(new Entity() instanceof Map, "Entity should not extend map.");
		assertDoesNotThrow(() -> new Entity().getAdditionalProperties(), "The additional properties field should have been created.");
		assertDoesNotThrow(() -> new Entity().setAdditionalProperties(Map.of("my", "property")), "The additional properties field should offer a setter.");
	}
}
