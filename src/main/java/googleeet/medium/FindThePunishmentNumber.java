package googleeet.medium;

public class FindThePunishmentNumber {
  /**
   * Given a positive integer n, return the punishment number of n.
   *
   * <p>The punishment number of n is defined as the sum of the squares of all integers i such that:
   *
   * <p>1 <= i <= n The decimal representation of i * i can be partitioned into contiguous
   * substrings such that the sum of the integer values of these substrings equals i.
   *
   * @param n - positive integer.
   * @return
   */
  public int punishmentNumber(int n) {
    // to store punishment number
    int punishmentNum = 0;

    // traverse the array
    for (int curr = 1; curr <= n; curr++) {

      // finding square
      int square = curr * curr;

      if (canPartition(square, curr)) punishmentNum += square;
    }

    return punishmentNum;
  }

  public boolean canPartition(int num, int target) {
    // invalid
    if (num < target || target < 0) return false;

    if (num == target) return true;

    return (canPartition(num / 10, target - (num % 10))
        || canPartition(num / 100, target - (num % 100))
        || canPartition(num / 1000, target - (num % 1000)));
  }
}
