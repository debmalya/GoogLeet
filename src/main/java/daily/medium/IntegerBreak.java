package daily.medium;

public class IntegerBreak {
    /**
     * Given an integer n, break it into the sum of k positive integers, where k >= 2, and maximize the product of those integers.
     *
     * @param n integer.
     * @return the maximum product you can get.
     * <p>
     * Input: n = 2
     * Output: 1
     * Explanation: 2 = 1 + 1, 1 × 1 = 1.
     * <p>
     * Example 2:
     * <p>
     * Input: n = 10
     * Output: 36
     * Explanation: 10 = 3 + 3 + 4, 3 × 3 × 4 = 36.
     */
    public int integerBreak(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;

        int count_of_3s = n / 3;
        int remainder = n % 3;

        if (remainder == 0) {
            return (int) Math.pow(3, count_of_3s);
        } else if (remainder == 1) {
            return (int) Math.pow(3, count_of_3s - 1) * 4;
        } else {
            return (int) Math.pow(3, count_of_3s) * 2;
        }
    }
}
