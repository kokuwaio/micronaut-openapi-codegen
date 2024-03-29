package org.openapitools.codegen.languages;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openapitools.codegen.CodegenConstants;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;
import org.openapitools.codegen.languages.features.BeanValidationFeatures;
import org.openapitools.codegen.languages.features.OptionalFeatures;
import org.openapitools.codegen.languages.features.UseGenericResponseFeatures;

public class MicronautCodegenTest extends AbstractCodegenTest {

	@DisplayName("api with defaults")
	@Test
	void api() {
		generate(configurator(SPEC_API, "testapi.defaults"));
	}

	@DisplayName("api without validation")
	@Test
	void apiWithoutValidation() {
		generate(configurator(SPEC_API, "testapi.novalidation")
				.addAdditionalProperty(BeanValidationFeatures.USE_BEANVALIDATION, false));
	}

	@DisplayName("api without optional")
	@Test
	void apiWithoutOptional() {
		generate(configurator(SPEC_API, "testapi.nooptional")
				.addAdditionalProperty(OptionalFeatures.USE_OPTIONAL, false));
	}

	@DisplayName("api without generic")
	@Test
	void apiWithoutGeneric() {
		generate(configurator(SPEC_API, "testapi.nogeneric")
				.addAdditionalProperty(UseGenericResponseFeatures.USE_GENERIC_RESPONSE, false));
	}

	@DisplayName("api with model suffix")
	@Test
	void apiWithModelSuffix() {
		generate(configurator(SPEC_API, "testapi.modelsuffix")
				.setModelNameSuffix("VO"));
	}

	@DisplayName("api with distinct packages")
	@Test
	void apiWithPackages() {
		var packageName = "testapi.packages";
		generate(configurator(SPEC_API, packageName)
				.addAdditionalProperty(MicronautCodegen.GENERATE_EXAMPLES, true)
				.setPackageName(packageName + ".root")
				.setApiPackage(packageName + ".api")
				.setModelPackage(packageName + ".model")
				.setInvokerPackage(packageName + ".invoker"));
	}

	@DisplayName("api with custom types")
	@Test
	void apiWithTypes() {
		generate(configurator(SPEC_API, "testapi.types")
				.addAdditionalProperty(MicronautCodegen.DATETIME_RELAXED, false)
				.addTypeMapping("DateTime", java.time.ZonedDateTime.class.getName())
				.addTypeMapping("double", java.math.BigDecimal.class.getName())
				.addTypeMapping("Generated", null)
				.addInstantiationType("list", java.util.Vector.class.getName())
				.addInstantiationType("set", java.util.TreeSet.class.getName())
				.addInstantiationType("map", java.util.TreeMap.class.getName()));
	}

	@DisplayName("api with constants")
	@Test
	void apiWithConstants() {
		generate(configurator(SPEC_API, "testapi.constants")
				.addAdditionalProperty(MicronautCodegen.GENERATE_CONSTANTS, true));
	}

	@DisplayName("api with async")
	@Test
	void apiWithAsyncReactor() {
		generate(configurator(SPEC_API, "testapi.async.reactor")
				.addAdditionalProperty(AbstractJavaCodegen.SUPPORT_ASYNC, true));
	}

	@DisplayName("api with async reactor nogeneric nooptional")
	@Test
	void apiWithAsyncSimple() {
		generate(configurator(SPEC_API, "testapi.async.simple")
				.addAdditionalProperty(AbstractJavaCodegen.SUPPORT_ASYNC, true)
				.addAdditionalProperty(UseGenericResponseFeatures.USE_GENERIC_RESPONSE, false)
				.addAdditionalProperty(OptionalFeatures.USE_OPTIONAL, false));
	}

	@DisplayName("security with defaults for server")
	@Test
	void securityServer() {
		generate(configurator(SPEC_SECURITY, "testsecurity.defaults.server"));
	}

	@DisplayName("security with defaults for client")
	@Test
	void securityClient() {
		generate(configurator(SPEC_SECURITY, "testsecurity.defaults.client")
				.addAdditionalProperty(MicronautCodegen.CLIENT_ID, "test"));
	}

	@DisplayName("security with authentication for client")
	@Test
	void securityWithAuthenticationClient() {
		generate(configurator(SPEC_SECURITY, "testsecurity.auth.client")
				.addAdditionalProperty(MicronautCodegen.CLIENT_ID, "test")
				.addAdditionalProperty(MicronautCodegen.GENERATE_AUTHENTICATION, true));
	}

	@DisplayName("security with authentication for server")
	@Test
	void securityWithAuthenticationServer() {
		generate(configurator(SPEC_SECURITY, "testsecurity.auth.server")
				.addAdditionalProperty(MicronautCodegen.GENERATE_AUTHENTICATION, true));
	}

	@DisplayName("security with custom types")
	@Test
	void securityWithTypes() {
		generate(configurator(SPEC_SECURITY, "testsecurity.types")
				.addAdditionalProperty(MicronautCodegen.GENERATE_AUTHENTICATION, true)
				.addTypeMapping("Authentication", java.security.Principal.class.getName()));
	}

	@DisplayName("model pojo with JsonNullable")
	@Test
	void modelPojoWithJsonNullable() {
		generate(configurator(SPEC_MODEL, "testmodel.micronaut_pojo_nullable"));
	}

	@DisplayName("model pojo without JsonNullable")
	@Test
	void modelPojoWithoutJsonNullable() {
		generate(configurator(SPEC_MODEL, "testmodel.micronaut_pojo")
				.addAdditionalProperty(AbstractJavaCodegen.OPENAPI_NULLABLE, false));
	}

	@DisplayName("model pojo without sealed")
	@Test
	void modelPojoWithoutSealed() {
		generate(configurator(SPEC_MODEL, "testmodel.micronaut_pojo_unsealed")
				.addAdditionalProperty(MicronautCodegen.SEALED, false));
	}

	@DisplayName("model pojo with constants")
	@Test
	void modelPojoWithConstants() {
		generate(configurator(SPEC_MODEL, "testmodel.micronaut_pojo_constants")
				.addAdditionalProperty(MicronautCodegen.GENERATE_CONSTANTS, true));
	}

	@DisplayName("model records without JsonNullable")
	@Test
	void modelRecordsWithoutJsonNullable() {
		generate(configurator(SPEC_MODEL, "testmodel.micronaut_record")
				.addAdditionalProperty(AbstractJavaCodegen.OPENAPI_NULLABLE, false)
				.addAdditionalProperty(MicronautCodegen.RECORD, true));
	}

	@DisplayName("model records with constants")
	@Test
	void modelRecordsWithConstants() {
		generate(configurator(SPEC_MODEL, "testmodel.micronaut_record_constants")
				.addAdditionalProperty(MicronautCodegen.RECORD, true)
				.addAdditionalProperty(MicronautCodegen.GENERATE_CONSTANTS, true));
	}

	@DisplayName("model without micronaut annotations")
	@Test
	void modelWithoutMicronaut() {
		generate(configurator(SPEC_MODEL, "testmodel.nomicronaut")
				.addAdditionalProperty(MicronautCodegen.SERDEABLE, false)
				.addAdditionalProperty(MicronautCodegen.GENERATE_EXAMPLES, true)
				.addTypeMapping("Generated", null));
	}

	static void generate(CodegenConfigurator configurator) {
		var gen = new DefaultGenerator();
		gen.setGenerateMetadata(false);
		gen.setGeneratorPropertyDefault(CodegenConstants.SUPPORTING_FILES, "false");
		gen.setGeneratorPropertyDefault(CodegenConstants.APIS, "true");
		gen.setGeneratorPropertyDefault(CodegenConstants.MODELS, "true");

		// server

		gen.opts(configurator.toClientOptInput()).generate();

		// client without model/supporting files

		gen.opts(configurator.addAdditionalProperty(MicronautCodegen.CLIENT_ID, "id").toClientOptInput()).generate();
	}
}
