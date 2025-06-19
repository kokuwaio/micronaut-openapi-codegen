package codegen;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

public class DeserializationTest {
	private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

	@Test
	void serializeChild() {
		assertDoesNotThrow(() -> OBJECT_MAPPER.readValue("{}", Child.class));
	}
}
