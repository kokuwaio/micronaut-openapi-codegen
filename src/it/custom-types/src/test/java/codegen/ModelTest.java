package codegen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Instant;
import java.util.Date;
import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

import org.junit.jupiter.api.Test;

class ModelTest {

	@Test
	void typeMappings() throws ReflectiveOperationException {
		assertEquals(Date.class, Model.class.getDeclaredField("date").getType(), "date");
		assertEquals(Instant.class, Model.class.getDeclaredField("dateTime").getType(), "dateTime");
		assertEquals(String.class, Model.class.getDeclaredField("uuid").getType(), "uuid");
		assertEquals(Set.class, Model.class.getDeclaredField("array").getType(), "array");
		assertEquals(Dictionary.class, Model.class.getDeclaredField("map").getType(), "map");
		assertEquals(Double.class, Model.class.getDeclaredField("number").getType(), "number");
		assertEquals(Float.class, Model.class.getDeclaredField("numberFloat").getType(), "numberFloat");
		assertEquals(Double.class, Model.class.getDeclaredField("numberDouble").getType(), "numberDouble");
	}

	@Test
	void instantiationTypes() {
		assertTrue(new Model().getArray() instanceof HashSet, "array");
		assertTrue(new Model().getMap() instanceof Hashtable, "map");
	}
}
