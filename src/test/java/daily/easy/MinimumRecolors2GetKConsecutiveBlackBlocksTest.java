package daily.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumRecolors2GetKConsecutiveBlackBlocksTest {

  MinimumRecolors2GetKConsecutiveBlackBlocks minimumRecolors2GetKConsecutiveBlackBlocks =
      new MinimumRecolors2GetKConsecutiveBlackBlocks();

  @Test
  void minimumRecolors() {
    assertEquals(3, minimumRecolors2GetKConsecutiveBlackBlocks.minimumRecolors("WBBWWBBWBW", 7));
    assertEquals(0, minimumRecolors2GetKConsecutiveBlackBlocks.minimumRecolors("WBWBBBW", 2));
  }
}
