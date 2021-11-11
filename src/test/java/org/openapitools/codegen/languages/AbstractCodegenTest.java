package org.openapitools.codegen.languages;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.fail;

import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.openapitools.codegen.CodegenConstants;
import org.openapitools.codegen.DefaultCodegen;
import org.openapitools.codegen.DefaultGenerator;
import org.openapitools.codegen.config.CodegenConfigurator;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class AbstractCodegenTest {

	static final String SPEC_TEST_API = "src/test/resources/openapi/test-api.yaml";
	static final String SPEC_TEST_MODEL_ONLY = "src/test/resources/openapi/test-model.yaml";
	static final Path SOURCE_FOLDER = Paths.get("gen/main/java");
	static final Path TEST_FOLDER = Paths.get("gen/test/java");

	static String getName(Class<? extends DefaultCodegen> codegen) {
		return assertDoesNotThrow(() -> codegen.getDeclaredConstructor().newInstance().getName());
	}

	static CodegenConfigurator configurator(String spec, String packageName) {
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

	static void generate(CodegenConfigurator configurator) {
		var gen = new DefaultGenerator();
		gen.setGenerateMetadata(false);

		// server

		gen.opts(configurator.toClientOptInput()).generate();

		// client without model/supporting files

		gen.setGeneratorPropertyDefault(CodegenConstants.APIS, Boolean.TRUE.toString());
		gen.opts(configurator.addAdditionalProperty(MicronautCodegen.CLIENT_ID, "id").toClientOptInput()).generate();
	}
}