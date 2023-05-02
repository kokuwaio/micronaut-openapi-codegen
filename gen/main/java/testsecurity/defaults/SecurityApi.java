package testsecurity.defaults;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.validation.Validated
public interface SecurityApi {

	java.lang.String PATH_ANONYMOUS = "/anonymous";
	java.lang.String PATH_AUTHENTICATED_WITH_PARAM = "/authenticated/with-param";
	java.lang.String PATH_AUTHENTICATED_WITHOUT_PARAM = "/authenticated/without-param";

	@io.micronaut.http.annotation.Get("/anonymous")
	io.micronaut.http.HttpResponse<Object> anonymous();

	@io.micronaut.http.annotation.Get("/authenticated/with-param")
	io.micronaut.http.HttpResponse<Object> authenticatedWithParam(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "queryParam")
			java.util.Optional<java.lang.String> queryParam);

	@io.micronaut.http.annotation.Get("/authenticated/without-param")
	io.micronaut.http.HttpResponse<Object> authenticatedWithoutParam();
}