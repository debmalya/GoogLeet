package daily.medium;

public class DominoNTrominoTiling {
  /**
   * 790. Domino and Tromino Tiling You have two types of tiles: a 2 x 1 domino shape and a tromino
   * shape. You may rotate these shapes.
   *
   * <p>Given an integer n, return the number of ways to tile an 2 x n board. Since the answer may
   * be very large, return it modulo 10**9 + 7.
   *
   * <p>In a tiling, every square must be covered by a tile. Two tilings are different if and only
   * if there are two 4-directionally adjacent cells on the board such that exactly one of the
   * tilings has both squares occupied by a tile.
   *
   * @param n number of columns
   * @return number of ways to tile an 2 x n board.
   */
  public int numTilings(int n) {
    int mod = 1000000007;
    if (n <= 2) return n;
    int[] f = new int[n + 1];
    f[0] = 0;
    f[1] = 1;
    f[2] = 2;
    f[3] = 5;
    for (int i = 4; i <= n; ++i) {
      f[i] = 2 * f[i - 1] % mod + f[i - 3] % mod;
      f[i] %= mod;
    }
    return f[n];
  }
}
