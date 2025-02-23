package hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecoverPreorderTraversedTreeTest {
  RecoverPreorderTraversedTree recoverPreorder = new RecoverPreorderTraversedTree();

  @Test
  void recoverFromPreorder() {
    var actualRoot = recoverPreorder.recoverFromPreorder("1-2--3--4-5--6--7");
    assertNotNull(actualRoot);
    assertEquals(1, actualRoot.val);
    assertNotNull(actualRoot.left);
    assertEquals(2, actualRoot.left.val);
    assertNotNull(actualRoot.right);
    assertEquals(5, actualRoot.right.val);
  }
}
