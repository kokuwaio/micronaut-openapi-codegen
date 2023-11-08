package testapi.modelsuffix;

/** Test client for {@link ParameterApi}. **/
@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client("${micronaut.http.services.test.clientId:/}")
public interface ParameterApiTestClient {

	@io.micronaut.http.annotation.Get("/param/all/{path}")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramAll(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "path")
			java.lang.String path,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "uuid")
			java.util.UUID uuid,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.time.LocalDate date,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Header(value = "integer")
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Post("/param/body/optional")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramBodyOptional(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Body
			ParameterModelVO parameterModelVO);

	@io.micronaut.http.annotation.Post("/param/body/required")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramBodyRequired(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Body
			ParameterModelVO parameterModelVO);

	@io.micronaut.http.annotation.Get("/param/cookie/optionalWithDefault")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramCookieOptionalWithDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.CookieValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/cookie/optionalWithoutDefault")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramCookieOptionalWithoutDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.CookieValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/cookie/requiredWithDefault")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramCookieRequiredWithDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.CookieValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/cookie/requiredWithoutDefault")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramCookieRequiredWithoutDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.CookieValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/header/optionalWithDefault")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramHeaderOptionalWithDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Header(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/header/optionalWithoutDefault")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramHeaderOptionalWithoutDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Header(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/header/requiredWithDefault")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramHeaderRequiredWithDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Header(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/header/requiredWithoutDefault")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramHeaderRequiredWithoutDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Header(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/overlay/{string}")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramPathOverlayWithString(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/overlay/{uuid}")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramPathOverlayWithUuid(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "uuid")
			java.util.UUID uuid);

	@io.micronaut.http.annotation.Get("/param/path/requiredWithDefault/{string}")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramPathRequiredWithDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/requiredWithoutDefault/{string}")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramPathRequiredWithoutDefault(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/with-bool/{bool}")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramPathWithBoolean(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "bool")
			java.lang.Boolean bool);

	@io.micronaut.http.annotation.Get("/param/path/with-integer/{integer}")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramPathWithInteger(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "integer")
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/param/path/with-long/{long}")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramPathWithLong(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "long")
			java.lang.Long _long);

	@io.micronaut.http.annotation.Get("/param/path/with-max-length/{string}")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramPathWithMaxLength(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/with-pattern/{string}")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramPathWithPattern(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/path/with-uuid/{uuid}")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramPathWithUuid(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "uuid")
			java.util.UUID uuid);

	@io.micronaut.http.annotation.Get("/param/query/date")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramQueryDate(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.time.LocalDate date);

	@io.micronaut.http.annotation.Get("/param/query/date-time")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramQueryDateTime(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.time.Instant date);

	@io.micronaut.http.annotation.Get("/param/query/multiple-lists?{&a*}{&b*}{&c*}")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramQueryMultipleLists(
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
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramQueryNumber(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.lang.Double date);

	@io.micronaut.http.annotation.Get("/param/query/optionalWithDefault")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramQueryOptionalWithDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/query/optionalWithoutDefault")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramQueryOptionalWithoutDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/query/requiredWithDefault")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramQueryRequiredWithDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/query/requiredWithoutDefault")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramQueryRequiredWithoutDefault(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/param/query/uuid")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<ParameterModelVO> paramQueryUuid(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "date")
			java.util.UUID date);
}
