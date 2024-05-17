package daily.easy;

import btree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EvaluateBooleanBinaryTreeTest {

    EvaluateBooleanBinaryTree evaluateBooleanBinaryTree = new EvaluateBooleanBinaryTree();

    @Test
    void evaluateTree() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(0);
        assertTrue(evaluateBooleanBinaryTree.evaluateTree(root));

        root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(0);
        root.right.left = new TreeNode(1);

        assertTrue(evaluateBooleanBinaryTree.evaluateTree(root));
    }
}