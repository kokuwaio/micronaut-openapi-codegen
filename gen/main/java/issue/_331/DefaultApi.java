package issue._331;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.validation.Validated
public interface DefaultApi {

	java.lang.String PATH_COMPLEX = "/complex";
	java.lang.String PATH_INTEGER = "/integer";
	java.lang.String PATH_NUMBER = "/number";
	java.lang.String PATH_STRING = "/string";

	@io.micronaut.http.annotation.Get(PATH_COMPLEX)
	io.micronaut.http.HttpResponse<Object> complex(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.constraints.NotNull @javax.validation.Valid ModelComplex>> array,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.Set<@javax.validation.constraints.NotNull @javax.validation.Valid ModelComplex>> set);

	@io.micronaut.http.annotation.Get(PATH_INTEGER)
	io.micronaut.http.HttpResponse<Object> integer(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.Integer>> withoutValidation,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Min(3) Integer>> withMinimum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Max(4) Integer>> withMaximum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Min(3) @javax.validation.constraints.Max(4) Integer>> withMinimumAndMaximum);

	@io.micronaut.http.annotation.Get(PATH_NUMBER)
	io.micronaut.http.HttpResponse<Object> number(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.Double>> withoutValidation,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.DecimalMin(value = "3.11111", inclusive = true) Double>> withMinimum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.DecimalMin(value = "3.11112", inclusive = true) Double>> withMinimumExclusiveFalse,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.DecimalMin(value = "3.11113", inclusive = false) Double>> withMinimumExclusiveTrue,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.DecimalMax(value = "4.22221", inclusive = true) Double>> withMaximum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.DecimalMax(value = "4.22222", inclusive = true) Double>> withMaximumExclusiveFalse,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.DecimalMax(value = "4.22223", inclusive = false) Double>> withMaximumExclusiveTrue);

	@io.micronaut.http.annotation.Get(PATH_STRING)
	io.micronaut.http.HttpResponse<Object> string(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.String>> withoutValidation,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.constraints.NotNull @javax.validation.Valid StringWithEnum>> withEnum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Email String>> withEmail,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Pattern(regexp = "^\\.[0-9]{3}$") String>> withPattern,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Size(min = 3) String>> withMinimum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Size(max = 4) String>> withMaximum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<java.lang.@javax.validation.constraints.NotNull @javax.validation.constraints.Size(min = 3, max = 4) String>> withMinimumAndMaximum);
}
