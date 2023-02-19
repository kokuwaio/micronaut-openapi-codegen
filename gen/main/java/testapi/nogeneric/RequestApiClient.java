package testapi.nogeneric;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client(id = "id")
public interface RequestApiClient {

	java.lang.String PATH_NO_OPERATION_ID_GET = "/no-operation-id";

	@io.micronaut.http.annotation.Get("/no-operation-id")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void noOperationIdGet();
}
