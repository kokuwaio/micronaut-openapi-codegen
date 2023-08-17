package testapi.defaults;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.validation.Validated
public interface ValidationApi {

	@io.micronaut.http.annotation.Get("/validation/double/max")
	io.micronaut.http.HttpResponse<Object> validationDoubleMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@jakarta.validation.constraints.DecimalMax(value = "4", inclusive = false)
			java.lang.Double number);

	@io.micronaut.http.annotation.Get("/validation/double/min")
	io.micronaut.http.HttpResponse<Object> validationDoubleMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@jakarta.validation.constraints.DecimalMin(value = "3", inclusive = false)
			java.lang.Double number);

	@io.micronaut.http.annotation.Get("/validation/double/range")
	io.micronaut.http.HttpResponse<Object> validationDoubleRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@jakarta.validation.constraints.DecimalMin(value = "3", inclusive = true)
			@jakarta.validation.constraints.DecimalMax(value = "4", inclusive = true)
			java.lang.Double number);

	@io.micronaut.http.annotation.Get("/validation/float/max")
	io.micronaut.http.HttpResponse<Object> validationFloatMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@jakarta.validation.constraints.DecimalMax(value = "4", inclusive = false)
			java.lang.Float number);

	@io.micronaut.http.annotation.Get("/validation/float/min")
	io.micronaut.http.HttpResponse<Object> validationFloatMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@jakarta.validation.constraints.DecimalMin(value = "3", inclusive = false)
			java.lang.Float number);

	@io.micronaut.http.annotation.Get("/validation/float/range")
	io.micronaut.http.HttpResponse<Object> validationFloatRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@jakarta.validation.constraints.DecimalMin(value = "3", inclusive = true)
			@jakarta.validation.constraints.DecimalMax(value = "4", inclusive = true)
			java.lang.Float number);

	@io.micronaut.http.annotation.Get("/validation/integer/max")
	io.micronaut.http.HttpResponse<Object> validationIntegerMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Max(4)
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/validation/integer/min")
	io.micronaut.http.HttpResponse<Object> validationIntegerMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Min(3)
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/validation/integer/range")
	io.micronaut.http.HttpResponse<Object> validationIntegerRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Min(3)
			@jakarta.validation.constraints.Max(4)
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/validation/list/max")
	io.micronaut.http.HttpResponse<Object> validationListMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			@jakarta.validation.constraints.Size(max = 4)
			java.util.List<java.lang.Integer> list);

	@io.micronaut.http.annotation.Get("/validation/list/min")
	io.micronaut.http.HttpResponse<Object> validationListMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			@jakarta.validation.constraints.Size(min = 3)
			java.util.List<java.lang.Integer> list);

	@io.micronaut.http.annotation.Post("/validation/list/model")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<Object> validationListModel(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			@jakarta.validation.Valid
			java.util.List<StringModel> stringModel);

	@io.micronaut.http.annotation.Post("/validation/list/range")
	io.micronaut.http.HttpResponse<Object> validationListRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			@jakarta.validation.constraints.Size(min = 3, max = 4)
			java.util.List<java.lang.Integer> list);

	@io.micronaut.http.annotation.Get("/validation/long/max")
	io.micronaut.http.HttpResponse<Object> validationLongMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Max(4)
			java.lang.Long integer);

	@io.micronaut.http.annotation.Get("/validation/long/min")
	io.micronaut.http.HttpResponse<Object> validationLongMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Min(3)
			java.lang.Long integer);

	@io.micronaut.http.annotation.Get("/validation/long/range")
	io.micronaut.http.HttpResponse<Object> validationLongRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Min(3)
			@jakarta.validation.constraints.Max(4)
			java.lang.Long integer);

	@io.micronaut.http.annotation.Post("/validation/model")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<Object> validationModel(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			@jakarta.validation.Valid
			StringModel stringModel);

	@io.micronaut.http.annotation.Get("/validation/string/max")
	io.micronaut.http.HttpResponse<Object> validationStringMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			@jakarta.validation.constraints.Size(max = 4)
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/validation/string/min")
	io.micronaut.http.HttpResponse<Object> validationStringMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			@jakarta.validation.constraints.Size(min = 3)
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/validation/string/pattern")
	io.micronaut.http.HttpResponse<Object> validationStringPattern(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			@jakarta.validation.constraints.Pattern(regexp = "[a-z]{3,5}")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/validation/string/range")
	io.micronaut.http.HttpResponse<Object> validationStringRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			@jakarta.validation.constraints.Size(min = 3, max = 4)
			java.lang.String string);
}
