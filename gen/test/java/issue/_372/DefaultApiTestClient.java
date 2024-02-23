package issue._372;

/** Test client for {@link DefaultApi}. **/
@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client("${micronaut.http.services.test.clientId:/}")
public interface DefaultApiTestClient {

	@io.micronaut.http.annotation.Get("/doIt")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<Model> doIt(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "stringWithDefault")
			java.lang.String stringWithDefault,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			java.lang.Integer integer,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Body
			Model model);
}
