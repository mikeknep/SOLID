import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by mrk on 4/7/14.
 */
public class BoardTest {
    @Test
    public void testBoardHasASize() {
        Board board = new Board(3);
        assertEquals(3, board.size);
    }

    @Test
    public void testBoardSpotCountIsSquareOfSide() {
        Board board = new Board(3);
        assertEquals(9, board.spots.size());
    }

    @Test
    public void testBoardReturnsValuesAtListOfSpots() {
        Board board = new Board(3);

        ArrayList<String> values = new ArrayList<String>();
        values.add("0");
        values.add("4");
        values.add("7");

        ArrayList<Integer> indexes = new ArrayList<Integer>();
        indexes.add(0);
        indexes.add(4);
        indexes.add(7);

        assertEquals(values, board.valuesAt(indexes));
    }
}
