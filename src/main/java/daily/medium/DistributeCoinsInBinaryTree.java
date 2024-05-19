package daily.medium;

import btree.TreeNode;

public class DistributeCoinsInBinaryTree {
  /**
   * You are given the root of a binary tree with n nodes where each node in the tree has node.val
   * coins. There are n coins in total throughout the whole tree.
   *
   * <p>In one move, we may choose two adjacent nodes and move one coin from one node to another. A
   * move may be from parent to child, or from child to parent.
   *
   * <p>Return the minimum number of moves required to make every node have exactly one coin.
   *
   * @param root
   * @return
   */
  public int ans;

  public int distributeCoins(TreeNode root) {
    ans = 0;
    countSteps(root);
    return ans;
  }

  public int countSteps(TreeNode root) {
    if (root == null) return 0;
    int leftCoins = countSteps(root.left);
    int rightCoins = countSteps(root.right);
    ans += Math.abs(leftCoins) + Math.abs(rightCoins);
    return (root.val - 1) + leftCoins + rightCoins;
  }
}
