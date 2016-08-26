import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NestedTest {
    private Example example = new Example();

    @Nested
    @DisplayName("When example method one is called")
    class TestFunctionalityOne {
        @Test
        @DisplayName("then it should return one")
        void testOne() {
            assertTrue(example.One() == 1);
        }

        @Test
        @DisplayName("then it should not return two")
        void testTwo() {
            assertFalse(example.One() == 2);
        }
    }

    @Nested
    @DisplayName("When example method two is called")
    class TestFunctionalityTwo {
        @Test
        @DisplayName("then it should return two")
        public void testOne() {
            assertTrue(example.Two() == 2);
        }

    }
}
