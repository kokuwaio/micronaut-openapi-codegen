package codegen;

import static java.util.stream.Collectors.toList;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.inject.Inject;

import codegen.model.InheritanceModel;
import codegen.model.InheritanceModel1;
import codegen.model.InheritanceModel2;
import codegen.model.InlineResponse200;
import codegen.model.Model;
import codegen.model.ModelStore;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;

@Controller
class ModelController implements ModelApi {

	@Inject
	ModelStore store;

	@Override
	public HttpResponse<List<Model>> findAll() {
		return HttpResponse.ok(store.stream().collect(Collectors.toList()));
	}

	@Override
	public HttpResponse<Model> findById(Integer modelId) {
		return find(modelId).map(HttpResponse::ok).orElseGet(HttpResponse::notFound);
	}

	@Override
	public HttpResponse<Object> create(Model model) {
		if (model.getId() != null) {
			if (find(model.getId()).isPresent()) {
				return HttpResponse.status(HttpStatus.CONFLICT, "dupplicate id");
			}
		} else {
			model.setId(IntStream.range(0, Integer.MAX_VALUE).filter(id -> find(id).isEmpty()).findFirst().getAsInt());
		}
		store.add(model);
		return HttpResponse.created(URI.create("/model/" + model.getId()));
	}

	@Override
	public HttpResponse<Object> delete(Integer modelId) {
		return store.remove(modelId) ? HttpResponse.noContent() : HttpResponse.notFound();
	}

	private Optional<Model> find(Integer modelId) {
		return store.stream().filter(model -> model.getId() == modelId).findAny();
	}

	@Override
	public HttpResponse<InlineResponse200> getInheritance() {
		return HttpResponse.ok(new InlineResponse200().list(List.of(new InheritanceModel1(), new InheritanceModel2())));
	}

	@Override
	public HttpResponse<List<String>> putInheritanceList(List<InheritanceModel> inheritanceModels) {
		return HttpResponse.ok(inheritanceModels.stream().map(m -> m.getType()).collect(toList()));
	}
}
