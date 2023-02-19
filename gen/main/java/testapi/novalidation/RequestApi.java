package testapi.novalidation;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
public interface RequestApi {

	java.lang.String PATH_NO_OPERATION_ID_GET = "/no-operation-id";

	@io.micronaut.http.annotation.Get("/no-operation-id")
	io.micronaut.http.HttpResponse<Object> noOperationIdGet();
}