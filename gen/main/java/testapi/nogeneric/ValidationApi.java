package testapi.nogeneric;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.validation.Validated
public interface ValidationApi {

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
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationDoubleMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@javax.validation.constraints.DecimalMax(value = "4", inclusive = false)
			java.lang.Double number);

	@io.micronaut.http.annotation.Get("/validation/double/min")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationDoubleMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@javax.validation.constraints.DecimalMin(value = "3", inclusive = false)
			java.lang.Double number);

	@io.micronaut.http.annotation.Get("/validation/double/range")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationDoubleRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@javax.validation.constraints.DecimalMin(value = "3", inclusive = true)
			@javax.validation.constraints.DecimalMax(value = "4", inclusive = true)
			java.lang.Double number);

	@io.micronaut.http.annotation.Get("/validation/float/max")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationFloatMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@javax.validation.constraints.DecimalMax(value = "4", inclusive = false)
			java.lang.Float number);

	@io.micronaut.http.annotation.Get("/validation/float/min")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationFloatMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@javax.validation.constraints.DecimalMin(value = "3", inclusive = false)
			java.lang.Float number);

	@io.micronaut.http.annotation.Get("/validation/float/range")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationFloatRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "number")
			@javax.validation.constraints.DecimalMin(value = "3", inclusive = true)
			@javax.validation.constraints.DecimalMax(value = "4", inclusive = true)
			java.lang.Float number);

	@io.micronaut.http.annotation.Get("/validation/integer/max")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationIntegerMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@javax.validation.constraints.Max(4)
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/validation/integer/min")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationIntegerMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@javax.validation.constraints.Min(3)
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/validation/integer/range")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationIntegerRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@javax.validation.constraints.Min(3)
			@javax.validation.constraints.Max(4)
			java.lang.Integer integer);

	@io.micronaut.http.annotation.Get("/validation/list/max")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationListMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			@javax.validation.constraints.Size(max = 4)
			java.util.List<java.lang.Integer> list);

	@io.micronaut.http.annotation.Get("/validation/list/min")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationListMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			@javax.validation.constraints.Size(min = 3)
			java.util.List<java.lang.Integer> list);

	@io.micronaut.http.annotation.Post("/validation/list/model")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	void validationListModel(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			@javax.validation.Valid
			java.util.List<StringModel> stringModel);

	@io.micronaut.http.annotation.Post("/validation/list/range")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationListRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			@javax.validation.constraints.Size(min = 3, max = 4)
			java.util.List<java.lang.Integer> list);

	@io.micronaut.http.annotation.Get("/validation/long/max")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationLongMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@javax.validation.constraints.Max(4)
			java.lang.Long integer);

	@io.micronaut.http.annotation.Get("/validation/long/min")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationLongMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@javax.validation.constraints.Min(3)
			java.lang.Long integer);

	@io.micronaut.http.annotation.Get("/validation/long/range")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationLongRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@javax.validation.constraints.Min(3)
			@javax.validation.constraints.Max(4)
			java.lang.Long integer);

	@io.micronaut.http.annotation.Post("/validation/model")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	void validationModel(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			@javax.validation.Valid
			StringModel stringModel);

	@io.micronaut.http.annotation.Get("/validation/string/max")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationStringMax(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			@javax.validation.constraints.Size(max = 4)
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/validation/string/min")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationStringMin(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			@javax.validation.constraints.Size(min = 3)
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/validation/string/pattern")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationStringPattern(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			@javax.validation.constraints.Pattern(regexp = "[a-z]{3,5}")
			java.lang.String string);

	@io.micronaut.http.annotation.Get("/validation/string/range")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.NO_CONTENT)
	void validationStringRange(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			@javax.validation.constraints.Size(min = 3, max = 4)
			java.lang.String string);
}