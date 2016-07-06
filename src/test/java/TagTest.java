import org.junit.gen5.api.Tag;
import org.junit.gen5.api.Tags;
import org.junit.gen5.api.Test;

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
