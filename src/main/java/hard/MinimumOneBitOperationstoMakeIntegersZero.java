package hard;

public class MinimumOneBitOperationstoMakeIntegersZero {
    /**
     * @param n Given an integer n, you must transform it into 0 using the following operations any number of times:
     *          Change the rightmost (0th) bit in the binary representation of n.
     *          Change the ith bit in the binary representation of n
     *          if the (i-1)th bit is set to 1 and the (i-2)th through 0th bits are set to 0.
     * @return the minimum number of operations to transform n into 0.
     */
    
    public int minimumOneBitOperations(int n) {
        int multiplier = 1;
        int res = 0;
        while (n > 0) {
            res += n ^ (n - 1) * multiplier;
            multiplier = -1 * multiplier;
            n &= n - 1;
        }
        return Math.abs(res);
    }
}
