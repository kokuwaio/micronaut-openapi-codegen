package testapi.types;

@io.micronaut.validation.Validated
public interface RequestApi {

	@io.micronaut.http.annotation.Get("/no-operation-id")
	io.micronaut.http.HttpResponse<Object> noOperationIdGet();
}
