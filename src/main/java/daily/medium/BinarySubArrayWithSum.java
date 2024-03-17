package daily.medium;

import java.util.HashMap;
import java.util.Map;

public class BinarySubArrayWithSum {
    /**
     * Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
     * <p>
     * A subarray is a contiguous part of the array.
     *
     * @param nums - binary array.
     * @param goal - integer.
     * @return - he number of non-empty subarrays with a sum goal.
     */
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;
        int result = 0;
        int prefixSum = 0;
        Map<Integer, Integer> map = new HashMap();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            result += map.getOrDefault(prefixSum - goal, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }
        return result;
    }
}
