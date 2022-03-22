package codegen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Map;

import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.ObjectMapper;

class ModelTest {

	@Test
	void defaultType() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		Entity entity = new Entity();
		entity.setId("my-id");
		entity.isEntity(true);
		String entityString = objectMapper.writeValueAsString(entity);
		String expectedJson = "{\"id\":\"my-id\",\"isEntity\":true}";

		assertEquals(expectedJson, entityString, "The json should keep the defined field names.");
	}
}
