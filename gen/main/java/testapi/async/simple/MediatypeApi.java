package testapi.async.simple;

@jakarta.annotation.Generated("org.openapitools.codegen.languages.MicronautCodegen")
@io.micronaut.validation.Validated
public interface MediatypeApi {

	@io.micronaut.http.annotation.Post("/mediatype/consumes-and-produces")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/octet-stream" })
	@io.micronaut.http.annotation.Produces({ "application/xml" })
	reactor.core.publisher.Mono<StringModel> mediatypeConsumesAndProduces(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			byte[] body);

	@io.micronaut.http.annotation.Post("/mediatype/consumes-multipart-with-fileupload")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "multipart/form-data" })
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<Multipart> mediatypeConsumesMultipartWithFileUpload(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Part(value = "orderId")
			java.lang.Integer orderId,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Part(value = "userId")
			java.lang.Integer userId,
			@io.micronaut.core.annotation.NonNull
			io.micronaut.http.multipart.StreamingFileUpload file);

	@io.micronaut.http.annotation.Post("/mediatype/consumes-multipart-without-fileupload")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "multipart/form-data" })
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<Multipart> mediatypeConsumesMultipartWithoutFileUpload(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Part(value = "orderId")
			java.lang.Integer orderId,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Part(value = "userId")
			java.lang.Integer userId);

	@io.micronaut.http.annotation.Post("/mediatype/consumes-octet-stream")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "application/octet-stream" })
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<StringModel> mediatypeConsumesOctetStream(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			byte[] body);

	@io.micronaut.http.annotation.Post("/mediatype/consumes-plain")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Consumes({ "text/plain" })
	@io.micronaut.http.annotation.Produces({ "application/json" })
	reactor.core.publisher.Mono<StringModel> mediatypeConsumesPlain(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.Body
			java.lang.String body);

	@io.micronaut.http.annotation.Get("/mediatype/produces-with-different-model")
	@io.micronaut.http.annotation.Produces({ "application/json", "text/plain" })
	reactor.core.publisher.Mono<io.micronaut.http.HttpResponse<Object>> mediatypeProducesDifferentModel(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "value")
			java.lang.String value,
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "plain")
			java.lang.Boolean plain);

	@io.micronaut.http.annotation.Get("/mediatype/produces-with-same-model")
	@io.micronaut.http.annotation.Status(io.micronaut.http.HttpStatus.OK)
	@io.micronaut.http.annotation.Produces({ "application/json", "application/xml" })
	reactor.core.publisher.Mono<StringModel> mediatypeProducesSameModel(
			@io.micronaut.core.annotation.NonNull
			@io.micronaut.http.annotation.QueryValue(value = "value")
			java.lang.String value);
}
