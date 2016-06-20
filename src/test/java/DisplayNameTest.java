import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertTrue;

public class DisplayNameTest {

    @Test
    @DisplayName("When method is called it should return one")
    public void whenMethodIsCalledReturnOne() throws Exception {
        Example example = new Example();
        assertTrue(example.One() == 1);
    }
}
