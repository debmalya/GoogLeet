package daily;

public class MaximumProfit {

	/**
	 * Input: [2, 3, 10, 6, 4, 8, 1], output 8
	 */
	public int getMaxProfit(int[] arr) {
		// Find the max ( Selling price)
		// Then get min ( before the index of max price)
		// If max is the first element?
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int minIndex = 0;
		int maxIndex = 0;
		int maxProfit = Integer.MIN_VALUE;
		// minIndex ( buy ) < maxIndex (sell)
		// O(n)
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				minIndex = i;
			} else if (arr[i] > max) {
				max = arr[i];
				maxIndex = i;
			}

			if (maxIndex > minIndex) {
				int currentProfit = arr[maxIndex] - arr[minIndex];
				maxProfit = Math.max(currentProfit, maxProfit);
			}
		}

		// PriorityQueue ( MinHeap / MaxHeap )?

		return maxProfit;
	}

	int[] merge2sortedArrays(int[] arr1, int[] arr2) {
		int[] merged = new int[arr1.length + arr2.length];
		for (int i = arr1.length - 1, j = arr2.length - 1, index = 0; i > -1 || j > -1; index++) {
			if (i > -1 && j > -1) {
				if (arr1[i] > arr2[j]) {
					merged[index] = arr1[i];
					i--;
				} else {
					merged[index] = arr2[j];
					j--;
				}
			} else if (i > -1) {
				merged[index] = arr1[i];
				i--;
			} else {
				merged[index] = arr2[j];
				j--;
			}
		}
		return merged;
	}

}
