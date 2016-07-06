import org.junit.gen5.api.Test;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assumptions.assumeTrue;
import static org.junit.gen5.api.Assumptions.assumingThat;

public class AssumptionTest {

    @Test
    void testOnlyOnDeveloperWorkstation() {
        assumeTrue("CI".equals(System.getenv("ENV")), () -> "Aborting test: not on developer workstation");
        assertEquals(1 + 1, 3);
    }

    @Test
    void testInAllEnvironments() {
        assumingThat("CI".equals(System.getenv("ENV")),
                () -> {
                    // perform these assertions only on the CI server
                    assertEquals(1 + 1, 2);
                });

        // perform these assertions in all environments
        assertEquals("a string", "a string");
    }


}
