package codegen.server;

import java.util.List;

import codegen.NumberModel;
import codegen.StringModel;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.reactivex.Single;

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
	public Single<HttpResponse<Object>> voidFound() {
		return Single.just(HttpResponse.noContent());
	}

	@Override
	public Single<HttpResponse<Object>> voidNotFound(Boolean found) {
		return Single.just(found
				? HttpResponse.noContent()
				: HttpResponse.notFound());
	}

	@Override
	public Single<HttpResponse<String>> single() {
		return Single.just(HttpResponse.ok(STRING1));
	}

	@Override
	public Single<HttpResponse<String>> optional(Boolean found) {
		return Single.just(found
				? HttpResponse.ok(STRING1)
				: HttpResponse.notFound());
	}

	@Override
	public Single<HttpResponse<Object>> header() {
		return Single.just(HttpResponse.ok().header("foo", String.valueOf(DOUBLE)));
	}

	@Override
	public Single<HttpResponse<List<String>>> arraySimple() {
		return Single.just(HttpResponse.ok(ARRAY_SIMPLE));
	}

	@Override
	public Single<HttpResponse<List<String>>> arraySimpleEmpty() {
		return Single.just(HttpResponse.ok(List.of()));
	}

	@Override
	public Single<HttpResponse<List<String>>> arraySimpleNotFound(Boolean found) {
		return Single.just(found
				? HttpResponse.ok(ARRAY_SIMPLE)
				: HttpResponse.notFound());
	}

	@Override
	public Single<HttpResponse<List<StringModel>>> arrayComplex() {
		return Single.just(HttpResponse.ok(ARRAY_COMPLEX));
	}

	@Override
	public Single<HttpResponse<List<StringModel>>> arrayComplexNotFound(Boolean found) {
		return Single.just(found
				? HttpResponse.ok(ARRAY_COMPLEX)
				: HttpResponse.notFound());
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
	public Single<HttpResponse<Object>> withDefault() {
		return Single.just(HttpResponse.noContent());
	}
}
