package daily.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementII {
    /**
     * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
     *
     * @param nums integer array.
     * @return list of elements that appear more than n/3 times.
     */
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> majorityList = new ArrayList<>();
        int majority = nums.length / 3;
        Arrays.sort(nums);
        int count = 0;
        int prev = 0;
        for (int index = 0; index < nums.length; index++) {
            if (index == 0) {
                count++;
            } else {
                if (prev == nums[index]) {
                    count++;

                } else {
                    count = 1;
                }
            }
            if (count == majority + 1) {
                majorityList.add(nums[index]);
            }

            prev = nums[index];
        }
        return majorityList;
    }
}
