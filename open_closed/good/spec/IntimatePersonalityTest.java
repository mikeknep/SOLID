import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mrk on 4/7/14.
 */
public class IntimatePersonalityTest {
    @Test
    public void testGreetsSomeoneIntimately() {
        IntimatePersonality ip = new IntimatePersonality();
        assertEquals("Hello Darling!", ip.greet());
    }
}
