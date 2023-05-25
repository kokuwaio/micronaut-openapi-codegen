package codegen;

import io.micronaut.security.token.jwt.signature.SignatureGeneratorConfiguration;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;

@MicronautTest
public abstract class AbstractTest {

	@Inject
	SignatureGeneratorConfiguration signature;

	public String auth(String subject, String... roles) {
		return new JwtProvider(signature).builder().subject(subject).roles(roles).toBearer();
	}
}
