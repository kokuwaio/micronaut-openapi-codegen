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
			java.util.Optional<java.util.List<@javax.validation.Valid ModelComplex>> array,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.Set<@javax.validation.Valid ModelComplex>> set);

	@io.micronaut.http.annotation.Get(PATH_INTEGER)
	io.micronaut.http.HttpResponse<Object> integer(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.Valid java.lang.Integer>> withoutValidation,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.Valid java.lang.Integer>> withMinimum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.Valid java.lang.Integer>> withMaximum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.Valid java.lang.Integer>> withMinimumAndMaximum);

	@io.micronaut.http.annotation.Get(PATH_NUMBER)
	io.micronaut.http.HttpResponse<Object> number(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.Valid java.lang.Double>> withoutValidation,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.Valid java.lang.Double>> withMinimum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.Valid java.lang.Double>> withMinimumExclusiveFalse,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.Valid java.lang.Double>> withMinimumExclusiveTrue,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.Valid java.lang.Double>> withMaximum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.Valid java.lang.Double>> withMaximumExclusiveFalse,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.Valid java.lang.Double>> withMaximumExclusiveTrue);

	@io.micronaut.http.annotation.Get(PATH_STRING)
	io.micronaut.http.HttpResponse<Object> string(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.Valid java.lang.String>> withoutValidation,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.Valid java.lang.String>> withEmail,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.Valid java.lang.String>> withPattern,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.Valid java.lang.String>> withMinimum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.Valid java.lang.String>> withMaximum,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue
			java.util.Optional<java.util.List<@javax.validation.Valid java.lang.String>> withMinimumAndMaximum);
}
