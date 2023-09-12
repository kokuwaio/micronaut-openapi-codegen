package org.openapitools.codegen.languages;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openapitools.codegen.CodegenConstants;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;

public class IssueCodegenTest extends AbstractCodegenTest {

	@DisplayName("model without micronaut annotations")
	@Test
	void modelWithoutMicronaut() {
		generate(configurator("src/test/resources/openapi/issue-303.yaml", "issue._303").setGenerateAliasAsModel(true));
	}

	static void generate(CodegenConfigurator configurator) {
		var gen = new DefaultGenerator();
		gen.setGenerateMetadata(false);
		gen.setGeneratorPropertyDefault(CodegenConstants.SUPPORTING_FILES, "false");
		gen.setGeneratorPropertyDefault(CodegenConstants.APIS, "true");
		gen.setGeneratorPropertyDefault(CodegenConstants.MODELS, "true");
		gen.opts(configurator.toClientOptInput()).generate();
	}
}
