package daily;

import java.util.Arrays;

public class SearchInRotatedSortedArray {
    public boolean search(int[] nums, int target) {
        int pivotIndex = -1;
        int prev = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (prev > nums[i]) {
                pivotIndex = i;
                break;
            }
            prev = nums[i];
        }
        if (pivotIndex > -1) {
            return Arrays.binarySearch(nums, 0, pivotIndex + 1,
                    target) > -1 || Arrays.binarySearch(nums, pivotIndex,
                    nums.length, target) > -1;
        }

        return Arrays.binarySearch(nums, target) > -1;
    }
}
