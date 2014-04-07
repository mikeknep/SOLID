import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by mrk on 4/7/14.
 */
public class BoardPresenterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testBoardPresenterPrintsBoardToConsole() {
        Board board = new Board(3);
        BoardPresenter presenter = new BoardPresenter(board);
        System.setOut(new PrintStream(outContent));
        presenter.displayBoard();

        assertEquals("0|1|2\n3|4|5\n6|7|8\n", outContent.toString());
    }
}
