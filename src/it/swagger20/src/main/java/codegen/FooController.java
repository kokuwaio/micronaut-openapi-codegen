package codegen;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;

@Controller
class FooController implements FooApi {

	@Override
	public HttpResponse<Model> get() {
		return HttpResponse.ok(new Model().a("a").b("b"));
	}
}
