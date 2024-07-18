package daily.medium;

import btree.TreeNode;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DeleteNodesReturnForest {

  HashSet<Integer> set = new HashSet<>();
  List<TreeNode> list = new ArrayList<>();

  public List<TreeNode> delNodes(TreeNode root, int[] toDelete) {
    for (int val : toDelete) {
      set.add(val);
    }
    helper(root);
    if (!set.contains(root.val)) {
      list.add(root);
    }
    return list;
  }

  public TreeNode helper(TreeNode node) {
    if (node == null) return null;

    node.left = helper(node.left);
    node.right = helper(node.right);

    if (set.contains(node.val)) {
      if (node.left != null) {
        list.add(node.left);
      }
      if (node.right != null) {
        list.add(node.right);
      }
      return null;
    }
    return node;
  }
}
