package daily.medium;

public class SumOfAbsoluteDifferenceSortedArray {
    /**
     * You are given an integer array nums sorted in non-decreasing order.
     * <p>
     * Build and return an integer array result with the same length as nums such that result[i] is equal to the summation
     * of absolute differences between nums[i] and all the other elements in the array.
     * <p>
     * In other words, result[i] is equal to sum(|nums[i]-nums[j]|) where 0 <= j < nums.length and j != i (0-indexed).
     *
     * @param nums
     * @return
     */
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        int left = 0;
        int right = sum;

        int[] r = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            right -= n;

            r[i] = n * i - left + right - n * (nums.length - i - 1);

            left += n;
        }

        return r;
    }

    public int[] getSumAbsoluteDifferences0(int[] nums) {
        int[] diffs = new int[nums.length];
        int sum = 0;
        int n = nums.length;

        for (int num : nums) {
            sum += num;
        }

        diffs[0] = Math.abs(n * nums[0] - sum);
        diffs[n - 1] = Math.abs(n * nums[n - 1] - sum);
//        int avg = sum / n;
        for (int index = 1; index < n - 1; index++) {
//            diffs[index] += Math.abs(nums[index] - avg) * index;
            for (int innerIndex = 0; innerIndex < n; innerIndex++) {
                diffs[index] += Math.abs(nums[index] - nums[innerIndex]);
            }
        }
        return diffs;
    }
}
