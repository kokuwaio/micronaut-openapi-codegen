package codegen.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.Optional;

import javax.inject.Inject;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

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
	@DisplayName("enum: constants")
	void enumConstants() {
		assertEquals(ModelEnum.ONE.getValue(), ModelEnum.ONE_VALUE);
		assertEquals(ModelEnum.TWO.getValue(), ModelEnum.TWO_VALUE);
	}

	@Test
	@DisplayName("enum: creator")
	void enumCreator() {
		assertEquals(ModelEnum.ONE, ModelEnum.fromString(ModelEnum.ONE_VALUE));
		assertEquals(ModelEnum.TWO, ModelEnum.fromString(ModelEnum.TWO_VALUE));
		assertThrows(IllegalArgumentException.class, () -> ModelEnum.valueOf("meh"));
	}

	@Test
	@DisplayName("enum: optional")
	void enumOptional() {
		assertEquals(Optional.of(ModelEnum.ONE), ModelEnum.toOptional(ModelEnum.ONE_VALUE));
		assertEquals(Optional.of(ModelEnum.TWO), ModelEnum.toOptional(ModelEnum.TWO_VALUE));
		assertEquals(Optional.empty(), ModelEnum.toOptional("meh"));
	}
}
