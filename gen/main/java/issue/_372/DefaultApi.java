package issue._372;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.validation.Validated
public interface DefaultApi {

	@io.micronaut.http.annotation.Get("/doIt")
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<Model> doIt(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "string")
			java.util.Optional<java.lang.@jakarta.validation.constraints.Size(min = 3) String> string,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "stringWithDefault")
			java.util.Optional<java.lang.@jakarta.validation.constraints.Size(min = 3) String> stringWithDefault,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			java.util.Optional<java.lang.@jakarta.validation.constraints.Min(1) @jakarta.validation.constraints.Max(3) Integer> integer,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			java.util.Optional<@jakarta.validation.Valid Model> model);
}
