package codegen;

import java.io.IOException;

import codegen.model.InlineResponse2001;
import codegen.model.InlineResponse2002;
import codegen.model.InlineResponse2003;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.exceptions.HttpStatusException;
import io.micronaut.http.multipart.CompletedFileUpload;

@Controller
public class MediatypeController implements MediatypeApi {

	@Override
	public HttpResponse<InlineResponse2001> mediatypePostPlain(String string) {
		return HttpResponse.ok(new InlineResponse2001().setString(string));
	}

	@Override
	public HttpResponse<InlineResponse2002> mediatypePostOctetStream(byte[] body) {
		return HttpResponse.ok(new InlineResponse2002().setBinary(body));
	}

	@Override
	public HttpResponse<InlineResponse2003> mediatypePostMultipart(Integer orderId, Integer userId,
			CompletedFileUpload fileName) {
		try {
			return HttpResponse.ok(new InlineResponse2003()
					.setOrderId(orderId)
					.setUserId(userId)
					.setFileName(fileName.getFilename())
					.setFile(fileName.getBytes()));
		} catch (IOException e) {
			throw new HttpStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e);
		}
	}
}
