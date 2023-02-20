package testapi.async.simple;

/** Test client for {@link RequestApi}. **/
@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client("/")
public interface RequestApiTestClient {

	@io.micronaut.http.annotation.Get("/no-operation-id")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	io.micronaut.http.HttpResponse<?> noOperationIdGet();
}
