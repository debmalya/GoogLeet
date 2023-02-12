package hackerrank.interview.prep;

import java.util.List;

public class DiagonalDifference {
	/**
	 * Given a square matrix, calculate the absolute difference between the sums of
	 * its diagonals.
	 * 
	 * @param arr - matrix
	 * @return
	 */
	public static int diagonalDifference(List<List<Integer>> arr) {
		int row = 0;
		int col = 0;
		int col2 = arr.get(0).size() - 1;
		int diagonal1 = 0;
		int diagonal2 = 0;

		for (; row < arr.size(); row++,col2--,col++) {
			diagonal1 += arr.get(row).get(col2);
			diagonal2 += arr.get(row).get(col);
		}

		return Math.abs(diagonal1 - diagonal2);

	}

}
