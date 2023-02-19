package testapi.defaults;

/** Test client for {@link RequestApi}. **/
@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client("/")
public interface RequestApiTestClient {

	@io.micronaut.http.annotation.Get("/no-operation-id")
	io.micronaut.http.HttpResponse<?> noOperationIdGet();
}
