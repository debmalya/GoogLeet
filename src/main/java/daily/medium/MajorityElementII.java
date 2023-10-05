package daily.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    /**
     * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
     *
     * @param nums integer array.
     * @return list of elements that appear more than n/3 times.
     */
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> majorityList = new ArrayList<>();
        int majority = nums.length / 3;
        Map<Integer, Integer> frequencyCount = new HashMap<>(nums.length);
        for (int each : nums) {
            Integer count = frequencyCount.getOrDefault(each, 0);
            count++;
            frequencyCount.put(each, count);
            if (count > majority) {
                if (!majorityList.contains(each)) {
                    majorityList.add(each);
                }
            }
        }
        return majorityList;
    }
}
