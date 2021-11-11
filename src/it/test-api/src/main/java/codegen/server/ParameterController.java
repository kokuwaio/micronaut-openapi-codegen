package codegen.server;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
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
	public HttpResponse<ParameterModel> paramBodyOptional(@Nullable Optional<ParameterModel> parameterModel) {
		return HttpResponse.ok(Optional.ofNullable(parameterModel).flatMap(t -> t).orElseGet(ParameterModel::new));
	}

	@Override
	public HttpResponse<ParameterModel> paramBodyRequired(ParameterModel parameterModel) {
		return HttpResponse.ok(parameterModel);
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryMultipleLists(
			Optional<List<String>> a,
			Optional<List<UUID>> b,
			Optional<List<Integer>> c) {
		return HttpResponse.ok(new ParameterModel()
				.a(a.orElse(List.of()))
				.b(b.orElse(List.of()))
				.c(c.orElse(List.of())));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryDate(Optional<LocalDate> date) {
		return HttpResponse.ok(new ParameterModel().date(date.orElse(null)));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryDateTime(Optional<Instant> dateTime) {
		return HttpResponse.ok(new ParameterModel().dateTime(dateTime.orElse(null)));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryNumber(Optional<Double> number) {
		return HttpResponse.ok(new ParameterModel().number(number.orElse(null)));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryUuid(Optional<UUID> uuid) {
		return HttpResponse.ok(new ParameterModel().uuid(uuid.orElse(null)));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryOptionalWithDefault(String string) {
		return HttpResponse.ok(new ParameterModel().string(string));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryOptionalWithoutDefault(Optional<String> string) {
		return HttpResponse.ok(new ParameterModel().string(string.orElse(null)));
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
	public HttpResponse<ParameterModel> paramHeaderOptionalWithoutDefault(Optional<String> string) {
		return HttpResponse.ok(new ParameterModel().string(string.orElse(null)));
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
	public HttpResponse<ParameterModel> paramAll(
			String path,
			UUID uuid,
			Optional<LocalDate> date,
			Optional<Integer> integer) {
		return HttpResponse.ok(new ParameterModel()
				.string(path)
				.uuid(uuid)
				.integer(integer.orElse(null))
				.date(date.orElse(null)));
	}
}
