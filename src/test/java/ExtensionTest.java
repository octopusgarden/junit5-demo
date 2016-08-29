

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ExtensionTest {
    public ExtensionTest() {
        System.out.print("Test Created");
    }

    @BeforeEach
    void initialize(@InjectMock User user) {
        when(user.getName()).thenReturn("Bob");
    }

    @Test
    void firstTestWithInjectedMock(@InjectMock User user) {
        assertEquals("Bob", user.getName());
    }

}