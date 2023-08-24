package testapi.types;

@io.micronaut.http.client.annotation.Client(id = "id")
public interface MediatypeApiClient {

	java.lang.String PATH_MEDIATYPE_CONSUMES_AND_PRODUCES = "/mediatype/consumes-and-produces";
	java.lang.String PATH_MEDIATYPE_CONSUMES_MULTIPART_WITH_FILE_UPLOAD = "/mediatype/consumes-multipart-with-fileupload";
	java.lang.String PATH_MEDIATYPE_CONSUMES_MULTIPART_WITHOUT_FILE_UPLOAD = "/mediatype/consumes-multipart-without-fileupload/{test_path_parameter}";
	java.lang.String PATH_MEDIATYPE_CONSUMES_OCTET_STREAM = "/mediatype/consumes-octet-stream";
	java.lang.String PATH_MEDIATYPE_CONSUMES_PLAIN = "/mediatype/consumes-plain";
	java.lang.String PATH_MEDIATYPE_PRODUCES_DIFFERENT_MODEL = "/mediatype/produces-with-different-model";
	java.lang.String PATH_MEDIATYPE_PRODUCES_SAME_MODEL = "/mediatype/produces-with-same-model";

	@io.micronaut.http.annotation.Post(PATH_MEDIATYPE_CONSUMES_AND_PRODUCES)
	@io.micronaut.http.annotation.Produces({ "application/octet-stream" })
	@io.micronaut.http.annotation.Consumes({ "application/xml" })
	io.micronaut.http.HttpResponse<StringModel> mediatypeConsumesAndProduces(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			byte[] body);

	@io.micronaut.http.annotation.Post(PATH_MEDIATYPE_CONSUMES_MULTIPART_WITH_FILE_UPLOAD)
	@io.micronaut.http.annotation.Produces({ "multipart/form-data" })
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<Multipart> mediatypeConsumesMultipartWithFileUpload(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			io.micronaut.http.client.multipart.MultipartBody multipart);

	@io.micronaut.http.annotation.Post(PATH_MEDIATYPE_CONSUMES_MULTIPART_WITHOUT_FILE_UPLOAD)
	@io.micronaut.http.annotation.Produces({ "multipart/form-data" })
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<Multipart> mediatypeConsumesMultipartWithoutFileUpload(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.PathVariable(value = "test_path_parameter")
			java.lang.String testPathParameter,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			io.micronaut.http.client.multipart.MultipartBody multipart);

	@io.micronaut.http.annotation.Post(PATH_MEDIATYPE_CONSUMES_OCTET_STREAM)
	@io.micronaut.http.annotation.Produces({ "application/octet-stream" })
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<StringModel> mediatypeConsumesOctetStream(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			byte[] body);

	@io.micronaut.http.annotation.Post(PATH_MEDIATYPE_CONSUMES_PLAIN)
	@io.micronaut.http.annotation.Produces({ "text/plain" })
	@io.micronaut.http.annotation.Consumes({ "application/json" })
	io.micronaut.http.HttpResponse<StringModel> mediatypeConsumesPlain(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			java.lang.String body);

	@io.micronaut.http.annotation.Get(PATH_MEDIATYPE_PRODUCES_DIFFERENT_MODEL)
	@io.micronaut.http.annotation.Consumes({ "application/json", "text/plain" })
	io.micronaut.http.HttpResponse<Object> mediatypeProducesDifferentModel(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "value")
			java.lang.String value,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "plain")
			java.lang.Boolean plain);

	@io.micronaut.http.annotation.Get(PATH_MEDIATYPE_PRODUCES_SAME_MODEL)
	@io.micronaut.http.annotation.Consumes({ "application/json", "application/xml" })
	io.micronaut.http.HttpResponse<StringModel> mediatypeProducesSameModel(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "value")
			java.lang.String value);
}
