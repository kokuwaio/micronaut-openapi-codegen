package codegen;

import codegen.model.InlineResponse2001;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;

@Controller
public class MediatypeController implements MediatypeApi {

	@Override
	public HttpResponse<InlineResponse2001> mediatypePostPlain(String string) {
		return HttpResponse.ok(new InlineResponse2001().setString(string));
	}
}
