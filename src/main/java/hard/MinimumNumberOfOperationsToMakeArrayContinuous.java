package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumNumberOfOperationsToMakeArrayContinuous {
    /**
     * In one operation, you can replace any element in nums with any integer.
     * <p>
     * nums is considered continuous if both of the following conditions are fulfilled:
     * <p>
     * All elements in nums are unique.
     * The difference between the maximum element and the minimum element in nums equals nums.length - 1.
     * <p>
     * For example, nums = [4, 2, 5, 3] is continuous, but nums = [1, 2, 3, 5, 6] is not continuous.
     *
     * @param nums integer array.
     * @return
     */

    public int minOperations(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums); // Sort the input array in ascending order
        int m = 1;

        // Remove duplicate elements in the sorted array
        for (int i = 1; i < n; ++i) {
            if (nums[i] != nums[i - 1]) {
                nums[m++] = nums[i];
            }
        }

        int ans = n;

        // Use a sliding window to find the minimum number of operations
        for (int i = 0, j = 0; i < m; ++i) {
            while (j < m && nums[j] - nums[i] <= n - 1) {
                ++j;
            }
            ans = Math.min(ans, n - (j - i));
        }

        return ans;
    }


    public int minOperations0(int[] nums) {

        int minOperations = 0;
        Arrays.sort(nums);
        boolean isOk = (nums[nums.length - 1] - nums[0] == nums.length - 1);

        List<Integer> missing = new ArrayList<>();

        boolean firstTime = true;
        int prevNum = 0;
        for (int num : nums) {
            if (firstTime) {
                firstTime = false;
            } else {
                while (num - prevNum > 1) {
                    missing.add(prevNum + 1);
                    prevNum++;
                }
            }
            prevNum = num;
        }

        int maxIndex = nums.length - 1;
        int minIndex = 0;
        boolean[] choosen = new boolean[missing.size()];
        if (!isOk && !missing.isEmpty()) {
            for (int index = 0; index < missing.size(); index++) {
                if (missing.get(index) < nums[nums.length - 1] && !choosen[index]) {
                    minOperations++;
                    if (maxIndex > 0) {
                        maxIndex--;
                    }
                    choosen[index] = true;
                    if (index == nums.length - 2 && missing.get(index) - nums[0] == nums.length - 1) {
                        break;
                    }
                }
                if (nums[maxIndex] - nums[minIndex] == nums.length - 1) {
                    break;
                }
            }
        }


        return minOperations;
    }
}
