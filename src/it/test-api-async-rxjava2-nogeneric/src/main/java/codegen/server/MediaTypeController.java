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
import io.reactivex.Single;

@Controller
public class MediaTypeController implements MediatypeApi {

	@Override
	public Single<StringModel> mediatypeConsumesOctetStream(byte[] body) {
		return Single.just(new StringModel().foo(new String(body)));
	}

	@Override
	public Single<StringModel> mediatypeConsumesAndProduces(byte[] body) {
		return Single.just(new StringModel().foo(new String(body)));
	}

	@Override
	public Single<Multipart> mediatypeConsumesMultipartWithFileUpload(
			Integer orderId, Integer userId, StreamingFileUpload file) {
		return Single.fromPublisher(file).map(part -> {
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
	public Single<Multipart> mediatypeConsumesMultipartWithoutFileUpload(
			String path,
			Integer orderId,
			Integer userId) {
		return Single.just(new Multipart().orderId(orderId).userId(userId));
	}

	@Override
	public Single<StringModel> mediatypeConsumesPlain(String body) {
		return Single.just(new StringModel().foo(body));
	}

	@Override
	public Single<StringModel> mediatypeProducesSameModel(String value) {
		return Single.just(new StringModel().foo(value));
	}

	@Override
	public Single<HttpResponse<Object>> mediatypeProducesDifferentModel(String value, Boolean plain) {
		var response = HttpResponse.status(HttpStatus.OK);
		return Single.just(plain
				? response.contentType(MediaType.TEXT_PLAIN).body(value)
				: response.contentType(MediaType.APPLICATION_JSON).body(new StringModel().foo(value)));
	}
}
