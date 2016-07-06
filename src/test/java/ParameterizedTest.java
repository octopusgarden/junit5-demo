
import static org.junit.gen5.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.gen5.api.DisplayName;
import org.junit.gen5.api.Tag;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.TestInfo;
import org.junit.gen5.api.TestReporter;

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
