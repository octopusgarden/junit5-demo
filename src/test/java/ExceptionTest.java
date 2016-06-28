import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.*;

class ExceptionTest {
    private Example example = new Example();

    @Test
    void testException() {
        assertThrows(ArithmeticException.class, () -> example.DivideByZero());
    }

    @Test
    void testExceptionUsingVariable() {
        Exception exception = expectThrows(ArithmeticException.class, () -> example.DivideByZero());
        assertEquals("/ by zero", exception.getMessage());
    }
}
