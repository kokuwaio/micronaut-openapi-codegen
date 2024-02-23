package testapi.async.reactor;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.validation.Validated
public interface ValidationApi {

	@io.micronaut.http.annotation.Get("/validation/double/max")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationDoubleMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@jakarta.validation.constraints.DecimalMax(value = "4", inclusive = false)
			java.lang.Double number);

	@io.micronaut.http.annotation.Get("/validation/double/min")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationDoubleMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@jakarta.validation.constraints.DecimalMin(value = "3", inclusive = false)
			java.lang.Double number);

	@io.micronaut.http.annotation.Get("/validation/double/range")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationDoubleRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@jakarta.validation.constraints.DecimalMin(value = "3", inclusive = true)
			@jakarta.validation.constraints.DecimalMax(value = "4", inclusive = true)
			java.lang.Double number);

	@io.micronaut.http.annotation.Get("/validation/float/max")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationFloatMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@jakarta.validation.constraints.DecimalMax(value = "4", inclusive = false)
			java.lang.Float number);

	@io.micronaut.http.annotation.Get("/validation/float/min")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationFloatMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@jakarta.validation.constraints.DecimalMin(value = "3", inclusive = false)
			java.lang.Float number);

	@io.micronaut.http.annotation.Get("/validation/float/range")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationFloatRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@jakarta.validation.constraints.DecimalMin(value = "3", inclusive = true)
			@jakarta.validation.constraints.DecimalMax(value = "4", inclusive = true)
			java.lang.Float number);

	@io.micronaut.http.annotation.Get("/validation/integer/max")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationIntegerMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Max(4)
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/validation/integer/min")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationIntegerMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Min(3)
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/validation/integer/range")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationIntegerRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Min(3)
			@jakarta.validation.constraints.Max(4)
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/validation/list/max")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationListMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "list")
			@jakarta.validation.constraints.Size(max = 4)
			java.util.List<java.lang.@jakarta.validation.constraints.NotNull Integer> list);

	@io.micronaut.http.annotation.Get("/validation/list/min")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationListMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "list")
			@jakarta.validation.constraints.Size(min = 3)
			java.util.List<java.lang.@jakarta.validation.constraints.NotNull Integer> list);

	@io.micronaut.http.annotation.Post("/validation/list/model")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationListModel(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			java.util.List<@jakarta.validation.constraints.NotNull @jakarta.validation.Valid StringModel> stringModel);

	@io.micronaut.http.annotation.Post("/validation/list/range")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationListRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "list")
			@jakarta.validation.constraints.Size(min = 3, max = 4)
			java.util.List<java.lang.@jakarta.validation.constraints.NotNull Integer> list);

	@io.micronaut.http.annotation.Get("/validation/long/max")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationLongMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Max(4)
			java.lang.Long integer);

	@io.micronaut.http.annotation.Get("/validation/long/min")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationLongMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Min(3)
			java.lang.Long integer);

	@io.micronaut.http.annotation.Get("/validation/long/range")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationLongRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Min(3)
			@jakarta.validation.constraints.Max(4)
			java.lang.Long integer);

	@io.micronaut.http.annotation.Post("/validation/model")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationModel(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			@jakarta.validation.Valid
			StringModel stringModel);

	@io.micronaut.http.annotation.Get("/validation/string/max")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationStringMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			@jakarta.validation.constraints.Size(max = 4)
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/validation/string/min")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationStringMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			@jakarta.validation.constraints.Size(min = 3)
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/validation/string/pattern")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationStringPattern(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			@jakarta.validation.constraints.Pattern(regexp = "[a-z]{3,5}")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/validation/string/range")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationStringRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			@jakarta.validation.constraints.Size(min = 3, max = 4)
			java.lang.String string);
}
