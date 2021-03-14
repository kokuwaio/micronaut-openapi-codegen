package codegen;

import java.util.Optional;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;

@Controller
public class OptionalsApiController implements codegen.OptionalsApi {

	@Override
	public HttpResponse<String> get(Integer size, Optional<String> id) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> post(String body) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> issue49(Optional<String> version) {
		return HttpResponse.noContent();
	}
}
