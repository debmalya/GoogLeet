package daily.medium;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber3 {
  public int[] singleNumber(int[] nums) {
    Map<Integer, Integer> occu = new HashMap<>();
    for (int num : nums) {
      if (occu.containsKey(num)) {
        occu.remove(num);
      } else {
        occu.put(num, occu.getOrDefault(num, 0) + 1);
      }
    }

    return occu.keySet().stream().mapToInt(Number::intValue).toArray();
  }
}
