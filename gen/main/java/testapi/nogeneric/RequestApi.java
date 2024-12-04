package testapi.nogeneric;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.validation.Validated
public interface RequestApi {

	@io.micronaut.http.annotation.Get("/no-operation-id")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void noOperationIdGet();
}
