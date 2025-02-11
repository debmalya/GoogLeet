package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveAllOccurrencesOfASubstringTest {

  RemoveAllOccurrencesOfASubstring removeAllOccurrencesOfASubstring =
      new RemoveAllOccurrencesOfASubstring();

  @Test
  void removeOccurrences() {
    assertEquals("dab", removeAllOccurrencesOfASubstring.removeOccurrences("daabcbaabcbc", "abc"));
  }
}
