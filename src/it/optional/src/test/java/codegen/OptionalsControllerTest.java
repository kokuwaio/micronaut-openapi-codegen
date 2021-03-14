package codegen;

import static codegen.HttpResponseAssertions.assert204;
import static codegen.HttpResponseAssertions.assert400;

import javax.inject.Inject;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@MicronautTest
public class OptionalsControllerTest implements OptionalsApiTestSpec {

	@Inject
	OptionalsApiTestClient client;

	@DisplayName("issue #49: no version")
	@Test
	@Override
	public void issue49204() {
		assert204(() -> client.issue49(null));
	}

	@DisplayName("issue #49: valid version")
	@Test
	public void issue49204Valid() {
		assert204(() -> client.issue49("1.2.3"));
	}

	@DisplayName("issue #49: invalid version")
	@Test
	@Override
	public void issue49400() {
		assert400(() -> client.issue49("a.b.c"));
	}

	@Override
	public void get200() {}

	@Override
	public void post201() {}
}
