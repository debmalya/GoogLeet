package daily.medium;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class MinimumArrayOperationToEmpty {
    /**
     * You are given a 0-indexed array nums consisting of positive integers.
     * <p>
     * There are two types of operations that you can apply on the array any number of times:
     * <p>
     * Choose two elements with equal values and delete them from the array.
     * Choose three elements with equal values and delete them from the array.
     * Return the minimum number of operations required to make the array empty, or -1 if it is not possible.
     *
     * @param nums
     * @return
     * @Constraints: 2 <= nums.length <= 10^5
     * 1 <= nums[i] <= 10^6
     */
    public int minOperations(int[] nums) {
        Map<Integer, Integer> frequency = new HashMap<>();
        AtomicInteger count = new AtomicInteger();
        for (int num : nums) {
            int value = frequency.getOrDefault(num, 0);
            value++;
            frequency.put(num, value);
        }

        frequency.forEach((key, value) -> {
            if (count.get() != -1) {
                int operations = count.get();
                if (value == 1) {
                    operations = -1;
                } else {
                    if (value % 3 == 0) {
                        operations += value / 3;
                    } else if ((value % 3) % 2 == 0) {
                        operations += (value / 3) + 1;
                    } else if (value % 3 == 1) {
                        operations += ((value - 4) / 3) + 2;
                    } else if (value % 2 == 0) {
                        operations += value / 2;
                    }
                }
                count.set(operations);
            }
        });

        return count.get();

    }
}
