import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;

@Tag("slow-test")
class TagTest {
    @Test
    @Tags({@Tag("really-slow-test"), @Tag("test-with-db-dependencies")})
    void tagTest() throws Exception {

    }

    @Slow
    void composeTagTest() {

    }
}
