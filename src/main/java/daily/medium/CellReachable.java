package daily.medium;

public class CellReachable {

    /**
     * You are given four integers sx, sy, fx, fy, and a non-negative integer t.
     * <p>
     * In an infinite 2D grid, you start at the cell (sx, sy). Each second, you must move to any of its adjacent cells.
     * <p>
     * Return true if you can reach cell (fx, fy) after exactly t seconds, or false otherwise.
     * <p>
     * A cell's adjacent cells are the 8 cells around it that share at least one corner with it. You can visit the same cell several times.
     *
     * @param sx starting position x coordinate.
     * @param sy starting position y coordinate.
     * @param fx end position x coordinate.
     * @param fy end position y coordinate.
     * @param t  allocated time.
     * @return true if reachable within time, false otherwise.
     */
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int hypotenuse = (int) Math.sqrt(Math.pow(fx - sy, 2) + Math.pow(fy - sy, 2));
        return hypotenuse < t;
    }
}
