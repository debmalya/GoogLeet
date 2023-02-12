package real;

import java.util.HashMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class Task3 {
	/**
	 * You are given an array A of N integers and an integer S. Your task is to
	 * compute how many ways one can choose contiguous fragment of A that has an
	 * arithmetic mean equal to S.
	 * 
	 * Examples Given A = [2,1,3] and S = 2, your function should return 3, since
	 * the arithmetic means of fragments [2],[1,3], and [2,1,3] equals to 2.
	 * 
	 * Given A = [0,4,3,-1] and S = 2, your function should return 2, since
	 * fragments [0,4] and [4,3,-1] have an arithmetic mean 2.
	 * 
	 * Given A = [2,1,4] and S = 3, your function should return 0, since there
	 * exists no contiguous fragments whose arithmetic mean is equal to 3.
	 * 
	 * @param A - an array of N integers.
	 * @param S - expected mean
	 * @return -how many ways one can choose contiguous fragment that has arithmetic
	 *         mean S.
	 */
	public int solution1(int[] arr, int k) {
		int result = 1, curSum = 0;
		int n = arr.length;

// Store the frequency of prefix
// sum of the array arr[]
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {

// Subtract k from each element,
// then add it to curSum
			curSum += (arr[i] - k);

// If curSum is 0 that means
// sum[0...i] is 0 so increment
// res
			if (curSum == 0)
				result++;

// Check if curSum has occurred
// before and if it has occurred
// before, add it's frequency to
// res
			if (mp.containsKey(curSum))
				result += mp.get(curSum);

// Increment the frequency
// of curSum
			if (mp.containsKey(curSum))
				mp.put(curSum, mp.get(curSum) + 1);
			else
				mp.put(curSum, 1);
		}

// Return result
		return result;
	}

	public int solution(int[] A, int S) {
		// Implement your solution here
		int no = 0;
		int startI = 0;
		int endI = 0;
		int sum = 0;

		SortedSet<Integer> n = new TreeSet<>();
		for (int i = 0; i < A.length; i++) {
			sum += A[i];
			endI = i + 1;
			int avg = sum / (endI - startI);
			if (avg == S) {
				no++;
			} else if (avg > S) {
				startI++;
				sum -= A[startI];
			}
			n.add(A[i]);
			no += lowerClass(A, n, i, S);

		}

		if (no > 1000000000) {
			return 1000000000;
		}
		return no;
	}

	private int lowerClass(int[] A, SortedSet<Integer> n, int i, int S) {
		SortedSet<Integer> head = n.headSet(A[i]);
		int count = 0;
		if (!head.isEmpty()) {
			Integer[] lowers = n.headSet(A[i]).toArray(new Integer[0]);
			int index = 0;
			int subSum = A[i];
			int subCount = 1;

			while (index < lowers.length - 1) {
				subSum += lowers[index];
				subCount++;
				int avg = subSum / subCount;
				if (avg == S) {
					count++;
				} else if (avg > S) {
					subSum = A[i];
					subCount = 1;
				}
				index++;
			}
		}
		return count;
	}

}
