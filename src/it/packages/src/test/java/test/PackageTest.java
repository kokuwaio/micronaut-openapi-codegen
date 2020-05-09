package test;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("package")
public class PackageTest {

	@Test
	@DisplayName("default")
	void defaultPackage() {
		assertClass("changeMe.Model");
		assertClass("changeMe.ModelApi");
		assertClass("changeMe.ModelApiTestClient");
		assertClass("changeMe.TimeTypeConverterRegistrar");
		assertClass("changeMe.HttpResponseAssertions");
	}

	@Test
	@DisplayName("partial")
	void partialPackage() {
		assertClass("partial.api.Model");
		assertClass("partial.api.ModelApi");
		assertClass("partial.api.ModelApiTestClient");
		assertClass("partial.invoker.TimeTypeConverterRegistrar");
		assertClass("partial.invoker.HttpResponseAssertions");
	}

	@Test
	@DisplayName("all")
	void allPackage() {
		assertClass("all.model.Model");
		assertClass("all.api.ModelApi");
		assertClass("all.api.ModelApiTestClient");
		assertClass("all.invoker.TimeTypeConverterRegistrar");
		assertClass("all.invoker.HttpResponseAssertions");
	}

	private static void assertClass(String name) {
		try {
			Class.forName(name);
		} catch (ClassNotFoundException e) {
			fail("Class " + name + " not found.");
		}
	}
}
