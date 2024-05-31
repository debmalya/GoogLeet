package daily.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class BeautifulSubset {
  private int dfs(int[] nums, int k, int i, Set<Integer> set) {
    if (i == nums.length) return set.isEmpty() ? 0 : 1;

    var cnt = dfs(nums, k, i + 1, set);

    if (set.contains(nums[i] - k)) return cnt;

    set.add(nums[i]);
    cnt += dfs(nums, k, i + 1, set);
    set.remove(nums[i]);

    return cnt;
  }

  public int beautifulSubsets(int[] nums, int k) {
    Arrays.sort(nums);

    return dfs(nums, k, 0, new HashSet<Integer>());
  }
}
