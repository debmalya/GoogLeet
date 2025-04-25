package daily.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountLargestGroupTest {

  @Test
  void countLargestGroup() {
    var clg = new CountLargestGroup();
    assertEquals(4, clg.countLargestGroup(13));
    assertEquals(2, clg.countLargestGroup(2));
  }
}
