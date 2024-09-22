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

  @Test
  void getFirstDigit() {
    assertEquals(1, kthSmallestLexigographicalOrder.getFirstDigit(13));
    assertEquals(1, kthSmallestLexigographicalOrder.getFirstDigit(10));
    assertEquals(9, kthSmallestLexigographicalOrder.getFirstDigit(9));
  }
}
