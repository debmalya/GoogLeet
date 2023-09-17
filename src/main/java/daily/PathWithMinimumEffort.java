package daily;

import java.util.PriorityQueue;

public class PathWithMinimumEffort {
    /**
     * You are a hiker preparing for an upcoming hike. You are given heights, a 2D array of size rows x columns,
     * where heights[row][col] represents the height of cell (row, col). You are situated in the top-left cell, (0, 0),
     * and you hope to travel to the bottom-right cell, (rows-1, columns-1) (i.e., 0-indexed). You can move up, down, left, or right,
     * and you wish to find a route that requires the minimum effort.
     * <p>
     * A route's effort is the maximum absolute difference in heights between two consecutive cells of the route.
     *
     * @param heights A route's effort is the maximum absolute difference in heights between two consecutive cells of the route.
     * @return the minimum effort required to travel from the top-left cell to the bottom-right cell.
     */
    public int minimumEffortPath(int[][] heights) {
        int rows = heights.length, cols = heights[0].length;
        int[][] dist = new int[rows][cols];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        minHeap.add(new int[]{0, 0, 0});

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
        dist[0][0] = 0;

        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        while (!minHeap.isEmpty()) {
            int[] top = minHeap.poll();
            int effort = top[0], x = top[1], y = top[2];

            if (effort > dist[x][y]) continue;

            if (x == rows - 1 && y == cols - 1) return effort;

            for (int[] dir : directions) {
                int nx = x + dir[0], ny = y + dir[1];
                if (nx >= 0 && nx < rows && ny >= 0 && ny < cols) {
                    int new_effort = Math.max(effort, Math.abs(heights[x][y] - heights[nx][ny]));
                    if (new_effort < dist[nx][ny]) {
                        dist[nx][ny] = new_effort;
                        minHeap.add(new int[]{new_effort, nx, ny});
                    }
                }
            }
        }
        return -1;
    }

    public int minimumEffortPath0(int[][] heights) {
        int minDiff = Integer.MAX_VALUE;

        int[] dx = new int[]{-1, 0, 1, 0};
        int[] dy = new int[]{0, 1, 0, 1};

        for (int row = 0; row < heights.length; row++) {
            for (int col = 0; col < heights[row].length; col++) {
                for (int i = 0; i < dx.length; i++) {
                    int dRow = row + dx[i];
                    int dCol = col + dy[i];
                    if (dRow > -1 && dRow < heights.length && dCol > -1 && dCol < heights[row].length) {
                        int diff = Math.abs(heights[row][col] - heights[dCol][dRow]);
                        if (diff < minDiff) {
                            minDiff = diff;
                        }
                    }
                }
            }
        }

        return minDiff;

    }
}
