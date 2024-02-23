package codegen;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import io.micronaut.json.JsonMapper;

public class ModelTest {

	private final JsonMapper mapper = JsonMapper.createDefault();
	private final String parentString = "{\"name\":\"foo\"}";
	private final ParentDefault parentObject = new ParentDefault().name("foo");
	private final String childString = "{\"name\":\"foo\",\"code\":123}";
	private final Child childObject = new Child().name("foo").code(123);

	@Test
	void writeChild() {
		assertEquals(childString, assertDoesNotThrow(() -> mapper.writeValueAsString(childObject)));
	}

	@Test
	void writeParent() {
		assertEquals(parentString, assertDoesNotThrow(() -> mapper.writeValueAsString(parentObject)));
	}

	@Test
	void readParentFromParent() {
		assertEquals(parentObject, assertDoesNotThrow(() -> mapper.readValue(parentString, Parent.class)));
	}

	@Test
	void readParentFromChild() {
		assertEquals(parentObject, assertDoesNotThrow(() -> mapper.readValue(childString, Parent.class)));
	}

	@Test
	void readParentDefaultFromParent() {
		assertEquals(parentObject, assertDoesNotThrow(() -> mapper.readValue(parentString, ParentDefault.class)));
	}

	@Test
	void readParentDefaultFromChild() {
		assertEquals(parentObject, assertDoesNotThrow(() -> mapper.readValue(childString, ParentDefault.class)));
	}

	@Test
	void readChildFromParent() {
		assertEquals(childObject, assertDoesNotThrow(() -> mapper.readValue(childString, Child.class)));
	}

	@Test
	void readChildFromChild() {
		assertEquals(childObject, assertDoesNotThrow(() -> mapper.readValue(childString, Child.class)));
	}
}
