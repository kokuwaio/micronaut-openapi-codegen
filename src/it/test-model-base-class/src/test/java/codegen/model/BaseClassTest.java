package codegen.model;

import static org.junit.jupiter.api.Assertions.assertTrue;

import codegen.FirstModel;
import test.BaseClass;

import org.junit.jupiter.api.Test;

public class BaseClassTest {

	@Test
	void assertExtends() {
		FirstModel firstModel = new FirstModel();
		assertTrue(firstModel instanceof BaseClass, "The model class should extend the configured base.");
	}
}
