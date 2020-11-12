package codegen;

import io.micronaut.http.HttpResponse;

public class DefaultApiController implements DefaultApi {

    @Override
    public HttpResponse<String> multipleContentTypes() {
        return HttpResponse.ok();
    }
}
