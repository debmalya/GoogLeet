package daily;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {

	/**
	 * 
	 * 
	 * @param nums    - You are given an integer array nums of length n, and an
	 *                integer array queries of length m.
	 * @param queries
	 * @return Return an array answer of length m where answer[i] is the maximum
	 *         size of a subsequence that you can take from nums such that the sum
	 *         of its elements is less than or equal to queries[i].
	 * 
	 *         A subsequence is an array that can be derived from another array by
	 *         deleting some or no elements without changing the order of the
	 *         remaining elements.
	 * 
	 * 
	 *         Example 1:
	 * 
	 *         Input: nums = [4,5,2,1], queries = [3,10,21] Output: [2,3,4]
	 *         Explanation: We answer the queries as follows: - The subsequence
	 *         [2,1] has a sum less than or equal to 3. It can be proven that 2 is
	 *         the maximum size of such a subsequence, so answer[0] = 2. - The
	 *         subsequence [4,5,1] has a sum less than or equal to 10. It can be
	 *         proven that 3 is the maximum size of such a subsequence, so answer[1]
	 *         = 3. - The subsequence [4,5,2,1] has a sum less than or equal to 21.
	 *         It can be proven that 4 is the maximum size of such a subsequence, so
	 *         answer[2] = 4.
	 * 
	 *         Example 2:
	 * 
	 *         Input: nums = [2,3,4,5], queries = [1] Output: [0] Explanation: The
	 *         empty subsequence is the only subsequence that has a sum less than or
	 *         equal to 1, so answer[0] = 0.
	 */
	public int[] answerQueries(int[] nums, int[] queries) {
		// Get the prefix sum array of the sorted 'nums'.
		Arrays.sort(nums);
		for (int i = 1; i < nums.length; ++i)
			nums[i] += nums[i - 1];

		// For each query, find its insertion index to the prefix sum array.
		int n = queries.length;
		int answer[] = new int[n];
		for (int i = 0; i < n; ++i) {
			int index = binarySearch(nums, queries[i]);
			answer[i] = index;
		}

		return answer;
	}

	int binarySearch(int[] nums, int target) {
		int left = 0, right = nums.length - 1;
		while (left < right) {
			int mid = (left + right) / 2;
			if (nums[mid] == target)
				return mid + 1;
			if (nums[mid] < target)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return nums[left] > target ? left : left + 1;
	}
}
