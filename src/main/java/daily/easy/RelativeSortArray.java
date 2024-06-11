package daily.easy;

import java.util.*;

public class RelativeSortArray {
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int[] result = new int[arr1.length];

    LinkedHashMap<Integer, Integer> frequency = new LinkedHashMap<>();
    for (int num : arr1) {
      var count = frequency.getOrDefault(num, 0);
      count++;
      frequency.put(num, count);
    }

    var resultIndex = 0;
    for (var num : arr2) {
      var count = frequency.get(num);
      while (count > 0) {
        result[resultIndex++] = num;
        count--;
      }
      frequency.remove(num);
    }

    var keys = frequency.keySet().toArray();
    Arrays.sort(keys);
    var iterator = Arrays.stream(keys).iterator();

    while (iterator.hasNext()) {
      Integer key = (Integer) iterator.next();
      var count = frequency.get(key);
      while (count > 0) {
        result[resultIndex++] = key;
        count--;
      }
    }

    return result;
  }
}
