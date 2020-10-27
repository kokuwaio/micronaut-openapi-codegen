package codegen;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;

@Controller
class ValidationController implements ValidationApi {

	@Override
	public HttpResponse<Object> body(Model model) {
		return HttpResponse.ok();
	}

	@Override
	public HttpResponse<Object> bodyWithCollection(ModelWithCollection modelWithCollection) {
		return HttpResponse.ok();
	}

	@Override
	public HttpResponse<Object> queryParam(Integer modelId) {
		return HttpResponse.ok();
	}
}
