package daily.medium;

import java.util.Arrays;

public class ThreeMusketers {
    /**
     * You are given an integer array nums of size n and a positive integer k.
     * <p>
     * Divide the array into one or more arrays of size 3 satisfying the following conditions:
     * <p>
     * Each element of nums should be in exactly one array.
     * The difference between any two elements in one array is less than or equal to k.
     * Return a 2D array containing all the arrays. If it is impossible to satisfy the conditions, return an empty array.
     * And if there are multiple answers, return any of them.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,3,4,8,7,9,3,5,1], k = 2
     * Output: [[1,1,3],[3,4,5],[7,8,9]]
     * Explanation: We can divide the array into the following arrays: [1,1,3], [3,4,5] and [7,8,9].
     * The difference between any two elements in each array is less than or equal to 2.
     * Note that the order of elements is not important.
     * Example 2:
     * <p>
     * Input: nums = [1,3,3,2,7,3], k = 3
     * Output: []
     * Explanation: It is not possible to divide the array satisfying all the conditions.
     * <p>
     * <p>
     * Constraints:
     * <p>
     * n == nums.length
     * 1 <= n <= 10^5
     * n is a multiple of 3.
     * 1 <= nums[i] <= 105
     * 1 <= k <= 105
     *
     * @param nums an integer array.
     * @param k    positive integer.
     * @return a 2D array containing all the arrays.
     */


    public int[][] divideArray(int[] nums, int k) {
        int size = nums.length;
        int[][] result = new int[size / 3][3];
        Arrays.sort(nums);
        boolean completed = true;
        for (int index = 0; index < size; index += 3) {
            if (nums[index + 2] - nums[index] <= k) {
                result[index / 3][0] = nums[index];
                result[index / 3][1] = nums[index + 1];
                result[index / 3][2] = nums[index + 2];
            } else {
                completed = false;
                break;
            }
        }
        if (!completed) {
            return new int[0][0];
        }
        return result;
    }


}
