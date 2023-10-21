package hard;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class ConstrainedSubsequenceSum {
    /**
     * Given an integer array nums and an integer k, return the maximum sum of a non-empty subsequence of that array
     * such that for every two consecutive integers in the subsequence, nums[i] and nums[j], where i < j,
     * the condition j - i <= k is satisfied.
     * <p>
     * A subsequence of an array is obtained by deleting some number of elements (can be zero) from the array,
     * leaving the remaining elements in their original order.
     *
     * @param nums integer array.
     * @param k    integer to check the condition is satisfied or not.
     * @return the maximum sum of a non-empty subsequence
     */
    public int constrainedSubsetSum(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        for (int index = 0; index < nums.length; index++) {
            nums[index] += !dq.isEmpty() ? nums[dq.peekFirst()] : 0;

            while (!dq.isEmpty() && (index - dq.peekFirst() >= k || nums[index] >= nums[dq.peekLast()])) {
                if (nums[index] >= nums[dq.peekLast()]) dq.pollLast();
                else dq.pollFirst();
            }

            if (nums[index] > 0) {
                dq.offerLast(index);
            }
        }
        return Arrays.stream(nums).max().getAsInt();
    }

}
