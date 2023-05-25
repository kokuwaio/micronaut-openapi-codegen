package codegen.server;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import codegen.ParameterModel;
import io.micronaut.core.annotation.Nullable;
import io.micronaut.http.annotation.Controller;

@Controller
public class ParameterController implements ParameterApi {

	@Override
	public ParameterModel paramPathWithMaxLength(String string) {
		return new ParameterModel().string(PATH_PARAM_PATH_WITH_MAX_LENGTH);
	}

	@Override
	public ParameterModel paramPathWithPattern(String string) {
		return new ParameterModel().string(PATH_PARAM_PATH_WITH_PATTERN);
	}

	@Override
	public ParameterModel paramPathWithUuid(UUID udid) {
		return new ParameterModel().string(PATH_PARAM_PATH_WITH_UUID);
	}

	@Override
	public ParameterModel paramPathWithBoolean(Boolean bool) {
		return new ParameterModel().string(PATH_PARAM_PATH_WITH_BOOLEAN);
	}

	@Override
	public ParameterModel paramPathWithInteger(Integer value) {
		return new ParameterModel().string(PATH_PARAM_PATH_WITH_INTEGER);
	}

	@Override
	public ParameterModel paramPathWithLong(Long value) {
		return new ParameterModel().string(PATH_PARAM_PATH_WITH_LONG);
	}

	@Override
	public ParameterModel paramPathOverlayWithString(String string) {
		return new ParameterModel().string(PATH_PARAM_PATH_OVERLAY_WITH_STRING);
	}

	@Override
	public ParameterModel paramPathOverlayWithUuid(UUID uuid) {
		return new ParameterModel().string(PATH_PARAM_PATH_OVERLAY_WITH_UUID);
	}

	@Override
	public ParameterModel paramPathRequiredWithDefault(String string) {
		return new ParameterModel().string(string);
	}

	@Override
	public ParameterModel paramPathRequiredWithoutDefault(String string) {
		return new ParameterModel().string(string);
	}

	@Override
	public ParameterModel paramBodyOptional(@Nullable Optional<ParameterModel> parameterModel) {
		return Optional.ofNullable(parameterModel).flatMap(t -> t).orElseGet(ParameterModel::new);
	}

	@Override
	public ParameterModel paramBodyRequired(ParameterModel parameterModel) {
		return parameterModel;
	}

	@Override
	public ParameterModel paramQueryMultipleLists(
			Optional<List<String>> a,
			Optional<List<UUID>> b,
			Optional<List<Integer>> c) {
		return new ParameterModel()
				.a(a.orElse(List.of()))
				.b(b.orElse(List.of()))
				.c(c.orElse(List.of()));
	}

	@Override
	public ParameterModel paramQueryDate(Optional<LocalDate> date) {
		return new ParameterModel().date(date.orElse(null));
	}

	@Override
	public ParameterModel paramQueryDateTime(Optional<Instant> dateTime) {
		return new ParameterModel().dateTime(dateTime.orElse(null));
	}

	@Override
	public ParameterModel paramQueryNumber(Optional<Double> number) {
		return new ParameterModel().number(number.orElse(null));
	}

	@Override
	public ParameterModel paramQueryUuid(Optional<UUID> uuid) {
		return new ParameterModel().uuid(uuid.orElse(null));
	}

	@Override
	public ParameterModel paramQueryOptionalWithDefault(String string) {
		return new ParameterModel().string(string);
	}

	@Override
	public ParameterModel paramQueryOptionalWithoutDefault(Optional<String> string) {
		return new ParameterModel().string(string.orElse(null));
	}

	@Override
	public ParameterModel paramQueryRequiredWithDefault(String string) {
		return new ParameterModel().string(string);
	}

	@Override
	public ParameterModel paramQueryRequiredWithoutDefault(String string) {
		return new ParameterModel().string(string);
	}

	@Override
	public ParameterModel paramHeaderOptionalWithDefault(String string) {
		return new ParameterModel().string(string);
	}

	@Override
	public ParameterModel paramHeaderOptionalWithoutDefault(Optional<String> string) {
		return new ParameterModel().string(string.orElse(null));
	}

	@Override
	public ParameterModel paramHeaderRequiredWithDefault(String string) {
		return new ParameterModel().string(string);
	}

	@Override
	public ParameterModel paramHeaderRequiredWithoutDefault(String string) {
		return new ParameterModel().string(string);
	}

	@Override
	public ParameterModel paramCookieOptionalWithDefault(String string) {
		return new ParameterModel().string(string);
	}

	@Override
	public ParameterModel paramCookieOptionalWithoutDefault(Optional<String> string) {
		return new ParameterModel().string(string.orElse(null));
	}

	@Override
	public ParameterModel paramCookieRequiredWithDefault(String string) {
		return new ParameterModel().string(string);
	}

	@Override
	public ParameterModel paramCookieRequiredWithoutDefault(String string) {
		return new ParameterModel().string(string);
	}

	@Override
	public ParameterModel paramAll(String path, UUID uuid, Optional<LocalDate> date, Optional<Integer> integer) {
		return new ParameterModel()
				.string(path)
				.uuid(uuid)
				.integer(integer.orElse(null))
				.date(date.orElse(null));
	}
}
