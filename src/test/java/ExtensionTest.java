
import org.junit.gen5.api.BeforeEach;
import org.junit.gen5.api.Test;
import org.junit.gen5.api.extension.ExtendWith;

import static org.junit.gen5.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExtensionTest {

    @BeforeEach
    void before(@InjectMock User user) {
        when(user.getName()).thenReturn("Bob");
    }

    @Test
    void parameterInjectionWorksOk(@InjectMock User user) {
        assertEquals("Bob", user.getName());
    }

}
