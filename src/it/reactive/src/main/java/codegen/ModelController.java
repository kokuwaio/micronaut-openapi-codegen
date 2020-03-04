package codegen;

import java.net.URI;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import javax.inject.Inject;

import codegen.model.Model;
import codegen.model.ModelStore;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.reactivex.Single;

@Controller
class ModelController implements ModelApiRx {

	@Inject
	ModelStore store;

	@Override
	public Single<HttpResponse<List<Model>>> findAll() {
		return Single.just(HttpResponse.ok(store.stream().collect(Collectors.toList())));
	}

	@Override
	public Single<HttpResponse<Model>> findById(Integer modelId) {
		return Single.just(find(modelId).map(HttpResponse::ok).orElseGet(HttpResponse::notFound));
	}

	@Override
	public Single<HttpResponse<?>> create(Model model) {
		if (model.getId() != null) {
			if (find(model.getId()).isPresent()) {
				return Single.just(HttpResponse.status(HttpStatus.CONFLICT, "dupplicate id"));
			}
		} else {
			model.setId(IntStream.range(0, Integer.MAX_VALUE).filter(id -> find(id).isEmpty()).findFirst().getAsInt());
		}
		store.add(model);
		return Single.just(HttpResponse.created(URI.create("/model/" + model.getId())));
	}

	@Override
	public Single<HttpResponse<?>> delete(Integer modelId) {
		return store.remove(modelId) ? Single.just(HttpResponse.noContent()) : Single.just(HttpResponse.notFound());
	}

	private Optional<Model> find(Integer modelId) {
		return store.stream().filter(model -> model.getId() == modelId).findAny();
	}
}
