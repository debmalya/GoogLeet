package daily.medium;

import java.util.Arrays;

public class MaximizeHappiness {
    /**
     * You are given an array happiness of length n, and a positive integer k.
     * <p>
     * There are n children standing in a queue, where the ith child has happiness value happiness[i].
     * You want to select k children from these n children in k turns.
     * <p>
     * In each turn, when you select a child, the happiness value of all the children that have not been selected till now decreases by 1.
     * Note that the happiness value cannot become negative and gets decremented only if it is positive.
     * <p>
     * Return the maximum sum of the happiness values of the selected children you can achieve by selecting k children.
     *
     * @param happiness an integer array.
     * @param k         children to select.
     * @return Example 1:
     * <p>
     * Input: happiness = [1,2,3], k = 2
     * Output: 4
     * Explanation: We can pick 2 children in the following way:
     * - Pick the child with the happiness value == 3. The happiness value of the remaining children becomes [0,1].
     * - Pick the child with the happiness value == 1. The happiness value of the remaining child becomes [0].
     * Note that the happiness value cannot become less than 0.
     * The sum of the happiness values of the selected children is 3 + 1 = 4.
     */
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum = happiness[happiness.length - 1];
        int count = 1;
        while (count < k) {
            if ((happiness[happiness.length - 1 - count] - count) > 0) {
                sum += happiness[happiness.length - 1 - count] - count;
            }
            count++;
        }
        return sum;
    }
}
