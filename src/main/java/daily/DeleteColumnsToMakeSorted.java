package daily;

import java.util.Arrays;

public class DeleteColumnsToMakeSorted {
	/**
	 * The strings can be arranged such that there is one on each line, making a
	 * grid. For example, strs = ["abc", "bce", "cae"] can be arranged as:
	 * 
	 * abc bce cae
	 * 
	 * Input: strs = ["cba","daf","ghi"] Output: 1 Explanation: The grid looks as
	 * follows: cba daf ghi Columns 0 and 2 are sorted, but column 1 is not, so you
	 * only need to delete 1 column.
	 * 
	 * Input: strs = ["a","b"] Output: 0 Explanation: The grid looks as follows: a b
	 * Column 0 is the only column and is sorted, so you will not delete any
	 * columns.
	 * 
	 * @param strs - an array of n strings strs, all of the same length.
	 * @return
	 */

	public int minDeletionSize(String[] strs) {
		int len = strs.length;
		int wordlen = strs[0].length();
		int count = 0;
		for (int i = 0; i < wordlen; i++) {
			char prev = strs[0].charAt(i);
			for (int j = 1; j < len; j++) {
				char ch = strs[j].charAt(i);
				if (ch < prev) {
					count++;
					break;
				}
				prev = ch;
			}
		}
		return count;
	}

}
