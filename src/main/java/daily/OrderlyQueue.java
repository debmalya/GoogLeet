package daily;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class OrderlyQueue {
	/**
	 * You are given a string s and an integer k. You can choose one of the first k
	 * letters of s and append it at the end of the string..
	 * 
	 * Return the lexicographically smallest string you could have after applying
	 * the mentioned step any number of moves.
	 * 
	 * Example: Input: s = "cba", k = 1 Output: "acb" In the first move, we move the
	 * 1st character 'c' to the end, obtaining the string "bac". In the second move,
	 * we move the 1st character 'b' to the end, obtaining the final result "acb".
	 * 
	 * Constraints:
	 * 
	 * 1 <= k <= s.length <= 1000 s consist of lowercase English letters.
	 * 
	 * @param s
	 * @param k
	 * @return
	 * 
	 *         Solution: This solution employs string rearrangements (rotations) to
	 *         find lexicographically minimum string. Time complexity is quadratic:
	 *         O(N*N). Space complexity is linear: O(N).
	 * 
	 *         For k>1 (we just check for k=2), any two adjacent characters can be
	 *         swapped: abXYZ -> abXYZ -> aXYZb -> XYZba -> YZbaX -> ZbaXY -> baXYZ.
	 * 
	 *         If ab are not in the beginning of the string, i.e., DEabF, we first
	 *         rotate the string DEabF -> EabFD -> abFDE, then apply the swap
	 *         algorithm.
	 * 
	 *         If we can swap adjacent characters then we can swap any characters in
	 *         the string, thus, completely sorting the string.
	 * 
	 *         For k=1, the best we can do is rotate the sting character by
	 *         character and search for the lexicographically minimal one.
	 * 
	 * 
	 */
	public String orderlyQueue(String s, int k) {
		if (k > 1) {
			char[] chars = s.toCharArray();
			Arrays.sort(chars);
			return new String(chars);
		}

		String ss = s;
		for (int i = 1; i < s.length(); i++) {
			String rot = s.substring(i) + s.substring(0, i);
			if (ss.compareTo(rot) > 0)
				ss = rot;
		}
		return ss;
	}

	

}
