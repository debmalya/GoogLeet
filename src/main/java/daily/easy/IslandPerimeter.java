package daily.easy;

public class IslandPerimeter {
    /**
     * You are given row x col grid representing a map where grid[i][j] = 1 represents land and grid[i][j] = 0 represents water.
     * <p>
     * Grid cells are connected horizontally/vertically (not diagonally). The grid is completely surrounded by water,
     * and there is exactly one island (i.e., one or more connected land cells).
     * <p>
     * The island doesn't have "lakes", meaning the water inside isn't connected to the water around the island.
     * One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100.
     * Determine the perimeter of the island.
     *
     * @param grid
     * @return
     */

    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;


        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                if (grid[row][col] == 1) {
                    int exposedSurface = getNoOfSurroudingLand(grid, row, col);
                    System.out.printf("row = %d, col = %d, exposed surface = %d\n", row, col, exposedSurface);
                    perimeter += exposedSurface;
                }
            }
        }

        return perimeter;
    }

    private int getNoOfSurroudingLand(int[][] grid, int row, int col) {
        int[] dx = new int[]{-1, 0, 0, 1};
        int[] dy = new int[]{0, -1, 1, 0};

        int land = 4;
        for (int index = 0; index < 4; index++) {
            if (row + dx[index] > -1 &&
                    row + dx[index] < grid.length &&
                    col + dy[index] > -1 &&
                    col + dy[index] < grid[row].length &&
                    grid[row + dx[index]][col + dy[index]] == 1) {
                land--;
            }
        }
        return land;
    }
}
