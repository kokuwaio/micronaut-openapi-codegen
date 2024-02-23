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
			@jakarta.validation.constraints.Size(min = 3)
			java.util.Optional<java.lang.String> string,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "stringWithDefault")
			@jakarta.validation.constraints.Size(min = 3)
			java.util.Optional<java.lang.String> stringWithDefault,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "integer")
			@jakarta.validation.constraints.Min(1)
			@jakarta.validation.constraints.Max(3)
			java.util.Optional<java.lang.Integer> integer,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			@jakarta.validation.Valid
			java.util.Optional<Model> model);
}
