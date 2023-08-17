package codegen.server;

import java.util.List;

import codegen.NumberModel;
import codegen.StringModel;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;

@Controller
public class ResponseController implements ResponseApi {

	public static final Double DOUBLE = 1234D;
	public static final String STRING1 = "string1";
	public static final String STRING2 = "string2";
	public static final StringModel MODEL_STRING1 = new StringModel(STRING1);
	public static final StringModel MODEL_STRING2 = new StringModel(STRING2);
	public static final NumberModel MODEL_NUMBER = new NumberModel(DOUBLE);
	public static final List<String> ARRAY_SIMPLE = List.of("a", "b");
	public static final List<StringModel> ARRAY_COMPLEX = List.of(new StringModel(STRING1), new StringModel(STRING2));

	@Override
	public HttpResponse<Object> voidFound() {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> voidNotFound(Boolean found) {
		return found
				? HttpResponse.noContent()
				: HttpResponse.notFound();
	}

	@Override
	public HttpResponse<String> single() {
		return HttpResponse.ok(STRING1);
	}

	@Override
	public HttpResponse<String> optional(Boolean found) {
		return found
				? HttpResponse.ok(STRING1)
				: HttpResponse.notFound();
	}

	@Override
	public HttpResponse<Object> header() {
		return HttpResponse.ok().header("foo", String.valueOf(DOUBLE));
	}

	@Override
	public HttpResponse<List<String>> arraySimple() {
		return HttpResponse.ok(ARRAY_SIMPLE);
	}

	@Override
	public HttpResponse<List<String>> arraySimpleEmpty() {
		return HttpResponse.ok(List.of());
	}

	@Override
	public HttpResponse<List<String>> arraySimpleNotFound(Boolean found) {
		return found
				? HttpResponse.ok(ARRAY_SIMPLE)
				: HttpResponse.notFound();
	}

	@Override
	public HttpResponse<List<StringModel>> arrayComplex() {
		return HttpResponse.ok(ARRAY_COMPLEX);
	}

	@Override
	public HttpResponse<List<StringModel>> arrayComplexNotFound(Boolean found) {
		return found
				? HttpResponse.ok(ARRAY_COMPLEX)
				: HttpResponse.notFound();
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
	public HttpResponse<Object> withDefault() {
		return HttpResponse.noContent();
	}
}
