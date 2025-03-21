package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountofSubstringsContainingEveryVowelandKConsonants3306Test {
  CountofSubstringsContainingEveryVowelandKConsonants3306
      countofSubstringsContainingEveryVowelandKConsonants3306 =
          new CountofSubstringsContainingEveryVowelandKConsonants3306();

  @Test
  void countVowelSubstrings() {
    var actual =
        countofSubstringsContainingEveryVowelandKConsonants3306.countOfSubstrings("aeioqq", 1);
    assertEquals(0, actual);
    actual =
        countofSubstringsContainingEveryVowelandKConsonants3306.countOfSubstrings(
            "ieaouqqieaouqq", 1);
    assertEquals(3, actual);
    actual =
        countofSubstringsContainingEveryVowelandKConsonants3306.countOfSubstrings(
            "ieaouqqieaouqq", 1);
    assertEquals(3, actual);
  }
}
