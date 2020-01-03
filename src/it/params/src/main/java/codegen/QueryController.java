package codegen;

import java.util.List;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
class QueryController implements QueryApi {

	@Get("/query")
	@Override
	public HttpResponse<Model> getMultipleLists(List<String> a, List<String> b) {
		return HttpResponse.ok(new Model().a(a).b(b));
	}
}
