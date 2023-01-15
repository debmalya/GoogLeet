package googleeet.medium;

public class MissingElementInSortedArray {

	public int missingElement(int[] nums, int k) {
		int count = 0;
		int prev = nums[0];
		int missing = 0;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] - prev > 1) {

				while (prev < nums[i] - 1) {
					count++;
					prev++;
					if (count == k) {
						missing = prev;
						break;
					}

				}

			}
			prev = nums[i];
		}

		if (missing == 0) {
			while (count < k) {
				count++;
				prev++;
				if (count == k) {
					missing = prev;
				}
			}

		}
		return missing;

	}

}
