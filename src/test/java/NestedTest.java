import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class NestedTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Prepare ALL test");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Prepare test");
    }

    @Nested
    class TestFunctionalityOne {
        @Test
        public void testOne() {
            System.out.println("testOne");
        }

        @Test
        public void testOneOne() {
            System.out.println("testOneOne");
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
