package codegen;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;

@Controller
class SecurityController implements SecurityApi {

	@Secured(SecurityRule.IS_ANONYMOUS)
	@Override
	public HttpResponse<Object> unsecured() {
		return HttpResponse.ok();
	}

	@Secured(SecurityRule.IS_AUTHENTICATED)
	@Override
	public HttpResponse<Object> secured() {
		return HttpResponse.ok();
	}

	@Secured("admin")
	@Override
	public HttpResponse<Object> securedAdmin() {
		return HttpResponse.ok();
	}
}
