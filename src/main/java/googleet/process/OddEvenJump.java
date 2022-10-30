package googleet.process;

import java.util.TreeMap;

public class OddEvenJump {
	/**
	 * Given an integer array. From starting index can make a series of jumps. Jumps
	 * in the series of (1,3,5...) are odd numbered jumps. Jumps in the series of
	 * (2,4,6...) are even numbered jumps. Jumps are numbered. 1st jump, 2nd jump,
	 * 3rd jump. Not the index.
	 * 
	 * Rule ( Joy ) of jumping
	 * 
	 * Only to forward index. From i to j. j > i
	 * 
	 * During odd numbered jump (1,3,5...) arr[i] <= arr[j]. arr[j] is the smallest
	 * possible value. E.g. [10, 13, 12, 14, 15]. Starting from 10 in 1st jump we
	 * can go to 12. arr[2] > arr[0] and 2 > 0.
	 * 
	 * 
	 * During even numbered jump (2,4,6,...) jump to the index j such that arr[i] >=
	 * arr[j] and arr[j] is the largest possible value. After jumping from 10 - 12
	 * in 2nd jump do not have any valid value to jump.
	 * 
	 * A starting index is good if, starting from that index, you can reach the end
	 * of the array (index arr.length - 1) by jumping some number of times (possibly
	 * 0 or more than once).
	 * 
	 * @param arr - integer array.
	 * @return the number of good starting indices.
	 * 
	 *         Input: arr = [10,13,12,14,15] Output: 2
	 * 
	 *         Explanation: From starting index i = 0, we can make our 1st jump to i
	 *         = 2 (since arr[2] is the smallest among arr[1], arr[2], arr[3],
	 *         arr[4] that is greater or equal to arr[0]), then we cannot jump any
	 *         more.
	 * 
	 *         From starting index i = 1 and i = 2, we can make our 1st jump to i =
	 *         3, then we cannot jump any more.
	 * 
	 *         From starting index i = 3, we can make our 1st jump to i = 4, so we
	 *         have reached the end.
	 * 
	 *         From starting index i = 4, we have reached the end already. In total,
	 *         there are 2 different starting indices i = 3 and i = 4, where we can
	 *         reach the end with some number of jumps.
	 */
	public int oddEvenJumps(int[] A) {
		int n = A.length;
		if (n <= 1) {
			return n;
		}
		boolean[] odd = new boolean[n];
		boolean[] even = new boolean[n];
		odd[n - 1] = even[n - 1] = true;
		TreeMap<Integer, Integer> map = new TreeMap<>();
		map.put(A[n - 1], n - 1);
		int count = 0;
		for (int i = n - 2; i >= 0; i--) {
			int val = A[i];
			if (map.containsKey(val)) {
				odd[i] = even[map.get(val)];
				even[i] = odd[map.get(val)];
			} else {
				Integer lower = map.lowerKey(val);
				Integer higher = map.higherKey(val);
				if (lower != null) {
					even[i] = odd[map.get(lower)];
				}
				if (higher != null) {
					odd[i] = even[map.get(higher)];
				}
			}
			map.put(val, i);
		}
		for (boolean b : odd) {
			count += b ? 1 : 0;
		}
		return count;
	}

	public int oddEvenJumpsOwn(int[] arr) {
		int possibleJumpCount = 0;
		for (int i = 0; i < arr.length; i++) {
			int jumpCount = 1;
			int result = i;
			while (true) {
				if (jumpCount % 2 == 1) {
					// odd numbered jump
					result = getOddJump(arr, result);
				} else {
					// even numbered jump
					result = getEvenJump(arr, result);
				}
				if (result == -1) {
					break;
				} else if (result == arr.length - 1) {
//					System.out.println("from index " + i + " value " + arr[i] + " we can reach the end");
					possibleJumpCount++;
					break;
				}
				jumpCount++;
			}
		}
		return possibleJumpCount;
	}

	/**
	 * During even numbered jump (2,4,6,...) jump to the index j such that arr[i] >=
	 * arr[j] and arr[j] is the largest possible value. After jumping from 10 - 12
	 * in 2nd jump do not have any valid value to jump.
	 * 
	 * @param arr
	 * @param currentIndex
	 * @return
	 */
	private int getEvenJump(int[] arr, int currentIndex) {
		if (currentIndex == arr.length - 1) {
			return currentIndex;
		}
		int[] dest = new int[arr.length - currentIndex - 1];
		System.arraycopy(arr, currentIndex + 1, dest, 0, arr.length - currentIndex - 1);
		int max = Integer.MIN_VALUE;
		int maxIndex = -1;

		for (int i = 0; i < dest.length; i++) {
			if (dest[i] <= arr[currentIndex] && dest[i] > max) {
				max = dest[i];
				maxIndex = currentIndex + 1 + i;
			}
		}
		return maxIndex;
	}

	/**
	 * During odd numbered jump (1,3,5...) arr[i] <= arr[j]. arr[j] is the smallest
	 * possible value. E.g. [10, 13, 12, 14, 15]. Starting from 10 in 1st jump we
	 * can go to 12. arr[2] > arr[0] and 2 > 0.
	 * 
	 * @param arr
	 * @param currentIndex
	 * @return
	 */
	private int getOddJump(int[] arr, int currentIndex) {
		if (currentIndex == arr.length - 1) {
			return currentIndex;
		}
		int[] dest = new int[arr.length - currentIndex - 1];
		System.arraycopy(arr, currentIndex + 1, dest, 0, arr.length - currentIndex - 1);
		int min = Integer.MAX_VALUE;
		int minIndex = -1;
		for (int i = 0; i < dest.length; i++) {
			if (dest[i] >= arr[currentIndex] && dest[i] < min) {
				min = dest[i];
				minIndex = currentIndex + 1 + i;

			}
		}
		return minIndex;

	}
}
