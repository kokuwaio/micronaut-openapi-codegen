package testapi.async.simple;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client(id = "id")
public interface ValidationApiClient {

	java.lang.String PATH_VALIDATION_DOUBLE_MAX = "/validation/double/max";
	java.lang.String PATH_VALIDATION_DOUBLE_MIN = "/validation/double/min";
	java.lang.String PATH_VALIDATION_DOUBLE_RANGE = "/validation/double/range";
	java.lang.String PATH_VALIDATION_FLOAT_MAX = "/validation/float/max";
	java.lang.String PATH_VALIDATION_FLOAT_MIN = "/validation/float/min";
	java.lang.String PATH_VALIDATION_FLOAT_RANGE = "/validation/float/range";
	java.lang.String PATH_VALIDATION_INTEGER_MAX = "/validation/integer/max";
	java.lang.String PATH_VALIDATION_INTEGER_MIN = "/validation/integer/min";
	java.lang.String PATH_VALIDATION_INTEGER_RANGE = "/validation/integer/range";
	java.lang.String PATH_VALIDATION_LIST_MAX = "/validation/list/max?{&list*}";
	java.lang.String PATH_VALIDATION_LIST_MIN = "/validation/list/min?{&list*}";
	java.lang.String PATH_VALIDATION_LIST_MODEL = "/validation/list/model";
	java.lang.String PATH_VALIDATION_LIST_RANGE = "/validation/list/range?{&list*}";
	java.lang.String PATH_VALIDATION_LONG_MAX = "/validation/long/max";
	java.lang.String PATH_VALIDATION_LONG_MIN = "/validation/long/min";
	java.lang.String PATH_VALIDATION_LONG_RANGE = "/validation/long/range";
	java.lang.String PATH_VALIDATION_MODEL = "/validation/model";
	java.lang.String PATH_VALIDATION_STRING_MAX = "/validation/string/max";
	java.lang.String PATH_VALIDATION_STRING_MIN = "/validation/string/min";
	java.lang.String PATH_VALIDATION_STRING_PATTERN = "/validation/string/pattern";
	java.lang.String PATH_VALIDATION_STRING_RANGE = "/validation/string/range";

	@io.micronaut.http.annotation.Get(PATH_VALIDATION_DOUBLE_MAX)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationDoubleMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			java.lang.Double number);

	@io.micronaut.http.annotation.Get(PATH_VALIDATION_DOUBLE_MIN)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationDoubleMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			java.lang.Double number);

	@io.micronaut.http.annotation.Get(PATH_VALIDATION_DOUBLE_RANGE)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationDoubleRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			java.lang.Double number);

	@io.micronaut.http.annotation.Get(PATH_VALIDATION_FLOAT_MAX)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationFloatMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			java.lang.Float number);

	@io.micronaut.http.annotation.Get(PATH_VALIDATION_FLOAT_MIN)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationFloatMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			java.lang.Float number);

	@io.micronaut.http.annotation.Get(PATH_VALIDATION_FLOAT_RANGE)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationFloatRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			java.lang.Float number);

	@io.micronaut.http.annotation.Get(PATH_VALIDATION_INTEGER_MAX)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationIntegerMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get(PATH_VALIDATION_INTEGER_MIN)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationIntegerMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get(PATH_VALIDATION_INTEGER_RANGE)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationIntegerRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get(PATH_VALIDATION_LIST_MAX)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationListMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "list")
			java.util.List<java.lang.Integer> list);

	@io.micronaut.http.annotation.Get(PATH_VALIDATION_LIST_MIN)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationListMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "list")
			java.util.List<java.lang.Integer> list);

	@io.micronaut.http.annotation.Post(PATH_VALIDATION_LIST_MODEL)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<java.lang.Void> validationListModel(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			java.util.List<@javax.validation.Valid StringModel> stringModel);

	@io.micronaut.http.annotation.Post(PATH_VALIDATION_LIST_RANGE)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationListRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "list")
			java.util.List<java.lang.Integer> list);

	@io.micronaut.http.annotation.Get(PATH_VALIDATION_LONG_MAX)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationLongMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			java.lang.Long integer);

	@io.micronaut.http.annotation.Get(PATH_VALIDATION_LONG_MIN)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationLongMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			java.lang.Long integer);

	@io.micronaut.http.annotation.Get(PATH_VALIDATION_LONG_RANGE)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationLongRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			java.lang.Long integer);

	@io.micronaut.http.annotation.Post(PATH_VALIDATION_MODEL)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<java.lang.Void> validationModel(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			StringModel stringModel);

	@io.micronaut.http.annotation.Get(PATH_VALIDATION_STRING_MAX)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationStringMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get(PATH_VALIDATION_STRING_MIN)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationStringMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get(PATH_VALIDATION_STRING_PATTERN)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationStringPattern(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get(PATH_VALIDATION_STRING_RANGE)
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	reactor.core.publisher.Mono<java.lang.Void> validationStringRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);
}
