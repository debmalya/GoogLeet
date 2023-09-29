package daily.easy;

public class SortArrayByParity {
    /**
     * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
     *
     * @param nums integer array.
     * @return move all the even integers at the beginning of the array followed by all the odd integers.
     */
    public int[] sortArrayByParity(int[] nums) {
        int[] sorted = new int[nums.length];
        int frontIndex = 0;
        int endIndex = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                sorted[frontIndex++] = nums[i];
            } else {
                sorted[endIndex--] = nums[i];
            }
        }
        return sorted;
    }
}
