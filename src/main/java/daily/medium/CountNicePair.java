package daily.medium;

import java.util.HashMap;

public class CountNicePair {
    /**
     * Let us define rev(x) as the reverse of the non-negative integer x. For example, rev(123) = 321, and rev(120) = 21.
     * A pair of indices (i, j) is nice if it satisfies all of the following conditions:
     * <p>
     * 0 <= i < j < nums.length
     * nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])
     *
     * @param nums an array nums that consists of non-negative integers.
     * @return the number of nice pairs of indices. Since that number can be too large, return it modulo 10^9 + 7.
     */
    public int countNicePairs(int[] nums) {
        var map = new HashMap<Integer, Integer>();
        var ans = 0;

        for (var n : nums) {
            var rev = rev(n);
            var a = map.getOrDefault(n - rev, 0);
            ans = (ans + a) % 1000000007;
            map.put(n - rev, a + 1);
        }
        return ans;
    }

    public int rev(int n) {
        var rev = 0;

        while (n > 0) {
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev;
    }


}
