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
        // If the starting and destination cells are the same, check if the time limit allows for it.
        if (sx == fx && sy == fy) {
            return (t > 1 || t == 0);
        }

        // Calculate the height and width differences between the starting and destination cells.
        int heightDifference = Math.abs(sy - fy);
        int widthDifference = Math.abs(sx - fx);

        // Calculate the extra time needed to cover the extra moves.
        int extraTime = Math.abs(heightDifference - widthDifference);

        // Check if the total time (min of height and width differences + extra time) is within the time limit.
        return (Math.min(heightDifference, widthDifference) + extraTime) <= t;
    }
}
