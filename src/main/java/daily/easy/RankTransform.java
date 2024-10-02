package daily.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RankTransform {
  public int[] arrayRankTransform(int[] arr) {
    Map<Integer, Integer> valueToRank = new HashMap<>(); // Map to store value-to-rank mapping
    int[] sortedUniqueNumbers =
        Arrays.stream(arr).distinct().sorted().toArray(); // Remove duplicates and sort

    // Assign ranks to sorted unique elements
    for (int i = 0; i < sortedUniqueNumbers.length; i++) {
      valueToRank.put(sortedUniqueNumbers[i], i + 1);
    }

    // Replace each element in the original array with its rank
    for (int i = 0; i < arr.length; i++) {
      arr[i] = valueToRank.get(arr[i]);
    }

    return arr; // Return the updated array
  }
}
