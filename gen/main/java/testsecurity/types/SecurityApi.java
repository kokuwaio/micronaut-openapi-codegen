package testsecurity.types;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.validation.Validated
public interface SecurityApi {

	@io.micronaut.http.annotation.Get("/anonymous")
	io.micronaut.http.HttpResponse<Object> anonymous();

	@io.micronaut.http.annotation.Get("/authenticated/with-param")
	io.micronaut.http.HttpResponse<Object> authenticatedWithParam(
			@io.micronaut.core.annotation.NonNull
			java.security.Principal authentication,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "queryParam")
			java.util.Optional<java.lang.String> queryParam);

	@io.micronaut.http.annotation.Get("/authenticated/without-param")
	io.micronaut.http.HttpResponse<Object> authenticatedWithoutParam();
}
