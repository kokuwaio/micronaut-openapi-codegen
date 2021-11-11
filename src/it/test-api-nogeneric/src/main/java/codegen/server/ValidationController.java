package codegen.server;

import java.util.List;

import codegen.StringModel;
import io.micronaut.http.annotation.Controller;

@Controller
public class ValidationController implements ValidationApi {

	@Override
	public void validationLongMin(Long integer) {}

	@Override
	public void validationLongMax(Long integer) {}

	@Override
	public void validationLongRange(Long integer) {}

	@Override
	public void validationIntegerMin(Integer integer) {}

	@Override
	public void validationIntegerMax(Integer integer) {}

	@Override
	public void validationIntegerRange(Integer integer) {}

	@Override
	public void validationDoubleMin(Double number) {}

	@Override
	public void validationDoubleMax(Double number) {}

	@Override
	public void validationDoubleRange(Double number) {}

	@Override
	public void validationFloatMin(Float number) {}

	@Override
	public void validationFloatMax(Float number) {}

	@Override
	public void validationFloatRange(Float number) {}

	@Override
	public void validationStringPattern(String string) {}

	@Override
	public void validationStringMin(String string) {}

	@Override
	public void validationStringMax(String string) {}

	@Override
	public void validationStringRange(String string) {}

	@Override
	public void validationListMin(List<Integer> list) {}

	@Override
	public void validationListMax(List<Integer> list) {}

	@Override
	public void validationListRange(List<Integer> list) {}

	@Override
	public void validationListModel(List<StringModel> stringModel) {}

	@Override
	public void validationModel(StringModel stringModel) {}
}
