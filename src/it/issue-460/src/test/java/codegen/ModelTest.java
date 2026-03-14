package codegen;

import static org.junit.jupiter.api.Assertions.assertInstanceOf;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ModelTest {

	private final ListModel model = new ListModel();

	@Test
	void shouldExtendsArrayList() {
		assertInstanceOf(List.class, model);
	}
}
