package codegen.server;

import java.io.IOException;

import codegen.Multipart;
import codegen.StringModel;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.http.multipart.CompletedFileUpload;

@Controller
public class MediaTypeController implements MediatypeApi {

	@Override
	public StringModel mediatypeConsumesOctetStream(byte[] body) {
		return new StringModel().foo(new String(body));
	}

	@Override
	public StringModel mediatypeConsumesAndProduces(byte[] body) {
		return new StringModel().foo(new String(body));
	}

	@Override
	public Multipart mediatypeConsumesMultipartWithFileUpload(
			Integer orderId, Integer userId, CompletedFileUpload file) {
		try {
			return new Multipart()
					.orderId(orderId)
					.userId(userId)
					.fileName(file.getFilename())
					.file(file.getBytes());
		} catch (IOException e) {
			throw new HttpStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
		}
	}

	@Override
	public Multipart mediatypeConsumesMultipartWithoutFileUpload(Integer orderId, Integer userId) {
		return new Multipart().orderId(orderId).userId(userId);
	}

	@Override
	public StringModel mediatypeConsumesPlain(String body) {
		return new StringModel().foo(body);
	}

	@Override
	public StringModel mediatypeProducesSameModel(String value) {
		return new StringModel().foo(value);
	}

	@Override
	public HttpResponse<Object> mediatypeProducesDifferentModel(String value, Boolean plain) {
		var response = HttpResponse.status(HttpStatus.OK);
		return plain
				? response.contentType(MediaType.TEXT_PLAIN).body(value)
				: response.contentType(MediaType.APPLICATION_JSON).body(new StringModel().foo(value));
	}
}
