package hard;

import java.util.*;

public class BuildAMatrixWithCondition {
  /**
   * You are given a positive integer k. You are also given:
   *
   * <p>a 2D integer array rowConditions of size n where rowConditions[i] = [abovei, belowi], and a
   * 2D integer array colConditions of size m where colConditions[i] = [lefti, righti].
   *
   * <p>The two arrays contain integers from 1 to k.
   *
   * <p>You have to build a k x k matrix that contains each of the numbers from 1 to k exactly once.
   * The remaining cells should have the value 0.
   *
   * <p>The matrix should also satisfy the following conditions:
   *
   * <p>The number abovei should appear in a row that is strictly above the row at which the number
   * belowi appears for all i from 0 to n - 1. The number lefti should appear in a column that is
   * strictly left of the column at which the number righti appears for all i from 0 to m - 1.
   * Return any matrix that satisfies the conditions. If no answer exists, return an empty matrix.
   *
   * @param k - positive integer.
   * @param rowConditions - 2D integer array.
   * @param colConditions - 2D integer array.
   * @return - k X k matrix.
   */
  public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
    List<Integer> order1 = GenerateTopologicalSort(rowConditions, k);
    List<Integer> order2 = GenerateTopologicalSort(colConditions, k);
    if (order1.size() < k || order2.size() < k) return new int[0][0];
    Map<Integer, Integer> m = new HashMap();
    for (int i = 0; i < k; i++) m.put(order2.get(i), i);
    int[][] ans = new int[k][k];
    for (int i = 0; i < k; i++) ans[i][m.get(order1.get(i))] = order1.get(i);
    return ans;
  }

  private List<Integer> GenerateTopologicalSort(int[][] A, int k) {
    int[] deg = new int[k];
    List<Integer> order = new ArrayList();
    List<List<Integer>> graph = new ArrayList();
    for (int i = 0; i < k; i++) graph.add(new ArrayList());
    Queue<Integer> q = new LinkedList();
    for (int[] c : A) {
      graph.get(c[0] - 1).add(c[1] - 1);
      deg[c[1] - 1]++;
    }
    for (int i = 0; i < k; i++) if (deg[i] == 0) q.add(i);
    while (!q.isEmpty()) {
      int x = q.poll();
      order.add(x + 1);
      for (int y : graph.get(x)) if (--deg[y] == 0) q.add(y);
    }
    return order;
  }
}
