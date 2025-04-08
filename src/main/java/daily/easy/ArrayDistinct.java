package daily.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ArrayDistinct {
  /**
   * 3396. Minimum Number of Operations to Make Elements in Array Distinct You are given an integer
   * array nums. You need to ensure that the elements in the array are distinct. To achieve this,
   * you can perform the following operation any number of times:
   *
   * <p>Remove 3 elements from the beginning of the array. If the array has fewer than 3 elements,
   * remove all remaining elements. Note that an empty array is considered to have distinct
   * elements. Return the minimum number of operations needed to make the elements in the array
   * distinct.
   *
   * @param nums - integer array.
   * @return minimum number of operations needed to make the elements in the array distinct.
   */
  public int minimumOperations(int[] nums) {
      int cnt = 0, temp;
      List<Integer> list = new ArrayList<>();
      for (int n : nums)
          list.add(n);
      while (true) {
          HashMap<Integer, Integer> mpp = new HashMap<>();
          temp = 0;
          for (int num : list)
              if (mpp.put(num, mpp.getOrDefault(num, 0) + 1) != null && mpp.get(num) == 2)
                  temp++;
          if (temp == 0)
              break;
          int removeCount = Math.min(3, list.size());
          for (int i = 0; i < removeCount; i++)
              list.remove(0);
          cnt++;
      }
      return cnt;
  }
}
