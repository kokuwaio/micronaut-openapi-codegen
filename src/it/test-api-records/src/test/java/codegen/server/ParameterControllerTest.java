package codegen.server;

import static codegen.HttpResponseAssertions.assert400;
import static codegen.HttpResponseAssertions.assert404;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

import jakarta.inject.Inject;

import org.junit.jupiter.api.Test;

import codegen.ParameterModel;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.uri.UriBuilder;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@MicronautTest
public class ParameterControllerTest implements ParameterApiTestSpec {

	private final String STRING = UUID.randomUUID().toString();
	private final String STRING_DEFAULT = "this-is-default";

	@Inject
	ParameterApiTestClient client;
	@Inject
	@Client("/")
	HttpClient rawClient;

	@Test
	@Override
	public void paramPathOverlayWithString200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_OVERLAY_WITH_STRING,
				client.paramPathOverlayWithString("221313").body().string());
	}

	@Test
	@Override
	public void paramPathOverlayWithUuid200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_OVERLAY_WITH_UUID,
				client.paramPathOverlayWithUuid(UUID.randomUUID()).body().string());
	}

	@Test
	@Override
	public void paramPathRequiredWithDefault200() {
		assertEquals(STRING, client.paramPathRequiredWithDefault(STRING).body().string());
	}

	@Test
	@Override
	public void paramPathRequiredWithoutDefault200() {
		assertEquals(STRING, client.paramPathRequiredWithoutDefault(STRING).body().string());
	}

	@Test
	@Override
	public void paramPathWithBoolean200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_BOOLEAN, client.paramPathWithBoolean(true).body().string());
	}

	@Test
	@Override
	public void paramPathWithInteger200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_INTEGER, client.paramPathWithInteger(-1).body().string());
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_INTEGER, client.paramPathWithInteger(0).body().string());
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_INTEGER, client.paramPathWithInteger(1).body().string());
	}

	@Test
	@Override
	public void paramPathWithLong200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_LONG, client.paramPathWithLong(-1L).body().string());
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_LONG, client.paramPathWithLong(0L).body().string());
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_LONG, client.paramPathWithLong(1L).body().string());
	}

	@Test
	@Override
	public void paramPathWithMaxLength200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_MAX_LENGTH,
				client.paramPathWithMaxLength("12345").body().string());
		assert404(() -> client.paramPathWithMaxLength("123456"));
	}

	@Test
	@Override
	public void paramPathWithPattern200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_PATTERN, client.paramPathWithPattern("4f").body().string());
		assert404(() -> client.paramPathWithPattern("f4"));
	}

	@Test
	@Override
	public void paramPathWithUuid200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_UUID,
				client.paramPathWithUuid(UUID.randomUUID()).body().string());
	}

	@Test
	@Override
	public void paramBodyOptional200() {
		var expected = new ParameterModel(null, "test", null, 5, UUID.randomUUID(), null, null, null, null, null);
		assertEquals(expected, client.paramBodyOptional(expected).body());
		expected = new ParameterModel(null, null, null, null, null, null, null, null, null, null);
		assertEquals(expected, client.paramBodyOptional(null).body());
	}

	@Test
	@Override
	public void paramBodyRequired200() {
		var expected = new ParameterModel(null, "test", null, 5, UUID.randomUUID(), null, null, null, null, null);
		assertEquals(expected, client.paramBodyRequired(expected).body());
	}

	@Test
	@Override
	public void paramBodyRequired400() {
		assert400(() -> client.paramBodyRequired(null));
	}

	@Test
	@Override
	public void paramQueryMultipleLists200() {
		Consumer<ParameterModel> equals = expected -> {
			assertEquals(expected, client
					.paramQueryMultipleLists(expected.a(), expected.b(), expected.c()).body());
			assertEquals(expected, rawClient.toBlocking().exchange(HttpRequest.GET(UriBuilder
					.of(ParameterApi.PATH_PARAM_QUERY_MULTIPLE_LISTS)
					.queryParam("a", expected.a().toArray())
					.queryParam("b", expected.b().toArray())
					.queryParam("c", expected.c().toArray())
					.build()), ParameterModel.class).body());
		};
		equals.accept(new ParameterModel(null, null, null, null, null, null, null,
				List.of(), List.of(), List.of()));
		equals.accept(new ParameterModel(null, null, null, null, null, null, null,
				List.of("a"), List.of(UUID.randomUUID()), List.of(123)));
		equals.accept(new ParameterModel(null, null, null, null, null, null, null,
				List.of("a", "b", "c"), List.of(UUID.randomUUID(), UUID.randomUUID()), List.of(123, 456)));
	}

	@Test
	@Override
	public void paramQueryDate200() {
		var expected = new ParameterModel(null, null, null, null, null, LocalDate.now(), null, null, null, null);
		assertEquals(expected, client.paramQueryDate(expected.date()).body());
		assertEquals(expected, rawClient.toBlocking().retrieve(UriBuilder
				.of(ParameterApi.PATH_PARAM_QUERY_DATE)
				.queryParam("date", expected.date().toString())
				.build().toString(), ParameterModel.class));
	}

	@Test
	@Override
	public void paramQueryDateTime200() {
		var expected = new ParameterModel(null, null, null, null, null, null, Instant.now(), null, null, null);
		assertEquals(expected, client.paramQueryDateTime(expected.dateTime()).body());
		assertEquals(expected, rawClient.toBlocking().retrieve(UriBuilder
				.of(ParameterApi.PATH_PARAM_QUERY_DATE_TIME)
				.queryParam("date", expected.dateTime().toString())
				.build().toString(), ParameterModel.class));
	}

	@Test
	@Override
	public void paramQueryNumber200() {
		var expected = new ParameterModel(null, null, 12.34, null, null, null, null, null, null, null);
		assertEquals(expected, client.paramQueryNumber(expected.number()).body());
	}

	@Test
	@Override
	public void paramQueryUuid200() {
		var expected = new ParameterModel(null, null, null, null, UUID.randomUUID(), null, null, null, null, null);
		assertEquals(expected, client.paramQueryUuid(expected.uuid()).body());
	}

	@Test
	@Override
	public void paramQueryOptionalWithDefault200() {
		assertEquals(STRING, client.paramQueryOptionalWithDefault(STRING).body().string());
		assertEquals(STRING_DEFAULT, client.paramQueryOptionalWithDefault(null).body().string());
	}

	@Test
	@Override
	public void paramQueryOptionalWithoutDefault200() {
		assertEquals(STRING, client.paramHeaderOptionalWithoutDefault(STRING).body().string());
		assertEquals(null, client.paramHeaderOptionalWithoutDefault(null).body().string());
	}

	@Test
	@Override
	public void paramQueryRequiredWithDefault200() {
		assertEquals(STRING, client.paramQueryRequiredWithDefault(STRING).body().string());
		assertEquals(STRING_DEFAULT, client.paramQueryRequiredWithDefault(null).body().string());
	}

	@Test
	@Override
	public void paramQueryRequiredWithoutDefault200() {
		assertEquals(STRING, client.paramQueryRequiredWithoutDefault(STRING).body().string());
	}

	@Test
	@Override
	public void paramQueryRequiredWithoutDefault400() {
		assert400(() -> client.paramQueryRequiredWithoutDefault(null));
	}

	@Test
	@Override
	public void paramHeaderOptionalWithDefault200() {
		assertEquals(STRING, client.paramHeaderOptionalWithDefault(STRING).body().string());
		assertEquals(STRING_DEFAULT, client.paramHeaderOptionalWithDefault(null).body().string());
	}

	@Test
	@Override
	public void paramHeaderOptionalWithoutDefault200() {
		assertEquals(STRING, client.paramHeaderOptionalWithoutDefault(STRING).body().string());
		assertEquals(null, client.paramHeaderOptionalWithoutDefault(null).body().string());
	}

	@Test
	@Override
	public void paramHeaderRequiredWithDefault200() {
		assertEquals(STRING, client.paramHeaderRequiredWithDefault(STRING).body().string());
		assertEquals(STRING_DEFAULT, client.paramHeaderRequiredWithDefault(null).body().string());
	}

	@Test
	@Override
	public void paramHeaderRequiredWithoutDefault200() {
		assertEquals(STRING, client.paramHeaderRequiredWithoutDefault(STRING).body().string());
	}

	@Test
	@Override
	public void paramHeaderRequiredWithoutDefault400() {
		assert400(() -> client.paramHeaderRequiredWithoutDefault(null));
	}

	@Test
	@Override
	public void paramCookieOptionalWithDefault200() {
		assertEquals(STRING, client.paramCookieOptionalWithDefault(STRING).body().string());
		assertEquals(STRING_DEFAULT, client.paramCookieOptionalWithDefault(null).body().string());
	}

	@Test
	@Override
	public void paramCookieOptionalWithoutDefault200() {
		assertEquals(STRING, client.paramCookieOptionalWithoutDefault(STRING).body().string());
		assertEquals(null, client.paramCookieOptionalWithoutDefault(null).body().string());
	}

	@Test
	@Override
	public void paramCookieRequiredWithDefault200() {
		assertEquals(STRING, client.paramCookieRequiredWithDefault(STRING).body().string());
		assertEquals(STRING_DEFAULT, client.paramCookieRequiredWithDefault(null).body().string());
	}

	@Test
	@Override
	public void paramCookieRequiredWithoutDefault200() {
		assertEquals(STRING, client.paramCookieRequiredWithoutDefault(STRING).body().string());
	}

	@Test
	@Override
	public void paramCookieRequiredWithoutDefault400() {
		assert400(() -> client.paramCookieRequiredWithoutDefault(null));
	}

	@Test
	@Override
	public void paramAll200() {
		var expected = new ParameterModel(
				null,
				UUID.randomUUID().toString(),
				null,
				123,
				UUID.randomUUID(),
				LocalDate.now(),
				null,
				null,
				null,
				null);
		assertEquals(expected, client.paramAll(
				expected.string(),
				expected.uuid(),
				expected.date(),
				expected.integer()).body());
	}
}
