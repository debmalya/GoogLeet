package daily.easy;

public class MonotonicArray {
    /**
     * An array is monotonic if it is either monotone increasing or monotone decreasing.
     * <p>
     * An array nums is monotone increasing if for all i <= j, nums[i] <= nums[j]. An array nums is monotone decreasing if for all i <= j, nums[i] >= nums[j].
     * <p>
     * Given an integer array nums, return true if the given array is monotonic, or false otherwise.
     *
     * @param nums integer array.
     * @return true if monotonic, false otherwise.
     */
    public boolean isMonotonic(int[] nums) {
        boolean negativeTrend = false;
        boolean positiveTrend = false;

        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != prev) {
                if (nums[i] > prev) {
                    positiveTrend = true;
                } else if (nums[i] < prev) {
                    negativeTrend = true;
                }
            }
            if (positiveTrend && negativeTrend) {
                break;
            }
            prev = nums[i];
        }

        return (positiveTrend && !negativeTrend) || ((!positiveTrend && negativeTrend)) || (!positiveTrend && !negativeTrend);
    }
}
