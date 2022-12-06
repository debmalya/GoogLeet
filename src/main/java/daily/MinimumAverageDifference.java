package daily;

public class MinimumAverageDifference {

	public int minimumAverageDifference(int[] nums) {
		int n = nums.length;
		int ans = -1;
		int minAvgDiff = Integer.MAX_VALUE;
		long currPrefixSum = 0;

		// Get total sum of array.
		long totalSum = 0;
		for (int index = 0; index < n; ++index) {
			totalSum += nums[index];
		}

		for (int index = 0; index < n; ++index) {
			currPrefixSum += nums[index];

			// Calculate average of left part of array, index 0 to i.
			long leftPartAverage = currPrefixSum;
			leftPartAverage /= (index + 1);

			// Calculate average of right part of array, index i+1 to n-1.
			long rightPartAverage = totalSum - currPrefixSum;
			// If right part have 0 elements, then we don't divide by 0.
			if (index != n - 1) {
				rightPartAverage /= (n - index - 1);
			}

			int currDifference = (int) Math.abs(leftPartAverage - rightPartAverage);
			// If current difference of averages is smaller,
			// then current index can be our answer.
			if (currDifference < minAvgDiff) {
				minAvgDiff = currDifference;
				ans = index;
			}
		}

		return ans;
	}

	public int minimumAverageDifference0(int[] nums) {
		int[] prefixSum = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			prefixSum[i] += nums[i];
			if (i > 0) {
				prefixSum[i] += prefixSum[i - 1];
			}
		}

		int minIndex = 0;
		int minAverageDifference = Integer.MAX_VALUE;
		for (int i = 0; i < nums.length; i++) {
			int currentAverageDifference = 0;
			if (i < nums.length - 1) {
				currentAverageDifference = Math.abs(Math.round(prefixSum[i] / (i + 1))
						- Math.round((prefixSum[nums.length - 1] - prefixSum[i]) / (nums.length - 1 - i)));
			} else {
				currentAverageDifference = prefixSum[nums.length - 1] / nums.length;
			}
			if (currentAverageDifference < minAverageDifference) {
				minAverageDifference = currentAverageDifference;
				minIndex = i;
			}
		}
		return minIndex;

	}
}
