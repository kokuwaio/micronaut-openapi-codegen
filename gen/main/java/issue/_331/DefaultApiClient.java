package issue._331;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client(id = "test")
public interface DefaultApiClient {

	java.lang.String PATH_COMPLEX = "/complex?{&array*}{&set*}";
	java.lang.String PATH_INTEGER = "/integer?{&withoutValidation*}{&withMinimum*}{&withMaximum*}{&withMinimumAndMaximum*}";
	java.lang.String PATH_NUMBER = "/number?{&withoutValidation*}{&withMinimum*}{&withMinimumExclusiveFalse*}{&withMinimumExclusiveTrue*}{&withMaximum*}{&withMaximumExclusiveFalse*}{&withMaximumExclusiveTrue*}";
	java.lang.String PATH_STRING = "/string?{&withoutValidation*}{&withEnum*}{&withEmail*}{&withPattern*}{&withMinimum*}{&withMaximum*}{&withMinimumAndMaximum*}";

	@io.micronaut.http.annotation.Get(PATH_COMPLEX)
	io.micronaut.http.HttpResponse<Object> complex(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "array")
			java.util.List<@javax.validation.constraints.NotNull @javax.validation.Valid ModelComplex> array,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "set")
			java.util.Set<@javax.validation.constraints.NotNull @javax.validation.Valid ModelComplex> set);

	@io.micronaut.http.annotation.Get(PATH_INTEGER)
	io.micronaut.http.HttpResponse<Object> integer(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withoutValidation")
			java.util.List<java.lang.Integer> withoutValidation,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMinimum")
			java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Min(3) Integer> withMinimum,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMaximum")
			java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Max(4) Integer> withMaximum,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMinimumAndMaximum")
			java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Min(3) @javax.validation.constraints.Max(4) Integer> withMinimumAndMaximum);

	@io.micronaut.http.annotation.Get(PATH_NUMBER)
	io.micronaut.http.HttpResponse<Object> number(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withoutValidation")
			java.util.List<java.lang.Double> withoutValidation,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMinimum")
			java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.DecimalMin(value = "3.11111", inclusive = true) Double> withMinimum,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMinimumExclusiveFalse")
			java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.DecimalMin(value = "3.11112", inclusive = true) Double> withMinimumExclusiveFalse,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMinimumExclusiveTrue")
			java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.DecimalMin(value = "3.11113", inclusive = false) Double> withMinimumExclusiveTrue,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMaximum")
			java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.DecimalMax(value = "4.22221", inclusive = true) Double> withMaximum,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMaximumExclusiveFalse")
			java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.DecimalMax(value = "4.22222", inclusive = true) Double> withMaximumExclusiveFalse,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMaximumExclusiveTrue")
			java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.DecimalMax(value = "4.22223", inclusive = false) Double> withMaximumExclusiveTrue);

	@io.micronaut.http.annotation.Get(PATH_STRING)
	io.micronaut.http.HttpResponse<Object> string(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withoutValidation")
			java.util.List<java.lang.String> withoutValidation,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withEnum")
			java.util.List<@javax.validation.constraints.NotNull StringWithEnum> withEnum,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withEmail")
			java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Email String> withEmail,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withPattern")
			java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Pattern(regexp = "^\\.[0-9]{3}$") String> withPattern,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMinimum")
			java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Size(min = 3) String> withMinimum,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMaximum")
			java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Size(max = 4) String> withMaximum,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMinimumAndMaximum")
			java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Size(min = 3, max = 4) String> withMinimumAndMaximum);
}
