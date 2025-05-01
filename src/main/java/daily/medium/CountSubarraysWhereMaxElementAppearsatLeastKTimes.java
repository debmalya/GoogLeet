package daily.medium;

public class CountSubarraysWhereMaxElementAppearsatLeastKTimes {
  /**
   * 2962. Count Subarrays Where Max Element Appears at Least K Times
   * You are given an integer array nums and a positive integer k.
   *
   * Return the number of subarrays where the maximum element of nums appears at least k times in that subarray.
   *
   * A subarray is a contiguous sequence of elements within an array.
   * @param nums - an integer array.
   * @param k - a positive integer.
   * @return the number of subarrays where the maximum element of nums appears at least k times in that subarray.
   */

      public long countSubarrays(int[] nums, int k) {
          int maxi = Integer.MIN_VALUE;
          for (int num : nums) maxi = Math.max(maxi, num);
          int left = 0;
          long maxiOccurence = 0;
          long res = 0;
          for (int right = 0; right < nums.length; right++) {
              if (nums[right] == maxi) maxiOccurence++;
              while (maxiOccurence >= k) {
                  if (nums[left] == maxi) maxiOccurence--;
                  left++;
              }
              res += left;
          }
          return res;
      }

}
