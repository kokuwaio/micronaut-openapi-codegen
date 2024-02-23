package codegen;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import codegen.server.DefaultApiTestClient;
import codegen.server.DefaultApiTestSpec;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;

@MicronautTest
public class DefaultControllerTest implements DefaultApiTestSpec {

	@Inject
	DefaultApiTestClient client;

	@Test
	@Override
	public void doIt200() {
		var params = List.of("foo", "bar", "!");
		assertEquals(params, client.doIt(params).body());
	}
}
