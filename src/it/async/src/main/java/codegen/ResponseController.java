package codegen;

import java.util.List;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.reactivex.Flowable;
import io.reactivex.Single;

@Controller
public class ResponseController implements ResponseApi {

	static final Model SINGLE = new Model().string("a");
	static final List<Model> ARRAY = List.of(new Model().string("a"), new Model().string("b"));

	@Override
	public Single<HttpResponse<?>> completable() {
		return Single.just(HttpResponse.noContent());
	}

	@Override
	public Single<HttpResponse<Model>> single() {
		return Single.just(HttpResponse.ok(SINGLE));
	}

	@Override
	public Single<HttpResponse<Model>> maybe(Boolean found) {
		return Single.just(found ? HttpResponse.ok(SINGLE) : HttpResponse.notFound());
	}

	@Override
	public Single<HttpResponse<List<Model>>> array() {
		return Single.just(HttpResponse.ok(ARRAY));
	}

	@Override
	public Single<HttpResponse<?>> noContentGet() {
		return Single.just(HttpResponse.ok());
	}

	@Override
	public HttpResponse<Flowable<Model>> stream() {
		return HttpResponse.ok(Flowable.fromIterable(ARRAY));
	}
}
