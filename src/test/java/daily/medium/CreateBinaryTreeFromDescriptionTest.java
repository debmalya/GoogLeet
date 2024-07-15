package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CreateBinaryTreeFromDescriptionTest {

  CreateBinaryTreeFromDescription createBinaryTreeFromDescription =
      new CreateBinaryTreeFromDescription();

  @Test
  void createBinaryTree() {
    var root =
        createBinaryTreeFromDescription.createBinaryTree(
            new int[][] {{20, 15, 1}, {20, 17, 0}, {50, 20, 1}, {50, 80, 0}});
    assertNotNull(root);
    assertEquals(50, root.val);
  }
}
