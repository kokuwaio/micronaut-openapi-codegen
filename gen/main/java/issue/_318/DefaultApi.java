package issue._318;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.validation.Validated
public interface DefaultApi {

	@io.micronaut.http.annotation.Get("/test")
	@io.micronaut.http.annotation.Produces({ "application/json" })
	io.micronaut.http.HttpResponse<UsedAllOfDto> testGet();
}
