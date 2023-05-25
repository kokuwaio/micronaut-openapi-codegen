package codegen.client;

import static codegen.HttpResponseAssertions.assert204;
import static codegen.HttpResponseAssertions.assert401;

import org.junit.jupiter.api.Test;

import codegen.AbstractTest;
import codegen.server.SecurityApiTestSpec;
import jakarta.inject.Inject;

public class SecurityClientTest extends AbstractTest implements SecurityApiTestSpec {

	@Inject
	SecurityApiClient client;

	@Test
	@Override
	public void anonymous204() {
		assert204(() -> client.anonymous());
	}

	@Test
	@Override
	public void authenticatedWithParam204() {
		assert204(() -> client.authenticatedWithParam(auth("sub1", "role_a", "role_b"), "param"));
	}

	@Test
	@Override
	public void authenticatedWithParam401() {
		assert401(() -> client.authenticatedWithParam(null, "param"));
		assert401(() -> client.authenticatedWithParam("invalidToken", "param"));
	}

	@Test
	@Override
	public void authenticatedWithoutParam204() {
		assert204(() -> client.authenticatedWithoutParam(auth("sub2", "role_c", "role_d")));
	}

	@Test
	@Override
	public void authenticatedWithoutParam401() {
		assert401(() -> client.authenticatedWithoutParam(null));
		assert401(() -> client.authenticatedWithoutParam("invalidToken"));
	}
}
