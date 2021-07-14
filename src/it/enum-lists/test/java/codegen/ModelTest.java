package codegen;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

import java.util.List;

class ModelTest {

	@Test
	void defaultType() {
		assertDoesNotThrow(new Person().setMood(List.of(Person.Mood.HAPPY, Person.Mood.CREATIVE)),
				"Enum list property should be settable.");
	}
}
