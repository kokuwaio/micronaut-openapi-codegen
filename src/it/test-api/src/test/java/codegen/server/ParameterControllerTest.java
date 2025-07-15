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
				client.paramPathOverlayWithString("221313").body().getString());
	}

	@Test
	@Override
	public void paramPathOverlayWithUuid200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_OVERLAY_WITH_UUID,
				client.paramPathOverlayWithUuid(UUID.randomUUID()).body().getString());
	}

	@Test
	@Override
	public void paramPathRequiredWithDefault200() {
		assertEquals(STRING, client.paramPathRequiredWithDefault(STRING).body().getString());
	}

	@Test
	@Override
	public void paramPathRequiredWithoutDefault200() {
		assertEquals(STRING, client.paramPathRequiredWithoutDefault(STRING).body().getString());
	}

	@Test
	@Override
	public void paramPathWithBoolean200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_BOOLEAN, client.paramPathWithBoolean(true).body().getString());
	}

	@Test
	@Override
	public void paramPathWithInteger200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_INTEGER, client.paramPathWithInteger(-1).body().getString());
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_INTEGER, client.paramPathWithInteger(0).body().getString());
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_INTEGER, client.paramPathWithInteger(1).body().getString());
	}

	@Test
	@Override
	public void paramPathWithLong200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_LONG, client.paramPathWithLong(-1L).body().getString());
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_LONG, client.paramPathWithLong(0L).body().getString());
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_LONG, client.paramPathWithLong(1L).body().getString());
	}

	@Test
	@Override
	public void paramPathWithMaxLength200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_MAX_LENGTH,
				client.paramPathWithMaxLength("12345").body().getString());
		assert404(() -> client.paramPathWithMaxLength("123456"));
	}

	@Test
	@Override
	public void paramPathWithPattern200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_PATTERN, client.paramPathWithPattern("4f").body().getString());
		assert404(() -> client.paramPathWithPattern("f4"));
	}

	@Test
	@Override
	public void paramPathWithUuid200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_UUID,
				client.paramPathWithUuid(UUID.randomUUID()).body().getString());
	}

	@Test
	@Override
	public void paramBodyOptional200() {
		var expected = new ParameterModel().integer(5).string("test").uuid(UUID.randomUUID());
		assertEquals(expected, client.paramBodyOptional(expected).body());
		assertEquals(new ParameterModel(), client.paramBodyOptional(null).body());
	}

	@Test
	@Override
	public void paramBodyRequired200() {
		var expected = new ParameterModel().integer(5).string("test").uuid(UUID.randomUUID());
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
					.paramQueryMultipleLists(expected.getA(), expected.getB(), expected.getC()).body());
			assertEquals(expected, rawClient.toBlocking().exchange(HttpRequest.GET(UriBuilder
					.of(ParameterApi.PATH_PARAM_QUERY_MULTIPLE_LISTS)
					.queryParam("a", expected.getA().toArray())
					.queryParam("b", expected.getB().toArray())
					.queryParam("c", expected.getC().toArray())
					.build()), ParameterModel.class).body());
		};
		equals.accept(new ParameterModel().a(List.of()).b(List.of()).c(List.of()));
		equals.accept(new ParameterModel().a(List.of("a")).b(List.of(UUID.randomUUID())).c(List.of(123)));
		equals.accept(new ParameterModel().a(List.of("a", "b", "c"))
				.b(List.of(UUID.randomUUID(), UUID.randomUUID())).c(List.of(123, 456)));
	}

	@Test
	@Override
	public void paramQueryDate200() {
		var expected = new ParameterModel().date(LocalDate.now());
		assertEquals(expected, client.paramQueryDate(expected.getDate()).body());
		assertEquals(expected, rawClient.toBlocking().retrieve(UriBuilder
				.of(ParameterApi.PATH_PARAM_QUERY_DATE)
				.queryParam("date", expected.getDate().toString())
				.build().toString(), ParameterModel.class));
	}

	@Test
	@Override
	public void paramQueryDateTime200() {
		var expected = new ParameterModel().dateTime(Instant.now());
		assertEquals(expected, client.paramQueryDateTime(expected.getDateTime()).body());
		assertEquals(expected, rawClient.toBlocking().retrieve(UriBuilder
				.of(ParameterApi.PATH_PARAM_QUERY_DATE_TIME)
				.queryParam("date", expected.getDateTime().toString())
				.build().toString(), ParameterModel.class));
	}

	@Test
	@Override
	public void paramQueryNumber200() {
		var expected = new ParameterModel().number(12.34);
		assertEquals(expected, client.paramQueryNumber(expected.getNumber()).body());
	}

	@Test
	@Override
	public void paramQueryUuid200() {
		var expected = new ParameterModel().uuid(UUID.randomUUID());
		assertEquals(expected, client.paramQueryUuid(expected.getUuid()).body());
	}

	@Test
	@Override
	public void paramQueryOptionalWithDefault200() {
		assertEquals(STRING, client.paramQueryOptionalWithDefault(STRING).body().getString());
		assertEquals(STRING_DEFAULT, client.paramQueryOptionalWithDefault(null).body().getString());
	}

	@Test
	@Override
	public void paramQueryOptionalWithoutDefault200() {
		assertEquals(STRING, client.paramHeaderOptionalWithoutDefault(STRING).body().getString());
		assertEquals(null, client.paramHeaderOptionalWithoutDefault(null).body().getString());
	}

	@Test
	@Override
	public void paramQueryRequiredWithDefault200() {
		assertEquals(STRING, client.paramQueryRequiredWithDefault(STRING).body().getString());
		assertEquals(STRING_DEFAULT, client.paramQueryRequiredWithDefault(null).body().getString());
	}

	@Test
	@Override
	public void paramQueryRequiredWithoutDefault200() {
		assertEquals(STRING, client.paramQueryRequiredWithoutDefault(STRING).body().getString());
	}

	@Test
	@Override
	public void paramQueryRequiredWithoutDefault400() {
		assert400(() -> client.paramQueryRequiredWithoutDefault(null));
	}

	@Test
	@Override
	public void paramHeaderOptionalWithDefault200() {
		assertEquals(STRING, client.paramHeaderOptionalWithDefault(STRING).body().getString());
		assertEquals(STRING_DEFAULT, client.paramHeaderOptionalWithDefault(null).body().getString());
	}

	@Test
	@Override
	public void paramHeaderOptionalWithoutDefault200() {
		assertEquals(STRING, client.paramHeaderOptionalWithoutDefault(STRING).body().getString());
		assertEquals(null, client.paramHeaderOptionalWithoutDefault(null).body().getString());
	}

	@Test
	@Override
	public void paramHeaderRequiredWithDefault200() {
		assertEquals(STRING, client.paramHeaderRequiredWithDefault(STRING).body().getString());
		assertEquals(STRING_DEFAULT, client.paramHeaderRequiredWithDefault(null).body().getString());
	}

	@Test
	@Override
	public void paramHeaderRequiredWithoutDefault200() {
		assertEquals(STRING, client.paramHeaderRequiredWithoutDefault(STRING).body().getString());
	}

	@Test
	@Override
	public void paramHeaderRequiredWithoutDefault400() {
		assert400(() -> client.paramHeaderRequiredWithoutDefault(null));
	}

	@Test
	@Override
	public void paramCookieOptionalWithDefault200() {
		assertEquals(STRING, client.paramCookieOptionalWithDefault(STRING).body().getString());
		assertEquals(STRING_DEFAULT, client.paramCookieOptionalWithDefault(null).body().getString());
	}

	@Test
	@Override
	public void paramCookieOptionalWithoutDefault200() {
		assertEquals(STRING, client.paramCookieOptionalWithoutDefault(STRING).body().getString());
		assertEquals(null, client.paramCookieOptionalWithoutDefault(null).body().getString());
	}

	@Test
	@Override
	public void paramCookieRequiredWithDefault200() {
		assertEquals(STRING, client.paramCookieRequiredWithDefault(STRING).body().getString());
		assertEquals(STRING_DEFAULT, client.paramCookieRequiredWithDefault(null).body().getString());
	}

	@Test
	@Override
	public void paramCookieRequiredWithoutDefault200() {
		assertEquals(STRING, client.paramCookieRequiredWithoutDefault(STRING).body().getString());
	}

	@Test
	@Override
	public void paramCookieRequiredWithoutDefault400() {
		assert400(() -> client.paramCookieRequiredWithoutDefault(null));
	}

	@Test
	@Override
	public void paramAll200() {
		var expected = new ParameterModel()
				.string(UUID.randomUUID().toString())
				.uuid(UUID.randomUUID())
				.date(LocalDate.now())
				.integer(123);
		assertEquals(expected, client.paramAll(
				expected.getString(),
				expected.getUuid(),
				expected.getDate(),
				expected.getInteger()).body());
	}
}
