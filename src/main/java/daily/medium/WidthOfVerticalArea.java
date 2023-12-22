package daily.medium;

import java.util.Arrays;

public class WidthOfVerticalArea {

    /**
     * Given n points on a 2D plane where points[i] = [xi, yi],
     * Return the widest vertical area between two points such that no points are inside the area.
     * <p>
     * A vertical area is an area of fixed-width extending infinitely along the y-axis (i.e., infinite height).
     * The widest vertical area is the one with the maximum width.
     * <p>
     * Note that points on the edge of a vertical area are not considered included in the area.
     *
     * @param points coordinates of n points.
     * @return widest vertical area.
     */
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));

        int max_width = 0;

        for (int i = 1; i < points.length; i++) {
            int width = points[i][0] - points[i - 1][0];
            max_width = Math.max(max_width, width);
        }

        return max_width;
    }

}