package daily.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountPrefixNSuffixPairsITest {

  CountPrefixNSuffixPairsI c = new CountPrefixNSuffixPairsI();

  @Test
  void countPrefixSuffixPairs() {
      // write unit test
      assertEquals(4, c.countPrefixSuffixPairs(new String[]{"a","aba","ababa","aa"}));
  }
}
