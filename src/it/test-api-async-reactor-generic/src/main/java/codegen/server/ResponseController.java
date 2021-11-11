package codegen.server;

import java.util.List;

import codegen.NumberModel;
import codegen.StringModel;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import reactor.core.publisher.Mono;

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
	public Mono<HttpResponse<Object>> voidFound() {
		return Mono.just(HttpResponse.noContent());
	}

	@Override
	public Mono<HttpResponse<Object>> voidNotFound(Boolean found) {
		return Mono.just(found
				? HttpResponse.noContent()
				: HttpResponse.notFound());
	}

	@Override
	public Mono<HttpResponse<String>> single() {
		return Mono.just(HttpResponse.ok(STRING1));
	}

	@Override
	public Mono<HttpResponse<String>> optional(Boolean found) {
		return Mono.just(found
				? HttpResponse.ok(STRING1)
				: HttpResponse.notFound());
	}

	@Override
	public Mono<HttpResponse<Object>> header() {
		return Mono.just(HttpResponse.ok().header("foo", String.valueOf(DOUBLE)));
	}

	@Override
	public Mono<HttpResponse<List<String>>> arraySimple() {
		return Mono.just(HttpResponse.ok(ARRAY_SIMPLE));
	}

	@Override
	public Mono<HttpResponse<List<String>>> arraySimpleEmpty() {
		return Mono.just(HttpResponse.ok(List.of()));
	}

	@Override
	public Mono<HttpResponse<List<String>>> arraySimpleNotFound(Boolean found) {
		return Mono.just(found
				? HttpResponse.ok(ARRAY_SIMPLE)
				: HttpResponse.notFound());
	}

	@Override
	public Mono<HttpResponse<List<StringModel>>> arrayComplex() {
		return Mono.just(HttpResponse.ok(ARRAY_COMPLEX));
	}

	@Override
	public Mono<HttpResponse<List<StringModel>>> arrayComplexNotFound(Boolean found) {
		return Mono.just(found
				? HttpResponse.ok(ARRAY_COMPLEX)
				: HttpResponse.notFound());
	}

	@Override
	public Mono<HttpResponse<Object>> multipleDataTypes(Boolean redirect) {
		return Mono.just(redirect
				? HttpResponse.status(HttpStatus.MULTIPLE_CHOICES).body(MODEL_NUMBER)
				: HttpResponse.ok(MODEL_STRING1));
	}

	@Override
	public Mono<HttpResponse<Object>> multipleDataTypesNotFound(Boolean redirect, Boolean found) {
		if (!found) {
			return Mono.just(HttpResponse.notFound());
		}
		return multipleDataTypes(redirect);
	}

	@Override
	public Mono<HttpResponse<StringModel>> multipleResponseCodes(Boolean redirect) {
		return Mono.just(redirect
				? HttpResponse.status(HttpStatus.MULTIPLE_CHOICES).body(MODEL_STRING2)
				: HttpResponse.ok(MODEL_STRING1));
	}

	@Override
	public Mono<HttpResponse<StringModel>> multipleResponseCodesNotFound(Boolean redirect, Boolean found) {
		if (!found) {
			return Mono.just(HttpResponse.notFound());
		}
		return multipleResponseCodes(redirect);
	}
}
