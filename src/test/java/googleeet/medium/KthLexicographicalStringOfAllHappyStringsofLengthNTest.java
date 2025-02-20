package googleeet.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KthLexicographicalStringOfAllHappyStringsofLengthNTest {

  @Test
  void getHappyString() {
      KthLexicographicalStringOfAllHappyStringsofLengthN test = new KthLexicographicalStringOfAllHappyStringsofLengthN();
      assertEquals("c", test.getHappyString(1,3));
      assertEquals("", test.getHappyString(1,4));
      assertEquals("cab", test.getHappyString(3,9));
      assertEquals("", test.getHappyString(2,7));
      assertEquals("abacbabacb", test.getHappyString(10,100));
  }
}
