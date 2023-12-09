package daily.easy;

import btree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstructStringFromBinaryTreeTest {
    ConstructStringFromBinaryTree constructStringFromBinaryTree = new ConstructStringFromBinaryTree();

    @Test
    void tree2str() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.right = new TreeNode(3);
        assertEquals("1(2(4))(3)", constructStringFromBinaryTree.tree2str(root));
    }
}