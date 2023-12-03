package daily.easy;

public class MinimumTime {
    /**
     * You can move according to these rules:
     * <p>
     * In 1 second, you can either:
     * move vertically by one unit,
     * move horizontally by one unit, or
     * move diagonally sqrt(2) units (in other words, move one unit vertically then one unit horizontally in 1 second).
     * You have to visit the points in the same order as they appear in the array.
     * You are allowed to pass through points that appear later in the order, but these do not count as visits.
     *
     * @param points 2D plane, there are n points with integer coordinates points[i] = [xi, yi].
     * @return the minimum time in seconds to visit all the points in the order given by points.
     */
    public int minTimeToVisitAllPoints(int[][] points) {
        int minTime = 0;
        for (int index = 1; index < points.length; index++) {
            minTime += Math.max(Math.abs(points[index - 1][0] - points[index][0]),
                    Math.abs(points[index - 1][1] - points[index][1]));
        }
        return minTime;
    }
}
