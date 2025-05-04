package daily.easy;

public class NoOfDominosPair {
  /**
   * 1128. Number of Equivalent Domino Pairs. Given a list of dominoes, dominoes[i] = [a, b] is
   * equivalent to dominoes[j] = [c, d] if and only if either (a == c and b == d), or (a == d and b
   * == c) - that is, one domino can be rotated to be equal to another domino.
   *
   * <p>Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is
   * equivalent to dominoes[j].
   *
   * @param dominoes list of dominoes.
   * @return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is
   *     equivalent to dominoes[j].
   */
  public int numEquivDominoPairs(int[][] dominoes) {
    int[] count = new int[100];
    int result = 0;
    for (int[] domino : dominoes) {
      int val = domino[0] < domino[1] ? domino[0] * 10 + domino[1] : domino[1] * 10 + domino[0];
      result += count[val];
      count[val]++;
    }
    return result;
  }
}
