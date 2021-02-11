package codegen;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class ModelTest {

	@Test
	void defaultType() {
		assertTrue(new Polygon().getCoordinates() instanceof PolygonDefinition, "Correct default value.");
	}

}
