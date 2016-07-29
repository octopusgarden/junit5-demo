import org.junit.jupiter.api.*;

class BeforeTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Prepare ALL tests");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Clean up ALL tests");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("Prepare test");
    }

    @AfterEach
    void afterEach() {
        System.out.println("Clean up test");
    }

    @Test
    void testOne() {
        System.out.println("testOne");
    }

    @Test
    void testTwo() {
        System.out.println("testTwo");
    }
}
