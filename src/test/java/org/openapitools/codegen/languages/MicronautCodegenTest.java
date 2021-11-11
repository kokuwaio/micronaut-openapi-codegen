package org.openapitools.codegen.languages;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.fail;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.function.Consumer;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.openapitools.codegen.CodegenConstants;
import org.openapitools.codegen.DefaultCodegen;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;
import org.openapitools.codegen.languages.features.BeanValidationFeatures;
import org.openapitools.codegen.languages.features.OptionalFeatures;
import org.openapitools.codegen.languages.features.UseGenericResponseFeatures;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class MicronautCodegenTest {

	private static final String SPEC_TEST_API = "src/test/resources/openapi/test-api.yaml";
	private static final String SPEC_TEST_MODEL_ONLY = "src/test/resources/openapi/test-model.yaml";
	private static final Path SOURCE_FOLDER = Paths.get("gen/main/java");
	private static final Path TEST_FOLDER = Paths.get("gen/test/java");

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

	@DisplayName("model with without micronaut annotations")
	@Test
	void modelWithoutconfigurator() {
		generate(configurator(SPEC_TEST_MODEL_ONLY, "testmodel.nomicronaut")
				.addAdditionalProperty(MicronautCodegen.INTROSPECTED, false)
				.addTypeMapping("Generated", null));
	}

	@DisplayName("model generator java")
	@Test
	void modelGeneratorJava() {
		generateModel(JavaClientCodegen.class, "testmodel.javaclient", configurator -> configurator
				.addAdditionalProperty(CodegenConstants.LIBRARY, JavaClientCodegen.JERSEY1));
	}

	@DisplayName("model generator jaxrs")
	@Test
	void modelGeneratorJaxRS() {
		generateModel(JavaJAXRSSpecServerCodegen.class, "testmodel.jaxrs", configurator -> {});
	}

	@DisplayName("model generator spring")
	@Disabled("generates invalid code for nullable map - check if this is a valid testcase")
	@Test
	void modelGeneratorSpring() {
		generateModel(SpringCodegen.class, "testmodel.spring", configurator -> configurator
				.addAdditionalProperty(SpringCodegen.INTERFACE_ONLY, true));
	}

	// internal

	private static CodegenConfigurator configurator(String spec, String packageName) {
		try {
			FileUtils.deleteDirectory(SOURCE_FOLDER.resolve(packageName.replace(".", "/")).toFile());
			FileUtils.deleteDirectory(TEST_FOLDER.resolve(packageName.replace(".", "/")).toFile());
		} catch (Exception e) {
			fail("failed to delete fold");
		}
		return new CodegenConfigurator()
				.setGeneratorName("micronaut")
				.setStrictSpecBehavior(true)
				.setValidateSpec(true)
				.setPackageName(packageName)
				.setInputSpec(spec)
				.setEnablePostProcessFile(false)
				.addAdditionalProperty("sourceFolder", SOURCE_FOLDER.toString())
				.addAdditionalProperty("testFolder", TEST_FOLDER.toString());
	}

	private static void generate(CodegenConfigurator configurator) {
		var gen = new DefaultGenerator();
		gen.setGenerateMetadata(false);

		// server

		gen.opts(configurator.toClientOptInput()).generate();

		// client without model/supporting files

		gen.setGeneratorPropertyDefault(CodegenConstants.APIS, Boolean.TRUE.toString());
		gen.opts(configurator.addAdditionalProperty(MicronautCodegen.CLIENT_ID, "id").toClientOptInput()).generate();
	}

	private static void generateModel(
			Class<? extends DefaultCodegen> codegen,
			String packageName,
			Consumer<CodegenConfigurator> configure) {
		var suppressAllWarnings = "@" + SuppressWarnings.class.getName() + "(\"all\")";
		var configurator = configurator(SPEC_TEST_MODEL_ONLY, packageName)
				.setGeneratorName(assertDoesNotThrow(() -> codegen.getDeclaredConstructor().newInstance().getName()))
				.setInvokerPackage(packageName)
				.setModelPackage(packageName)
				.setApiPackage(packageName)
				.addAdditionalProperty(CodegenConstants.HIDE_GENERATION_TIMESTAMP, true)
				.addAdditionalProperty(CodegenConstants.LEGACY_DISCRIMINATOR_BEHAVIOR, true)
				.addAdditionalProperty(CodegenConstants.USE_ONEOF_DISCRIMINATOR_LOOKUP, true)
				.addAdditionalProperty(AbstractJavaCodegen.ADDITIONAL_MODEL_TYPE_ANNOTATIONS, suppressAllWarnings)
				.addAdditionalProperty(AbstractJavaCodegen.ADDITIONAL_ENUM_TYPE_ANNOTATIONS, suppressAllWarnings)
				.addAdditionalProperty(AbstractJavaCodegen.JAVA8_MODE, true)
				.addAdditionalProperty(AbstractJavaCodegen.DATE_LIBRARY, "java8");
		configure.accept(configurator);
		var gen = new DefaultGenerator();
		gen.setGeneratorPropertyDefault(CodegenConstants.SUPPORTING_FILES, "false");
		gen.setGeneratorPropertyDefault(CodegenConstants.MODEL_TESTS, "false");
		gen.setGeneratorPropertyDefault(CodegenConstants.MODELS, "true");
		gen.setGenerateMetadata(false);
		gen.opts(configurator.toClientOptInput()).generate();
	}
}
