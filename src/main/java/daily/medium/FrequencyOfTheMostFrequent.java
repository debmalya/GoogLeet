package daily.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FrequencyOfTheMostFrequent {
    /**
     * The frequency of an element is the number of times it occurs in an array.
     * <p>
     * You are given an integer array nums and an integer k.
     * In one operation, you can choose an index of nums and increment the element at that index by 1.
     *
     * @param nums array of integer.
     * @param k    number of operations.
     * @return the maximum possible frequency of an element after performing at most k operations.
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [1,2,4], k = 5
     * Output: 3
     * Explanation: Increment the first element three times and the second element two times to make nums = [4,4,4].
     * 4 has a frequency of 3.
     */
    public int maxFrequency(int[] nums, int k) {
        int maxFrequency = 0; // Initialize the maximum frequency
        long currentSum = 0; // Initialize the current sum of the subarray elements

        Arrays.sort(nums); // Sort the array in ascending order

        for (int left = 0, right = 0; right < nums.length; ++right) {
            currentSum += nums[right]; // Include the current element in the subarray sum

            // Check if the current subarray violates the condition (sum + k < nums[right] * length)
            while (currentSum + k < (long) nums[right] * (right - left + 1)) {
                currentSum -= nums[left]; // Adjust the subarray sum by removing the leftmost element
                left++; // Move the left pointer to the right
            }

            // Update the maximum frequency based on the current subarray length
            maxFrequency = Math.max(maxFrequency, right - left + 1);
        }

        return maxFrequency;
    }

    public int maxFrequency1(int[] nums, int k) {
        int maxCount = 0;
        int mostFrequency = 0;
        int maxFrequent = 0;
        int max = 0;
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            int count = frequency.getOrDefault(num, 0);
            count++;
            frequency.put(num, count);
            if (num > max) {
                max = num;
            }
            if (count >= mostFrequency) {
                mostFrequency = count;
                maxFrequent = num;
            }
        }

        for (int num : nums) {
            int diff = maxFrequent - num;
            if (diff > 0 && diff <= k) {
                k -= diff;
                maxCount = Math.max(++mostFrequency, maxCount);
            } else if (max - num > 0 && max - num <= k && k > 0) {
                k -= (max - num);
                int count = frequency.getOrDefault(max, 0);
                count++;
                frequency.put(max, count);
                maxCount = Math.max(count, maxCount);
            }
        }
        return Math.max(mostFrequency, maxCount);
    }

    public int maxFrequency0(int[] nums, int k) {
        int maxCount = 0;
        Arrays.sort(nums);
        int max = nums[nums.length - 1];

        int diff = 0;
        int count = 0;
        for (int index = 0; index < nums.length; index++) {
            int num = nums[index];
            if (max - num + diff > k) {
                int nextIndex = index + 1;
                if (nums[nextIndex] - num + diff <= k) {
                    diff += nums[nextIndex] - num;
                    nums[index] += nums[nextIndex] - num;
                    count++;
                }
            } else {
                diff += max - num;
                nums[index] += max - num;
                count++;
            }

            maxCount = Math.max(maxCount, count);
        }


        return maxCount;
    }
}
