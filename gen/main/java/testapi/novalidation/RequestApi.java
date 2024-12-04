package testapi.novalidation;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
public interface RequestApi {

	@io.micronaut.http.annotation.Get("/no-operation-id")
	io.micronaut.http.HttpResponse<Object> noOperationIdGet();
}
