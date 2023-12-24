package issue._331;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.validation.Validated
public interface DefaultApi {

	@io.micronaut.http.annotation.Get("/complex")
	io.micronaut.http.HttpResponse<Object> complex(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@jakarta.validation.Valid ModelComplex>> array,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.Set<@jakarta.validation.Valid ModelComplex>> set);

	@io.micronaut.http.annotation.Get("/integer")
	io.micronaut.http.HttpResponse<Object> integer(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@jakarta.validation.Valid java.lang.Integer>> withoutValidation,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@jakarta.validation.Valid java.lang.Integer>> withMinimum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@jakarta.validation.Valid java.lang.Integer>> withMaximum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@jakarta.validation.Valid java.lang.Integer>> withMinimumAndMaximum);

	@io.micronaut.http.annotation.Get("/number")
	io.micronaut.http.HttpResponse<Object> number(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@jakarta.validation.Valid java.lang.Double>> withoutValidation,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@jakarta.validation.Valid java.lang.Double>> withMinimum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@jakarta.validation.Valid java.lang.Double>> withMinimumExclusiveFalse,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@jakarta.validation.Valid java.lang.Double>> withMinimumExclusiveTrue,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@jakarta.validation.Valid java.lang.Double>> withMaximum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@jakarta.validation.Valid java.lang.Double>> withMaximumExclusiveFalse,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@jakarta.validation.Valid java.lang.Double>> withMaximumExclusiveTrue);

	@io.micronaut.http.annotation.Get("/string")
	io.micronaut.http.HttpResponse<Object> string(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@jakarta.validation.Valid java.lang.String>> withoutValidation,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@jakarta.validation.Valid java.lang.String>> withEmail,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@jakarta.validation.Valid java.lang.String>> withPattern,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@jakarta.validation.Valid java.lang.String>> withMinimum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@jakarta.validation.Valid java.lang.String>> withMaximum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@jakarta.validation.Valid java.lang.String>> withMinimumAndMaximum);
}
