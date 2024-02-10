package daily.medium;

import java.util.*;

public class LargestDivisibleSubset {

    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        Arrays.sort(nums);

        int maxSize = 1, maxIndex = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    if (dp[i] > maxSize) {
                        maxSize = dp[i];
                        maxIndex = i;
                    }
                }
            }
        }

        List<Integer> result = new ArrayList<>();
        int num = nums[maxIndex];
        for (int i = maxIndex; i >= 0; i--) {
            if (num % nums[i] == 0 && dp[i] == maxSize) {
                result.add(nums[i]);
                num = nums[i];
                maxSize--;
            }
        }

        return result;
    }

    public List<Integer> largestDivisibleSubset0(int[] nums) {
        List<List<Integer>> allLists = new ArrayList<>();

        for (int num : nums) {
            List<Integer> newList = new ArrayList<>();
            newList.add(num);
            for (List<Integer> list : allLists) {
                boolean toAdd = true;
                for (int n : list) {
                    if (num % n != 0 && n % num != 0) {
                        toAdd = false;
                        break;
                    }
                }
                if (toAdd) {
                    list.add(num);
                }
            }


            allLists.add(newList);
        }

        System.out.println(allLists);
        Collections.sort(allLists, Comparator.comparingInt(List::size));
        return allLists.getLast();
    }
}
