package daily.medium;

import java.util.Arrays;

public class MaximumElementAfterDecreasingRearranging {
    /**
     * You are given an array of positive integer array. Perform some operations (possibly none) on arr so that it satisfies these conditions:
     * <p>
     * The value of the first element in arr must be 1.
     * The absolute difference between any 2 adjacent elements must be less than or equal to 1.
     * In other words, abs(arr[i] - arr[i - 1]) <= 1 for each i where 1 <= i < arr.length (0-indexed). abs(x) is the absolute value of x.
     * <p>
     * There are 2 types of operations that you can perform any number of times:
     * Decrease the value of any element of arr to a smaller positive integer.
     * Rearrange the elements of arr to be in any order.
     *
     * @param arr array of positive integer array.
     * @return the maximum possible value of an element in arr after performing the operations to satisfy the conditions.
     */
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        arr[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] > 1) {
                arr[i] = arr[i - 1] + 1;
            }
        }
        return arr[arr.length - 1];
    }
}
