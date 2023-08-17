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
	public HttpResponse<StringModel> mediatypeConsumesOctetStream(byte[] body) {
		return HttpResponse.ok(new StringModel(new String(body)));
	}

	@Override
	public HttpResponse<StringModel> mediatypeConsumesAndProduces(byte[] body) {
		return HttpResponse.ok(new StringModel(new String(body)));
	}

	@Override
	public HttpResponse<Multipart> mediatypeConsumesMultipartWithFileUpload(
			Integer orderId, Integer userId, CompletedFileUpload file) {
		try {
			return HttpResponse.ok(new Multipart(orderId, userId, file.getFilename(), file.getBytes()));
		} catch (IOException e) {
			throw new HttpStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getMessage());
		}
	}

	@Override
	public HttpResponse<Multipart> mediatypeConsumesMultipartWithoutFileUpload(Integer orderId, Integer userId) {
		return HttpResponse.ok(new Multipart(orderId, userId, null, null));
	}

	@Override
	public HttpResponse<StringModel> mediatypeConsumesPlain(String body) {
		return HttpResponse.ok(new StringModel(body));
	}

	@Override
	public HttpResponse<StringModel> mediatypeProducesSameModel(String value) {
		return HttpResponse.ok(new StringModel(value));
	}

	@Override
	public HttpResponse<Object> mediatypeProducesDifferentModel(String value, Boolean plain) {
		var response = HttpResponse.status(HttpStatus.OK);
		return plain
				? response.contentType(MediaType.TEXT_PLAIN).body(value)
				: response.contentType(MediaType.APPLICATION_JSON).body(new StringModel(value));
	}
}
