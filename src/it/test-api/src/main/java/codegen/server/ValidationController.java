package codegen.server;

import java.util.List;

import codegen.StringModel;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;

@Controller
public class ValidationController implements ValidationApi {

	@Override
	public HttpResponse<Object> validationLongMin(Long integer) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationLongMax(Long integer) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationLongRange(Long integer) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationIntegerMin(Integer integer) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationIntegerMax(Integer integer) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationIntegerRange(Integer integer) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationDoubleMin(Double number) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationDoubleMax(Double number) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationDoubleRange(Double number) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationFloatMin(Float number) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationFloatMax(Float number) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationFloatRange(Float number) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationStringPattern(String string) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationStringMin(String string) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationStringMax(String string) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationStringRange(String string) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationListMin(List<Integer> list) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationListMax(List<Integer> list) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationListRange(List<Integer> list) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationListModel(List<StringModel> stringModel) {
		return HttpResponse.noContent();
	}

	@Override
	public HttpResponse<Object> validationModel(StringModel stringModel) {
		return HttpResponse.noContent();
	}
}
