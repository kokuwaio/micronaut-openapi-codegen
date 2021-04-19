package codegen;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import codegen.model.QueryModel;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
class QueryController implements QueryApi {

	@Override
	@Get("/query/multiple-lists")
	public HttpResponse<QueryModel> getMultipleLists(List<String> a, List<String> b) {
		return HttpResponse.ok(new QueryModel().a(a).b(b));
	}

	@Override
	public HttpResponse<QueryModel> getTypeDate(LocalDate date) {
		return HttpResponse.ok(new QueryModel().date(date));
	}

	@Override
	public HttpResponse<QueryModel> getTypeDateTime(Instant dateTime) {
		return HttpResponse.ok(new QueryModel().dateTime(dateTime));
	}

	@Override
	public HttpResponse<QueryModel> getTypeNumber(Double number) {
		return HttpResponse.ok(new QueryModel().number(number));
	}

	@Override
	public HttpResponse<QueryModel> getUuid(UUID uuid) {
		return HttpResponse.ok(new QueryModel().uuid(uuid));
	}
}
