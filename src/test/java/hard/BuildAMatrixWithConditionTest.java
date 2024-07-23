package hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BuildAMatrixWithConditionTest {

  BuildAMatrixWithCondition buildAMatrixWithCondition = new BuildAMatrixWithCondition();

  @Test
  void buildMatrix() {
    var result =
        buildAMatrixWithCondition.buildMatrix(
            3, new int[][] {{1, 2}, {3, 2}}, new int[][] {{2, 1}, {3, 2}});
    assertEquals(3, result.length);
    assertEquals(3, result[0].length);
  }
}
