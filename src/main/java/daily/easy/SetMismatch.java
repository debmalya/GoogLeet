package daily.easy;

import java.util.Arrays;

public class SetMismatch {
    /**
     * You have a set of integers s, which originally contains all the numbers from 1 to n.
     * Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set,
     * which results in repetition of one number and loss of another number.
     * <p>
     * You are given an integer array nums representing the data status of this set after the error.
     * <p>
     * Find the number that occurs twice and the number that is missing and return them in the form of an array.
     *
     * @param nums - integer array.
     * @return the number that occurs twice and the number that is missing and return them in the form of an array.
     */
    public int[] findErrorNums(int[] nums) {
        int[] found = new int[2];
        Arrays.sort(nums);
        int errorIndex = 0;
        for (int index = 1; index < nums.length; index++) {
            if (nums[index] - nums[index - 1] > 1) {
                found[errorIndex++] = nums[index - 1] + 1;
            } else if (nums[index] == nums[index - 1]) {
                found[errorIndex++] = nums[index];
            }
        }

        if (found[1] == 0) {
            found[1] = nums[nums.length - 1] + 1;
        }
        return found;
    }
}
