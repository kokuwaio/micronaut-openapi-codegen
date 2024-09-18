package codegen;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

public class GeneratedTest {

	@Test
	void load() {
		assertClass("codegen.ModelPrefixModelObjectModelSuffix");
		assertClass("codegen.ModelPrefixModelEnumModelSuffix");
		assertClass("codegen.server.ApiPrefixDefaultApiSuffix");
		assertClass("codegen.server.ApiPrefixDefaultApiSuffixTestClient");
		assertClass("codegen.server.ApiPrefixDefaultApiSuffixTestSpec");
	}

	private static void assertClass(String name) {
		assertDoesNotThrow(() -> Class.forName(name), "Failed to load " + name);
	}
}
