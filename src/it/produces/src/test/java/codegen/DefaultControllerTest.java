package codegen;

import io.micronaut.http.annotation.Consumes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.lang.reflect.Method;

public class DefaultControllerTest implements DefaultApiTestSpec {

    @Inject
    DefaultApiTestClient client;

    @Test
    @Override
    public void multipleContentTypes200() throws Exception {
        final Method method = DefaultApiTestClient.class.getMethod("multipleContentTypes");
        final Consumes cons = method.getAnnotation(Consumes.class);

        Assertions.assertNotNull(cons);
        Assertions.assertArrayEquals(new String[]{"application/json", "text/plain"}, cons.value());
    }
}
