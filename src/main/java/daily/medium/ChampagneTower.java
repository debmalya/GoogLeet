package daily.medium;

import java.util.ArrayList;
import java.util.List;

public class ChampagneTower {

    /**
     * We stack glasses in a pyramid, where the first row has 1 glass, the second row has 2 glasses, and so on until the 100th row.
     * Each glass holds one cup of champagne.
     * <p>
     * Then, some champagne is poured into the first glass at the top.  When the topmost glass is full,
     * any excess liquid poured will fall equally to the glass immediately to the left and right of it.
     * When those glasses become full, any excess champagne will fall equally to the left and right of those glasses, and so on.
     * (A glass at the bottom row has its excess champagne fall on the floor.)
     * <p>
     * For example, after one cup of champagne is poured, the top most glass is full.
     * After two cups of champagne are poured, the two glasses on the second row are half full.
     * After three cups of champagne are poured, those two cups become full - there are 3 full glasses total now.
     * After four cups of champagne are poured, the third row has the middle glass half full,
     * and the two outside glasses are a quarter full.
     *
     * @param poured      amount of champagne poured. 0 <= poured <= 10^9
     * @param query_row   row number (0 bases) queried for. i th row. 0 <= query_glass <= query_row < 100
     * @param query_glass j th glass in i th row.
     * @return return how full the jth glass in the ith row is (both i and j are 0-indexed.)
     */
    public double champagneTower(int poured, int queryRow, int queryGlass) {
        if (poured == 0)
            return 0;

        var prevRow = new ArrayList<>(List.of((double) poured));

        while (queryRow-- > 0) {
            var champagneInEnds = Math.max(0, (prevRow.get(0) - 1) / 2);  // min champagne can be 0
            var currentRow = new ArrayList<>(List.of(champagneInEnds)); // list with first glass

            for (var i = 1; i < prevRow.size(); i++)
                currentRow.add(Math.max(0, (prevRow.get(i - 1) - 1) / 2) + // flow from top-left glass
                        Math.max(0, (prevRow.get(i) - 1) / 2));     // flow from top-right glass

            currentRow.add(champagneInEnds); // last glass
            prevRow = currentRow;
        }

        return Math.min(1, prevRow.get(queryGlass)); // max champagne can be 1
    }
}
