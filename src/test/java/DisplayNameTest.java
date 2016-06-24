import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertTrue;

@DisplayName("Try Junit5 display name annotation")
class DisplayNameTest {

    @Test
    @DisplayName("When method is called it should return one ╯°□°）╯")
    void whenMethodIsCalledReturnOne() throws Exception {
        Example example = new Example();
        assertTrue(example.One() == 1);
    }
}
