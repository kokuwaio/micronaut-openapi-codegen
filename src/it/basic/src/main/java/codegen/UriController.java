package codegen;

import java.util.UUID;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;

@Controller
class UriController implements UriApi {

	@Override
	public HttpResponse<String> uriWithString(String string) {
		return HttpResponse.ok("uriWithString_" + string);
	}

	@Override
	public HttpResponse<String> uriWithUuid(UUID uuid) {
		return HttpResponse.ok("uriWithUuid_" + uuid);
	}

	@Override
	public HttpResponse<String> uriWithMultipleUuids(UUID uuid1, UUID uuid2) {
		return HttpResponse.ok("uriWithMultipleUuids_" + uuid1 + "_" + uuid2);
	}
}