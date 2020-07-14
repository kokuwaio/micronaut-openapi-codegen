package codegen;

import java.util.List;

import io.micronaut.http.annotation.Controller;
import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Maybe;
import io.reactivex.Single;

@Controller
public class ResponseController implements ResponseApi {

	static final Model SINGLE = new Model().string("a");
	static final List<Model> ARRAY = List.of(new Model().string("a"), new Model().string("b"));

	@Override
	public Completable completable() {
		return Completable.complete();
	}

	@Override
	public Single<Model> single() {
		return Single.just(SINGLE);
	}

	@Override
	public Maybe<Model> maybe(Boolean found) {
		return found ? Maybe.just(SINGLE) : Maybe.empty();
	}

	@Override
	public Single<List<Model>> array() {
		return Single.just(ARRAY);
	}

	@Override
	public Flowable<Model> stream() {
		return Flowable.fromIterable(ARRAY);
	}
}
