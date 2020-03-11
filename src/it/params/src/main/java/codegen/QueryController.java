package codegen;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
class QueryController implements QueryApi {

	@Override
	@Get("/query/multiple-lists")
	public HttpResponse<Model> getMultipleLists(List<String> a, List<String> b) {
		return HttpResponse.ok(new Model().a(a).b(b));
	}

	@Override
	public HttpResponse<Model> getTypeDate(LocalDate date) {
		return HttpResponse.ok(new Model().date(date));
	}

	@Override
	public HttpResponse<Model> getTypeDateTime(OffsetDateTime dateTime) {
		return HttpResponse.ok(new Model().dateTime(dateTime));
	}

	@Override
	public HttpResponse<Model> getTypeNumber(Double number) {
		return HttpResponse.ok(new Model().number(number));
	}

	@Override
	public HttpResponse<Model> getUuid(UUID uuid) {
		return HttpResponse.ok(new Model().uuid(uuid));
	}
}
