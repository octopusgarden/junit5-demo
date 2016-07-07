
import org.junit.gen5.api.Test;
import org.junit.gen5.api.extension.ExtendWith;

import static org.junit.gen5.api.Assertions.assertEquals;


class ExtensionsTest {

    @Test
    @ExtendWith(CustomParameterResolver.class)
    void testWithCustomParameterResolver(@Custom CustomParameter params) {
        assertEquals("a", params.getValue());
    }

}
