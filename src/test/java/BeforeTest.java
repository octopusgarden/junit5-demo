import org.junit.gen5.api.*;

public class BeforeTest {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("Prepare ALL tests");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Clean up ALL tests");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Prepare test");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Clean up test");
    }

    @Test
    public void testOne() {
        System.out.println("testOne");
    }

    @Test
    public void testTwo() {
        System.out.println("testTwo");
    }
}
