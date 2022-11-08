package googleeet.arrays.strings;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
	/**
	 * You are given an inclusive range [lower, upper] and a sorted unique integer
	 * array nums, where all elements are in the inclusive range.
	 * 
	 * A number x is considered missing if x is in the range [lower, upper] and x is
	 * not in nums.
	 * 
	 * Return the smallest sorted list of ranges that cover every missing number
	 * exactly. That is, no element of nums is in any of the ranges, and each
	 * missing number is in one of the ranges.
	 * 
	 * Each range [a,b] in the list should be output as:
	 * 
	 * "a->b" if a != b "a" if a == b
	 * 
	 * Example 1: Input: nums = [0,1,3,50,75], lower = 0, upper = 99 Output:
	 * ["2","4->49","51->74","76->99"] Explanation: The ranges are: [2,2] --> "2"
	 * [4,49] --> "4->49" [51,74] --> "51->74" [76,99] --> "76->99"
	 * 
	 * 
	 * Exampl 2:
	 * 
	 * 
	 * 
	 * @param nums
	 * @param lower
	 * @param upper
	 * @return
	 */
	public List<String> findMissingRanges(int[] nums, int lower, int upper) {
		List<String> missing = new ArrayList<>();
		if (nums == null || nums.length == 0) {
			return missing;
		}
		if (nums[0] > lower) {
			addMissingNumber(lower, nums[0], missing);
		}
		int prev = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] - prev > 1) {
				addMissingNumber(prev, nums[i], missing);
			}
			prev = nums[i];
		}
		if (nums[nums.length - 1] < upper) {
			addMissingNumber(nums[nums.length - 1], upper + 1, missing);
		}
		return missing;
	}

	private void addMissingNumber(int lower, int higher, List<String> missing) {
		if (higher - lower > 2) {
			missing.add(String.format("%d->%d", lower + 1, higher - 1));
		} else {
			missing.add(String.valueOf(lower + 1));
		}
	}

}
