package codegen.server;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import codegen.ParameterModel;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;

@Controller
public class ParameterController implements ParameterApi {

	@Override
	public HttpResponse<ParameterModel> paramPathWithMaxLength(String string) {
		return HttpResponse.ok(new ParameterModel().string(PATH_PARAM_PATH_WITH_MAX_LENGTH));
	}

	@Override
	public HttpResponse<ParameterModel> paramPathWithPattern(String string) {
		return HttpResponse.ok(new ParameterModel().string(PATH_PARAM_PATH_WITH_PATTERN));
	}

	@Override
	public HttpResponse<ParameterModel> paramPathWithUuid(UUID udid) {
		return HttpResponse.ok(new ParameterModel().string(PATH_PARAM_PATH_WITH_UUID));
	}

	@Override
	public HttpResponse<ParameterModel> paramPathWithBoolean(Boolean bool) {
		return HttpResponse.ok(new ParameterModel().string(PATH_PARAM_PATH_WITH_BOOLEAN));
	}

	@Override
	public HttpResponse<ParameterModel> paramPathWithInteger(Integer value) {
		return HttpResponse.ok(new ParameterModel().string(PATH_PARAM_PATH_WITH_INTEGER));
	}

	@Override
	public HttpResponse<ParameterModel> paramPathWithLong(Long value) {
		return HttpResponse.ok(new ParameterModel().string(PATH_PARAM_PATH_WITH_LONG));
	}

	@Override
	public HttpResponse<ParameterModel> paramPathOverlayWithString(String string) {
		return HttpResponse.ok(new ParameterModel().string(PATH_PARAM_PATH_OVERLAY_WITH_STRING));
	}

	@Override
	public HttpResponse<ParameterModel> paramPathOverlayWithUuid(UUID uuid) {
		return HttpResponse.ok(new ParameterModel().string(PATH_PARAM_PATH_OVERLAY_WITH_UUID));
	}

	@Override
	public HttpResponse<ParameterModel> paramPathRequiredWithDefault(String string) {
		return HttpResponse.ok(new ParameterModel().string(string));
	}

	@Override
	public HttpResponse<ParameterModel> paramPathRequiredWithoutDefault(String string) {
		return HttpResponse.ok(new ParameterModel().string(string));
	}

	@Override
	public HttpResponse<ParameterModel> paramBodyOptional(@Nullable ParameterModel parameterModel) {
		return HttpResponse.ok(parameterModel == null ? new ParameterModel() : parameterModel);
	}

	@Override
	public HttpResponse<ParameterModel> paramBodyRequired(ParameterModel parameterModel) {
		return HttpResponse.ok(parameterModel);
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryMultipleLists(
			@Nullable List<String> a,
			@Nullable List<UUID> b,
			@Nullable List<Integer> c) {
		return HttpResponse.ok(new ParameterModel()
				.a(a == null ? List.of() : a)
				.b(b == null ? List.of() : b)
				.c(c == null ? List.of() : c));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryDate(@Nullable LocalDate date) {
		return HttpResponse.ok(new ParameterModel().date(date));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryDateTime(@Nullable Instant dateTime) {
		return HttpResponse.ok(new ParameterModel().dateTime(dateTime));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryNumber(@Nullable Double number) {
		return HttpResponse.ok(new ParameterModel().number(number));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryUuid(@Nullable UUID uuid) {
		return HttpResponse.ok(new ParameterModel().uuid(uuid));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryOptionalWithDefault(String string) {
		return HttpResponse.ok(new ParameterModel().string(string));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryOptionalWithoutDefault(@Nullable String string) {
		return HttpResponse.ok(new ParameterModel().string(string));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryRequiredWithDefault(String string) {
		return HttpResponse.ok(new ParameterModel().string(string));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryRequiredWithoutDefault(String string) {
		return HttpResponse.ok(new ParameterModel().string(string));
	}

	@Override
	public HttpResponse<ParameterModel> paramHeaderOptionalWithDefault(String string) {
		return HttpResponse.ok(new ParameterModel().string(string));
	}

	@Override
	public HttpResponse<ParameterModel> paramHeaderOptionalWithoutDefault(@Nullable String string) {
		return HttpResponse.ok(new ParameterModel().string(string));
	}

	@Override
	public HttpResponse<ParameterModel> paramHeaderRequiredWithDefault(String string) {
		return HttpResponse.ok(new ParameterModel().string(string));
	}

	@Override
	public HttpResponse<ParameterModel> paramHeaderRequiredWithoutDefault(String string) {
		return HttpResponse.ok(new ParameterModel().string(string));
	}

	@Override
	public HttpResponse<ParameterModel> paramCookieOptionalWithDefault(String string) {
		return HttpResponse.ok(new ParameterModel().string(string));
	}

	@Override
	public HttpResponse<ParameterModel> paramCookieOptionalWithoutDefault(@Nullable String string) {
		return HttpResponse.ok(new ParameterModel().string(string));
	}

	@Override
	public HttpResponse<ParameterModel> paramCookieRequiredWithDefault(String string) {
		return HttpResponse.ok(new ParameterModel().string(string));
	}

	@Override
	public HttpResponse<ParameterModel> paramCookieRequiredWithoutDefault(String string) {
		return HttpResponse.ok(new ParameterModel().string(string));
	}

	@Override
	public HttpResponse<ParameterModel> paramAll(
			String path,
			UUID uuid,
			@Nullable LocalDate date,
			@Nullable Integer integer) {
		return HttpResponse.ok(new ParameterModel()
				.string(path)
				.uuid(uuid)
				.integer(integer)
				.date(date));
	}
}
