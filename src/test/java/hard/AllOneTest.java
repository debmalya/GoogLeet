package hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AllOneTest {
  @Test
  void allOneTest() {
    AllOne allOne = new AllOne();
    allOne.inc("hello");
    allOne.inc("hello");
    assertEquals("hello", allOne.getMaxKey());
    allOne.inc("leet");
    assertEquals("hello", allOne.getMaxKey());
    assertEquals("leet", allOne.getMinKey());
    allOne.dec("leet");
    assertEquals("hello", allOne.getMinKey());
  }
}
