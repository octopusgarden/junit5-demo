import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

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
