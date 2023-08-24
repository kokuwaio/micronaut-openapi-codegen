package codegen.server;

import java.io.IOException;

import codegen.Multipart;
import codegen.StringModel;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.multipart.StreamingFileUpload;
import reactor.core.publisher.Mono;

@Controller
public class MediaTypeController implements MediatypeApi {

	@Override
	public Mono<HttpResponse<StringModel>> mediatypeConsumesOctetStream(byte[] body) {
		return Mono.just(HttpResponse.ok(new StringModel().foo(new String(body))));
	}

	@Override
	public Mono<HttpResponse<StringModel>> mediatypeConsumesAndProduces(byte[] body) {
		return Mono.just(HttpResponse.ok(new StringModel().foo(new String(body))));
	}

	@Override
	public Mono<HttpResponse<Multipart>> mediatypeConsumesMultipartWithFileUpload(
			Integer orderId, Integer userId, StreamingFileUpload file) {
		return Mono.from(file).map(part -> {
			try {
				return HttpResponse.ok(new Multipart()
						.orderId(orderId)
						.userId(userId)
						.fileName(file.getFilename())
						.file(part.getBytes()));
			} catch (IOException e) {
				return HttpResponse.status(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
			}
		});
	}

	@Override
	public Mono<HttpResponse<Multipart>> mediatypeConsumesMultipartWithoutFileUpload(
			String path,
			Integer orderId,
			Integer userId) {
		return Mono.just(HttpResponse.ok(new Multipart().orderId(orderId).userId(userId)));
	}

	@Override
	public Mono<HttpResponse<StringModel>> mediatypeConsumesPlain(String body) {
		return Mono.just(HttpResponse.ok(new StringModel().foo(body)));
	}

	@Override
	public Mono<HttpResponse<StringModel>> mediatypeProducesSameModel(String value) {
		return Mono.just(HttpResponse.ok(new StringModel().foo(value)));
	}

	@Override
	public Mono<HttpResponse<Object>> mediatypeProducesDifferentModel(String value, Boolean plain) {
		var response = HttpResponse.status(HttpStatus.OK);
		return Mono.just(plain
				? response.contentType(MediaType.TEXT_PLAIN).body(value)
				: response.contentType(MediaType.APPLICATION_JSON).body(new StringModel().foo(value)));
	}
}
