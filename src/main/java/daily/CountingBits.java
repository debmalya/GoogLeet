package daily;

public class CountingBits {
    /**
     * Given an integer n, return an array ans of length n + 1
     * such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
     *
     * @param n
     * @return
     */
    public int[] countBits(int n) {

        int[] ans = new int[n + 1];
        ans[0] = 0;
        for (int i = 1; i < n + 1; i++) {
            ans[i] = Integer.bitCount(i);
        }
        return ans;

    }
}
