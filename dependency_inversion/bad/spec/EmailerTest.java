import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mrk on 4/8/14.
 */
public class EmailerTest {
    @Test
    public void testGeneratesAlertString() {
        Emailer emailer = new Emailer();
        assertEquals("It is sunny", emailer.generateWeatherAlert("sunny"));
    }
}
