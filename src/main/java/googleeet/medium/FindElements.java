package googleeet.medium;

import btree.TreeNode;

/**
 * Given a binary tree with the following rules:
 *
 * <p>root.val == 0 For any treeNode: If treeNode.val has a value x and treeNode.left != null, then
 * treeNode.left.val == 2 * x + 1 If treeNode.val has a value x and treeNode.right != null, then
 * treeNode.right.val == 2 * x + 2 Now the binary tree is contaminated, which means all treeNode.val
 * have been changed to -1.
 *
 * <p>Implement the FindElements class:
 *
 * <p>FindElements(TreeNode* root) Initializes the object with a contaminated binary tree and
 * recovers it. bool find(int target) Returns true if the target value exists in the recovered
 * binary tree.
 */
public class FindElements {
  TreeNode root;

  public FindElements(TreeNode root) {
    this.root = root;
  }

  public boolean find(int target) {
    String path = Integer.toBinaryString(target + 1);
    TreeNode node = root;
    for (int i = 1; i < path.length(); i++) {
      if (path.charAt(i) == '0') {
        node = node.left;
      } else {
        node = node.right;
      }
      if (node == null) return false;
    }
    return true;
  }
}
