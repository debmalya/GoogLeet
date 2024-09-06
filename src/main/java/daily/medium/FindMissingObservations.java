package daily.medium;

public class FindMissingObservations {
  /**
   * You have observations of n + m 6-sided dice rolls with each face numbered from 1 to 6. n of the
   * observations went missing, and you only have the observations of m rolls. Fortunately, you have
   * also calculated the average value of the n + m rolls.
   *
   * <p>You are given an integer array rolls of length m where rolls[i] is the value of the ith
   * observation. You are also given the two integers mean and n.
   *
   * <p>Return an array of length n containing the missing observations such that the average value
   * of the n + m rolls is exactly mean. If there are multiple valid answers, return any of them. If
   * no such array exists, return an empty array.
   *
   * <p>The average value of a set of k numbers is the sum of the numbers divided by k.
   *
   * <p>Note that mean is an integer, so the sum of the n + m rolls should be divisible by n + m.
   *
   * @param rolls - an integer array.
   * @param mean - an integer.
   * @param n - an integer.
   * @return - an integer array.
   */
  public int[] missingRolls(int[] rolls, int mean, int n) {
    int m = rolls.length;
    int totalSum = mean * (n + m);
    int observedSum = 0;

    for (int roll : rolls) {
      observedSum += roll;
    }

    int missingSum = totalSum - observedSum;

    // Check if it's possible to distribute missingSum across n rolls
    if (missingSum < n || missingSum > 6 * n) {
      return new int[0]; // return empty array
    }

    // Distribute missingSum across n rolls
    int quotient = missingSum / n;
    int remainder = missingSum % n;

    int[] result = new int[n];
    for (int i = 0; i < n; i++) {
      result[i] = quotient;
    }

    // Distribute the remainder
    for (int i = 0; i < remainder; i++) {
      result[i]++;
    }

    return result;
  }
}
