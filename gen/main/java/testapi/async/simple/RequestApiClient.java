package testapi.async.simple;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client(id = "id")
public interface RequestApiClient {

	java.lang.String PATH_NO_OPERATION_ID_GET = "/no-operation-id";

	@io.micronaut.http.annotation.Get(PATH_NO_OPERATION_ID_GET)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> noOperationIdGet();
}
