package codegen;

import static codegen.HttpResponseAssertions.assert200;
import static codegen.HttpResponseAssertions.assert400;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.inject.Inject;
import javax.validation.ConstraintViolationException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@MicronautTest
class ValidationControllerTest implements ValidationApiTestSpec {

	@Inject
	ValidationApiTestClient client;

	@Inject
	ValidationApiClient validatingClient;

	@Test
	@Override
	public void body204() {
		assert200(() -> client.body(model()));
		assert200(() -> client.body(model().setIntegerValue(1)));
		assert200(() -> client.body(model().setIntegerValue(3)));
		assert200(() -> client.body(model().setLongValue(5)));
		assert200(() -> client.body(model().setLongValue(7)));
		assert200(() -> client.body(model().setFloatValue(1.79F)));
		assert200(() -> client.body(model().setFloatValue(1.94F)));
		assert200(() -> client.body(model().setDoubleValue(3.11D)));
		assert200(() -> client.body(model().setDoubleValue(6.12D)));
	}

	@Test
	@Override
	public void body400() {
		assert400(() -> client.body(model().setStringValue(null)));
		assert400(() -> client.body(model().setStringValue("abcdef")));
		assert400(() -> client.body(model().setIntegerValue(0)));
		assert400(() -> client.body(model().setIntegerValue(4)));
		assert400(() -> client.body(model().setLongValue(4)));
		assert400(() -> client.body(model().setLongValue(8)));
		assert400(() -> client.body(model().setFloatValue(1.77F)));
		assert400(() -> client.body(model().setFloatValue(1.96F)));
		assert400(() -> client.body(model().setDoubleValue(3.10D)));
		assert400(() -> client.body(model().setDoubleValue(6.13D)));
		assert400(() -> client.body(model().embedded(null)));
		assert400(() -> client.body(model().embedded(new Embedded())));
	}

	@Test
	@Override
	public void bodyWithCollection204() {
		assert200(() -> client.bodyWithCollection(new ModelWithCollection()));
		assert200(() -> client.bodyWithCollection(new ModelWithCollection().list(List.of(model()))));
		assert200(() -> client.bodyWithCollection(new ModelWithCollection().uuids(List.of(UUID.randomUUID()))));
	}

	@Test
	@Override
	public void bodyWithCollection400() {
		assert400(() -> client.bodyWithCollection(new ModelWithCollection()
				.list(List.of(new Model()))));
		assert400(() -> client.bodyWithCollection(new ModelWithCollection()
				.list(List.of(model().setStringValue(null)))));
		assert400(() -> client.bodyWithCollection(new ModelWithCollection()
				.list(List.of(model().setStringValue("abcdef")))));
		assert400(() -> client.bodyWithCollection(new ModelWithCollection()
				.list(List.of(model().embedded(null)))));
		assert400(() -> client.bodyWithCollection(new ModelWithCollection()
				.list(List.of(model().embedded(new Embedded())))));
	}

	@Test
	@DisplayName("succesful client side bean validation")
	@Override
	public void bodyWithConstraintCollection200() {
		assert200(() -> validatingClient.bodyWithConstraintCollection(new ModelWithConstraintCollection()
				.addObjArrayItem(new Embedded().name("embed"))
				.addUuidArrayItem(UUID.randomUUID())
				.addUuidArrayItem(UUID.randomUUID())
		));
		// use of additional properties must not trigger violation due to falsely required @Introspected annotation
		assert200(() -> validatingClient.bodyWithConstraintCollection(new ModelWithConstraintCollection()
				.addObjArrayItem(new Embedded().name("embed"))
				.properties(Map.of("key", "value"))
		));

	}

	@Test
	@DisplayName("violation of client side bean validation")
	@Override
	public void bodyWithConstraintCollection400() {
		assertThrows(ConstraintViolationException.class, () -> validatingClient.bodyWithConstraintCollection(
				// too less entries
				new ModelWithConstraintCollection()));
		assertThrows(ConstraintViolationException.class, () -> validatingClient.bodyWithConstraintCollection(
				new ModelWithConstraintCollection()
						.addObjArrayItem(new Embedded().name("embed"))
						// too many entries
						.addUuidArrayItem(UUID.randomUUID())
						.addUuidArrayItem(UUID.randomUUID())
						.addUuidArrayItem(UUID.randomUUID())
		));
	}

	@Test
	@Override
	public void queryParam200() {
		assert200(() -> client.queryParam(1));
	}

	@Test
	@Override
	public void queryParam400() {
		assert400(() -> client.queryParam(0));
		assert400(() -> client.queryParam(3));
	}

	private Model model() {
		return new Model().setStringValue("foo").setIntegerValue(1).embedded(new Embedded().name("bar"));
	}
}
