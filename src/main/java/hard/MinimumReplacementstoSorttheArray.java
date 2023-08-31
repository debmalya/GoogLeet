package hard;

public class MinimumReplacementstoSorttheArray {
    /**
     * You are given a 0-indexed integer array nums.
     * In one operation you can replace any element of the array with any two elements that sum to it.
     * <p>
     * For example, consider nums = [5,6,7]. In one operation, we can replace nums[1] with 2 and 4 and convert nums to [5,2,4,7].
     *
     * @param nums integer array.
     * @return the minimum number of operations to make an array that is sorted in non-decreasing order..
     */

    public long minimumReplacement(int[] nums) {
        long operations = 0;
//         work from right to left, maintaining a dynamic upper bound (prev_bound).
        long prev_bound = nums[nums.length - 1];

        for (int i = nums.length - 2; i >= 0; i--) {
            long num = nums[i];
            long no_of_times = (num + prev_bound - 1) / prev_bound;
            operations += no_of_times - 1;
            prev_bound = num / no_of_times;
        }

        return operations;
    }

}
