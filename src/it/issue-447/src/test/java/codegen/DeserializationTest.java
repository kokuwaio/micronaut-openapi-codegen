package codegen;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DeserializationTest {
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	@Test
	void serializeChild() {
		assertDoesNotThrow(() -> OBJECT_MAPPER.readValue("{}", Child.class));
	}
}
