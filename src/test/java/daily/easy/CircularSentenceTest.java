package daily.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CircularSentenceTest {

  CircularSentence cs = new CircularSentence();

  @Test
  void isCircularSentence1() {
    assertTrue(cs.isCircularSentence("leetcode exercises sound delightful"));
  }

  @Test
  void isCircularSentence() {
    assertTrue(cs.isCircularSentence("eetcode"));
  }

  @Test
  void isCircularSentence2() {
    assertFalse(cs.isCircularSentence("Leetcode is cool"));
  }
}
