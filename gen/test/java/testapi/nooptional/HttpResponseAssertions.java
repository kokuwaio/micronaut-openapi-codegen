package testapi.nooptional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.function.Supplier;
import java.util.regex.Pattern;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.client.exceptions.HttpClientResponseException;

@io.micronaut.core.annotation.Generated
public class HttpResponseAssertions {

	public static <T> HttpResponse<T> assertStatus(HttpResponse<T> response, HttpStatus status) {
		assertStatus(response, status, null);
		return response;
	}

	public static <T> HttpResponse<T> assertStatus(HttpResponse<T> response, HttpStatus status, String message) {
		assertEquals(status, response.getStatus(), message == null ? "invalid status" : message);
		return response;
	}

	public static <T> HttpResponse<T> assertStatus(Supplier<HttpResponse<T>> executeable, HttpStatus status) {
		return assertStatus(executeable, status, null);
	}

	@SuppressWarnings("unchecked")
	public static <T> HttpResponse<T> assertStatus(Supplier<HttpResponse<T>> executeable, HttpStatus status,
			String message) {
		HttpResponse<T> response = null;
		try {
			response = executeable.get();
		} catch (HttpClientResponseException e) {
			response = (HttpResponse<T>) e.getResponse();
		}
		assertStatus(response, status, message);
		return response;
	}

	// responses

	public static <T> HttpResponse<T> assert200(Supplier<HttpResponse<T>> executeable) {
		return assertStatus(executeable, HttpStatus.OK);
	}

	public static <T> HttpResponse<T> assert200(Supplier<HttpResponse<T>> executeable, String message) {
		return assertStatus(executeable, HttpStatus.OK, message);
	}

	public static <T> HttpResponse<T> assert201(Supplier<HttpResponse<T>> executeable) {
		return assertStatus(executeable, HttpStatus.CREATED);
	}

	public static <T> HttpResponse<T> assert201(Supplier<HttpResponse<T>> executeable, String message) {
		return assertStatus(executeable, HttpStatus.CREATED, message);
	}

	public static <T> HttpResponse<T> assert204(Supplier<HttpResponse<T>> executeable) {
		return assertStatus(executeable, HttpStatus.NO_CONTENT);
	}

	public static <T> HttpResponse<T> assert204(Supplier<HttpResponse<T>> executeable, String message) {
		return assertStatus(executeable, HttpStatus.NO_CONTENT, message);
	}

	public static <T> HttpResponse<T> assert300(Supplier<HttpResponse<T>> executeable) {
		return assertStatus(executeable, HttpStatus.MULTIPLE_CHOICES);
	}

	public static <T> HttpResponse<T> assert300(Supplier<HttpResponse<T>> executeable, String message) {
		return assertStatus(executeable, HttpStatus.MULTIPLE_CHOICES, message);
	}

	public static <T> HttpResponse<T> assert400(Supplier<HttpResponse<T>> executeable) {
		return assertStatus(executeable, HttpStatus.BAD_REQUEST);
	}

	public static <T> HttpResponse<T> assert400(Supplier<HttpResponse<T>> executeable, String message) {
		return assertStatus(executeable, HttpStatus.BAD_REQUEST, message);
	}

	public static <T> HttpResponse<T> assert401(Supplier<HttpResponse<T>> executeable) {
		return assertStatus(executeable, HttpStatus.UNAUTHORIZED);
	}

	public static <T> HttpResponse<T> assert401(Supplier<HttpResponse<T>> executeable, String message) {
		return assertStatus(executeable, HttpStatus.UNAUTHORIZED, message);
	}

	public static <T> HttpResponse<T> assert403(Supplier<HttpResponse<T>> executeable) {
		return assertStatus(executeable, HttpStatus.FORBIDDEN);
	}

	public static <T> HttpResponse<T> assert403(Supplier<HttpResponse<T>> executeable, String message) {
		return assertStatus(executeable, HttpStatus.FORBIDDEN, message);
	}

	public static <T> HttpResponse<T> assert404(Supplier<HttpResponse<T>> executeable) {
		return assertStatus(executeable, HttpStatus.NOT_FOUND);
	}

	public static <T> HttpResponse<T> assert404(Supplier<HttpResponse<T>> executeable, String message) {
		return assertStatus(executeable, HttpStatus.NOT_FOUND, message);
	}

	public static <T> HttpResponse<T> assert409(Supplier<HttpResponse<T>> executeable) {
		return assertStatus(executeable, HttpStatus.CONFLICT);
	}

	public static <T> HttpResponse<T> assert409(Supplier<HttpResponse<T>> executeable, String message) {
		return assertStatus(executeable, HttpStatus.CONFLICT, message);
	}

	public static <T> HttpResponse<T> assert412(Supplier<HttpResponse<T>> executeable) {
		return assertStatus(executeable, HttpStatus.PRECONDITION_FAILED);
	}

	public static <T> HttpResponse<T> assert412(Supplier<HttpResponse<T>> executeable, String message) {
		return assertStatus(executeable, HttpStatus.PRECONDITION_FAILED, message);
	}

	public static <T> HttpResponse<T> assert422(Supplier<HttpResponse<T>> executeable) {
		return assertStatus(executeable, HttpStatus.UNPROCESSABLE_ENTITY);
	}

	public static <T> HttpResponse<T> assert422(Supplier<HttpResponse<T>> executeable, String message) {
		return assertStatus(executeable, HttpStatus.UNPROCESSABLE_ENTITY, message);
	}

	public static <T> HttpResponse<T> assert428(Supplier<HttpResponse<T>> executeable) {
		return assertStatus(executeable, HttpStatus.PRECONDITION_REQUIRED);
	}

	public static <T> HttpResponse<T> assert428(Supplier<HttpResponse<T>> executeable, String message) {
		return assertStatus(executeable, HttpStatus.PRECONDITION_REQUIRED, message);
	}

	public static <T> HttpResponse<T> assert502(Supplier<HttpResponse<T>> executeable) {
		return assertStatus(executeable, HttpStatus.BAD_GATEWAY);
	}

	public static <T> HttpResponse<T> assert502(Supplier<HttpResponse<T>> executeable, String message) {
		return assertStatus(executeable, HttpStatus.BAD_GATEWAY, message);
	}

	// header

	public static String getLocationHeader(HttpResponse<?> response) {
		var location = response.header(HttpHeaders.LOCATION);
		assertNotNull(location, "no location header found");
		return location;
	}

	public static String getLocationHeaderValue(HttpResponse<?> response, String pattern) {
		return getLocationHeaderValue(response, pattern, 1);
	}

	public static String getLocationHeaderValue(HttpResponse<?> response, String pattern, int group) {
		var location = getLocationHeader(response);
		var matcher = Pattern.compile(pattern).matcher(location);
		assertTrue(matcher.matches(), "location header is invalid: " + location);
		return matcher.group(group);
	}
}
