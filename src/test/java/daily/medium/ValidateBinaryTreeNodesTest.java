package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ValidateBinaryTreeNodesTest {

    ValidateBinaryTreeNodes validateBinaryTreeNodes = new ValidateBinaryTreeNodes();

    @Test
    void validateBinaryTreeNodes0() {
        assertTrue(validateBinaryTreeNodes.validateBinaryTreeNodes0(4, new int[]{1, -1, 3, -1}, new int[]{2, -1, -1, -1}));
        assertFalse(validateBinaryTreeNodes.validateBinaryTreeNodes0(4, new int[]{1, -1, 3, -1}, new int[]{2, 3, -1, -1}));
        assertFalse(validateBinaryTreeNodes.validateBinaryTreeNodes0(2, new int[]{1, 0}, new int[]{-1, -1}));
    }

    @Test
    void validateBinaryTreeNodes() {
        assertTrue(validateBinaryTreeNodes.validateBinaryTreeNodes(4, new int[]{1, -1, 3, -1}, new int[]{2, -1, -1, -1}));
        assertFalse(validateBinaryTreeNodes.validateBinaryTreeNodes(4, new int[]{1, -1, 3, -1}, new int[]{2, 3, -1, -1}));
        assertFalse(validateBinaryTreeNodes.validateBinaryTreeNodes(2, new int[]{1, 0}, new int[]{-1, -1}));
    }
}