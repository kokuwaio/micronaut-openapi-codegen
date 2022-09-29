package codegen.model;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import codegen.*;

import java.util.Map;

import org.junit.jupiter.api.Test;

public class ExamplesTest {

	@Test
	void assertSuccessfulBuild() {

		assertDoesNotThrow(() -> AdditionalPropertiesModelTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> AdditionalPropertiesModelValueTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> EnumerationIntegerTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> EnumerationModelTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> EnumerationNumberTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> EnumerationStringDefaultTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> EnumerationStringTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> FirstModelTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> InheritanceExtendedTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> InheritanceSimpleTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> InheritanceWithEnumType1TestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> InheritanceWithEnumType2TestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> InheritanceWithEnumType3TestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> InheritanceWithEnumTypeEnumTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> InheritanceWithEnumTypeTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> InheritanceWithoutType1TestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> InheritanceWithoutType2TestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> InheritanceWithoutTypeTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> InheritanceWithStringType1TestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> InheritanceWithStringType2TestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> InheritanceWithStringTypeTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> ModelTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> OneOfImplementor1TestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> OneOfImplementor2TestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> OneOfInterfaceTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> OneOfModelTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> PropertyTypeOneTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> PropertyTypeTwoTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> SecondLevelModelTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> SecondLevelOneModelTestExample.build(), "The example should have been built.");
		assertDoesNotThrow(() -> SecondLevelTwoModelTestExample.build(), "The example should have been built.");
	}
}
