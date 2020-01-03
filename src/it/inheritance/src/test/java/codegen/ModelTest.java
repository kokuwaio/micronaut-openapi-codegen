package codegen;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.micronaut.test.annotation.MicronautTest;

@MicronautTest
class ModelTest {

	@Inject
	ObjectMapper mapper;

	@Test
	void isAssignableFrom() {
		assertTrue(Model.class.isAssignableFrom(Model1.class));
		assertTrue(Model.class.isAssignableFrom(Model2.class));
	}

	@Test
	void jackson() throws IOException {
		var expected = new Model2().b("b2").id(2).name("b2");
		var json = mapper.writeValueAsBytes(expected);
		var actual = mapper.readValue(json, Model.class);
		assertEquals(expected, actual);
	}
}
