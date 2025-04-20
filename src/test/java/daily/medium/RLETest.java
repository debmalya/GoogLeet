package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RLETest {

  @Test
  void countAndSay() {
    RLE rle = new RLE();
    assertEquals("1", rle.countAndSay(1));
    assertEquals("11", rle.countAndSay(2));
    assertEquals("21", rle.countAndSay(3));
    assertEquals("1211", rle.countAndSay(4));
    assertEquals("111221", rle.countAndSay(5));
  }
}
