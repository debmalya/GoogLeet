package daily.easy;

public class SignOfFour {
    /**
     * Given an integer n, return true if it is a power of four. Otherwise, return false.
     *
     * @param n An integer n is a power of four, if there exists an integer x such that n == 4x.
     * @return return true if it is a power of four. Otherwise, false.
     */
    public boolean isPowerOfFour(int n) {
        int mask = 0x55555555;
        return n > 0 && (n & (n - 1)) == 0 && (n & mask) == n;
    }

    public boolean isPowerOfFour0(int n) {
        if (n <= 0) {
            return false;
        }
        n = Math.abs(n);
        while (n > 1) {
            if (n % 4 != 0) {
                return false;
            }
            n /= 4;
        }

        return true;
    }
}
