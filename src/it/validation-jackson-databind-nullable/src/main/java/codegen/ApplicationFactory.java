package codegen;

import javax.inject.Singleton;

import org.openapitools.jackson.nullable.JsonNullableModule;

import io.micronaut.context.annotation.Factory;

@Factory
public class ApplicationFactory {

	/**
	 * The Jackson module returned here is responsible for the marshalling/unmarshalling of
	 * {@link org.openapitools.jackson.nullable.JsonNullable}s.
	 *
	 * @return The instantiated module.
	 */
	@Singleton
	JsonNullableModule jsonNullableModule() {
		return new JsonNullableModule();
	}
}
