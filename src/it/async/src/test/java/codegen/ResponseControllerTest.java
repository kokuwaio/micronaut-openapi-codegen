package codegen;

import static codegen.HttpResponseAssertions.assert200;
import static codegen.HttpResponseAssertions.assert204;
import static codegen.HttpResponseAssertions.assert404;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.ArrayList;

import javax.inject.Inject;

import org.junit.jupiter.api.Test;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.MediaType;
import io.micronaut.http.client.RxStreamingHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@MicronautTest
public class ResponseControllerTest implements ResponseApiTestSpec {

	@Inject
	ResponseApiTestClient client;
	@Inject
	@Client("/")
	RxStreamingHttpClient rxClient;

	@Test
	@Override
	public void completable204() {
		var response = assert204(() -> client.completable());
		assertNull(response.body());
	}

	@Test
	@Override
	public void single200() {
		var response = assert200(() -> client.single());
		assertEquals(ResponseController.SINGLE, response.body());
	}

	@Test
	@Override
	public void maybe200() {
		var response = assert200(() -> client.maybe(true));
		assertEquals(ResponseController.SINGLE, response.body());
	}

	@Test
	@Override
	public void maybe404() {
		assert404(() -> client.maybe(false));
	}

	@Test
	@Override
	public void noContentGet200() {
		assert200(() -> client.noContentGet());
	}

	@Test
	@Override
	public void array200() {
		var response = assert200(() -> client.array());
		assertEquals(ResponseController.ARRAY, response.body());
	}

	@Test
	@Override
	public void stream200() {
		var result = new ArrayList<Model>();
		var disposable = rxClient
				.jsonStream(HttpRequest.GET("/stream").accept(MediaType.APPLICATION_JSON_STREAM_TYPE), Model.class)
				.subscribe(result::add);
		while (!disposable.isDisposed()) {
			Thread.onSpinWait();
		}
		assertEquals(ResponseController.ARRAY, result);
	}
}
