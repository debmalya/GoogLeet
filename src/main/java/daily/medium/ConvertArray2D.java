package daily.medium;

import java.util.ArrayList;
import java.util.List;

public class ConvertArray2D {
    /**
     * You are given an integer array nums. You need to create a 2D array from nums satisfying the following conditions:
     * <p>
     * The 2D array should contain only the elements of the array nums.
     * Each row in the 2D array contains distinct integers.
     * The number of rows in the 2D array should be minimal.
     *
     * @param nums integer array.
     * @return the resulting array. If there are multiple answers, return any of them.
     * @Note that the 2D array can have a different number of elements on each row.
     * @Constraints 1 <= nums.length <= 200
     * 1 <= nums[i] <= nums.length
     */
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> twoDimensionalList = new ArrayList<>(nums.length);
        int[] frequency = new int[nums.length];

        int maxFrequency = 0;
        for (int num : nums) {
            frequency[num - 1]++;
            if (frequency[num - 1] > maxFrequency) {
                maxFrequency = frequency[num - 1];
            }

            while (twoDimensionalList.size() < frequency[num - 1]) {
                twoDimensionalList.add(new ArrayList<>());
            }
            twoDimensionalList.get(frequency[num - 1] - 1).add(num);

        }


        return twoDimensionalList;
    }
}
