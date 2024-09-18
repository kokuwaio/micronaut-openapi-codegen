package issue._414;

/** Test client for {@link DefaultApi}. **/
@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client("${micronaut.http.services.test.clientId:/}")
public interface DefaultApiTestClient {

	@io.micronaut.http.annotation.Get("/doIt")
	io.micronaut.http.HttpResponse<?> doIt();
}
