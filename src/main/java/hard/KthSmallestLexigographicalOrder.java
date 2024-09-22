package hard;

import java.util.*;

public class KthSmallestLexigographicalOrder {
  public int findKthNumber(int n, int k) {
    var result = lexicalOrder(n);
    return result.get(k - 1);
  }

  private List<Integer> lexicalOrder(int n) {
    List<Integer> result = new ArrayList<>();
    Map<Integer, List<Integer>> firstDigitNumMap = new HashMap<>();
    for (var num = 1; num <= n; num++) {
      var firstDigit = getFirstDigit(num);
      var listOfNums = firstDigitNumMap.getOrDefault(firstDigit, new ArrayList<>());
      listOfNums.add(num);
      firstDigitNumMap.put(firstDigit, listOfNums);
    }
    var keys = new ArrayList<>(firstDigitNumMap.keySet());
    Collections.sort(keys);
    for (var key : keys) {
      var nums = firstDigitNumMap.get(key);
      Collections.sort(nums);
      result.addAll(nums);
    }
    return result;
  }

  public int getFirstDigit(int num) {
    while (num >= 10) {
      num /= 10;
    }
    return num;
  }
}
