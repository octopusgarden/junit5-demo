import org.junit.gen5.api.Disabled;
import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertTrue;

@Disabled
public class ExampleDisabledTest {

    @Test
    @DisplayName("When method is called it should return one")
    public void whenMethodIsCalledReturnOneDisabled() throws Exception {
        Example example = new Example();
        assertTrue(example.One() == 1);
    }

    public void whenMethodIsCalledReturnOne() throws Exception {
        Example example = new Example();
        assertTrue(example.One() == 1);
    }


}
