package daily;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class SlidingWindowMaximum {
    /**
     * You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
     * <p>
     * Return the max sliding window.
     *
     * @param nums - an array of integers.
     * @param k    - window size.
     * @return - the max sliding window.
     * nums = [1,3,-1,-3,5,3,6,7], k = 3
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        int left = 0;
        int right = 0;
        Deque<Integer> q = new ArrayDeque<>();

        while (right < nums.length) {
            while (!q.isEmpty() && nums[right] > nums[q.peekLast()]) {
                q.pollLast();
            }
            q.offerLast(right);

            if (left > q.peekFirst()) {
                q.pollFirst();
            }

            if (right + 1 >= k) {
                res.add(nums[q.peekFirst()]);
                left++;
            }
            right++;
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
