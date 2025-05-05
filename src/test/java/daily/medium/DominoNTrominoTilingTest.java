package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DominoNTrominoTilingTest {

  @Test
  void numTilings() {
    DominoNTrominoTiling dominoNTrominoTiling = new DominoNTrominoTiling();
    assertEquals(5, dominoNTrominoTiling.numTilings(3));
  }
}
