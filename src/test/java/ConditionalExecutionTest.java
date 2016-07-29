import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(ConditionalDisabledCondition.class)
class ConditionalExecutionTest {

    @Test
    @ConditionalDisabled
    void testConditionalTest() {
        assertTrue(false, () -> "This test is runned");
    }

}
