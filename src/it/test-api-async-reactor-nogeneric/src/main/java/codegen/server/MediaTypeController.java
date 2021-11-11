package codegen.server;

import java.io.IOException;

import codegen.Multipart;
import codegen.StringModel;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.http.multipart.StreamingFileUpload;
import reactor.core.publisher.Mono;

@Controller
public class MediaTypeController implements MediatypeApi {

	@Override
	public Mono<StringModel> mediatypeConsumesOctetStream(byte[] body) {
		return Mono.just(new StringModel().foo(new String(body)));
	}

	@Override
	public Mono<StringModel> mediatypeConsumesAndProduces(byte[] body) {
		return Mono.just(new StringModel().foo(new String(body)));
	}

	@Override
	public Mono<Multipart> mediatypeConsumesMultipartWithFileUpload(
			Integer orderId, Integer userId, StreamingFileUpload file) {
		return Mono.from(file).map(part -> {
			try {
				return new Multipart()
						.orderId(orderId)
						.userId(userId)
						.fileName(file.getFilename())
						.file(part.getBytes());
			} catch (IOException e) {
				throw new HttpStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
			}
		});
	}

	@Override
	public Mono<Multipart> mediatypeConsumesMultipartWithoutFileUpload(Integer orderId, Integer userId) {
		return Mono.just(new Multipart().orderId(orderId).userId(userId));
	}

	@Override
	public Mono<StringModel> mediatypeConsumesPlain(String body) {
		return Mono.just(new StringModel().foo(body));
	}

	@Override
	public Mono<StringModel> mediatypeProducesSameModel(String value) {
		return Mono.just(new StringModel().foo(value));
	}

	@Override
	public Mono<HttpResponse<Object>> mediatypeProducesDifferentModel(String value, Boolean plain) {
		var response = HttpResponse.status(HttpStatus.OK);
		return Mono.just(plain
				? response.contentType(MediaType.TEXT_PLAIN).body(value)
				: response.contentType(MediaType.APPLICATION_JSON).body(new StringModel().foo(value)));
	}
}
