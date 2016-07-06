import org.junit.gen5.api.Test;
import static org.junit.gen5.api.Assertions.assertEquals;
import static org.junit.gen5.api.Assertions.assertFalse;
import static org.junit.gen5.api.Assertions.assertNotEquals;

interface EqualsContract<T> extends Testable<T> {

	T createNotEqualValue();

	@Test
	default void valueEqualsItself() {
		T value = createValue();
		assertEquals(value, value);
	}

	@Test
	default void valueDoesNotEqualNull() {
		T value = createValue();
		assertFalse(value.equals(null));
	}

	@Test
	default void valueDoesNotEqualDifferentValue() {
		T value = createValue();
		T differentValue = createNotEqualValue();
		assertNotEquals(value, differentValue);
		assertNotEquals(differentValue, value);
	}

	interface Testable<T> {
		T createValue();
	}

	class StringTests implements EqualsContract<String> {

		@Override
		public String createValue() {
			return "foo";
		}

		@Override
		public String createNotEqualValue() {
			return "baz";
		}

	}
}