package daily.medium;

public class CountTheHiddenSequences {
  /**
   * 2145. Count the Hidden Sequences You are given a 0-indexed array of n integers differences,
   * which describes the differences between each pair of consecutive integers of a hidden sequence
   * of length (n + 1). More formally, call the hidden sequence hidden, then we have that
   * differences[i] = hidden[i + 1] - hidden[i].
   *
   * <p>You are further given two integers lower and upper that describe the inclusive range of
   * values [lower, upper] that the hidden sequence can contain.
   *
   * <p>For example, given differences = [1, -3, 4], lower = 1, upper = 6, the hidden sequence is a
   * sequence of length 4 whose elements are in between 1 and 6 (inclusive). [3, 4, 1, 5] and [4, 5,
   * 2, 6] are possible hidden sequences. [5, 6, 3, 7] is not possible since it contains an element
   * greater than 6. [1, 2, 3, 4] is not possible since the differences are not correct.
   *
   * @param differences the differences between each pair of consecutive integers of a hidden sequence of length (n + 1).
   * @param lower range of values.
   * @param upper range of values.
   * @return the number of possible hidden sequences there are. If there are no possible sequences, return 0.
   */
  public int numberOfArrays(int[] differences, int lower, int upper) {
    long min = 0, max = 0, sum = 0;
    for (int diff : differences) {
      sum += diff;
      min = Math.min(min, sum);
      max = Math.max(max, sum);
    }
    return (int) Math.max(0, (upper - lower) - (max - min) + 1);
  }
}
