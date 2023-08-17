package testsecurity.auth.server;

/** Test client for {@link SecurityApi}. **/
@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client("/")
public interface SecurityApiTestClient {

	@io.micronaut.http.annotation.Get("/anonymous")
	io.micronaut.http.HttpResponse<?> anonymous();

	@io.micronaut.http.annotation.Get("/authenticated/with-param")
	io.micronaut.http.HttpResponse<?> authenticatedWithParam(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Header(io.micronaut.http.HttpHeaders.AUTHORIZATION)
			java.lang.String authorization,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "queryParam")
			java.lang.String queryParam);

	@io.micronaut.http.annotation.Get("/authenticated/without-param")
	io.micronaut.http.HttpResponse<?> authenticatedWithoutParam(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Header(io.micronaut.http.HttpHeaders.AUTHORIZATION)
			java.lang.String authorization);
}
