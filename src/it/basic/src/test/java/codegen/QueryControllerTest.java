package codegen;

import static codegen.HttpResponseAssertions.assert200;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import codegen.model.QueryModel;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.http.uri.UriBuilder;
import io.micronaut.test.annotation.MicronautTest;

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

		// declarative

		var expected = OffsetDateTime.of(2015, 5, 28, 12, 34, 56, 0, ZoneOffset.UTC);
		var actual = client.getTypeDateTime(expected).body().getDateTime();
		assertEquals(expected, actual, "declarative");

		// raw - from instant

		var string = "2009-12-31T14:26:53.456789Z";
		var uri = UriBuilder.of("/query/type/date-time").queryParam("date-time", string).build().toString();
		var model = rawClient.toBlocking().retrieve(uri, Map.class);
		assertEquals(string, model.get("dateTime"), "raw-instant");

		// raw - from local

		var local = LocalDateTime.now(ZoneOffset.UTC).withNano(123456);
		uri = UriBuilder.of("/query/type/date-time").queryParam("date-time", local.toString()).build().toString();
		model = rawClient.toBlocking().retrieve(uri, Map.class);
		assertEquals(local.atOffset(ZoneOffset.UTC).toString(), model.get("dateTime"), "raw-local");

		// raw - from zoned

		var zoned = ZonedDateTime.now(ZoneId.of("Europe/Berlin")).withNano(123456);
		uri = UriBuilder.of("/query/type/date-time").queryParam("date-time", zoned.toString()).build().toString();
		model = rawClient.toBlocking().retrieve(uri, Map.class);
		assertEquals(zoned.toOffsetDateTime().toString(), model.get("dateTime"), "raw-zoned");
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
