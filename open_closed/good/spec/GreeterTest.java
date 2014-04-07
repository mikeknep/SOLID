import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * Created by mrk on 4/7/14.
 */

public class GreeterTest {
    private Personality mockPersonality;

    @Before
    public void mockPersonality() {
        class MockPersonality implements Personality {
            public String greet() {
                return "foo";
            }
        }

        mockPersonality = new MockPersonality();
    }

    @Test
    public void testGreetsSomeone() {
        Greeter greeter = new Greeter(mockPersonality);
        assertEquals("foo", greeter.greet());
    }
}
