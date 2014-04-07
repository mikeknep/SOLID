import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 * Created by mrk on 4/7/14.
 */
public class GreeterTest {
    private Personality personality;

    @Before
    public void setUpPersonalities() {
        ArrayList<Personality> personalities = new ArrayList<Personality>();

        FormalPersonality fp = new FormalPersonality();
        CasualPersonality cp = new CasualPersonality();
        IntimatePersonality ip = new IntimatePersonality();

        personalities.add(fp);
        personalities.add(cp);
        personalities.add(ip);

        Random generator = new Random();
        int index = generator.nextInt(personalities.size());

        Personality personality = personalities.get(index);
    }

    @Test
    public void testGreetsSomeone() {
//        Greeter greeter = new Greeter(personality);
        CasualPersonality cp = new CasualPersonality();
        Greeter greeter = new Greeter(cp);
        assertEquals("".getClass(), greeter.greet().getClass());
    }
}
