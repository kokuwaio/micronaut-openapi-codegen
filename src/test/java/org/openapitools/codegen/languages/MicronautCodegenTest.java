package org.openapitools.codegen.languages;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openapitools.codegen.languages.features.BeanValidationFeatures;
import org.openapitools.codegen.languages.features.OptionalFeatures;
import org.openapitools.codegen.languages.features.UseGenericResponseFeatures;

public class MicronautCodegenTest extends AbstractCodegenTest {

	@DisplayName("api with defaults")
	@Test
	void api() {
		generate(configurator(SPEC_TEST_API, "testapi.defaults"));
	}

	@DisplayName("api without validation")
	@Test
	void apiWithoutValidation() {
		generate(configurator(SPEC_TEST_API, "testapi.novalidation")
				.addAdditionalProperty(BeanValidationFeatures.USE_BEANVALIDATION, false));
	}

	@DisplayName("api without optional")
	@Test
	void apiWithoutOptional() {
		generate(configurator(SPEC_TEST_API, "testapi.nooptional")
				.addAdditionalProperty(OptionalFeatures.USE_OPTIONAL, false));
	}

	@DisplayName("api without generic")
	@Test
	void apiWithoutGeneric() {
		generate(configurator(SPEC_TEST_API, "testapi.nogeneric")
				.addAdditionalProperty(UseGenericResponseFeatures.USE_GENERIC_RESPONSE, false));
	}

	@DisplayName("api with model suffix")
	@Test
	void apiWithModelSuffix() {
		generate(configurator(SPEC_TEST_API, "testapi.modelsuffix")
				.setModelNameSuffix("VO"));
	}

	@DisplayName("api with distinct packages")
	@Test
	void apiWithPackages() {
		var packageName = "testapi.packages";
		generate(configurator(SPEC_TEST_API, packageName)
				.setPackageName(packageName + ".root")
				.setApiPackage(packageName + ".api")
				.setModelPackage(packageName + ".model")
				.setInvokerPackage(packageName + ".invoker"));
	}

	@DisplayName("api with custom types")
	@Test
	void apiWithTypes() {
		generate(configurator(SPEC_TEST_API, "testapi.types")
				.addAdditionalProperty(MicronautCodegen.DATETIME_RELAXED, false)
				.addTypeMapping("DateTime", java.time.ZonedDateTime.class.getName())
				.addTypeMapping("double", java.math.BigDecimal.class.getName())
				.addTypeMapping("Generated", null)
				.addInstantiationType("list", java.util.Vector.class.getName())
				.addInstantiationType("set", java.util.TreeSet.class.getName())
				.addInstantiationType("map", java.util.TreeMap.class.getName()));
	}

	@DisplayName("api with async")
	@Test
	void apiWithAsyncReactor() {
		generate(configurator(SPEC_TEST_API, "testapi.async.reactor")
				.addAdditionalProperty(AbstractJavaCodegen.SUPPORT_ASYNC, true));
	}

	@DisplayName("api with async reactor nogeneric nooptional")
	@Test
	void apiWithAsyncSimple() {
		generate(configurator(SPEC_TEST_API, "testapi.async.simple")
				.addAdditionalProperty(AbstractJavaCodegen.SUPPORT_ASYNC, true)
				.addAdditionalProperty(UseGenericResponseFeatures.USE_GENERIC_RESPONSE, false)
				.addAdditionalProperty(OptionalFeatures.USE_OPTIONAL, false));
	}

	@DisplayName("model with default micronaut annotations")
	@Test
	void model() {
		generate(configurator(SPEC_TEST_MODEL_ONLY, "testmodel.micronaut"));
	}

	@DisplayName("model without micronaut annotations")
	@Test
	void modelWithoutMicronaut() {
		generate(configurator(SPEC_TEST_MODEL_ONLY, "testmodel.nomicronaut")
				.addAdditionalProperty(MicronautCodegen.INTROSPECTED, false)
				.addTypeMapping("Generated", null));
	}
}
