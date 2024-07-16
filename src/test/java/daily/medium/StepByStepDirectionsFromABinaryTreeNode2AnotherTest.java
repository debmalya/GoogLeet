package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import btree.TreeNode;
import org.junit.jupiter.api.Test;

class StepByStepDirectionsFromABinaryTreeNode2AnotherTest {

  StepByStepDirectionsFromABinaryTreeNode2Another stepByStepDirectionsFromABinaryTreeNode2Another =
      new StepByStepDirectionsFromABinaryTreeNode2Another();

  @Test
  void getDirections() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(1);
    root.left.right = new TreeNode(3);
    root.right = new TreeNode(2);
    root.right.left = new TreeNode(6);
    root.right.right = new TreeNode(4);
    assertEquals("UURL", stepByStepDirectionsFromABinaryTreeNode2Another.getDirections(root, 3, 6));
  }
}
