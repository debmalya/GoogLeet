package googleeet.medium;

import btree.TreeNode;

public class ConstructBinaryTreeFromPreorderAndPostorderTraversal {
  /**
   * Given two integer arrays, preorder and postorder where preorder is the preorder traversal of a
   * binary tree of distinct values and postorder is the postorder traversal of the same tree,
   * reconstruct and return the binary tree.
   *
   * <p>If there exist multiple answers, you can return any of them. Return any binary tree that
   * matches the given preorder and postorder traversals.
   *
   * @param preorder integer array.
   * @param postorder integer array.
   * @return any binary tree that matches the given preorder and postorder traversals.
   */
  public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
    return constructFromPrePost(
        preorder, 0, preorder.length - 1, postorder, 0, postorder.length - 1);
  }

  private TreeNode constructFromPrePost(
      int[] pre, int preStart, int preEnd, int[] post, int postStart, int postEnd) {
    if (preStart > preEnd) return null;
    TreeNode root = new TreeNode(pre[preStart]);
    if (preStart == preEnd) return root;
    int idx = postStart;
    while (post[idx] != pre[preStart + 1]) idx++;
    int leftSize = idx - postStart + 1;
    root.left = constructFromPrePost(pre, preStart + 1, preStart + leftSize, post, postStart, idx);
    root.right =
        constructFromPrePost(pre, preStart + leftSize + 1, preEnd, post, idx + 1, postEnd - 1);
    return root;
  }
}
