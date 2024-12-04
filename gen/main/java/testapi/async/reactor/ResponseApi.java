package testapi.async.reactor;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.validation.Validated
public interface ResponseApi {

	@io.micronaut.http.annotation.Get("/response/array-complex")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<java.util.List<StringModel>>> arrayComplex();

	@io.micronaut.http.annotation.Get("/response/array-complex-not-found")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<java.util.List<StringModel>>> arrayComplexNotFound(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "found")
			java.lang.Boolean found);

	@io.micronaut.http.annotation.Get("/response/array-simple")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<java.util.List<java.lang.String>>> arraySimple();

	@io.micronaut.http.annotation.Get("/response/array-simple-empty")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<java.util.List<java.lang.String>>> arraySimpleEmpty();

	@io.micronaut.http.annotation.Get("/response/array-simple-not-found")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<java.util.List<java.lang.String>>> arraySimpleNotFound(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "found")
			java.lang.Boolean found);

	@io.micronaut.http.annotation.Get("/response/header")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> header();

	@io.micronaut.http.annotation.Get("/response/multiple-datatypes")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> multipleDataTypes(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "redirect")
			java.lang.Boolean redirect);

	@io.micronaut.http.annotation.Get("/response/multiple-datatypes-not-found")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> multipleDataTypesNotFound(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "redirect")
			java.lang.Boolean redirect,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "found")
			java.lang.Boolean found);

	@io.micronaut.http.annotation.Get("/response/multiple-response-codes")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<StringModel>> multipleResponseCodes(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "redirect")
			java.lang.Boolean redirect);

	@io.micronaut.http.annotation.Get("/response/multiple-response-codes-not-found")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<StringModel>> multipleResponseCodesNotFound(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "redirect")
			java.lang.Boolean redirect,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "found")
			java.lang.Boolean found);

	@io.micronaut.http.annotation.Get("/response/optional")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<java.lang.String>> optional(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "found")
			java.lang.Boolean found);

	@io.micronaut.http.annotation.Get("/response/single")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<java.lang.String>> single();

	@io.micronaut.http.annotation.Get("/response/void")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> voidFound();

	@io.micronaut.http.annotation.Get("/response/void-not-found")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> voidNotFound(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "found")
			java.lang.Boolean found);

	@io.micronaut.http.annotation.Get("/response/default")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> withDefault();
}
