package daily.easy;

import java.util.*;

public class SortArrayByIncreasingFrequency {
  public int[] frequencySort(int[] nums) {
    Map<Integer, Integer> frequencyMap = new HashMap<>();

    for (int num : nums) {
      frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
    }
    TreeMap<Integer, List<Integer>> reverseFrequency = new TreeMap<>();
    frequencyMap.forEach(
        (key, value) -> {
          var existingKeys = reverseFrequency.getOrDefault(value, new ArrayList<>());
          existingKeys.add(key);
          reverseFrequency.put(value, existingKeys);
        });

    int[] sortedNums = new int[nums.length];
    var entrySet = reverseFrequency.entrySet();

    var index = 0;
    for (var each : entrySet) {
      var count = each.getKey();
      var items = each.getValue();
      Collections.sort(items);
      for (var eachItem : items) {
        var eachIndex = 0;
        while (eachIndex < count) {
          sortedNums[index++] = eachItem;
          eachIndex++;
        }
      }
    }
    return sortedNums;
  }
}
