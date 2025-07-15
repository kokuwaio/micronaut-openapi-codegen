package codegen;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.micronaut.json.JsonMapper;

public class ModelTest {

	private final JsonMapper mapper = JsonMapper.createDefault();
	private final String dogString = "{\"petType\":\"Dog\",\"bark\":true,\"breed\":\"Dingo\"}";
	private final Dog dogObject = new Dog().bark(true).breed(Dog.Breed.DINGO);

	@Test
	void writeDog() {
		assertEquals(dogString, assertDoesNotThrow(() -> mapper.writeValueAsString(dogObject)));
	}

	@Test
	void readSerializedDogString() {
		assertEquals(dogObject, assertDoesNotThrow(() -> mapper.readValue(dogString, Dog.class)));
	}
}
