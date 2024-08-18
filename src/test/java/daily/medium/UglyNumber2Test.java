package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UglyNumber2Test {

  UglyNumber2 uglyNumber2 = new UglyNumber2();

  @Test
  void nthUglyNumber() {
    assertEquals(12, uglyNumber2.nthUglyNumber(10));
  }
}
