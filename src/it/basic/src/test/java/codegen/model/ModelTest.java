package codegen.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;

import javax.inject.Inject;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

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
}
