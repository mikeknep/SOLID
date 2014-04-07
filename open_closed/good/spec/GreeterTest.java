import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mrk on 4/7/14.
 */
class MockPersonality implements Personality {
    public String greet() {
        return "foo";
    }
}

public class GreeterTest {
    @Test
    public void testGreetsSomeone() {
        MockPersonality mockPersonality = new MockPersonality();
        Greeter greeter = new Greeter(mockPersonality);

        assertEquals("foo", greeter.greet());
    }
}
