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

		if (maxProfit == Integer.MIN_VALUE) {
			maxProfit = 0;
		}

		return maxProfit;
	}

	/**
	 * You are given an array prices where prices[i] is the price of a given stock
	 * on the ith day.
	 * 
	 * Find the maximum profit you can achieve. You may complete as many
	 * transactions as you like (i.e., buy one and sell one share of the stock
	 * multiple times) with the following restrictions:
	 * 
	 * After you sell your stock, you cannot buy stock on the next day (i.e.,
	 * cooldown one day). Note: You may not engage in multiple transactions
	 * simultaneously (i.e., you must sell the stock before you buy again).
	 * 
	 * @param prices -  an array prices
	 * @return - maximum profit
	 */
	public int maxProfit(int[] prices) {
	    int sold = Integer.MIN_VALUE, held = Integer.MIN_VALUE, reset = 0;

	    for (int price : prices) {
	      int preSold = sold;

	      sold = held + price;
	      held = Math.max(held, reset - price);
	      reset = Math.max(reset, preSold);
	    }

	    return Math.max(sold, reset);
	  
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
