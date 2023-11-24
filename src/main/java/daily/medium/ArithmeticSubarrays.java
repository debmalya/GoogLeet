package daily.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArithmeticSubarrays {
    /**
     * A sequence of numbers is called arithmetic if it consists of at least two elements,
     * and the difference between every two consecutive elements is the same. More formally, a sequence s is arithmetic
     * if and only if s[i+1] - s[i] == s[1] - s[0] for all valid i.
     * <p>
     * For example, these are arithmetic sequences:
     * <p>
     * 1, 3, 5, 7, 9
     * 7, 7, 7, 7
     * 3, -1, -5, -9
     * The following sequence is not arithmetic:
     * <p>
     * 1, 1, 2, 5, 7
     * <p>
     * You are given an array of n integers, nums, and two arrays of m integers each, l and r, representing the m range queries,
     * where the ith query is the range [l[i], r[i]]. All the arrays are 0-indexed.
     *
     * @param nums integer array.
     * @param l    integer array.
     * @param r    integer array.
     * @return a list of boolean elements answer,
     * where answer[i] is true if the subarray nums[l[i]], nums[l[i]+1], ... , nums[r[i]]
     * can be rearranged to form an arithmetic sequence, and false otherwise.
     */

    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> subarrayNums = new ArrayList<>();
        for (int index = 0; index < l.length; index++) {
            int size = r[index] - l[index];
            int[] arr = new int[size + 1];
            System.arraycopy(nums, l[index], arr, 0, size + 1);
            subarrayNums.add(isArithmatic(arr));
        }
        return subarrayNums;
    }

    private Boolean isArithmatic(int[] arr) {
        boolean arithmatic = true;
        Arrays.sort(arr);
        if (arr.length > 1) {
            int diff = arr[1] - arr[0];
            for (int index = 1; index < arr.length - 1; index++) {
                if (diff != arr[index + 1] - arr[index]) {
                    arithmatic = false;
                    break;
                }
            }
        }
        return arithmatic;
    }
}
