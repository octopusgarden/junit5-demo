
import static org.junit.gen5.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.extension.ExtendWith;

@ExtendWith(MockitoExtension.class)
class ExtensionsTest {

	@BeforeEach
	void before(@InjectMock User user) {
		when(user.getName()).thenReturn("Bob");
	}

	@Test
	void parameterInjectionWorksOk(@InjectMock User user) {
		assertEquals("Bob", user.getName());
	}

	@ExtendWith(CustomParameterResolver.class)
	void testWithCustomParameterResolver(CustomParameter params) {
		assertEquals("a", params.getParameter());
	}

}
