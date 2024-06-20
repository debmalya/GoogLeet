package daily.medium;

public class MinimumNumberOfDaysToMakeMBouquets {
  /**
   * You are given an integer array bloomDay, an integer m and an integer k.
   *
   * <p>You want to make m bouquets. To make a bouquet, you need to use k adjacent flowers from the
   * garden.
   *
   * <p>The garden consists of n flowers, the ith flower will bloom in the bloomDay[i] and then can
   * be used in exactly one bouquet.
   *
   * <p>Return the minimum number of days you need to wait to be able to make m bouquets from the
   * garden. If it is impossible to make m bouquets return -1.
   *
   * @param bloomDay
   * @param m
   * @param k
   * @return
   */
  public int minDays(int[] bloomDay, int m, int k) {
    if ((long) m * k > bloomDay.length) {
      return -1;
    }

    int low = 1, high = (int) 1e9;
    while (low < high) {
      int mid = low + (high - low) / 2;

      if (isPossibleBouquets(bloomDay, m, k, mid)) {
        high = mid;
      } else {
        low = mid + 1;
      }
    }

      return low;
  }
  private boolean isPossibleBouquets(int[] bloomDay, int m, int k, int day) {
    int total = 0;

    for (int i = 0; i < bloomDay.length; i++) {
      int count = 0;
      while (i < bloomDay.length && count < k && bloomDay[i] <= day) {
        count++;
        i++;
      }

      if (count == k) {
        total++;
        i--;
      }

      if (total >= m) {
        return true;
      }
    }

    return false;
  }
}
