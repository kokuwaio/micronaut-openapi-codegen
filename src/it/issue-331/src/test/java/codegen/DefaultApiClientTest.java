package codegen;

import codegen.client.DefaultApiClient;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import jakarta.validation.ValidationException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

@MicronautTest
public class DefaultApiClientTest {

	@Inject
	DefaultApiClient defaultApiClient;

	@Test
	public void bodyValidated() {
		var invalidModel = new ModelComplex().string("avvvv");
		assertThrows(ValidationException.class,
				() -> defaultApiClient.complex(null, null, null, invalidModel));
	}

	@Test
	public void paramValidated() {
		var invalidModel = new ModelComplex().string("avvvv");
		assertThrows(ValidationException.class,
				() -> defaultApiClient.complex(null, null, invalidModel, null));
	}

}
