package daily.medium;


import btree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class EvenOddTreeTest {

    EvenOddTree evenOddTree = new EvenOddTree();

    @Test
    void isEvenOddTree() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(7);
        assertFalse(evenOddTree.isEvenOddTree(root));
    }

 
}