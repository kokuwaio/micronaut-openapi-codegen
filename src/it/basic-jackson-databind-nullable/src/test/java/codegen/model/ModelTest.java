package codegen.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ModelTest {

	Model model;

	@BeforeEach
	void beforeEach() {
		model = new Model();
	}

	@Test
	@DisplayName("non nullable string without default value")
	void nonNullableString() {
		assertNull(model.getName());
	}

	@Test
	@DisplayName("non nullable string with default value")
	void nonNullableDefault() {
		assertEquals("defaultStringValue", model.getDefaultString());
	}

	@Test
	@DisplayName("nullable string without default value")
	void nullableString() {
		assertFalse(model.getNullableString().isPresent());
	}

	@Test
	@DisplayName("nullable string with default value")
	void nullableStringDefault() {
		assertTrue(model.getDefaultNullable().isPresent());
		assertEquals("defaultNullableValue", model.getDefaultNullable().get());
	}

	@Test
	@DisplayName("addItem for list")
	void modelAddItemList() {
		assertEquals(List.of(), model.getArray());
		model.addArrayItem("foo");
		assertEquals(List.of("foo"), model.getArray());
		assertTrue(model.getArray() instanceof ArrayList);
	}

	@Test
	@DisplayName("addItem for set")
	void modelAddItemSet() {
		assertEquals(Set.of(), model.getSet());
		model.addSetItem("foo");
		assertEquals(Set.of("foo"), model.getSet());
		assertTrue(model.getSet() instanceof LinkedHashSet);
	}

	@Test
	@DisplayName("addItem for map")
	void modelAddItemMap() {
		assertEquals(Map.of(), model.getMap());
		model.putMapItem("foo", "bar");
		assertEquals(Map.of("foo", "bar"), model.getMap());
		assertTrue(model.getMap() instanceof HashMap);
	}

	@Test
	@DisplayName("addItem for nullable list")
	void modelAddItemNullableList() {
		assertNotNull(model.getNullableArray());
		assertFalse(model.getNullableArray().isPresent());
		model.addNullableArrayItem("foo");
		assertTrue(model.getNullableArray().isPresent());
		assertEquals(List.of("foo"), model.getNullableArray().get());
		assertTrue(model.getNullableArray().get() instanceof ArrayList);
	}

	@Test
	@DisplayName("addItem for nullable set")
	void modelAddItemNullableSet() {
		assertNotNull(model.getNullableSet());
		assertFalse(model.getNullableSet().isPresent());
		model.addNullableSetItem("foo");
		assertTrue(model.getNullableSet().isPresent());
		assertEquals(Set.of("foo"), model.getNullableSet().get());
		assertTrue(model.getNullableSet().get() instanceof LinkedHashSet);
	}

	@Test
	@DisplayName("addItem for nullable map")
	void modelAddItemNullableMap() {
		assertNotNull(model.getNullableMap());
		assertFalse(model.getNullableMap().isPresent());
		model.putNullableMapItem("foo", "bar");
		assertTrue(model.getNullableMap().isPresent());
		assertEquals(Map.of("foo", "bar"), model.getNullableMap().get());
		assertTrue(model.getNullableMap().get() instanceof HashMap);
	}

	@Test
	@DisplayName("addItem for optional list")
	void modelAddItemoptionalList() {
		assertNull(model.getOptionalArray());
		model.addOptionalArrayItem("foo");
		assertEquals(List.of("foo"), model.getOptionalArray());
		assertTrue(model.getOptionalArray() instanceof ArrayList);
	}

	@Test
	@DisplayName("addItem for optional set")
	void modelAddItemoptionalSet() {
		assertNull(model.getOptionalSet());
		model.addOptionalSetItem("foo");
		assertEquals(Set.of("foo"), model.getOptionalSet());
		assertTrue(model.getOptionalSet() instanceof LinkedHashSet);
	}

	@Test
	@DisplayName("addItem for optional map")
	void modelAddItemoptionalMap() {
		assertNull(model.getOptionalMap());
		model.putOptionalMapItem("foo", "bar");
		assertEquals(Map.of("foo", "bar"), model.getOptionalMap());
		assertTrue(model.getOptionalMap() instanceof HashMap);
	}
}
