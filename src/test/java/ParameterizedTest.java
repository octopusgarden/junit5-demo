import org.junit.jupiter.api.*;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParameterizedTest {

	@Test
	@DisplayName("TEST 1")
	@Tag("my tag")
	void testWithInfoParameter(TestInfo info) {
		assertEquals("TEST 1", info.getDisplayName());
	}

	@Test
	void testWithReporterParameter(TestReporter reporter) {
		reporter.publishEntry("a key", "a value");

		HashMap<String, String> values = new HashMap<>();
		values.put("user name", "dk38");
		values.put("award year", "1974");

		reporter.publishEntry(values);
	}
	
}
