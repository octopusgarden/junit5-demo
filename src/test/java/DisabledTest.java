import org.junit.gen5.api.Disabled;
import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertTrue;

@Disabled
public class DisabledTest {

    @Test
    @Disabled
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
