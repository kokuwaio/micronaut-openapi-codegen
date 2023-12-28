package testapi.async.simple;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.validation.Validated
public interface ValidationApi {

	@io.micronaut.http.annotation.Get("/validation/double/max")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationDoubleMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@jakarta.validation.constraints.DecimalMax(value = "4", inclusive = false)
			java.lang.Double number);

	@io.micronaut.http.annotation.Get("/validation/double/min")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationDoubleMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@jakarta.validation.constraints.DecimalMin(value = "3", inclusive = false)
			java.lang.Double number);

	@io.micronaut.http.annotation.Get("/validation/double/range")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationDoubleRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@jakarta.validation.constraints.DecimalMin(value = "3", inclusive = true)
			@jakarta.validation.constraints.DecimalMax(value = "4", inclusive = true)
			java.lang.Double number);

	@io.micronaut.http.annotation.Get("/validation/float/max")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationFloatMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@jakarta.validation.constraints.DecimalMax(value = "4", inclusive = false)
			java.lang.Float number);

	@io.micronaut.http.annotation.Get("/validation/float/min")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationFloatMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@jakarta.validation.constraints.DecimalMin(value = "3", inclusive = false)
			java.lang.Float number);

	@io.micronaut.http.annotation.Get("/validation/float/range")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationFloatRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@jakarta.validation.constraints.DecimalMin(value = "3", inclusive = true)
			@jakarta.validation.constraints.DecimalMax(value = "4", inclusive = true)
			java.lang.Float number);

	@io.micronaut.http.annotation.Get("/validation/integer/max")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationIntegerMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Max(4)
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/validation/integer/min")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationIntegerMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Min(3)
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/validation/integer/range")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationIntegerRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Min(3)
			@jakarta.validation.constraints.Max(4)
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/validation/list/max")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationListMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			@jakarta.validation.constraints.Size(max = 4)
			java.util.List<java.lang.@jakarta.validation.constraints.NotNull Integer> list);

	@io.micronaut.http.annotation.Get("/validation/list/min")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationListMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			@jakarta.validation.constraints.Size(min = 3)
			java.util.List<java.lang.@jakarta.validation.constraints.NotNull Integer> list);

	@io.micronaut.http.annotation.Post("/validation/list/model")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<java.lang.Void> validationListModel(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			java.util.List<@jakarta.validation.constraints.NotNull @jakarta.validation.Valid StringModel> stringModel);

	@io.micronaut.http.annotation.Post("/validation/list/range")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationListRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			@jakarta.validation.constraints.Size(min = 3, max = 4)
			java.util.List<java.lang.@jakarta.validation.constraints.NotNull Integer> list);

	@io.micronaut.http.annotation.Get("/validation/long/max")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationLongMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Max(4)
			java.lang.Long integer);

	@io.micronaut.http.annotation.Get("/validation/long/min")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationLongMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Min(3)
			java.lang.Long integer);

	@io.micronaut.http.annotation.Get("/validation/long/range")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationLongRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Min(3)
			@jakarta.validation.constraints.Max(4)
			java.lang.Long integer);

	@io.micronaut.http.annotation.Post("/validation/model")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<java.lang.Void> validationModel(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			@jakarta.validation.Valid
			StringModel stringModel);

	@io.micronaut.http.annotation.Get("/validation/string/max")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationStringMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			@jakarta.validation.constraints.Size(max = 4)
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/validation/string/min")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationStringMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			@jakarta.validation.constraints.Size(min = 3)
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/validation/string/pattern")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationStringPattern(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			@jakarta.validation.constraints.Pattern(regexp = "[a-z]{3,5}")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/validation/string/range")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationStringRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			@jakarta.validation.constraints.Size(min = 3, max = 4)
			java.lang.String string);
}
