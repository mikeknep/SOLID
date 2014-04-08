import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mrk on 4/8/14.
 */
public class StudioTest {
    @Test
    public void testInitializedWithZeroBedrooms() {
        Studio studio = new Studio();
        assertEquals(0, studio.numberOfRooms);
    }

    @Test
    public void testSetsSquareFootage() {
        Studio studio = new Studio();
        studio.setSquareFootage(550);

        assertEquals(550, studio.squareFootage);
    }
}
