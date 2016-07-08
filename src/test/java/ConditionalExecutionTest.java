import org.junit.gen5.api.Test;
import org.junit.gen5.api.extension.ExtendWith;

import static org.junit.gen5.api.Assertions.assertTrue;

@ExtendWith(ConditionalDisabledCondition.class)
class ConditionalExecutionTest {

    @Test
    @ConditionalDisabled
    void testConditionalTest() {
        assertTrue(false, () -> "This test is runned");
    }

}
