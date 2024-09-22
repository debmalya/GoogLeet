package hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KthSmallestLexigographicalOrderTest {

  KthSmallestLexigographicalOrder kthSmallestLexigographicalOrder =
      new KthSmallestLexigographicalOrder();

  @Test
  void findKthNumber() {
    assertEquals(10, kthSmallestLexigographicalOrder.findKthNumber(13, 2));
  }
}
