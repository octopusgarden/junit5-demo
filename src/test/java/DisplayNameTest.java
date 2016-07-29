import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Try Junit5 display name annotation")
class DisplayNameTest {

    @Test
    @DisplayName("When method is called it should return one ╯°□°）╯")
    void whenMethodIsCalledReturnOne() throws Exception {
        Example example = new Example();
        assertTrue(example.One() == 1);
    }


}
