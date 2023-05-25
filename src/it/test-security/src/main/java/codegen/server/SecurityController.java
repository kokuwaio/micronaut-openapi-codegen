package codegen.server;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import io.micronaut.security.utils.SecurityService;

@Controller
public class SecurityController implements SecurityApi {

	private final Logger log = LoggerFactory.getLogger(SecurityController.class);
	private final SecurityService security;

	public SecurityController(SecurityService security) {
		this.security = security;
	}

	@Secured(SecurityRule.IS_ANONYMOUS)
	@Override
	public HttpResponse<Object> anonymous() {
		return doIt();
	}

	@Secured(SecurityRule.IS_AUTHENTICATED)
	@Override
	public HttpResponse<Object> authenticatedWithParam(Optional<String> queryParam) {
		return doIt();
	}

	@Secured(SecurityRule.IS_AUTHENTICATED)
	@Override
	public HttpResponse<Object> authenticatedWithoutParam() {
		return doIt();
	}

	private HttpResponse<Object> doIt() {
		log.info("Principal: " + security.getAuthentication().orElse(null));
		return HttpResponse.noContent();
	}
}
