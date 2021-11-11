package testapi.async.reactor;

/** Test client for {@link MediatypeApi}. **/
@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.http.client.annotation.Client("/")
public interface MediatypeApiTestClient {

	@io.micronaut.http.annotation.Post("/mediatype/consumes-and-produces")
	@io.micronaut.http.annotation.Produces({ "application/octet-stream" })
	@io.micronaut.http.annotation.Consumes({ "application/xml" })
	io.micronaut.http.HttpResponse<StringModel> mediatypeConsumesAndProduces(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Body
			byte[] body);

	@io.micronaut.http.annotation.Post("/mediatype/consumes-multipart-with-fileupload")
	@io.micronaut.http.annotation.Produces({ "multipart/form-data" })
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<Multipart> mediatypeConsumesMultipartWithFileUpload(
			@io.micronaut.http.annotation.Body
			io.micronaut.http.client.multipart.MultipartBody multipart);

	@io.micronaut.http.annotation.Post("/mediatype/consumes-multipart-without-fileupload")
	@io.micronaut.http.annotation.Produces({ "multipart/form-data" })
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<Multipart> mediatypeConsumesMultipartWithoutFileUpload(
			@io.micronaut.http.annotation.Body
			io.micronaut.http.client.multipart.MultipartBody multipart);

	@io.micronaut.http.annotation.Post("/mediatype/consumes-octet-stream")
	@io.micronaut.http.annotation.Produces({ "application/octet-stream" })
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<StringModel> mediatypeConsumesOctetStream(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Body
			byte[] body);

	@io.micronaut.http.annotation.Post("/mediatype/consumes-plain")
	@io.micronaut.http.annotation.Produces({ "text/plain" })
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<StringModel> mediatypeConsumesPlain(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.Body
			java.lang.String body);

	@io.micronaut.http.annotation.Get("/mediatype/produces-with-different-model")
	@io.micronaut.http.annotation.Consumes({ "application/json", "text/plain" })
	io.micronaut.http.HttpResponse<?> mediatypeProducesDifferentModel(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "value")
			java.lang.String value,
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "plain")
			java.lang.Boolean plain);

	@io.micronaut.http.annotation.Get("/mediatype/produces-with-same-model")
	@io.micronaut.http.annotation.Consumes({ "application/json", "application/xml" })
	io.micronaut.http.HttpResponse<StringModel> mediatypeProducesSameModel(
			@io.micronaut.core.annotation.Nullable
			@io.micronaut.http.annotation.QueryValue(value = "value")
			java.lang.String value);
}
