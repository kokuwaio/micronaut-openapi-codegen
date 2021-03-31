package codegen;

import java.io.IOException;

import codegen.model.InlineResponse2001;
import codegen.model.InlineResponse2002;
import codegen.model.InlineResponse2003;
import codegen.model.MediaModel;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.http.multipart.CompletedFileUpload;

@Controller
public class MediatypeController implements MediatypeApi {

	@Override
	public InlineResponse2001 mediatypePostPlain(String string) {
		return new InlineResponse2001().setString(string);
	}

	@Override
	public InlineResponse2002 mediatypePostOctetStream(byte[] body) {
		return new InlineResponse2002().setBinary(body);
	}

	@Override
	public InlineResponse2003 mediatypePostMultipart(Integer orderId, Integer userId, CompletedFileUpload fileName) {
		try {
			return new InlineResponse2003()
					.setOrderId(orderId)
					.setUserId(userId)
					.setFileName(fileName.getFilename())
					.setFile(fileName.getBytes());
		} catch (IOException e) {
			throw new HttpStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e);
		}
	}

	@Override
	public HttpResponse<Object> mediatypeMultipleContentTypesDifferentModel(Boolean plain) {
		var response = HttpResponse.status(HttpStatus.OK);
		return plain
				? response.contentType(MediaType.TEXT_PLAIN).body("plain")
				: response.contentType(MediaType.APPLICATION_JSON).body(new MediaModel().setData("json"));
	}

	@Override
	public MediaModel mediatypeMultipleContentTypesSameModel() {
		return new MediaModel().setData("test");
	}
}
