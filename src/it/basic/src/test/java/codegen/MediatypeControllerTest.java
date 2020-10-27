package codegen;

import static codegen.HttpResponseAssertions.assert200;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.UUID;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import codegen.model.InlineResponse2001;
import io.micronaut.test.annotation.MicronautTest;

@MicronautTest
public class MediatypeControllerTest implements MediatypeApiTestSpec {

	@Inject
	MediatypeApiTestClient client;

	@Test
	@Override
	public void mediatypePostPlain200() {
		var string = UUID.randomUUID().toString();
		var response = assert200(() -> client.mediatypePostPlain(string)).body();
		assertEquals(new InlineResponse2001().setString(string), response);
	}
}
