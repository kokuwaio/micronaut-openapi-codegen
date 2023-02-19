package testapi.async.simple;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.validation.Validated
public interface RequestApi {

	java.lang.String PATH_NO_OPERATION_ID_GET = "/no-operation-id";

	@io.micronaut.http.annotation.Get("/no-operation-id")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> noOperationIdGet();
}