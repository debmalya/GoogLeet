package hard;

public class CountSubarraysWithScoreLessThanK {
  public long countSubarrays(int[] nums, long k) {
    int n = nums.length;
    long ans = 0;
    long sum = 0;
    int left = 0;

    for (int right = 0; right < n; right++) {
      sum += nums[right];
      while (sum * (right - left + 1) >= k) {
        sum -= nums[left++];
      }
      ans += right - left + 1;
    }

    return ans;
  }
}
