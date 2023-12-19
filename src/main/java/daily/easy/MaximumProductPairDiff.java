package daily.easy;

public class MaximumProductPairDiff {
    public int maxProductDifference(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int min2 = 0;
        int max2 = 0;
        for (int num : nums) {
            if (num > max) {
                max2 = max;
                max = num;
            } else if (num > max2) {
                max2 = num;
            }
            if (num < min) {
                min2 = min;
                min = num;
            } else if (num < min2) {
                min2 = num;
            }
        }
        return (max * max2) - (min * min2);
    }
}
