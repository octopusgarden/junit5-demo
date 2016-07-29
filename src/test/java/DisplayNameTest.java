import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("A demo for Junit 5 display name")
class DisplayNameTest {

    @Test
    @DisplayName("When method is called it should return one ╯°□°）╯")
    void whenMethodIsCalledReturnOne() throws Exception {
        Example example = new Example();
        assertTrue(example.One() == 2);
    }


}
