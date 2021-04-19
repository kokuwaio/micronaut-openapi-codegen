package codegen;

import static codegen.HttpResponseAssertions.assert200;
import static codegen.HttpResponseAssertions.assert401;
import static codegen.HttpResponseAssertions.assert403;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@MicronautTest
class SecurityControllerTest implements SecurityApiTestSpec {

	@Inject
	SecurityApiTestClient client;
	@Inject
	JwtProvider jwt;

	@Test
	@Override
	public void unsecured200() {
		assert200(() -> client.unsecured());
	}

	@Test
	@Override
	public void secured200() {
		assert200(() -> client.secured(jwt.bearer("user")));
	}

	@Test
	@Override
	public void secured401() {
		assert401(() -> client.secured(null));
	}

	@Test
	@Override
	public void securedAdmin200() {
		assert200(() -> client.securedAdmin(jwt.bearer("user", "admin")));
	}

	@Test
	@Override
	public void securedAdmin401() {
		assert401(() -> client.securedAdmin(null));
	}

	@Test
	@Override
	public void securedAdmin403() {
		assert403(() -> client.securedAdmin(jwt.bearer("user")));
	}
}
