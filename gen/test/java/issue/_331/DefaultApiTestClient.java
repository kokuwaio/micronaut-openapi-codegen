package issue._331;

/** Test client for {@link DefaultApi}. **/
@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client("${micronaut.http.services.test.clientId:/}")
public interface DefaultApiTestClient {

	@io.micronaut.http.annotation.Get("/complex?{&array*}{&set*}")
	io.micronaut.http.HttpResponse<?> complex(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "array")
			java.util.List<ModelComplex> array,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "set")
			java.util.Set<ModelComplex> set);

	@io.micronaut.http.annotation.Get("/integer?{&withoutValidation*}{&withMinimum*}{&withMaximum*}{&withMinimumAndMaximum*}")
	io.micronaut.http.HttpResponse<?> integer(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withoutValidation")
			java.util.List<java.lang.Integer> withoutValidation,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMinimum")
			java.util.List<java.lang.Integer> withMinimum,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMaximum")
			java.util.List<java.lang.Integer> withMaximum,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMinimumAndMaximum")
			java.util.List<java.lang.Integer> withMinimumAndMaximum);

	@io.micronaut.http.annotation.Get("/number?{&withoutValidation*}{&withMinimum*}{&withMinimumExclusiveFalse*}{&withMinimumExclusiveTrue*}{&withMaximum*}{&withMaximumExclusiveFalse*}{&withMaximumExclusiveTrue*}")
	io.micronaut.http.HttpResponse<?> number(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withoutValidation")
			java.util.List<java.lang.Double> withoutValidation,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMinimum")
			java.util.List<java.lang.Double> withMinimum,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMinimumExclusiveFalse")
			java.util.List<java.lang.Double> withMinimumExclusiveFalse,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMinimumExclusiveTrue")
			java.util.List<java.lang.Double> withMinimumExclusiveTrue,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMaximum")
			java.util.List<java.lang.Double> withMaximum,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMaximumExclusiveFalse")
			java.util.List<java.lang.Double> withMaximumExclusiveFalse,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMaximumExclusiveTrue")
			java.util.List<java.lang.Double> withMaximumExclusiveTrue);

	@io.micronaut.http.annotation.Get("/string?{&withoutValidation*}{&withEnum*}{&withEmail*}{&withPattern*}{&withMinimum*}{&withMaximum*}{&withMinimumAndMaximum*}")
	io.micronaut.http.HttpResponse<?> string(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withoutValidation")
			java.util.List<java.lang.String> withoutValidation,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withEnum")
			java.util.List<StringWithEnum> withEnum,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withEmail")
			java.util.List<java.lang.String> withEmail,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withPattern")
			java.util.List<java.lang.String> withPattern,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMinimum")
			java.util.List<java.lang.String> withMinimum,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMaximum")
			java.util.List<java.lang.String> withMaximum,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "withMinimumAndMaximum")
			java.util.List<java.lang.String> withMinimumAndMaximum);
}
