package codegen.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.inject.Inject;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import codegen.model.Model.DefaultEnumeration;
import codegen.model.Model.EmbeddedEnumeration;
import io.micronaut.core.annotation.Introspected;
import io.micronaut.test.annotation.MicronautTest;

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
	}

	@Test
	@DisplayName("introspected: present by default")
	void introspected() {
		assertNotNull(Model.class.getAnnotation(Introspected.class), "no annotation found");
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
	@DisplayName("model: binary type")
	void modelBinary() throws ReflectiveOperationException {
		assertEquals(byte[].class, Model.class.getDeclaredField("binary").getType());
	}
}
