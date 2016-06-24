import org.junit.gen5.api.Disabled;
import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertTrue;

@Disabled("test is skipped")
public class DisabledTest {

    @Test
    @Disabled("test is skipped")
    public void whenMethodIsCalledReturnOneDisabled() throws Exception {
        Example example = new Example();
        assertTrue(example.One() == 1);
    }

    @Test
    public void whenMethodIsCalledReturnOne() throws Exception {
        Example example = new Example();
        assertTrue(example.One() == 1);
    }


}
