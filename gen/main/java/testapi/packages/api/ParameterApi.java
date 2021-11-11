package testapi.packages.api;

import testapi.packages.model.*;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.validation.Validated
public interface ParameterApi {

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
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramAll(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "path")
			java.lang.String path,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "uuid")
			java.util.UUID uuid,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.util.Optional<java.time.LocalDate> date,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Header(value = "integer")
			java.util.Optional<java.lang.Integer> integer);

	@io.micronaut.http.annotation.Post("/param/body/optional")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramBodyOptional(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			@javax.validation.Valid
			java.util.Optional<ParameterModel> parameterModel);

	@io.micronaut.http.annotation.Post("/param/body/required")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramBodyRequired(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			@javax.validation.Valid
			ParameterModel parameterModel);

	@io.micronaut.http.annotation.Get("/param/header/optionalWithDefault")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramHeaderOptionalWithDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Header(value = "string", defaultValue = "this-is-default")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/header/optionalWithoutDefault")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramHeaderOptionalWithoutDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Header(value = "string")
			java.util.Optional<java.lang.String> string);

	@io.micronaut.http.annotation.Get("/param/header/requiredWithDefault")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramHeaderRequiredWithDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string", defaultValue = "this-is-default")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/header/requiredWithoutDefault")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramHeaderRequiredWithoutDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Header(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/overlay/{string:10}")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramPathOverlayWithString(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string")
			@javax.validation.constraints.Size(max = 10)
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/overlay/{uuid:[a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9]-[a-f0-9][a-f0-9][a-f0-9][a-f0-9]-[a-f0-9][a-f0-9][a-f0-9][a-f0-9]-[a-f0-9][a-f0-9][a-f0-9][a-f0-9]-[a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9]}")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramPathOverlayWithUuid(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "uuid")
			java.util.UUID uuid);

	@io.micronaut.http.annotation.Get("/param/path/requiredWithDefault/{string}")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramPathRequiredWithDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string", defaultValue = "this-is-default")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/requiredWithoutDefault/{string}")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramPathRequiredWithoutDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/with-bool/{bool:true|false}")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramPathWithBoolean(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "bool")
			java.lang.Boolean bool);

	@io.micronaut.http.annotation.Get("/param/path/with-integer/{integer:\\-?[0-9]+}")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramPathWithInteger(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "integer")
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/param/path/with-long/{long:\\-?[0-9]+}")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramPathWithLong(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "long")
			java.lang.Long _long);

	@io.micronaut.http.annotation.Get("/param/path/with-max-length/{string:5}")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramPathWithMaxLength(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string")
			@javax.validation.constraints.Size(max = 5)
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/with-pattern/{string:[0-9][a-z]}")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramPathWithPattern(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string")
			@javax.validation.constraints.Pattern(regexp = "[0-9][a-z]")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/with-uuid/{uuid:[a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9]-[a-f0-9][a-f0-9][a-f0-9][a-f0-9]-[a-f0-9][a-f0-9][a-f0-9][a-f0-9]-[a-f0-9][a-f0-9][a-f0-9][a-f0-9]-[a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9][a-f0-9]}")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramPathWithUuid(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "uuid")
			java.util.UUID uuid);

	@io.micronaut.http.annotation.Get("/param/query/date")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramQueryDate(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.util.Optional<java.time.LocalDate> date);

	@io.micronaut.http.annotation.Get("/param/query/date-time")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramQueryDateTime(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.util.Optional<java.time.Instant> date);

	@io.micronaut.http.annotation.Get("/param/query/multiple-lists")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramQueryMultipleLists(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.String>> a,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.util.UUID>> b,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.Integer>> c);

	@io.micronaut.http.annotation.Get("/param/query/number")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramQueryNumber(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.util.Optional<java.lang.Double> date);

	@io.micronaut.http.annotation.Get("/param/query/optionalWithDefault")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramQueryOptionalWithDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string", defaultValue = "this-is-default")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/query/optionalWithoutDefault")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramQueryOptionalWithoutDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.util.Optional<java.lang.String> string);

	@io.micronaut.http.annotation.Get("/param/query/requiredWithDefault")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramQueryRequiredWithDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string", defaultValue = "this-is-default")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/query/requiredWithoutDefault")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramQueryRequiredWithoutDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/query/uuid")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModel> paramQueryUuid(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.util.Optional<java.util.UUID> date);
}