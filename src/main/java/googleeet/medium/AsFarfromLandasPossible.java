package googleeet.medium;

import java.util.Arrays;

public class AsFarfromLandasPossible {

	/**
	 * Given an n x n grid containing only values 0 and 1, where 0 represents water
	 * and 1 represents land, find a water cell such that its distance to the
	 * nearest land cell is maximized, and return the distance. If no land or water
	 * exists in the grid, return -1.
	 * 
	 * The distance used in this problem is the Manhattan distance: the distance
	 * between two cells (x0, y0) and (x1, y1) is |x0 - x1| + |y0 - y1|.
	 * 
	 * @param grid
	 * @return
	 */

	public int maxDistance(int[][] grid) {
		int rows = grid.length;
		// Although it's a square matrix, using different variable for readability.
		int cols = grid[0].length;

		// Maximum manhattan distance possible + 1.
		final int MAX_DISTANCE = rows + cols + 1;

		int[][] dist = new int[rows][cols];
		for (int[] arr : dist)
			Arrays.fill(arr, MAX_DISTANCE);

		// First pass: check for left and top neighbours
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				// Distance of land cells will be 0.
				if (grid[i][j] == 1) {
					dist[i][j] = 0;
				} else {
					// Check left and top cell distances if they exist and update the current cell
					// distance.
					dist[i][j] = Math.min(dist[i][j], Math.min(i > 0 ? dist[i - 1][j] + 1 : MAX_DISTANCE,
							j > 0 ? dist[i][j - 1] + 1 : MAX_DISTANCE));
				}
			}
		}

		// Second pass: check for the bottom and right neighbours.
		int ans = Integer.MIN_VALUE;
		for (int i = rows - 1; i >= 0; i--) {
			for (int j = cols - 1; j >= 0; j--) {
				// Check the right and bottom cell distances if they exist and update the
				// current cell distance.
				dist[i][j] = Math.min(dist[i][j], Math.min(i < rows - 1 ? dist[i + 1][j] + 1 : MAX_DISTANCE,
						j < cols - 1 ? dist[i][j + 1] + 1 : MAX_DISTANCE));

				ans = Math.max(ans, dist[i][j]);
			}
		}

		// If ans is 0, it means there is no water cell,
		// If ans is MAX_DISTANCE, it implies no land cell.
		return ans == 0 || ans == MAX_DISTANCE ? -1 : ans;
	}

	public int maxDistance0(int[][] grid) {
		int maxDistance = Integer.MIN_VALUE;

		int[] drow = { 0, -1, 0, 1 };
		int[] dcol = { -1, 0, 1, 0 };

		boolean[][] visited = new boolean[grid.length][grid[0].length];
		boolean isAnyWater = false;

		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[row].length; col++) {
				if (!visited[row][col]) {
					if (grid[row][col] == 1) {
						isAnyWater = true;
						// water cell
						// mark nearest cells are 1 distance away
						for (int i = 0; i < 4; i++) {
							int neighbourRow = row + drow[i];
							int neighbourCol = col + dcol[i];
							if (neighbourRow > -1 && neighbourCol > -1 && neighbourRow < grid.length
									&& neighbourCol < grid[neighbourRow].length && grid[neighbourRow][neighbourCol] != 1
									&& !visited[neighbourRow][neighbourCol]) {
								grid[neighbourRow][neighbourCol] = 1;
								visited[neighbourRow][neighbourCol] = true;
							}

						}
					} else {
						// land cell
						// check how far neighbors are from water cell.
						boolean waterCellNeighbor = false;
						int currentMaxDistance = 0;
						for (int i = 0; i < 4; i++) {
							int neighbourRow = row + drow[i];
							int neighbourCol = col + dcol[i];

							if (neighbourRow > -1 && neighbourCol > -1 && neighbourRow < grid.length
									&& neighbourCol < grid[neighbourRow].length) {
								currentMaxDistance = Math.max(currentMaxDistance, grid[neighbourRow][neighbourCol]);
								if (!visited[neighbourRow][neighbourCol] && grid[neighbourRow][neighbourCol] == 1) {
									waterCellNeighbor = true;
									visited[row][col] = true;
									grid[row][col] = 1;
									break;
								}
							}
						}

						if (!waterCellNeighbor && isAnyWater) {
							grid[row][col] = currentMaxDistance + 1;
							maxDistance = Math.max(maxDistance, grid[row][col]);
							visited[row][col] = true;
						}

					}

				}
			}
		}

		if (maxDistance == Integer.MIN_VALUE) {
			maxDistance = -1;
		}
		return maxDistance;
	}

}
