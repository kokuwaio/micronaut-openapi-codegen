package codegen.server;

import static codegen.HttpResponseAssertions.assert204;
import static codegen.HttpResponseAssertions.assert400;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import jakarta.inject.Inject;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import codegen.StringModel;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;

@Disabled("annotation inheritance")
@MicronautTest
public class ValidationControllerTest implements ValidationApiTestSpec {

	private final float diff = 0.0000000000001F;

	@Inject
	ValidationApiTestClient client;

	@Test
	@Override
	public void validationLongMin204() {
		assert204(() -> client.validationLongMin(3L));
		assert204(() -> client.validationLongMin(4L));
		assert204(() -> client.validationLongMin(5L));
	}

	@Test
	@Override
	public void validationLongMin400() {
		assert400(() -> client.validationLongMin(2L));
	}

	@Test
	@Override
	public void validationLongMax204() {
		assert204(() -> client.validationLongMax(2L));
		assert204(() -> client.validationLongMax(3L));
		assert204(() -> client.validationLongMax(4L));
	}

	@Test
	@Override
	public void validationLongMax400() {
		assert400(() -> client.validationLongMax(5L));
	}

	@Test
	@Override
	public void validationLongRange204() {
		assert204(() -> client.validationLongRange(3L));
		assert204(() -> client.validationLongRange(4L));
	}

	@Test
	@Override
	public void validationLongRange400() {
		assert400(() -> client.validationLongRange(2L));
		assert400(() -> client.validationLongRange(5L));
	}

	@Test
	@Override
	public void validationIntegerMin204() {
		assert204(() -> client.validationIntegerMin(3));
		assert204(() -> client.validationIntegerMin(4));
		assert204(() -> client.validationIntegerMin(5));
	}

	@Test
	@Override
	public void validationIntegerMin400() {
		assert400(() -> client.validationIntegerMin(2));
	}

	@Test
	@Override
	public void validationIntegerMax204() {
		assert204(() -> client.validationIntegerMax(2));
		assert204(() -> client.validationIntegerMax(3));
		assert204(() -> client.validationIntegerMax(4));
	}

	@Test
	@Override
	public void validationIntegerMax400() {
		assert400(() -> client.validationIntegerMax(5));
	}

	@Test
	@Override
	public void validationIntegerRange204() {
		assert204(() -> client.validationIntegerRange(3));
		assert204(() -> client.validationIntegerRange(4));
	}

	@Test
	@Override
	public void validationIntegerRange400() {
		assert400(() -> client.validationIntegerRange(2));
		assert400(() -> client.validationIntegerRange(5));
	}

	@Test
	@Override
	public void validationDoubleMin204() {
		assert204(() -> client.validationDoubleMin(3D + diff));
	}

	@Test
	@Override
	public void validationDoubleMin400() {
		assert400(() -> client.validationDoubleMin(3D));
	}

	@Test
	@Override
	public void validationDoubleMax204() {
		assert204(() -> client.validationDoubleMax(4D - diff));
	}

	@Test
	@Override
	public void validationDoubleMax400() {
		assert400(() -> client.validationDoubleMax(4D));
	}

	@Test
	@Override
	public void validationDoubleRange204() {
		assert204(() -> client.validationDoubleRange(3D));
		assert204(() -> client.validationDoubleRange(4D));
	}

	@Test
	@Override
	public void validationDoubleRange400() {
		assert400(() -> client.validationDoubleRange(3D - diff));
		assert400(() -> client.validationDoubleRange(4D + diff));
	}

	@Test
	@Override
	public void validationFloatMin204() {
		assert204(() -> client.validationFloatMin(3F + diff));
	}

	@Test
	@Override
	public void validationFloatMin400() {
		assert400(() -> client.validationFloatMin(3F));
	}

	@Test
	@Override
	public void validationFloatMax204() {
		assert204(() -> client.validationFloatMax(4F - diff));
	}

	@Test
	@Override
	public void validationFloatMax400() {
		assert400(() -> client.validationFloatMax(4F));
	}

	@Test
	@Override
	public void validationFloatRange204() {
		assert204(() -> client.validationFloatRange(3F));
		assert204(() -> client.validationFloatRange(4F));
	}

	@Test
	@Override
	public void validationFloatRange400() {
		assert400(() -> client.validationFloatRange(3F - diff));
		assert400(() -> client.validationFloatRange(4F + diff));
	}

	@Test
	@Override
	public void validationStringPattern204() {
		assert204(() -> client.validationStringPattern("abcd"));
	}

	@Test
	@Override
	public void validationStringPattern400() {
		assert400(() -> client.validationStringPattern("abcdef"));
		assert400(() -> client.validationStringPattern("1234"));
	}

	@Test
	@Override
	public void validationStringMin204() {
		assert204(() -> client.validationStringMin("124"));
		assert204(() -> client.validationStringMin("1234"));
		assert204(() -> client.validationStringMin("12345"));
	}

	@Test
	@Override
	public void validationStringMin400() {
		assert400(() -> client.validationStringMin("12"));
	}

	@Test
	@Override
	public void validationStringMax204() {
		assert204(() -> client.validationStringMax("12"));
		assert204(() -> client.validationStringMax("123"));
		assert204(() -> client.validationStringMax("1234"));
	}

	@Test
	@Override
	public void validationStringMax400() {
		assert400(() -> client.validationStringMax("12345"));
	}

	@Test
	@Override
	public void validationStringRange204() {
		assert204(() -> client.validationStringRange("123"));
		assert204(() -> client.validationStringRange("1234"));
	}

	@Test
	@Override
	public void validationStringRange400() {
		assert400(() -> client.validationStringRange("12"));
		assert400(() -> client.validationStringRange("12345"));
	}

	@Test
	@Override
	public void validationListMin204() {
		assert204(() -> client.validationListMin(list(3)));
		assert204(() -> client.validationListMin(list(4)));
		assert204(() -> client.validationListMin(list(5)));
	}

	@Test
	@Override
	public void validationListMin400() {
		assert400(() -> client.validationListMin(list(2)));
	}

	@Override
	public void validationListMax204() {
		assert204(() -> client.validationListMax(list(2)));
		assert204(() -> client.validationListMax(list(3)));
		assert204(() -> client.validationListMax(list(4)));
	}

	@Test
	@Override
	public void validationListMax400() {
		assert400(() -> client.validationListMax(list(5)));
	}

	@Test
	@Override
	public void validationListRange204() {
		assert204(() -> client.validationListRange(list(3)));
		assert204(() -> client.validationListRange(list(4)));
	}

	@Test
	@Override
	public void validationListRange400() {
		assert400(() -> client.validationListRange(list(2)));
		assert400(() -> client.validationListRange(list(5)));
	}

	@Test
	@Override
	public void validationListModel204() {
		assert204(() -> client
				.validationListModel(List.of(new StringModel("foo"), new StringModel("bar"))));
	}

	@Test
	@Override
	public void validationListModel400() {
		assert204(() -> client
				.validationListModel(List.of(new StringModel("foo"), new StringModel(null))));
	}

	@Test
	@Override
	public void validationModel204() {
		assert204(() -> client.validationModel(new StringModel("meh")));
	}

	@Test
	@Override
	public void validationModel400() {
		assert400(() -> client.validationModel(new StringModel(null)));
	}

	private List<Integer> list(int size) {
		return IntStream.rangeClosed(1, size).mapToObj(i -> i).collect(Collectors.toList());
	}
}
