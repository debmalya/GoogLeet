package daily.medium;

public class SumOfPowerOfThree {
  /**
   * 1780. Check if Number is a Sum of Powers of Three
   *
   * @param n Given an integer.
   * @return true if it is possible to represent n as the sum of distinct powers of three.
   *     Otherwise, return false.
   */
  public boolean checkPowersOfThree(int n) {
    while (n > 0) {
      if (n % 3 == 2) {
        return false;
      }
      n /= 3;
    }
    return true;
  }
}
