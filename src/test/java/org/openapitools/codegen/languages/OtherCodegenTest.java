package org.openapitools.codegen.languages;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.function.Consumer;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openapitools.codegen.CodegenConstants;
import org.openapitools.codegen.DefaultCodegen;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;
import org.openapitools.codegen.languages.features.DocumentationProviderFeatures;
import org.openapitools.codegen.languages.features.DocumentationProviderFeatures.AnnotationLibrary;
import org.openapitools.codegen.languages.features.DocumentationProviderFeatures.DocumentationProvider;

public class OtherCodegenTest extends AbstractCodegenTest {

	@DisplayName("api: micronaut")
	@Test
	void apiMicronaut() {
		generateApi(JavaMicronautServerCodegen.class, "testapi.micronaut-java", configurator -> {});
	}

	@DisplayName("model: micronaut")
	@Disabled("will generate invalid code because openapi generator it self has not tests and nobody verifies this")
	@Test
	void modelMicronaut() {
		generateModel(JavaMicronautServerCodegen.class, "testmodel.micronaut-java", configurator -> configurator
				.addAdditionalProperty(SpringCodegen.INTERFACE_ONLY, true)
				.addAdditionalProperty(JavaMicronautAbstractCodegen.OPT_GENERATE_SWAGGER_ANNOTATIONS, "false"));
	}

	@DisplayName("model: java")
	@Test
	void modelJava() {
		generateModel(JavaClientCodegen.class, "testmodel.javaclient", configurator -> configurator
				.addAdditionalProperty(CodegenConstants.LIBRARY, JavaClientCodegen.JERSEY1));
	}

	@DisplayName("model: jaxrs")
	@Test
	void modelJaxRS() {
		generateModel(JavaJAXRSSpecServerCodegen.class, "testmodel.jaxrs", configurator -> configurator
				.addAdditionalProperty(JavaJAXRSSpecServerCodegen.USE_SWAGGER_ANNOTATIONS, "false"));
	}

	@DisplayName("model: spring")
	@Test
	void modelSpring() {
		generateModel(SpringCodegen.class, "testmodel.spring", configurator -> configurator
				.addAdditionalProperty(SpringCodegen.INTERFACE_ONLY, true)
				.addAdditionalProperty(DocumentationProviderFeatures.DOCUMENTATION_PROVIDER,
						DocumentationProvider.SOURCE.name())
				.addAdditionalProperty(DocumentationProviderFeatures.ANNOTATION_LIBRARY,
						AnnotationLibrary.NONE.name()));
	}

	static void generateApi(Class<? extends DefaultCodegen> codegen, String packageName,
			Consumer<CodegenConfigurator> configure) {
		var suppressAllWarnings = "@" + SuppressWarnings.class.getName() + "(\"all\")";
		var configurator = configurator(SPEC_TEST_API, packageName)
				.setGeneratorName(getName(codegen))
				.setInvokerPackage(packageName)
				.setModelPackage(packageName)
				.setApiPackage(packageName)
				.addAdditionalProperty(AbstractJavaCodegen.ADDITIONAL_MODEL_TYPE_ANNOTATIONS, suppressAllWarnings)
				.addAdditionalProperty(AbstractJavaCodegen.ADDITIONAL_ENUM_TYPE_ANNOTATIONS, suppressAllWarnings)
				.addAdditionalProperty(AbstractJavaCodegen.DATE_LIBRARY, "java8");
		configure.accept(configurator);
		var gen = new DefaultGenerator();
		gen.setGeneratorPropertyDefault(CodegenConstants.SUPPORTING_FILES, "false");
		gen.setGeneratorPropertyDefault(CodegenConstants.MODEL_TESTS, "false");
		gen.setGeneratorPropertyDefault(CodegenConstants.MODEL_DOCS, "false");
		gen.setGeneratorPropertyDefault(CodegenConstants.GENERATE_API_TESTS, "false");
		gen.setGeneratorPropertyDefault(CodegenConstants.GENERATE_API_DOCS, "false");
		gen.setGenerateMetadata(false);
		gen.opts(configurator.toClientOptInput()).generate();
	}

	static void generateModel(Class<? extends DefaultCodegen> codegen, String packageName,
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
				.addAdditionalProperty(AbstractJavaCodegen.DATE_LIBRARY, "java8");
		configure.accept(configurator);
		var gen = new DefaultGenerator();
		gen.setGeneratorPropertyDefault(CodegenConstants.SUPPORTING_FILES, "false");
		gen.setGeneratorPropertyDefault(CodegenConstants.MODEL_TESTS, "false");
		gen.setGeneratorPropertyDefault(CodegenConstants.MODEL_DOCS, "false");
		gen.setGeneratorPropertyDefault(CodegenConstants.MODELS, "true");
		gen.setGenerateMetadata(false);
		gen.opts(configurator.toClientOptInput()).generate();
	}
}
