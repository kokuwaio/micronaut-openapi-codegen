package codegen;

import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import java.util.Optional;

@MicronautTest
public class ClientTest {

    @Test
    public void test() {
        org.mockito.Mockito.mock(OptionalsApiClient.class).get(1, Optional.of("1"));
        org.mockito.Mockito.mock(OptionalsApiTestClient.class).get(1, Optional.of("1"));
    }
}