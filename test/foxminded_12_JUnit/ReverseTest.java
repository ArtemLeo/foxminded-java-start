package foxminded_12_JUnit;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseTest {

    @Test
    public void test() {
        // fail("Not yet implemented");
        assertEquals("olleH dlroW", Reverse.reverse("Hello World"));
    }
}