package interview.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SumSubSets {
	/**
	 * Given a sorted array of integers array and an integer number, find all
	 * possible unique subsets of array that add up to number. Both the array of
	 * subsets and the subsets themselves should be sorted in lexicographical order.
	 * 
	 * @param arr - sorted array of integers.
	 * @param num - integer that add up to number.
	 * @return - all possible unique subsets of array that add up to number.
	 */
	int[][] solution(int[] arr, int num) {
		List<List<Integer>> subSets = new ArrayList<>();
		if (num < arr[0]) {
			// no possible solution

		} else {
			int sum = arraySum(arr);
			if (sum == num) {
				List<Integer> newSubSet = new ArrayList<>();
				for (int i = 0; i < arr.length; i++) {
					newSubSet.add(arr[i]);
				}
				subSets.add(newSubSet);
			} else if (arraySum(arr) > num) {
				for (int i = 0; i < arr.length && arr[i] <= num; i++) {
					if (arr[i] == num) {
						List<Integer> newSubSet = new ArrayList<>();
						newSubSet.add(arr[i]);
						if (!subSets.contains(newSubSet)) {
							subSets.add(newSubSet);
						}
					} else {
						int complement = num - arr[i];
						int csIndex = Arrays.binarySearch(arr, complement);
						if (csIndex > -1) {
							// found
							List<Integer> newSubSet = new ArrayList<>();
							newSubSet.add(arr[i]);
							newSubSet.add(complement);
							Collections.sort(newSubSet);
							if (!subSets.contains(newSubSet)) {
								subSets.add(newSubSet);
							}
						} else {
							// need more elements
							csIndex = Math.abs(csIndex);
							List<Integer> newSubSet = new ArrayList<>();
							findSubSetsWithMoreThan2Members(arr, i, csIndex, num, arr[i] + arr[csIndex], newSubSet);
							if (!newSubSet.isEmpty()) {
								subSets.add(newSubSet);
							}
						}
					}
				}
			}
		}
		return subSets.stream().map(u -> u.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);
	}

	private List<Integer> findSubSetsWithMoreThan2Members(int[] arr, int i, int csIndex, int num, int currentSum,
			List<Integer> newSubSet) {

		int complement = num - currentSum;
		return newSubSet;
	}

	public int arraySum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

}
