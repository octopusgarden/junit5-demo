import org.junit.gen5.api.Tag;
import org.junit.gen5.api.Tags;
import org.junit.gen5.api.Test;

@Tag("slow-test")
public class TagTest {
    @Test
    @Tags({@Tag("really-slow-test"), @Tag("test-with-db-dependencies")})
    public void tagTest() throws Exception{

    }
}
