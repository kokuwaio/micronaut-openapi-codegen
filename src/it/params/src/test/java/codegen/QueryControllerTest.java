package codegen;

import static codegen.HttpResponseAssertions.assert200;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.micronaut.test.annotation.MicronautTest;

@MicronautTest
class QueryControllerTest implements QueryApiTestSpec {

	@Inject
	QueryApiTestClient client;

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
		var expected = LocalDate.of(2015, 5, 28);
		var actual = client.getTypeDate(expected).body().getDate();
		assertEquals(expected, actual);
	}

	@Test
	@Override
	public void getTypeDateTime200() {
		var expected = OffsetDateTime.of(2015, 5, 28, 12, 34, 56, 0, ZoneOffset.UTC);
		var actual = client.getTypeDateTime(expected).body().getDateTime();
		assertEquals(expected, actual);
	}

	@Test
	@Override
	public void getTypeNumber200() {
		var expected = 3.12313346D;
		var actual = client.getTypeNumber(expected).body().getNumber();
		assertEquals(expected, actual);
	}

	void assertLists(List<String> a, List<String> b) {
		var expected = new Model().a(a == null || a.isEmpty() ? null : a).b(b == null || b.isEmpty() ? null : b);
		var actual = assert200(() -> client.getMultipleLists(a, b)).body();
		assertEquals(expected, actual);
	}
}
