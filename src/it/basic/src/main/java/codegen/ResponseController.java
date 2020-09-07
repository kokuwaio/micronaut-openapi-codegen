package codegen;

import java.util.List;

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
	public HttpResponse<String> header() {
		return HttpResponse.ok();
	}

	@Override
	public HttpResponse<List<String>> arrayNotFound(Boolean found) {
		return found ? HttpResponse.ok(ARRAY) : HttpResponse.notFound();
	}

	@Override
	public HttpResponse<String> multiple(Boolean redirect) {
		if (redirect) {
			throw new HttpStatusException(HttpStatus.MULTIPLE_CHOICES, DOUBLE);
		}
		return HttpResponse.ok(STRING);
	}

	@Override
	public HttpResponse<String> multipleNotFound(Boolean redirect, Boolean found) {
		if (redirect) {
			throw new HttpStatusException(HttpStatus.MULTIPLE_CHOICES, DOUBLE);
		}
		return found ? HttpResponse.ok(STRING) : HttpResponse.notFound();
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
	public HttpResponse<?> voidNormal() {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<?> voidNotFound(Boolean found) {
		return found ? HttpResponse.noContent() : HttpResponse.notFound();
	}

	@Override
	public HttpResponse<?> defaultWithNoContent() {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<String> defaultWithOk() {
		return HttpResponse.ok();
	}
}
