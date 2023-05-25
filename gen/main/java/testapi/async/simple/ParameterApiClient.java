package testapi.async.simple;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client(id = "id")
public interface ParameterApiClient {

	java.lang.String PATH_PARAM_ALL = "/param/all/{path}";
	java.lang.String PATH_PARAM_BODY_OPTIONAL = "/param/body/optional";
	java.lang.String PATH_PARAM_BODY_REQUIRED = "/param/body/required";
	java.lang.String PATH_PARAM_HEADER_OPTIONAL_WITH_DEFAULT = "/param/header/optionalWithDefault";
	java.lang.String PATH_PARAM_HEADER_OPTIONAL_WITHOUT_DEFAULT = "/param/header/optionalWithoutDefault";
	java.lang.String PATH_PARAM_HEADER_REQUIRED_WITH_DEFAULT = "/param/header/requiredWithDefault";
	java.lang.String PATH_PARAM_HEADER_REQUIRED_WITHOUT_DEFAULT = "/param/header/requiredWithoutDefault";
	java.lang.String PATH_PARAM_PATH_OVERLAY_WITH_STRING = "/param/path/overlay/{string}";
	java.lang.String PATH_PARAM_PATH_OVERLAY_WITH_UUID = "/param/path/overlay/{uuid}";
	java.lang.String PATH_PARAM_PATH_REQUIRED_WITH_DEFAULT = "/param/path/requiredWithDefault/{string}";
	java.lang.String PATH_PARAM_PATH_REQUIRED_WITHOUT_DEFAULT = "/param/path/requiredWithoutDefault/{string}";
	java.lang.String PATH_PARAM_PATH_WITH_BOOLEAN = "/param/path/with-bool/{bool}";
	java.lang.String PATH_PARAM_PATH_WITH_INTEGER = "/param/path/with-integer/{integer}";
	java.lang.String PATH_PARAM_PATH_WITH_LONG = "/param/path/with-long/{long}";
	java.lang.String PATH_PARAM_PATH_WITH_MAX_LENGTH = "/param/path/with-max-length/{string}";
	java.lang.String PATH_PARAM_PATH_WITH_PATTERN = "/param/path/with-pattern/{string}";
	java.lang.String PATH_PARAM_PATH_WITH_UUID = "/param/path/with-uuid/{uuid}";
	java.lang.String PATH_PARAM_QUERY_DATE = "/param/query/date";
	java.lang.String PATH_PARAM_QUERY_DATE_TIME = "/param/query/date-time";
	java.lang.String PATH_PARAM_QUERY_MULTIPLE_LISTS = "/param/query/multiple-lists";
	java.lang.String PATH_PARAM_QUERY_NUMBER = "/param/query/number";
	java.lang.String PATH_PARAM_QUERY_OPTIONAL_WITH_DEFAULT = "/param/query/optionalWithDefault";
	java.lang.String PATH_PARAM_QUERY_OPTIONAL_WITHOUT_DEFAULT = "/param/query/optionalWithoutDefault";
	java.lang.String PATH_PARAM_QUERY_REQUIRED_WITH_DEFAULT = "/param/query/requiredWithDefault";
	java.lang.String PATH_PARAM_QUERY_REQUIRED_WITHOUT_DEFAULT = "/param/query/requiredWithoutDefault";
	java.lang.String PATH_PARAM_QUERY_UUID = "/param/query/uuid";

	@io.micronaut.http.annotation.Get("/param/all/{path}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramAll(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "path")
			java.lang.String path,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "uuid")
			java.util.UUID uuid,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.time.LocalDate date,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Header(value = "integer")
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Post("/param/body/optional")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramBodyOptional(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Body
			ParameterModel parameterModel);

	@io.micronaut.http.annotation.Post("/param/body/required")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json" })
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramBodyRequired(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			ParameterModel parameterModel);

	@io.micronaut.http.annotation.Get("/param/header/optionalWithDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramHeaderOptionalWithDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Header(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/header/optionalWithoutDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramHeaderOptionalWithoutDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Header(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/header/requiredWithDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramHeaderRequiredWithDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Header(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/header/requiredWithoutDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramHeaderRequiredWithoutDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Header(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/overlay/{string}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathOverlayWithString(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/overlay/{uuid}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathOverlayWithUuid(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "uuid")
			java.util.UUID uuid);

	@io.micronaut.http.annotation.Get("/param/path/requiredWithDefault/{string}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathRequiredWithDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.PathVariable(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/requiredWithoutDefault/{string}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathRequiredWithoutDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/with-bool/{bool}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathWithBoolean(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "bool")
			java.lang.Boolean bool);

	@io.micronaut.http.annotation.Get("/param/path/with-integer/{integer}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathWithInteger(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "integer")
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/param/path/with-long/{long}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathWithLong(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "long")
			java.lang.Long _long);

	@io.micronaut.http.annotation.Get("/param/path/with-max-length/{string}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathWithMaxLength(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/with-pattern/{string}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathWithPattern(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/with-uuid/{uuid}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramPathWithUuid(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "uuid")
			java.util.UUID uuid);

	@io.micronaut.http.annotation.Get("/param/query/date")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramQueryDate(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.time.LocalDate date);

	@io.micronaut.http.annotation.Get("/param/query/date-time")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramQueryDateTime(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.time.Instant date);

	@io.micronaut.http.annotation.Get("/param/query/multiple-lists?{&a*}{&b*}{&c*}")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramQueryMultipleLists(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "a")
			java.util.List<java.lang.String> a,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "b")
			java.util.List<java.util.UUID> b,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "c")
			java.util.List<java.lang.Integer> c);

	@io.micronaut.http.annotation.Get("/param/query/number")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramQueryNumber(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.lang.Double date);

	@io.micronaut.http.annotation.Get("/param/query/optionalWithDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramQueryOptionalWithDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/query/optionalWithoutDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramQueryOptionalWithoutDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/query/requiredWithDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramQueryRequiredWithDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/query/requiredWithoutDefault")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramQueryRequiredWithoutDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/query/uuid")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	reactor.core.publisher.Mono<ParameterModel> paramQueryUuid(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.util.UUID date);
}
