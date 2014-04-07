import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

/**
 * Created by mrk on 4/7/14.
 */
public class BoardTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testBoardHasNineSpots() {
        Board board = new Board();
        assertEquals(9, board.spots.size());
    }

    @Test
    public void testBoardReturnsFirstRow() {
        Board board = new Board();
        ArrayList<String> rowOne = new ArrayList<String>();
        rowOne.add("0");
        rowOne.add("1");
        rowOne.add("2");

        assertEquals(rowOne, board.firstRow());
    }

    @Test
    public void testBoardReturnsSecondRow() {
        Board board = new Board();
        ArrayList<String> rowTwo = new ArrayList<String>();
        rowTwo.add("3");
        rowTwo.add("4");
        rowTwo.add("5");

        assertEquals(rowTwo, board.secondRow());
    }

    @Test
    public void testBoardReturnsThirdRow() {
        Board board = new Board();
        ArrayList<String> rowThree = new ArrayList<String>();
        rowThree.add("6");
        rowThree.add("7");
        rowThree.add("8");

        assertEquals(rowThree, board.thirdRow());
    }

    @Test
    public void testPrintsBoardToConsole() {
        Board board = new Board();
        System.setOut(new PrintStream(outContent));
        board.display();
        assertEquals("0 | 1 | 2\n3 | 4 | 5\n6 | 7 | 8", outContent.toString());
    }
}
