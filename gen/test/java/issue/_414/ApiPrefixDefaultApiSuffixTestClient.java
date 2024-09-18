package issue._414;

/** Test client for {@link ApiPrefixDefaultApiSuffix}. **/
@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client("${micronaut.http.services.test.clientId:/}")
public interface ApiPrefixDefaultApiSuffixTestClient {

	@io.micronaut.http.annotation.Get("/doIt")
	io.micronaut.http.HttpResponse<?> doIt();
}
