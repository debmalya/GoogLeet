package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindTheLengthofTheLongestCommonPrefixTest {

  FindTheLengthofTheLongestCommonPrefix findTheLengthofTheLongestCommonPrefix =
      new FindTheLengthofTheLongestCommonPrefix();

  @Test
  void longestCommonPrefix() {
    assertEquals(
        3,
        findTheLengthofTheLongestCommonPrefix.longestCommonPrefix(
            new int[] {1, 10, 100}, new int[] {1000}));
  }
}
