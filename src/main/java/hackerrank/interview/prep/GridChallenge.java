package hackerrank.interview.prep;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GridChallenge {

	/**
	 * Given a square grid of characters in the range ascii[a-z], rearrange elements
	 * of each row alphabetically, ascending. Determine if the columns are also in
	 * ascending alphabetical order, top to bottom. Return YES if they are or NO if
	 * they are not.
	 * 
	 * Example
	 * 
	 * The grid is illustrated below.
	 * 
	 * a b c a d e e f g The rows are already in alphabetical order. The columns a a
	 * e, b d f and c e g are also in alphabetical order, so the answer would be
	 * YES. Only elements within the same row can be rearranged. They cannot be
	 * moved to a different row.
	 * 
	 * @param grid
	 * @return
	 */
	public static String gridChallenge(List<String> grid) {
		// Write your code here
//		Collections.sort(grid);
		if (grid != null && !grid.isEmpty()) {
			char[][] sortedGrid = new char[grid.size()][grid.size()];
			for (int index = 0; index < grid.size(); index++) {
				char[] each = grid.get(index).toCharArray();
				Arrays.sort(each);
				sortedGrid[index] = each;
			}

			for (int col = 0; col < sortedGrid[0].length; col++) {
				for (int row = 1; row < sortedGrid.length; row++) {
					if (sortedGrid[row - 1][col] > sortedGrid[row][col]) {
						return "NO";
					}
				}
			}
		}
		return "YES";
	}

}
