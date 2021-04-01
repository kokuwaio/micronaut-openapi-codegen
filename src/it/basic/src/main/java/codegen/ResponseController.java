package codegen;

import java.util.List;

import codegen.model.ResponseMultiple200;
import codegen.model.ResponseMultiple300;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.exceptions.HttpStatusException;

@Controller
class ResponseController implements ResponseApi {

	static final Double DOUBLE = 1234D;
	static final String STRING = "string";
	static final List<String> ARRAY = List.of("a", "b");

	@Override
	public HttpResponse<List<String>> array() {
		return HttpResponse.ok(ARRAY);
	}

	@Override
	public HttpResponse<Object> header() {
		return HttpResponse.ok();
	}

	@Override
	public HttpResponse<List<String>> arrayNotFound(Boolean found) {
		return found ? HttpResponse.ok(ARRAY) : HttpResponse.notFound();
	}

	@Override
	public HttpResponse<Long> defaultResponse(Boolean error) {
		if (error) {
			throw new HttpStatusException(HttpStatus.BAD_GATEWAY, (Object) "nope");
		}
		return HttpResponse.ok(3L);
	}

	@Override
	public HttpResponse<ResponseMultiple200> multipleResponseCodes(Boolean redirect) {
		return redirect
				? HttpResponse.status(HttpStatus.MULTIPLE_CHOICES).body(new ResponseMultiple200().setFoo(STRING))
				: HttpResponse.ok(new ResponseMultiple200().setFoo(STRING));
	}

	@Override
	public HttpResponse<Object> multipleDataTypes(Boolean redirect) {
		if (redirect) {
			return HttpResponse.status(HttpStatus.MULTIPLE_CHOICES).body(new ResponseMultiple300().setBar(DOUBLE));
		}
		return HttpResponse.ok(new ResponseMultiple200().setFoo(STRING));
	}

	@Override
	public HttpResponse<Object> multipleDataTypesNotFound(Boolean redirect, Boolean found) {
		if (redirect) {
			return HttpResponse.status(HttpStatus.MULTIPLE_CHOICES).body(new ResponseMultiple300().setBar(DOUBLE));
		}
		return found ? HttpResponse.ok(new ResponseMultiple200().setFoo(STRING)) : HttpResponse.notFound();
	}

	@Override
	public HttpResponse<String> optional(Boolean found) {
		return found ? HttpResponse.ok(STRING) : HttpResponse.notFound();
	}

	@Override
	public HttpResponse<String> single() {
		return HttpResponse.ok(STRING);
	}

	@Override
	public HttpResponse<Object> voidNormal() {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> voidNotFound(Boolean found) {
		return found ? HttpResponse.noContent() : HttpResponse.notFound();
	}
}
