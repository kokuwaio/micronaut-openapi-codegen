package codegen.model;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import codegen.FirstModel;
import codegen.OneOfModel;
import codegen.OneOfInterface;
import codegen.OneOfImplementor1;
import codegen.OneOfImplementor2;
import codegen.PropertyTypeOne;
import codegen.PropertyTypeTwo;
import codegen.SecondLevelModel;
import codegen.SecondLevelOneModel;
import codegen.SecondLevelTwoModel;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class OneOfInterfacesTest {

	@Test
	void assertOneOfStructureWithDiscriminator() {
		OneOfImplementor1 oneOfImplementor1 = new OneOfImplementor1();
		OneOfImplementor2 oneOfImplementor2 = new OneOfImplementor2();
		assertTrue(oneOfImplementor1 instanceof OneOfInterface, "The implementor should be an instance of the interface.");
		assertTrue(oneOfImplementor2 instanceof OneOfInterface, "The implementor should be an instance of the interface.");

		assertDoesNotThrow(() -> oneOfImplementor1.getType(), "The declared discrimnator property should exist.");
		assertDoesNotThrow(() -> oneOfImplementor2.getType(), "The declared discrimnator property should exist.");
	}

	@Test
	void assertOneOfMultiLevelStructure() {
		FirstModel firstModel = new FirstModel();
		SecondLevelOneModel secondLevelOneModel = new SecondLevelOneModel();
		SecondLevelTwoModel secondLevelTwoModel = new SecondLevelTwoModel();

		assertTrue(firstModel instanceof OneOfModel, "All models should implement OneOfModel.");
		assertTrue(secondLevelOneModel instanceof OneOfModel, "All models should implement OneOfModel.");
		assertTrue(secondLevelOneModel instanceof OneOfModel, "All models should implement OneOfModel.");
		assertFalse(firstModel instanceof SecondLevelModel, "FirstModel should only implement the OneOfModel interface.");
		assertTrue(secondLevelOneModel instanceof SecondLevelModel, "Both second level models should also implement the SecondLevelModel interface.");
		assertTrue(secondLevelTwoModel instanceof SecondLevelModel, "Both second level models should also implement the SecondLevelModel interface.");

	}
}