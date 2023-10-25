package daily.medium;

import btree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindLargestValueInEachRowTest {

    FindLargestValueInEachRow findLargestValueInEachRow = new FindLargestValueInEachRow();

    @Test
    void largestValues0() {
        var root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);
        var maxPerRow = findLargestValueInEachRow.largestValues0(root);
        assertEquals(1, maxPerRow.get(0));
        assertEquals(3, maxPerRow.get(1));
        assertEquals(9, maxPerRow.get(2));
    }

    @Test
    void largestValues() {
        var root = new TreeNode(1);
        root.left = new TreeNode(3);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.right = new TreeNode(9);
        var maxPerRow = findLargestValueInEachRow.largestValues(root);
        assertEquals(1, maxPerRow.get(0));
        assertEquals(3, maxPerRow.get(1));
        assertEquals(9, maxPerRow.get(2));
    }
}