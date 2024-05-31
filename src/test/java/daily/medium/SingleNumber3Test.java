package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingleNumber3Test {

  @Test
  void singleNumber() {
    SingleNumber3 singleNumber3 = new SingleNumber3();
    assertArrayEquals(new int[] {3, 5}, singleNumber3.singleNumber(new int[] {1, 2, 1, 3, 2, 5}));
    assertArrayEquals(new int[] {-1, 0}, singleNumber3.singleNumber(new int[] {-1, 0}));
    assertArrayEquals(new int[] {0, 1}, singleNumber3.singleNumber(new int[] {1, 0}));
  }
}
