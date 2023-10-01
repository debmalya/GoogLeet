package daily.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Pattern132 {
    /**
     * Given an array of n integers nums, a 132 pattern is a subsequence of three integers nums[i], nums[j] and nums[k]
     * such that i < j < k and nums[i] < nums[k] < nums[j].
     * <p>
     * Return
     *
     * @param nums an integer array.
     * @return true if there is a 132 pattern in nums, otherwise, return false.
     */
    public boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third) return true;
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                third = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }

    public boolean find132pattern0(int[] nums) {
        int reverseIndex = nums.length - 1;
        List<Integer> one = new ArrayList<>();
        List<Integer> two = new ArrayList<>();

        for (int index = 0; index < nums.length; index++) {
            int num = nums[index];
            int num3 = nums[reverseIndex];
            if (num3 > num && index < reverseIndex) {
                one.add(index);
                two.add(reverseIndex);
                reverseIndex--;
            }
        }

        if (one.isEmpty()) {
            return false;
        } else {
            for (int index = 0; index < nums.length; index++) {
                for (int i = 0; i < one.size(); i++) {
                    if (index > one.get(i) && index < two.get(i) && nums[index] > nums[one.get(i)] && nums[index] > nums[two.get(i)]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
