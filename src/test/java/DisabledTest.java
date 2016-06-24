import org.junit.gen5.api.Disabled;
import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertTrue;

@Disabled("test is skipped")
class DisabledTest {

    @Test
    @Disabled("test is skipped")
    void whenMethodIsCalledReturnOneDisabled() throws Exception {
        Example example = new Example();
        assertTrue(example.One() == 1);
    }

    @Test
    void whenMethodIsCalledReturnOne() throws Exception {
        Example example = new Example();
        assertTrue(example.One() == 1);
    }


}
