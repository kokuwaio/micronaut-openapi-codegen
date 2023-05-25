package codegen.client;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;
import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

import codegen.ParameterModel;
import codegen.server.ParameterApi;
import codegen.server.ParameterApiTestSpec;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;

@MicronautTest
public class ParameterClientTest implements ParameterApiTestSpec {

	private final String STRING = UUID.randomUUID().toString();
	private final String STRING_DEFAULT = "this-is-default";

	@Inject
	ParameterApiClient client;

	@Test
	@Override
	public void paramPathOverlayWithString200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_OVERLAY_WITH_STRING,
				client.paramPathOverlayWithString("221313").getString());
	}

	@Test
	@Override
	public void paramPathOverlayWithUuid200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_OVERLAY_WITH_UUID,
				client.paramPathOverlayWithUuid(UUID.randomUUID()).getString());
	}

	@Test
	@Override
	public void paramPathRequiredWithDefault200() {
		assertEquals(STRING, client.paramPathRequiredWithDefault(STRING).getString());
	}

	@Test
	@Override
	public void paramPathRequiredWithoutDefault200() {
		assertEquals(STRING, client.paramPathRequiredWithoutDefault(STRING).getString());
	}

	@Test
	@Override
	public void paramPathWithBoolean200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_BOOLEAN, client.paramPathWithBoolean(true).getString());
	}

	@Test
	@Override
	public void paramPathWithInteger200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_INTEGER, client.paramPathWithInteger(-1).getString());
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_INTEGER, client.paramPathWithInteger(0).getString());
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_INTEGER, client.paramPathWithInteger(1).getString());
	}

	@Test
	@Override
	public void paramPathWithLong200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_LONG, client.paramPathWithLong(-1L).getString());
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_LONG, client.paramPathWithLong(0L).getString());
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_LONG, client.paramPathWithLong(1L).getString());
	}

	@Test
	@Override
	public void paramPathWithMaxLength200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_MAX_LENGTH, client.paramPathWithMaxLength("12345").getString());
	}

	@Test
	@Override
	public void paramPathWithPattern200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_PATTERN, client.paramPathWithPattern("4f").getString());
	}

	@Test
	@Override
	public void paramPathWithUuid200() {
		assertEquals(ParameterApi.PATH_PARAM_PATH_WITH_UUID,
				client.paramPathWithUuid(UUID.randomUUID()).getString());
	}

	@Test
	@Override
	public void paramBodyOptional200() {
		var expected = new ParameterModel().integer(5).string("test").uuid(UUID.randomUUID());
		assertEquals(expected, client.paramBodyOptional(expected));
		assertEquals(new ParameterModel(), client.paramBodyOptional(null));
	}

	@Test
	@Override
	public void paramBodyRequired200() {
		var expected = new ParameterModel().integer(5).string("test").uuid(UUID.randomUUID());
		assertEquals(expected, client.paramBodyRequired(expected));
	}

	@Test
	@Override
	public void paramBodyRequired400() {
		assertThrows(IllegalArgumentException.class, () -> client.paramBodyRequired(null));
	}

	@Test
	@Override
	public void paramQueryMultipleLists200() {
		Consumer<ParameterModel> equals = expected -> {
			assertEquals(expected,
					client.paramQueryMultipleLists(expected.getA(), expected.getB(), expected.getC()));
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
		assertEquals(expected, client.paramQueryDate(expected.getDate()));
	}

	@Test
	@Override
	public void paramQueryDateTime200() {
		var expected = new ParameterModel().dateTime(Instant.now());
		assertEquals(expected, client.paramQueryDateTime(expected.getDateTime()));
	}

	@Test
	@Override
	public void paramQueryNumber200() {
		var expected = new ParameterModel().number(12.34);
		assertEquals(expected, client.paramQueryNumber(expected.getNumber()));
	}

	@Test
	@Override
	public void paramQueryUuid200() {
		var expected = new ParameterModel().uuid(UUID.randomUUID());
		assertEquals(expected, client.paramQueryUuid(expected.getUuid()));
	}

	@Test
	@Override
	public void paramQueryOptionalWithDefault200() {
		assertEquals(STRING, client.paramQueryOptionalWithDefault(STRING).getString());
		assertEquals(STRING_DEFAULT, client.paramQueryOptionalWithDefault(null).getString());
	}

	@Test
	@Override
	public void paramQueryOptionalWithoutDefault200() {
		assertEquals(STRING, client.paramHeaderOptionalWithoutDefault(STRING).getString());
		assertEquals(null, client.paramHeaderOptionalWithoutDefault(null).getString());
	}

	@Test
	@Override
	public void paramQueryRequiredWithDefault200() {
		assertEquals(STRING, client.paramQueryRequiredWithDefault(STRING).getString());
		assertEquals(STRING_DEFAULT, client.paramQueryRequiredWithDefault(null).getString());
	}

	@Test
	@Override
	public void paramQueryRequiredWithoutDefault200() {
		assertEquals(STRING, client.paramQueryRequiredWithoutDefault(STRING).getString());
	}

	@Test
	@Override
	public void paramQueryRequiredWithoutDefault400() {
		assertThrows(IllegalArgumentException.class, () -> client.paramQueryRequiredWithoutDefault(null));
	}

	@Test
	@Override
	public void paramHeaderOptionalWithDefault200() {
		assertEquals(STRING, client.paramHeaderOptionalWithDefault(STRING).getString());
		assertEquals(STRING_DEFAULT, client.paramHeaderOptionalWithDefault(null).getString());
	}

	@Test
	@Override
	public void paramHeaderOptionalWithoutDefault200() {
		assertEquals(STRING, client.paramHeaderOptionalWithoutDefault(STRING).getString());
		assertEquals(null, client.paramHeaderOptionalWithoutDefault(null).getString());
	}

	@Test
	@Override
	public void paramHeaderRequiredWithDefault200() {
		assertEquals(STRING, client.paramHeaderRequiredWithDefault(STRING).getString());
		assertEquals(STRING_DEFAULT, client.paramHeaderRequiredWithDefault(null).getString());
	}

	@Test
	@Override
	public void paramHeaderRequiredWithoutDefault200() {
		assertEquals(STRING, client.paramHeaderRequiredWithoutDefault(STRING).getString());
	}

	@Test
	@Override
	public void paramHeaderRequiredWithoutDefault400() {
		assertThrows(IllegalArgumentException.class, () -> client.paramHeaderRequiredWithoutDefault(null));
	}

	@Test
	@Override
	public void paramCookieOptionalWithDefault200() {
		assertEquals(STRING, client.paramCookieOptionalWithDefault(STRING).getString());
		assertEquals(STRING_DEFAULT, client.paramCookieOptionalWithDefault(null).getString());
	}

	@Test
	@Override
	public void paramCookieOptionalWithoutDefault200() {
		assertEquals(STRING, client.paramCookieOptionalWithoutDefault(STRING).getString());
		assertEquals(null, client.paramCookieOptionalWithoutDefault(null).getString());
	}

	@Test
	@Override
	public void paramCookieRequiredWithDefault200() {
		assertEquals(STRING, client.paramCookieRequiredWithDefault(STRING).getString());
		assertEquals(STRING_DEFAULT, client.paramCookieRequiredWithDefault(null).getString());
	}

	@Test
	@Override
	public void paramCookieRequiredWithoutDefault200() {
		assertEquals(STRING, client.paramCookieRequiredWithoutDefault(STRING).getString());
	}

	@Test
	@Override
	public void paramCookieRequiredWithoutDefault400() {
		assertThrows(IllegalArgumentException.class, () -> client.paramCookieRequiredWithoutDefault(null));
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
				expected.getInteger()));
	}
}
