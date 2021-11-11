package testapi.async.reactor;

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
	java.lang.String PATH_VALIDATION_LIST_MAX = "/validation/list/max";
	java.lang.String PATH_VALIDATION_LIST_MIN = "/validation/list/min";
	java.lang.String PATH_VALIDATION_LIST_MODEL = "/validation/list/model";
	java.lang.String PATH_VALIDATION_LIST_RANGE = "/validation/list/range";
	java.lang.String PATH_VALIDATION_LONG_MAX = "/validation/long/max";
	java.lang.String PATH_VALIDATION_LONG_MIN = "/validation/long/min";
	java.lang.String PATH_VALIDATION_LONG_RANGE = "/validation/long/range";
	java.lang.String PATH_VALIDATION_MODEL = "/validation/model";
	java.lang.String PATH_VALIDATION_STRING_MAX = "/validation/string/max";
	java.lang.String PATH_VALIDATION_STRING_MIN = "/validation/string/min";
	java.lang.String PATH_VALIDATION_STRING_PATTERN = "/validation/string/pattern";
	java.lang.String PATH_VALIDATION_STRING_RANGE = "/validation/string/range";

	@io.micronaut.http.annotation.Get("/validation/double/max")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationDoubleMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			java.lang.Double number);

	@io.micronaut.http.annotation.Get("/validation/double/min")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationDoubleMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			java.lang.Double number);

	@io.micronaut.http.annotation.Get("/validation/double/range")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationDoubleRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			java.lang.Double number);

	@io.micronaut.http.annotation.Get("/validation/float/max")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationFloatMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			java.lang.Float number);

	@io.micronaut.http.annotation.Get("/validation/float/min")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationFloatMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			java.lang.Float number);

	@io.micronaut.http.annotation.Get("/validation/float/range")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationFloatRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			java.lang.Float number);

	@io.micronaut.http.annotation.Get("/validation/integer/max")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationIntegerMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/validation/integer/min")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationIntegerMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/validation/integer/range")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationIntegerRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/validation/list/max?{&list*}")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationListMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "list")
			java.util.List<java.lang.Integer> list);

	@io.micronaut.http.annotation.Get("/validation/list/min?{&list*}")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationListMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "list")
			java.util.List<java.lang.Integer> list);

	@io.micronaut.http.annotation.Post("/validation/list/model")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationListModel(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			java.util.List<StringModel> stringModel);

	@io.micronaut.http.annotation.Post("/validation/list/range?{&list*}")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationListRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "list")
			java.util.List<java.lang.Integer> list);

	@io.micronaut.http.annotation.Get("/validation/long/max")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationLongMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			java.lang.Long integer);

	@io.micronaut.http.annotation.Get("/validation/long/min")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationLongMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			java.lang.Long integer);

	@io.micronaut.http.annotation.Get("/validation/long/range")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationLongRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			java.lang.Long integer);

	@io.micronaut.http.annotation.Post("/validation/model")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationModel(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			StringModel stringModel);

	@io.micronaut.http.annotation.Get("/validation/string/max")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationStringMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/validation/string/min")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationStringMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/validation/string/pattern")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationStringPattern(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/validation/string/range")
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> validationStringRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);
}
