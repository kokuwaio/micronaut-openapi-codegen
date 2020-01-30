package codegen;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.List;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;

@Controller
class QueryController implements QueryApi {

	@Override
	public HttpResponse<Model> getMultipleLists(List<String> a, List<String> b) {
		return HttpResponse.ok(new Model().a(a).b(b));
	}

	@Override
	public HttpResponse<LocalDate> getTypeDate(LocalDate date) {
		return HttpResponse.ok(date);
	}

	@Override
	public HttpResponse<OffsetDateTime> getTypeDateTime(OffsetDateTime dateTime) {
		return HttpResponse.ok(dateTime);
	}

	@Override
	public HttpResponse<Double> getTypeNumber(Double number) {
		return HttpResponse.ok(number);
	}
}
