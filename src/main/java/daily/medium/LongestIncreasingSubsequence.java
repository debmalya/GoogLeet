package daily.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestIncreasingSubsequence {

    public int lengthOfLIS(int[] nums) {
        int[] temp = new int[nums.length];
        int len = 1;
        temp[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (temp[len - 1] < nums[i]) {
                temp[len++] = nums[i];
            } else {
                int ind = Arrays.binarySearch(temp, 0, len, nums[i]);
                if (ind < 0) {
                    ind = -(ind + 1);
                }
                temp[ind] = nums[i];
            }
        }
        return len;
    }

    public int lengthOfLIS1(int[] nums) {
        List<List<Integer>> increasingSubsequence = new ArrayList<>();

        for (int num : nums) {
            List<List<Integer>> newIncreasingSubsequence = new ArrayList<>();
            for (List<Integer> each : increasingSubsequence) {
                if (each.get(each.size() - 1) < num) {
                    each.add(num);
                } else {
                    int index = 0;
                    List<Integer> newList = new ArrayList<>();
                    while (index < each.size() && each.get(index) < num) {
                        newList.add(each.get(index));
                        index++;
                    }

                    if (!newList.isEmpty()) {
                        newList.add(num);
                        newIncreasingSubsequence.add(newList);
                    }

                }

            }
            List<Integer> last = new ArrayList<>();
            last.add(num);
            increasingSubsequence.add(last);
            increasingSubsequence.addAll(newIncreasingSubsequence);
        }

        increasingSubsequence.sort(Comparator.comparingInt(List::size));
        return increasingSubsequence.get(increasingSubsequence.size() - 1).size();
    }


    public int lengthOfLIS0(int[] nums) {
        List<List<Integer>> increasingSubsequence = new ArrayList<>();

        for (int num : nums) {
            for (List<Integer> each : increasingSubsequence) {
                if (each.get(each.size() - 1) < num) {
                    each.add(num);
                }
            }
            List<Integer> last = new ArrayList<>();
            last.add(num);
            increasingSubsequence.add(last);
        }

        increasingSubsequence.sort(Comparator.comparingInt(List::size));
        return increasingSubsequence.get(increasingSubsequence.size() - 1).size();
    }
}
