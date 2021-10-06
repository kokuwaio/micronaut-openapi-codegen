package codegen;

import java.util.List;

import codegen.model.*;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;

@Controller
class ModelController implements ModelApi {

	@Override
	public HttpResponse<Object> create(Model model) {
		return HttpResponse.ok();
	}

	@Override
	public HttpResponse<Object> delete(Integer modelId) {
		return HttpResponse.ok();
	}

	@Override
	public HttpResponse<List<Model>> findAll() {
		return HttpResponse.ok();
	}

	@Override
	public HttpResponse<Model> findById(Integer modelId) {
		return HttpResponse.ok();
	}

	@Override
	public HttpResponse<InlineResponse200> getInheritance() {
		return HttpResponse.ok();
	}

	@Override
	public HttpResponse<List<String>> putInheritanceList(List<InheritanceModel> inheritanceModel) {
		return HttpResponse.ok();
	}
}
