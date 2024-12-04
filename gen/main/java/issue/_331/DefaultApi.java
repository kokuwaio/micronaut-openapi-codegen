package issue._331;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.validation.Validated
public interface DefaultApi {

	@io.micronaut.http.annotation.Get("/complex")
	io.micronaut.http.HttpResponse<Object> complex(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "array")
			java.util.Optional<java.util.List<@jakarta.validation.constraints.NotNull @jakarta.validation.Valid ModelComplex>> array,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "set")
			java.util.Optional<java.util.Set<@jakarta.validation.constraints.NotNull @jakarta.validation.Valid ModelComplex>> set);

	@io.micronaut.http.annotation.Get("/integer")
	io.micronaut.http.HttpResponse<Object> integer(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "withoutValidation")
			java.util.Optional<java.util.List<java.lang.Integer>> withoutValidation,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "withMinimum")
			java.util.Optional<java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Min(3) Integer>> withMinimum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "withMaximum")
			java.util.Optional<java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Max(4) Integer>> withMaximum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "withMinimumAndMaximum")
			java.util.Optional<java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Min(3) @jakarta.validation.constraints.Max(4) Integer>> withMinimumAndMaximum);

	@io.micronaut.http.annotation.Get("/number")
	io.micronaut.http.HttpResponse<Object> number(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "withoutValidation")
			java.util.Optional<java.util.List<java.lang.Double>> withoutValidation,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "withMinimum")
			java.util.Optional<java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.DecimalMin(value = "3.11111", inclusive = true) Double>> withMinimum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "withMinimumExclusiveFalse")
			java.util.Optional<java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.DecimalMin(value = "3.11112", inclusive = true) Double>> withMinimumExclusiveFalse,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "withMinimumExclusiveTrue")
			java.util.Optional<java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.DecimalMin(value = "3.11113", inclusive = false) Double>> withMinimumExclusiveTrue,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "withMaximum")
			java.util.Optional<java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.DecimalMax(value = "4.22221", inclusive = true) Double>> withMaximum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "withMaximumExclusiveFalse")
			java.util.Optional<java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.DecimalMax(value = "4.22222", inclusive = true) Double>> withMaximumExclusiveFalse,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "withMaximumExclusiveTrue")
			java.util.Optional<java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.DecimalMax(value = "4.22223", inclusive = false) Double>> withMaximumExclusiveTrue);

	@io.micronaut.http.annotation.Get("/string")
	io.micronaut.http.HttpResponse<Object> string(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "withoutValidation")
			java.util.Optional<java.util.List<java.lang.String>> withoutValidation,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "withEnum")
			java.util.Optional<java.util.List<@jakarta.validation.constraints.NotNull StringWithEnum>> withEnum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "withEmail")
			java.util.Optional<java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Email String>> withEmail,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "withPattern")
			java.util.Optional<java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Pattern(regexp = "^\\.[0-9]{3}$") String>> withPattern,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "withMinimum")
			java.util.Optional<java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Size(min = 3) String>> withMinimum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "withMaximum")
			java.util.Optional<java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Size(max = 4) String>> withMaximum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "withMinimumAndMaximum")
			java.util.Optional<java.util.List<java.lang.@jakarta.validation.constraints.NotNull @jakarta.validation.constraints.Size(min = 3, max = 4) String>> withMinimumAndMaximum);
}
