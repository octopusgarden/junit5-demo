


import org.junit.gen5.api.*;

import java.util.HashMap;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertTrue;

class ParameterizedTest {

    @Test
    @DisplayName("TEST 1")
    @Tag("my tag")
    void testWithInfoParameter(TestInfo info) {
        assertEquals("TEST 1", info.getDisplayName());

        assertTrue(false);
    }

    @Test
    void testWithReporterParameter(TestReporter reporter) {
        reporter.publishEntry("a key", "a value");

        HashMap<String, String> values = new HashMap<>();
        values.put("user name", "dk38");
        values.put("award year", "1974");

        reporter.publishEntry(values);

        assertTrue(false);
    }
}
