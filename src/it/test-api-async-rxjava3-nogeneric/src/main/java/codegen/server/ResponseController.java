package codegen.server;

import java.util.List;

import codegen.NumberModel;
import codegen.StringModel;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.exceptions.HttpStatusException;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;

@Controller
public class ResponseController implements ResponseApi {

	public static final Double DOUBLE = 1234D;
	public static final String STRING1 = "string1";
	public static final String STRING2 = "string2";
	public static final StringModel MODEL_STRING1 = new StringModel().foo(STRING1);
	public static final StringModel MODEL_STRING2 = new StringModel().foo(STRING2);
	public static final NumberModel MODEL_NUMBER = new NumberModel().bar(DOUBLE);
	public static final List<String> ARRAY_SIMPLE = List.of("a", "b");
	public static final List<StringModel> ARRAY_COMPLEX = List.of(
			new StringModel().foo(STRING1),
			new StringModel().foo(STRING2));

	@Override
	public Completable voidFound() {
		return Completable.complete();
	}

	@Override
	public Completable voidNotFound(Boolean found) {
		return found
				? Completable.complete()
				: Completable.error(new HttpStatusException(HttpStatus.NOT_FOUND, "nope"));
	}

	@Override
	public Single<String> single() {
		return Single.just(STRING1);
	}

	@Override
	public Maybe<String> optional(Boolean found) {
		return found ? Maybe.just(STRING1) : Maybe.empty();
	}

	@Override
	public Single<HttpResponse<Object>> header() {
		return Single.just(HttpResponse.ok().header("foo", String.valueOf(DOUBLE)));
	}

	@Override
	public Single<List<String>> arraySimple() {
		return Single.just(ARRAY_SIMPLE);
	}

	@Override
	public Single<List<String>> arraySimpleEmpty() {
		return Single.just(List.of());
	}

	@Override
	public Maybe<List<String>> arraySimpleNotFound(Boolean found) {
		return found ? Maybe.just(ARRAY_SIMPLE) : Maybe.empty();
	}

	@Override
	public Single<List<StringModel>> arrayComplex() {
		return Single.just(ARRAY_COMPLEX);
	}

	@Override
	public Maybe<List<StringModel>> arrayComplexNotFound(Boolean found) {
		return found ? Maybe.just(ARRAY_COMPLEX) : Maybe.empty();
	}

	@Override
	public Single<HttpResponse<Object>> multipleDataTypes(Boolean redirect) {
		return Single.just(redirect
				? HttpResponse.status(HttpStatus.MULTIPLE_CHOICES).body(MODEL_NUMBER)
				: HttpResponse.ok(MODEL_STRING1));
	}

	@Override
	public Single<HttpResponse<Object>> multipleDataTypesNotFound(Boolean redirect, Boolean found) {
		if (!found) {
			return Single.just(HttpResponse.notFound());
		}
		return multipleDataTypes(redirect);
	}

	@Override
	public Single<HttpResponse<StringModel>> multipleResponseCodes(Boolean redirect) {
		return Single.just(redirect
				? HttpResponse.status(HttpStatus.MULTIPLE_CHOICES).body(MODEL_STRING2)
				: HttpResponse.ok(MODEL_STRING1));
	}

	@Override
	public Single<HttpResponse<StringModel>> multipleResponseCodesNotFound(Boolean redirect, Boolean found) {
		if (!found) {
			return Single.just(HttpResponse.notFound());
		}
		return multipleResponseCodes(redirect);
	}

	@Override
	public Completable withDefault() {
		return Completable.complete();
	}
}
