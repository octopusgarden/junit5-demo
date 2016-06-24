import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.*;

class AssertionTest {

    @Test
    void assertTestWithLambda() {
        assertTrue(1 + 1 == 2, () -> "1 plus 1 is 2");
        assertFalse(1 + 1 == 3, () -> "1 plus 1 is not 3");
        assertEquals(1 + 1, 2, () -> "1 plus 1 is 2");
        assertNotEquals(1 + 1, 3, () -> "1 plus 1 is not 3");
        assertNull(null, () -> "null is null");
        assertNotNull(1, () -> "1 is not null");
        assertSame(1 + 1, 2, () -> "1 plus 1 is 2");
        assertNotSame(1 + 1, 3, () -> "1 plus 1 is not 3");
    }

}
