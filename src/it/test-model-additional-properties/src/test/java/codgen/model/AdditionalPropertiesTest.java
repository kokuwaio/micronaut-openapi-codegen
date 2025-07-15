package codegen.model;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Map;

import org.junit.jupiter.api.Test;

import codegen.AdditionalPropertiesModel;
import codegen.PropertyTypeOne;
import codegen.PropertyTypeTwo;

public class AdditionalPropertiesTest {

	@Test
	void assertAdditionalProperties() {
		AdditionalPropertiesModel additionalPropertiesModel = new AdditionalPropertiesModel();
		assertFalse(additionalPropertiesModel instanceof Map,
				"Objects with composed additional properties should not be created as maps.");
		assertDoesNotThrow(() -> additionalPropertiesModel.getAdditionalProperties(),
				"The additional properties field should have been created.");
		PropertyTypeOne pto = new PropertyTypeOne();
		PropertyTypeTwo ptt = new PropertyTypeTwo();
		assertDoesNotThrow(() -> additionalPropertiesModel.setAdditionalProperties("one", pto),
				"Adding typed objects should be possible.");
		assertDoesNotThrow(() -> additionalPropertiesModel.setAdditionalProperties("two", ptt),
				"Adding typed objects should be possible.");
	}
}
