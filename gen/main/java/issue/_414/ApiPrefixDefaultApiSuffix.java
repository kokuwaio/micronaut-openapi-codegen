package issue._414;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.validation.Validated
public interface ApiPrefixDefaultApiSuffix {

	@io.micronaut.http.annotation.Get("/doIt")
	io.micronaut.http.HttpResponse<Object> doIt();
}
