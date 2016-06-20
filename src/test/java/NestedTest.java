import org.junit.gen5.api.BeforeAll;
import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Nested;
import org.junit.gen5.api.Test;

public class NestedTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Prepare ALL test");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Prepare test");
    }

    @Nested
    class TestFunctionalityOne {
        @Test
        public void testOne() {
            System.out.println("testOne");
        }
    }

    @Nested
    class TestFunctionalityTwo {
        @Test
        public void testTwo() {
            System.out.println("testTwo");
        }
    }

}