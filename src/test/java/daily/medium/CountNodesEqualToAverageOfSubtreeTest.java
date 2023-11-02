package daily.medium;

import btree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountNodesEqualToAverageOfSubtreeTest {
    CountNodesEqualToAverageOfSubtree countNodesEqualToAverageOfSubtree = new CountNodesEqualToAverageOfSubtree();

    @Test
    void averageOfSubtreeNull() {
        assertEquals(0, countNodesEqualToAverageOfSubtree.averageOfSubtree(null));
    }

    @Test
    void averageOfSubtree() {
        TreeNode root = new TreeNode(1);
        assertEquals(1, countNodesEqualToAverageOfSubtree.averageOfSubtree(root));
    }

    @Test
    void averageOfSubtreeValues() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(8);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);
        assertEquals(5, countNodesEqualToAverageOfSubtree.averageOfSubtree(root));
    }
}