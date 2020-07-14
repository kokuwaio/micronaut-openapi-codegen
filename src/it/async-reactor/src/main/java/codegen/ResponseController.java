package codegen;

import java.util.List;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
public class ResponseController implements ResponseApi {

	static final Model SINGLE = new Model().string("a");
	static final List<Model> ARRAY = List.of(new Model().string("a"), new Model().string("b"));

	@Override
	public Mono<HttpResponse<?>> completable() {
		return Mono.just(HttpResponse.noContent());
	}

	@Override
	public Mono<HttpResponse<Model>> single() {
		return Mono.just(HttpResponse.ok(SINGLE));
	}

	@Override
	public Mono<HttpResponse<Model>> maybe(Boolean found) {
		return Mono.just(found ? HttpResponse.ok(SINGLE) : HttpResponse.notFound());
	}

	@Override
	public Mono<HttpResponse<List<Model>>> array() {
		return Mono.just(HttpResponse.ok(ARRAY));
	}

	@Override
	public HttpResponse<Flux<Model>> stream() {
		return HttpResponse.ok(Flux.fromIterable(ARRAY));
	}
}
