package codegen;

import java.util.List;

import codegen.server.DefaultApi;
import io.micronaut.http.annotation.Controller;

@Controller
public class DefaultController implements DefaultApi {

	@Override
	public List<String> doIt(List<String> param) {
		return param;
	}
}
