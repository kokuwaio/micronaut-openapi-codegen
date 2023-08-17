package testapi.async.reactor;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client(id = "id")
public interface RequestApiClient {

	java.lang.String PATH_NO_OPERATION_ID_GET = "/no-operation-id";

	@io.micronaut.http.annotation.Get(PATH_NO_OPERATION_ID_GET)
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> noOperationIdGet();
}
