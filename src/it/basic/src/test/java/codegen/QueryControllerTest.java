package codegen;

import static codegen.HttpResponseAssertions.assert200;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import codegen.model.QueryModel;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.uri.UriBuilder;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@MicronautTest
class QueryControllerTest implements QueryApiTestSpec {

	@Inject
	QueryApiTestClient client;
	@Inject
	@Client("/")
	RxHttpClient rawClient;

	@Test
	@Override
	public void getMultipleLists200() {
		assertAll(
				() -> assertLists(List.of(), List.of()),
				() -> assertLists(List.of("1"), null),
				() -> assertLists(List.of("1", "2"), null),
				() -> assertLists(null, List.of("3")),
				() -> assertLists(List.of(), List.of("3")),
				() -> assertLists(List.of("1", "2"), List.of("3", "4")),
				() -> assertLists(null, null));
	}

	@Test
	@Override
	public void getTypeDate200() {

		// declarative

		var expected = LocalDate.of(2015, 5, 28);
		var actual = client.getTypeDate(expected).body().getDate();
		assertEquals(expected, actual, "declarative");

		// raw

		var string = "2009-12-31";
		var uri = UriBuilder.of("/query/type/date").queryParam("date", string).build().toString();
		var model = rawClient.toBlocking().retrieve(uri, Map.class);
		assertEquals(string, model.get("date"), "raw");
	}

	@Test
	@Override
	public void getTypeDateTime200() {
		var now = Instant.now().with(ChronoField.NANO_OF_SECOND, 123456);
		assertAll(
				() -> assertEquals(now, client.getTypeDateTime(now).body().getDateTime(), "declarative"),
				() -> assertDateTime(now, now, "raw-instant"),
				() -> assertDateTime(now, now.atOffset(ZoneOffset.ofHoursMinutes(5, 30)), "raw-offset"),
				() -> assertDateTime(now, now.atZone(ZoneId.of("Europe/Berlin")), "raw-zoned"),
				() -> assertDateTime(now, LocalDateTime.ofInstant(now, ZoneOffset.UTC), "raw-local"));
	}

	private void assertDateTime(Instant expected, Temporal value, String message) {
		var uri = UriBuilder.of("/query/type/date-time").queryParam("date-time", value.toString()).build().toString();
		var actual = rawClient.toBlocking().retrieve(uri, Map.class).get("dateTime");
		assertEquals(expected.toString(), actual, message);
	}

	@Test
	@Override
	public void getTypeNumber200() {
		var expected = 3.12313346D;
		var actual = client.getTypeNumber(expected).body().getNumber();
		assertEquals(expected, actual);
	}

	@Test
	@Override
	public void getUuid200() {
		var expected = UUID.randomUUID();
		var actual = client.getUuid(expected).body().getUuid();
		assertEquals(expected, actual);
	}

	void assertLists(List<String> a, List<String> b) {
		var expected = new QueryModel().a(a == null || a.isEmpty() ? null : a).b(b == null || b.isEmpty() ? null : b);
		var actual = assert200(() -> client.getMultipleLists(a, b)).body();
		assertEquals(expected, actual);
	}
}
