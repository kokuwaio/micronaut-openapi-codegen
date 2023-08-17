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
		return HttpResponse.ok(new ParameterModel(
				null, PATH_PARAM_PATH_WITH_MAX_LENGTH, null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramPathWithPattern(String string) {
		return HttpResponse.ok(new ParameterModel(
				null, PATH_PARAM_PATH_WITH_PATTERN, null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramPathWithUuid(UUID udid) {
		return HttpResponse.ok(new ParameterModel(
				null, PATH_PARAM_PATH_WITH_UUID, null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramPathWithBoolean(Boolean bool) {
		return HttpResponse.ok(new ParameterModel(
				null, PATH_PARAM_PATH_WITH_BOOLEAN, null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramPathWithInteger(Integer value) {
		return HttpResponse.ok(new ParameterModel(
				null, PATH_PARAM_PATH_WITH_INTEGER, null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramPathWithLong(Long value) {
		return HttpResponse.ok(new ParameterModel(
				null, PATH_PARAM_PATH_WITH_LONG, null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramPathOverlayWithString(String string) {
		return HttpResponse.ok(new ParameterModel(null, PATH_PARAM_PATH_OVERLAY_WITH_STRING, null, null, null, null,
				null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramPathOverlayWithUuid(UUID uuid) {
		return HttpResponse.ok(new ParameterModel(
				null, PATH_PARAM_PATH_OVERLAY_WITH_UUID, null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramPathRequiredWithDefault(String string) {
		return HttpResponse.ok(new ParameterModel(
				null, string, null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramPathRequiredWithoutDefault(String string) {
		return HttpResponse.ok(new ParameterModel(
				null, string, null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramBodyOptional(@Nullable Optional<ParameterModel> parameterModel) {
		return HttpResponse.ok(Optional.ofNullable(parameterModel).flatMap(t -> t).orElseGet(() -> new ParameterModel(
				null, null, null, null, null, null, null, null, null, null)));
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
		return HttpResponse.ok(new ParameterModel(null, null, null, null, null, null, null,
				a.orElse(List.of()),
				b.orElse(List.of()),
				c.orElse(List.of())));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryDate(Optional<LocalDate> date) {
		return HttpResponse.ok(new ParameterModel(
				null, null, null, null, null, date.orElse(null), null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryDateTime(Optional<Instant> dateTime) {
		return HttpResponse.ok(new ParameterModel(
				null, null, null, null, null, null, dateTime.orElse(null), null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryNumber(Optional<Double> number) {
		return HttpResponse.ok(new ParameterModel(
				null, null, number.orElse(null), null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryUuid(Optional<UUID> uuid) {
		return HttpResponse.ok(new ParameterModel(
				null, null, null, null, uuid.orElse(null), null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryOptionalWithDefault(String string) {
		return HttpResponse.ok(new ParameterModel(null, string, null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryOptionalWithoutDefault(Optional<String> string) {
		return HttpResponse.ok(new ParameterModel(
				null, string.orElse(null), null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryRequiredWithDefault(String string) {
		return HttpResponse.ok(new ParameterModel(null, string, null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramQueryRequiredWithoutDefault(String string) {
		return HttpResponse.ok(new ParameterModel(null, string, null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramHeaderOptionalWithDefault(String string) {
		return HttpResponse.ok(new ParameterModel(null, string, null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramHeaderOptionalWithoutDefault(Optional<String> string) {
		return HttpResponse.ok(new ParameterModel(
				null, string.orElse(null), null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramHeaderRequiredWithDefault(String string) {
		return HttpResponse.ok(new ParameterModel(null, string, null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramHeaderRequiredWithoutDefault(String string) {
		return HttpResponse.ok(new ParameterModel(null, string, null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramCookieOptionalWithDefault(String string) {
		return HttpResponse.ok(new ParameterModel(null, string, null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramCookieOptionalWithoutDefault(Optional<String> string) {
		return HttpResponse.ok(new ParameterModel(
				null, string.orElse(null), null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramCookieRequiredWithDefault(String string) {
		return HttpResponse.ok(new ParameterModel(null, string, null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramCookieRequiredWithoutDefault(String string) {
		return HttpResponse.ok(new ParameterModel(null, string, null, null, null, null, null, null, null, null));
	}

	@Override
	public HttpResponse<ParameterModel> paramAll(
			String path,
			UUID uuid,
			Optional<LocalDate> date,
			Optional<Integer> integer) {
		return HttpResponse.ok(new ParameterModel(
				null, path, null, integer.orElse(null), uuid, date.orElse(null), null, null, null, null));
	}
}
