package codegen.server;

import java.util.List;
import java.util.Optional;

import codegen.NumberModel;
import codegen.StringModel;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.exceptions.HttpStatusException;

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
	public void voidFound() {}

	@Override
	public void voidNotFound(Boolean found) {
		if (!found) {
			throw new HttpStatusException(HttpStatus.NOT_FOUND, null);
		}
	}

	@Override
	public String single() {
		return STRING1;
	}

	@Override
	public Optional<String> optional(Boolean found) {
		return found ? Optional.of(STRING1) : Optional.empty();
	}

	@Override
	public HttpResponse<Object> header() {
		return HttpResponse.ok().header("foo", String.valueOf(DOUBLE));
	}

	@Override
	public List<String> arraySimple() {
		return ARRAY_SIMPLE;
	}

	@Override
	public List<String> arraySimpleEmpty() {
		return List.of();
	}

	@Override
	public Optional<List<String>> arraySimpleNotFound(Boolean found) {
		return found ? Optional.of(ARRAY_SIMPLE) : Optional.empty();
	}

	@Override
	public List<StringModel> arrayComplex() {
		return ARRAY_COMPLEX;
	}

	@Override
	public Optional<List<StringModel>> arrayComplexNotFound(Boolean found) {
		return found ? Optional.of(ARRAY_COMPLEX) : Optional.empty();
	}

	@Override
	public HttpResponse<Object> multipleDataTypes(Boolean redirect) {
		return redirect
				? HttpResponse.status(HttpStatus.MULTIPLE_CHOICES).body(MODEL_NUMBER)
				: HttpResponse.ok(MODEL_STRING1);
	}

	@Override
	public HttpResponse<Object> multipleDataTypesNotFound(Boolean redirect, Boolean found) {
		if (!found) {
			return HttpResponse.notFound();
		}
		return multipleDataTypes(redirect);
	}

	@Override
	public HttpResponse<StringModel> multipleResponseCodes(Boolean redirect) {
		return redirect
				? HttpResponse.status(HttpStatus.MULTIPLE_CHOICES).body(MODEL_STRING2)
				: HttpResponse.ok(MODEL_STRING1);
	}

	@Override
	public HttpResponse<StringModel> multipleResponseCodesNotFound(Boolean redirect, Boolean found) {
		if (!found) {
			return HttpResponse.notFound();
		}
		return multipleResponseCodes(redirect);
	}

	@Override
	public void withDefault() {}
}
