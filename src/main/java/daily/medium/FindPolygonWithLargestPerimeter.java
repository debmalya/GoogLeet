package daily.medium;

import java.util.Arrays;

public class FindPolygonWithLargestPerimeter {
    /**
     * You are given an array of positive integers nums of length n.
     * <p>
     * A polygon is a closed plane figure that has at least 3 sides.
     * The longest side of a polygon is smaller than the sum of its other sides.
     * <p>
     * Conversely, if you have k (k >= 3) positive real numbers a1, a2, a3, ..., ak where a1 <= a2 <= a3 <= ... <= ak and a1 + a2 + a3 + ... + ak-1 > ak, then there always exists a polygon with k sides whose lengths are a1, a2, a3, ..., ak.
     * <p>
     * The perimeter of a polygon is the sum of lengths of its sides.
     * <p>
     * Return the largest possible perimeter of a polygon whose sides can be formed from nums, or -1 if it is not possible to create a polygon.
     *
     * @param nums integer array.
     * @return permiter of largest possible polygon or -1.
     */
    public long largestPerimeter(int[] nums) {
        long sum = 0;
        Arrays.sort(nums);
        for (int num : nums) {
            sum += num;
        }
        int n = nums.length;
        for (int i = n - 1; i >= 2; i--) {
            sum -= nums[i];
            if (sum > nums[i]) {
                return sum + nums[i];
            }
        }
        return -1;
    }
}
