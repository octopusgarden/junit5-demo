import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.extension.ExtendWith;

interface User {
	String getName();
}

@ExtendWith(MockitoExtension.class)
public class ExtensionsTest {
	@BeforeEach
	void init(@InjectMock User user) {
		when(user.getName()).thenReturn("Mert");
	}

	@Test
	void parameterInjectionWorksOk(@InjectMock User user) {
		assertEquals("Mert", user.getName());
	}
}
