package daily.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RankTransformTest {

  RankTransform rankTransform = new RankTransform();

  @Test
  void arrayRankTransform() {
    var actual = rankTransform.arrayRankTransform(new int[] {40, 10, 20, 30});
    var expected = new int[] {4, 1, 2, 3};
    assertArrayEquals(expected, actual);
  }

  @Test
  void arrayRankTransformMultiOccurence() {
    var actual = rankTransform.arrayRankTransform(new int[] {100, 100, 100});
    var expected = new int[] {1, 1, 1};
    assertArrayEquals(expected, actual);
  }
}
