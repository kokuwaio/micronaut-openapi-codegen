package testsecurity.types;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client(id = "id")
public interface SecurityApiClient {

	java.lang.String PATH_ANONYMOUS = "/anonymous";
	java.lang.String PATH_AUTHENTICATED_WITH_PARAM = "/authenticated/with-param";
	java.lang.String PATH_AUTHENTICATED_WITHOUT_PARAM = "/authenticated/without-param";

	@io.micronaut.http.annotation.Get("/anonymous")
	io.micronaut.http.HttpResponse<Object> anonymous();

	@io.micronaut.http.annotation.Get("/authenticated/with-param")
	io.micronaut.http.HttpResponse<Object> authenticatedWithParam(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "queryParam")
			java.lang.String queryParam);

	@io.micronaut.http.annotation.Get("/authenticated/with-param")
	io.micronaut.http.HttpResponse<Object> authenticatedWithParam(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Header(io.micronaut.http.HttpHeaders.AUTHORIZATION)
			String authorization,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "queryParam")
			java.lang.String queryParam);


	@io.micronaut.http.annotation.Get("/authenticated/without-param")
	io.micronaut.http.HttpResponse<Object> authenticatedWithoutParam();

	@io.micronaut.http.annotation.Get("/authenticated/without-param")
	io.micronaut.http.HttpResponse<Object> authenticatedWithoutParam(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Header(io.micronaut.http.HttpHeaders.AUTHORIZATION)
			String authorization);

}
