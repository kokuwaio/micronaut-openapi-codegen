package codegen;

import static codegen.HttpResponseAssertions.assert200;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
				() -> assertLists(List.of("1,2"), null),
				() -> assertLists(null, List.of("3")),
				() -> assertLists(List.of(), List.of("3")),
				() -> assertLists(List.of("1", "2"), List.of("3", "4")),
				() -> assertLists(null, null));
	}

	void assertLists(List<String> a, List<String> b) {
		var expected = new Model().a(a == null || a.isEmpty() ? null : a).b(b == null || b.isEmpty() ? null : b);
		var actual = assert200(() -> client.getMultipleLists(a, b)).getBody().get();
		assertEquals(expected, actual);
	}
}
