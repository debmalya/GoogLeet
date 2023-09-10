package daily;

import java.util.*;

public class CombinationSum4 {
    /**
     * @param nums   array of distinct integers.
     * @param target target integer.
     * @return the number of possible combinations that add up to target.
     */

    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 1; i <= target; i++) {
            for (int num : nums) {
                if (i - num >= 0) {
                    dp[i] += dp[i - num];
                }
            }
        }

        return dp[target];
    }

    public int combinationSum4_0(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> solutionSet = new HashSet<>();
        int[] prefixSum = new int[nums.length];
        for (int index = 0; index < nums.length; index++) {
            prefixSum[index] = target - nums[index];
            int count = target / nums[index];
            if (target > -1) {
                if (target % nums[index] == 0) {
                    int addCount = 0;
                    List<Integer> sameInteger = new ArrayList<>();
                    while (addCount < count) {
                        sameInteger.add(nums[index]);
                        addCount++;
                    }
                    System.out.println(sameInteger);
                    solutionSet.add(sameInteger);
                }
                if (Arrays.binarySearch(nums, prefixSum[index]) > -1) {
                    List<Integer> prefixList = new ArrayList<>();
                    prefixList.add(prefixSum[index]);
                    prefixList.add(nums[index]);
                    System.out.println(prefixList);
                    solutionSet.add(prefixList);
                }

            }
        }
        return solutionSet.size();
    }
}
