package daily.easy;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class CountLargestGroup {
  public int countLargestGroup(int n) {

    var sumMap = new LinkedHashMap<Integer, Integer>();
    var max = Integer.MIN_VALUE;
    var maxCount = new AtomicInteger(0);

    for (var i = 1; i <= n; i++) {
      var key = digitSum(i);
      var value = sumMap.getOrDefault(key, 0) + 1;
      sumMap.put(key, value);
      if (value > max) {
        max = value;
      }
    }

    // count max
    for (var entry : sumMap.entrySet()) {
      if (entry.getValue() == max) {
        maxCount.getAndIncrement();
      }
    }

    return maxCount.get();
  }

  private int digitSum(int n) {
    var sum = 0;
    while (n > 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
}
