package daily.medium;

class CheckIfArrayPairsAreDivisibleByK {
  /**
   * Given an array of integers arr of even length n and an integer k.
   *
   * <p>We want to divide the array into exactly n / 2 pairs such that the sum of each pair is
   * divisible by k.
   *
   * @param arr integer array.
   * @param k integer value.
   * @return true If you can find a way to do that or false otherwise.
   */
  public boolean canArrange(int[] arr, int k) {
    int[] frequency = new int[k];
    for (int num : arr) {
      num %= k;
      if (num < 0) num += k;
      frequency[num]++;
    }
    if (frequency[0] % 2 != 0) return false;

    for (int i = 1; i <= k / 2; i++) if (frequency[i] != frequency[k - i]) return false;

    return true;
  }
}
