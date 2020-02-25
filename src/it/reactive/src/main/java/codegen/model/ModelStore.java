package codegen.model;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import javax.inject.Singleton;

@Singleton
public class ModelStore {

	final Set<Model> cache = new HashSet<>();

	public void clear() {
		cache.clear();
	}

	public Stream<Model> stream() {
		return cache.stream();
	}

	public boolean remove(Integer modelId) {
		return cache.removeIf(model -> model.getId().equals(modelId));
	}

	public Model add(Model model) {
		cache.add(model);
		return model;
	}
}
