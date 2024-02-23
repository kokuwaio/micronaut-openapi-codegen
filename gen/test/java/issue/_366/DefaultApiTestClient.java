package issue._366;

/** Test client for {@link DefaultApi}. **/
@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client("${micronaut.http.services.test.clientId:/}")
public interface DefaultApiTestClient {

	@io.micronaut.http.annotation.Get("/doIt?{&my_query_param*}")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<java.util.List<java.lang.String>> doIt(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "my_query_param")
			java.util.List<java.lang.String> myQueryParam);
}
