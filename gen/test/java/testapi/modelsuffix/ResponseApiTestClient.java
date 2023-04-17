package testapi.modelsuffix;

/** Test client for {@link ResponseApi}. **/
@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client("/")
public interface ResponseApiTestClient {

	@io.micronaut.http.annotation.Get("/response/array-complex")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<java.util.List<StringModelVO>> arrayComplex();

	@io.micronaut.http.annotation.Get("/response/array-complex-not-found")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<java.util.List<StringModelVO>> arrayComplexNotFound(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "found")
			java.lang.Boolean found);

	@io.micronaut.http.annotation.Get("/response/array-simple")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<java.util.List<java.lang.String>> arraySimple();

	@io.micronaut.http.annotation.Get("/response/array-simple-empty")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<java.util.List<java.lang.String>> arraySimpleEmpty();

	@io.micronaut.http.annotation.Get("/response/array-simple-not-found")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<java.util.List<java.lang.String>> arraySimpleNotFound(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "found")
			java.lang.Boolean found);

	@io.micronaut.http.annotation.Get("/response/header")
	io.micronaut.http.HttpResponse<?> header();

	@io.micronaut.http.annotation.Get("/response/multiple-datatypes")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<?> multipleDataTypes(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "redirect")
			java.lang.Boolean redirect);

	@io.micronaut.http.annotation.Get("/response/multiple-datatypes-not-found")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<?> multipleDataTypesNotFound(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "redirect")
			java.lang.Boolean redirect,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "found")
			java.lang.Boolean found);

	@io.micronaut.http.annotation.Get("/response/multiple-response-codes")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<StringModelVO> multipleResponseCodes(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "redirect")
			java.lang.Boolean redirect);

	@io.micronaut.http.annotation.Get("/response/multiple-response-codes-not-found")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<StringModelVO> multipleResponseCodesNotFound(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "redirect")
			java.lang.Boolean redirect,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "found")
			java.lang.Boolean found);

	@io.micronaut.http.annotation.Get("/response/optional")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<java.lang.String> optional(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "found")
			java.lang.Boolean found);

	@io.micronaut.http.annotation.Get("/response/single")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<java.lang.String> single();

	@io.micronaut.http.annotation.Get("/response/void")
	io.micronaut.http.HttpResponse<?> voidFound();

	@io.micronaut.http.annotation.Get("/response/void-not-found")
	io.micronaut.http.HttpResponse<?> voidNotFound(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "found")
			java.lang.Boolean found);

	@io.micronaut.http.annotation.Get("/response/default")
	io.micronaut.http.HttpResponse<?> withDefault();
}
