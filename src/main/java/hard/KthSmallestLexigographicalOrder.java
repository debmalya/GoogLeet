package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KthSmallestLexigographicalOrder {
  public int findKthNumber(int n, int k) {
    var result = lexicalOrder(n);
    return result.get(k - 1);
  }

  private List<Integer> lexicalOrder(int n) {
    List<Integer> result = new ArrayList<>();
    String[] arr = new String[n];
    for (var index = 1; index <= n; index++) {
      arr[index - 1] = String.valueOf(index);
    }
    Arrays.sort(arr);
    for (String e : arr) {
      result.add(Integer.valueOf(e));
    }
    return result;
  }
}
