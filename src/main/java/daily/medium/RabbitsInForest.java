package daily.medium;

public class RabbitsInForest {
  /**
   * 781. Rabbits in Forest
   *
   * @param answers
   * @return
   */
  public int numRabbits(int[] answers) {
    int[] count = new int[1000];
    for (int i : answers) count[i]++;
    int ans = 0;
    for (int k = 0; k < 1000; ++k) ans += Math.floorMod(-count[k], k + 1) + count[k];
    return ans;
  }
}
