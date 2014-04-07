import java.util.ArrayList;

/**
 * Created by mrk on 4/7/14.
 */
public class BoardShaper {
    int size;

    public BoardShaper(int size) {
        this.size = size;
    }


    public ArrayList<ArrayList<Integer>> rowIndexes() {
        ArrayList<ArrayList<Integer>> rowIndexes = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < this.size; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < this.size; j++) {
                row.add((i*size)+(j));
            }
            rowIndexes.add(row);
        }

        return rowIndexes;
    }
}
