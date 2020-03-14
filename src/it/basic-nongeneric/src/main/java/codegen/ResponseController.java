package codegen;

import java.util.List;
import java.util.Optional;

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
	public List<String> array() {
		return ARRAY;
	}

	@Override
	public HttpResponse<?> header() {
		return HttpResponse.ok();
	}

	@Override
	public Optional<List<String>> arrayNotFound(Boolean found) {
		return found ? Optional.of(ARRAY) : Optional.empty();
	}

	@Override
	public String multiple(Boolean redirect) {
		if (redirect) {
			throw new HttpStatusException(HttpStatus.MULTIPLE_CHOICES, DOUBLE);
		}
		return STRING;
	}

	@Override
	public Optional<String> multipleNotFound(Boolean redirect, Boolean found) {
		if (redirect) {
			throw new HttpStatusException(HttpStatus.MULTIPLE_CHOICES, DOUBLE);
		}
		return found ? Optional.of(STRING) : Optional.empty();
	}

	@Override
	public Optional<String> optional(Boolean found) {
		return found ? Optional.of(STRING) : Optional.empty();
	}

	@Override
	public String single() {
		return STRING;
	}

	@Override
	public void voidNormal() {}

	@Override
	public void voidNotFound(Boolean found) {
		if (!found) {
			throw new HttpStatusException(HttpStatus.NOT_FOUND, null);
		}
	}
}
