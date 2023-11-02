package daily.easy;

import btree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindModeInBinarySearchTreeTest {
    FindModeInBinarySearchTree findModeInBinarySearchTree = new FindModeInBinarySearchTree();

    @Test
    void findMode0() {
        TreeNode root = new TreeNode();
        root.val = 1;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        int[] actual = findModeInBinarySearchTree.findMode0(root);
        int[] expected = new int[]{2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findMode() {
        TreeNode root = new TreeNode();
        root.val = 1;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(2);
        int[] actual = findModeInBinarySearchTree.findMode(root);
        int[] expected = new int[]{2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findModeSingle() {
        TreeNode root = new TreeNode();
        root.val = 1;
        int[] actual = findModeInBinarySearchTree.findMode(root);
        int[] expected = new int[]{1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findModeDouble() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        int[] actual = findModeInBinarySearchTree.findMode(root);
        int[] expected = new int[]{2, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findModeMultipleSameCount0() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        int[] actual = findModeInBinarySearchTree.findMode0(root);
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, actual);
    }

    @Test
    void findModeMultipleSameCount() {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(1);
        root.right.right = new TreeNode(1);
        int[] actual = findModeInBinarySearchTree.findMode(root);
        int[] expected = new int[]{0, 1};
        assertArrayEquals(expected, actual);
    }

}