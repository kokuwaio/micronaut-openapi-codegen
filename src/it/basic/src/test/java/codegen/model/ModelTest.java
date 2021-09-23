package codegen.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.inject.Inject;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import codegen.model.Model.DefaultEnumeration;
import codegen.model.Model.EmbeddedEnumeration;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@MicronautTest
class ModelTest {

	@Inject
	ObjectMapper mapper;

	@Test
	@DisplayName("inheritance: is assignable from super class")
	void inheritanceIsAssignableFrom() {
		assertTrue(InheritanceModel.class.isAssignableFrom(InheritanceModel1.class));
		assertTrue(InheritanceModel.class.isAssignableFrom(InheritanceModel2.class));
	}

	@Test
	@DisplayName("inheritance: test with jackson")
	void inheritanceJackson() throws IOException {
		var expected = new InheritanceModel2().b("b2").id(2).name("b2");
		var json = mapper.writeValueAsBytes(expected);
		var actual = mapper.readValue(json, InheritanceModel.class);
		assertEquals(expected, actual);
		assertEquals(expected.hashCode(), actual.hashCode());
	}

	@Test
	@DisplayName("inheritance: test with jackson and type")
	void inheritanceJacksonType() throws IOException {
		assertTrue(InheritanceModelWithType.class.isAssignableFrom(InheritanceModelWithType1.class));
		assertTrue(InheritanceModelWithType.class.isAssignableFrom(InheritanceModelWithType2.class));
		assertTrue(InheritanceModelWithType.class.isAssignableFrom(InheritanceModelWithType3.class));
		assertTrue(InheritanceModelWithType2.class.isAssignableFrom(InheritanceModelWithType3.class));
		var expected = new InheritanceModelWithType3().c("c3").b("b2");
		var json = mapper.writeValueAsString(expected);
		var actual = mapper.readValue(json, InheritanceModelWithType.class);
		assertEquals(InheritanceModelType.INHERITANCEMODEL3, expected.getType(), "type");
		assertEquals(1, json.split("type", -1).length - 1, "multiple");
		assertEquals(expected, actual);
		assertEquals(expected.hashCode(), actual.hashCode());
	}

	@Test
	@DisplayName("inheritance: has visitor")
	void inheritanceHasVisitor() throws ReflectiveOperationException {
		assertNotNull(InheritanceModel.class.getDeclaredMethod("accept", InheritanceModel.Visitor.class), "model doesn't accept visitor");
	}

	@Test
	@DisplayName("introspected: present by default")
	void introspected() {
		assertNotNull(Model.class.getAnnotation(Introspected.class), "no annotation found");
	}

	@Test
	@DisplayName("model enum: introspected present by default")
	void modelEnumIntrospected() {
		assertNotNull(StringEnumeration.class.getAnnotation(Introspected.class), "no annotation found");
	}

	@Test
	@DisplayName("model enum: constants")
	void modelEnumConstants() {
		assertEquals(StringEnumeration.ONE.getValue(), StringEnumeration.ONE_VALUE);
		assertEquals(StringEnumeration.TWO.getValue(), StringEnumeration.TWO_VALUE);
	}

	@Test
	@DisplayName("model enum: creator")
	void modelEnumCreator() {
		assertEquals(StringEnumeration.ONE, StringEnumeration.toEnum(StringEnumeration.ONE_VALUE));
		assertEquals(StringEnumeration.TWO, StringEnumeration.toEnum(StringEnumeration.TWO_VALUE));
		assertThrows(IllegalArgumentException.class, () -> StringEnumeration.valueOf("meh"));
	}

	@Test
	@DisplayName("model enum: optional")
	void modelEnumOptional() {
		assertEquals(Optional.of(StringEnumeration.ONE), StringEnumeration.toOptional(StringEnumeration.ONE_VALUE));
		assertEquals(Optional.of(StringEnumeration.TWO), StringEnumeration.toOptional(StringEnumeration.TWO_VALUE));
		assertEquals(Optional.empty(), StringEnumeration.toOptional("meh"));
	}

	@Test
	@DisplayName("embedded enum: introspected present by default")
	void embeddedEnumIntrospected() {
		assertNotNull(EmbeddedEnumeration.class.getAnnotation(Introspected.class), "no annotation found");
	}

	@Test
	@DisplayName("embedded enum: constants")
	void embeddedEnumConstants() {
		assertEquals(EmbeddedEnumeration.FIRST.getValue(), EmbeddedEnumeration.FIRST_VALUE);
		assertEquals(EmbeddedEnumeration.SECOND.getValue(), EmbeddedEnumeration.SECOND_VALUE);
	}

	@Test
	@DisplayName("embedded enum: creator")
	void embeddedEnumCreator() {
		assertEquals(EmbeddedEnumeration.FIRST, EmbeddedEnumeration.toEnum(EmbeddedEnumeration.FIRST_VALUE));
		assertEquals(EmbeddedEnumeration.SECOND, EmbeddedEnumeration.toEnum(EmbeddedEnumeration.SECOND_VALUE));
		assertThrows(IllegalArgumentException.class, () -> EmbeddedEnumeration.valueOf("meh"));
	}

	@Test
	@DisplayName("embedded enum: optional")
	void embeddedEnumOptional() {
		assertEquals(Optional.of(EmbeddedEnumeration.FIRST), EmbeddedEnumeration.toOptional(EmbeddedEnumeration.FIRST_VALUE));
		assertEquals(Optional.of(EmbeddedEnumeration.SECOND), EmbeddedEnumeration.toOptional(EmbeddedEnumeration.SECOND_VALUE));
		assertEquals(Optional.empty(), EmbeddedEnumeration.toOptional("meh"));
	}

	@Test
	@DisplayName("model enum: integer")
	void modelEnumInteger() {
		assertEquals(Integer.MAX_VALUE, IntegerEnumeration.NUMBER_2147483647.getValue());
		assertEquals(Integer.MAX_VALUE, IntegerEnumeration.NUMBER_2147483647_VALUE);
		assertEquals(Integer.MIN_VALUE, IntegerEnumeration.NUMBER_MINUS_2147483648.getValue());
		assertEquals(Integer.MIN_VALUE, IntegerEnumeration.NUMBER_MINUS_2147483648_VALUE);
		assertEquals(List.of(Integer.MIN_VALUE, -1, 0, 1, Integer.MAX_VALUE), Stream
				.of(IntegerEnumeration.values())
				.map(IntegerEnumeration::getValue)
				.collect(Collectors.toList()));
	}

	@Test
	@DisplayName("default value: array required")
	void defaultValueArrayRequired() {
		assertNotNull(new Model().getArray());
	}

	@Test
	@DisplayName("default value: array nullable")
	void defaultValueArrayNullable() {
		assertNull(new Model().getNullableArray());
	}

	@Test
	@DisplayName("default value: string")
	void defaultValueString() {
		assertEquals("defaultStringValue", new Model().getDefaultString());
	}

	@Test
	@DisplayName("default value: integer")
	void defaultValueInteger() {
		assertEquals(1234L, new Model().getDefaultInteger());
	}

	@Test
	@DisplayName("default value: enumeration")
	void defaultValueEnumeration() {
		assertEquals(DefaultEnumeration.BAR, new Model().getDefaultEnumeration());
	}

	@Test
	@DisplayName("model: bytes type")
	void modelBytes() throws ReflectiveOperationException {
		assertEquals(byte[].class, Model.class.getDeclaredField("bytes").getType());
		var model1 = new Model().setBytes("test".getBytes());
		var model2 = new Model().setBytes("test".getBytes());
		assertEquals(model1, model2);
		assertEquals(model1.hashCode(), model2.hashCode());
	}

	@Test
	@DisplayName("model: binary type")
	void modelBinary() throws ReflectiveOperationException {
		assertEquals(byte[].class, Model.class.getDeclaredField("binary").getType());
		var model1 = new Model().setBinary("test".getBytes());
		var model2 = new Model().setBinary("test".getBytes());
		assertEquals(model1, model2);
		assertEquals(model1.hashCode(), model2.hashCode());
	}

	@Test
	@DisplayName("model: any type")
	void modelAny() throws ReflectiveOperationException {
		assertEquals(Object.class, Model.class.getDeclaredField("any").getType());
	}

	@Test
	@DisplayName("model: addItem for list")
	void modelAddItemList() {
		var model = new Model();
		assertEquals(List.of(), model.getArray());
		model.addArrayItem("foo");
		assertEquals(List.of("foo"), model.getArray());
		assertTrue(model.getArray() instanceof ArrayList);
	}

	@Test
	@DisplayName("model: addItem for set")
	void modelAddItemSet() {
		var model = new Model();
		assertEquals(Set.of(), model.getSet());
		model.addSetItem("foo");
		assertEquals(Set.of("foo"), model.getSet());
		assertTrue(model.getSet() instanceof LinkedHashSet);
	}

	@Test
	@DisplayName("model: addItem for map")
	void modelAddItemMap() {
		var model = new Model();
		assertEquals(Map.of(), model.getMap());
		model.putMapItem("foo", "bar");
		assertEquals(Map.of("foo", "bar"), model.getMap());
		assertTrue(model.getMap() instanceof HashMap);
	}

	@Test
	@DisplayName("model: addItem for nullable list")
	void modelAddItemNullableList() {
		var model = new Model();
		assertNull(model.getNullableArray());
		model.addNullableArrayItem("foo");
		assertEquals(List.of("foo"), model.getNullableArray());
		assertTrue(model.getNullableArray() instanceof ArrayList);
	}

	@Test
	@DisplayName("model: addItem for nullable set")
	void modelAddItemNullableSet() {
		var model = new Model();
		assertNull(model.getNullableSet());
		model.addNullableSetItem("foo");
		assertEquals(Set.of("foo"), model.getNullableSet());
		assertTrue(model.getNullableSet() instanceof LinkedHashSet);
	}

	@Test
	@DisplayName("model: addItem for nullable map")
	void modelAddItemNullableMap() {
		var model = new Model();
		assertNull(model.getNullableMap());
		model.putNullableMapItem("foo", "bar");
		assertEquals(Map.of("foo", "bar"), model.getNullableMap());
		assertTrue(model.getNullableMap() instanceof HashMap);
	}

	@Test
	@DisplayName("model: addItem for optional list")
	void modelAddItemoptionalList() {
		var model = new Model();
		assertNull(model.getOptionalArray());
		model.addOptionalArrayItem("foo");
		assertEquals(List.of("foo"), model.getOptionalArray());
		assertTrue(model.getOptionalArray() instanceof ArrayList);
	}

	@Test
	@DisplayName("model: addItem for optional set")
	void modelAddItemoptionalSet() {
		var model = new Model();
		assertNull(model.getOptionalSet());
		model.addOptionalSetItem("foo");
		assertEquals(Set.of("foo"), model.getOptionalSet());
		assertTrue(model.getOptionalSet() instanceof LinkedHashSet);
	}

	@Test
	@DisplayName("model: addItem for optional map")
	void modelAddItemoptionalMap() {
		var model = new Model();
		assertNull(model.getOptionalMap());
		model.putOptionalMapItem("foo", "bar");
		assertEquals(Map.of("foo", "bar"), model.getOptionalMap());
		assertTrue(model.getOptionalMap() instanceof HashMap);
	}

	@Test
	@DisplayName("model: property with multiple enum values")
	void modelMultiEnumProperty() {
		var model = new MultiEnumPropertyModel();
		assertNull(model.getMultiEnum());
		model.putMultiEnumItem("foo", MultiEnumPropertyModel.MultiEnum.ONE);
		model.putMultiEnumItem("bar", MultiEnumPropertyModel.MultiEnum.TWO);
		assertTrue(model.getMultiEnum() instanceof HashMap);
		assertEquals(Map.of(
				"foo", MultiEnumPropertyModel.MultiEnum.ONE,
				"bar", MultiEnumPropertyModel.MultiEnum.TWO),
				model.getMultiEnum());
	}
}
