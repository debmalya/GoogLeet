package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import btree.TreeNode;
import org.junit.jupiter.api.Test;

class DistributeCoinsInBinaryTreeTest {
  DistributeCoinsInBinaryTree distributeCoinsInBinaryTree = new DistributeCoinsInBinaryTree();

  @Test
  void distributeCoins() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(0);
    root.right = new TreeNode(0);

    assertEquals(2,distributeCoinsInBinaryTree.distributeCoins(root));
  }
}
