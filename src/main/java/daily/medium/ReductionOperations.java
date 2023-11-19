package daily.medium;

import java.util.*;

public class ReductionOperations {
    /**
     * Given an integer array nums, your goal is to make all elements in nums equal. To complete one operation, follow these steps:
     * <p>
     * Find the largest value in nums. Let its index be i (0-indexed) and its value be largest.
     * If there are multiple elements with the largest value, pick the smallest i.
     * <p>
     * Find the next largest value in nums strictly smaller than largest. Let its value be nextLargest.
     * <p>
     * Reduce nums[i] to nextLargest.
     *
     * @param nums integer array.
     * @return the number of operations to make all elements in nums equal.
     */

    public int reductionOperations(int[] nums) {
        int n = nums.length;
        int[] freq = new int[50001];
        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }
        int res = 0, operations = 0;
        for (int i = 50000; i >= 1; i--) {
            if (freq[i] > 0) {
                operations += freq[i];
                res += operations - freq[i];
            }
        }
        return res;
    }

    public int reductionOperations1(int[] nums) {
        int noOfOperations = 0;

        Map<Integer, List<Integer>> indexMap = new HashMap<>();


        for (int index = 0; index < nums.length; index++) {
            int num = nums[index];
            var positions = indexMap.getOrDefault(num, new ArrayList<>());
            positions.add(index);
            indexMap.put(num, positions);
        }


        if (indexMap.size() > 1) {
            var sortedKeys = indexMap.keySet().toArray(new Integer[0]);
            Arrays.sort(sortedKeys);
            for (var index = sortedKeys.length - 1; index > 0; index--) {
                noOfOperations += index * indexMap.get(sortedKeys[index]).size();
            }
        }

        return noOfOperations;
    }

    public int reductionOperations0(int[] nums) {
        int noOfOperations = 0;

        SortedMap<Integer, List<Integer>> indexMap = new TreeMap<>();


        for (int index = 0; index < nums.length; index++) {
            int num = nums[index];
            var positions = indexMap.getOrDefault(num, new ArrayList<>());
            positions.add(index);
            indexMap.put(num, positions);
        }


        if (indexMap.size() > 1) {
            var sortedKeys = indexMap.keySet().toArray(new Integer[0]);
            for (var index = sortedKeys.length - 1; index > 0; index--) {
                noOfOperations += index * indexMap.get(sortedKeys[index]).size();
            }
        }

        return noOfOperations;
    }
}
