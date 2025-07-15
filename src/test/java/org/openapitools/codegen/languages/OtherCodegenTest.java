package org.openapitools.codegen.languages;

import java.util.function.Consumer;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openapitools.codegen.CodegenConstants;
import org.openapitools.codegen.DefaultCodegen;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;
import org.openapitools.codegen.languages.features.DocumentationProviderFeatures;
import org.openapitools.codegen.languages.features.DocumentationProviderFeatures.AnnotationLibrary;
import org.openapitools.codegen.languages.features.DocumentationProviderFeatures.DocumentationProvider;

@SuppressWarnings({ "removal", "deprecation" })
public class OtherCodegenTest extends AbstractCodegenTest {

	@DisplayName("api: micronaut")
	@Test
	void apiMicronaut() {
		generate(JavaMicronautServerCodegen.class, SPEC_API, "testapi.micronaut-java", configurator -> {});
	}

	@DisplayName("security: micronaut")
	@Test
	void securityicronaut() {
		generate(JavaMicronautServerCodegen.class, SPEC_SECURITY, "testsecurity.micronaut-java", configurator -> {});
	}

	@DisplayName("model: micronaut")
	@Test
	void modelMicronaut() {
		generate(JavaMicronautServerCodegen.class, SPEC_MODEL, "testmodel.micronaut-java", configurator -> {});
	}

	@DisplayName("model: jaxrs")
	@Test
	void modelJaxRS() {
		generate(JavaJAXRSSpecServerCodegen.class, SPEC_MODEL, "testmodel.jaxrs", configurator -> configurator
				.addAdditionalProperty(JavaJAXRSSpecServerCodegen.USE_SWAGGER_ANNOTATIONS, false));
	}

	@DisplayName("model: spring")
	@Test
	void modelSpring() {
		generate(SpringCodegen.class, SPEC_MODEL, "testmodel.spring", configurator -> configurator
				.addAdditionalProperty(SpringCodegen.INTERFACE_ONLY, true)
				.addAdditionalProperty(DocumentationProviderFeatures.DOCUMENTATION_PROVIDER,
						DocumentationProvider.SOURCE.name())
				.addAdditionalProperty(DocumentationProviderFeatures.ANNOTATION_LIBRARY,
						AnnotationLibrary.NONE.name()));
	}

	private static void generate(Class<? extends DefaultCodegen> codegen, String spec, String packageName,
			Consumer<CodegenConfigurator> configure) {
		var suppressAllWarnings = "@" + SuppressWarnings.class.getName() + "(\"all\")";
		var configurator = configurator(spec, packageName)
				.setGeneratorName(getName(codegen))
				.setInvokerPackage(packageName)
				.setModelPackage(packageName)
				.setApiPackage(packageName)
				.addAdditionalProperty(CodegenConstants.HIDE_GENERATION_TIMESTAMP, true)
				.addAdditionalProperty(CodegenConstants.LEGACY_DISCRIMINATOR_BEHAVIOR, true)
				.addAdditionalProperty(CodegenConstants.USE_ONEOF_DISCRIMINATOR_LOOKUP, true)
				.addAdditionalProperty(JavaMicronautAbstractCodegen.OPT_REACTIVE, false)
				.addAdditionalProperty(JavaMicronautAbstractCodegen.OPT_GENERATE_SWAGGER_ANNOTATIONS, false)
				.addAdditionalProperty(AbstractJavaCodegen.ADDITIONAL_MODEL_TYPE_ANNOTATIONS, suppressAllWarnings)
				.addAdditionalProperty(AbstractJavaCodegen.ADDITIONAL_ENUM_TYPE_ANNOTATIONS, suppressAllWarnings)
				.addAdditionalProperty(AbstractJavaCodegen.DATE_LIBRARY, "java8");
		configure.accept(configurator);
		var gen = new DefaultGenerator();
		gen.setGeneratorPropertyDefault(CodegenConstants.SUPPORTING_FILES, "false");
		gen.setGeneratorPropertyDefault(CodegenConstants.MODEL_DOCS, "false");
		gen.setGeneratorPropertyDefault(CodegenConstants.MODEL_TESTS, "false");
		gen.setGeneratorPropertyDefault(CodegenConstants.MODELS, "true");
		gen.setGeneratorPropertyDefault(CodegenConstants.API_DOCS, "false");
		gen.setGeneratorPropertyDefault(CodegenConstants.API_TESTS, "false");
		gen.setGeneratorPropertyDefault(CodegenConstants.APIS, "true");
		gen.setGenerateMetadata(false);
		gen.opts(configurator.toClientOptInput()).generate();
	}
}
