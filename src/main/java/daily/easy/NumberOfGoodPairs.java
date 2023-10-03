package daily.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, List<Integer>> pairs = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            var indexes = pairs.getOrDefault(nums[index], new ArrayList<>());
            count += indexes.size();
            indexes.add(index);
            pairs.put(nums[index], indexes);
        }
        return count;
    }
}
