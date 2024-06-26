package daily.medium;

import btree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class BalanceBinarySearchTree {
  public TreeNode balanceBST(TreeNode root) {
    List<TreeNode> nodes = new ArrayList<>();
    inorder(root, nodes);
    return buildTree(nodes, 0, nodes.size() - 1);
  }

  private TreeNode buildTree(List<TreeNode> nodes, int i, int i1) {
    if (i > i1) {
      return null;
    }
    int mid = i + (i1 - i) / 2;
    TreeNode root = nodes.get(mid);
    root.left = buildTree(nodes, i, mid - 1);
    root.right = buildTree(nodes, mid + 1, i1);
    return root;
  }

  private void inorder(TreeNode root, List<TreeNode> nodes) {
    if (root == null) {
      return;
    }
    inorder(root.left, nodes);
    nodes.add(root);
    inorder(root.right, nodes);
  }
}
