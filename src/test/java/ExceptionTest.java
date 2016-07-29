import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.expectThrows;

class ExceptionTest {
    private final Example example = new Example();

    @Test
    void testException() {
        assertThrows(ArithmeticException.class, example::DivideByZero);
    }

    @Test
    void testExceptionUsingVariable() {
        Exception exception = expectThrows(ArithmeticException.class, example::DivideByZero);
        assertEquals("/ by zero", exception.getMessage());
    }
}
