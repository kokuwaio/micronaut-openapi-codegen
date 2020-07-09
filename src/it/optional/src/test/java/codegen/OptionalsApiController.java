package codegen;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;

import javax.annotation.Nonnull;
import java.util.Optional;

@Controller
public class OptionalsApiController implements codegen.OptionalsApi {


    @Override
    public HttpResponse<String> get(Integer size, @Nonnull Optional<String> id) {
        return null;
    }

    @Override
    public HttpResponse<?> post(String body) {
        return null;
    }
}
