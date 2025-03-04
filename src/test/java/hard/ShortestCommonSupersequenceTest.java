package hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShortestCommonSupersequenceTest {

  @Test
  void shortestCommonSupersequence() {
    assertEquals(
        "cabac", new ShortestCommonSupersequence().shortestCommonSupersequence("abac", "cab"));
    assertEquals(
        "aaaaaaaa",
        new ShortestCommonSupersequence().shortestCommonSupersequence("aaaaaaaa", "aaaaaaaa"));
  }
}
