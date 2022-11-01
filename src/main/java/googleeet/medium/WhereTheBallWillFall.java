package googleeet.medium;

public class WhereTheBallWillFall {



	/**
	 * You have a 2-D grid of size m x n representing a box, and you have n balls.
	 * The box is open on the top and bottom sides.
	 * 
	 * Each cell in the box has a diagonal board spanning two corners of the cell
	 * that can redirect a ball to the right or to the left.
	 * 
	 * A board that redirects the ball to the right spans the top-left corner to the
	 * bottom-right corner and is represented in the grid as 1.
	 * 
	 * A board that redirects the ball to the left spans the top-right corner to the
	 * bottom-left corner and is represented in the grid as -1.
	 * 
	 * We drop one ball at the top of each column of the box. Each ball can get
	 * stuck in the box or fall out of the bottom. A ball gets stuck if it hits a
	 * "V" shaped pattern between two boards or if a board redirects the ball into
	 * either wall of the box.
	 * 
	 * @param grid
	 * @return Return an array answer of size n where answer[i] is the column that
	 *         the ball falls out of at the bottom after dropping the ball from the
	 *         ith column at the top, or -1 if the ball gets stuck in the box.
	 * 
	 * 
	 */
	public int[] findBall(int[][] grid) {

		int[] result = null;
		if (grid != null && grid.length > 0) {
			result = new int[grid[0].length];
			int totalRows = grid.length;

			
			for (int col = 0; col < grid[0].length; col++) {
				int row = 0;
				int cx = col;
				while (row < totalRows && !isBlocked(grid, row, cx)) {
					cx += grid[row][cx];
					row += 1;
				}

				result[col] = row == totalRows ? cx : -1;

			}
		}

		return result;
	}

	private boolean isBlocked(int[][] grid, int cy, int cx) {
		int n = grid[0].length;
		return (grid[cy][cx] == 1 && cx == n - 1) // will hit right wall
				|| (grid[cy][cx] == -1 && cx == 0) // will hit left wall
				|| (grid[cy][cx] == 1 && grid[cy][cx + 1] == -1) // V shape with next
				|| (grid[cy][cx] == -1 && grid[cy][cx - 1] == 1); // V shape with previous
	}

}
