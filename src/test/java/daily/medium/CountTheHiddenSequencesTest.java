package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountTheHiddenSequencesTest {

  @Test
  void numberOfArrays() {
    CountTheHiddenSequences countTheHiddenSequences = new CountTheHiddenSequences();
    int[] differences = {1, -3, 4};
    int lower = 1;
    int upper = 6;
    int expected = 2;
    int actual = countTheHiddenSequences.numberOfArrays(differences, lower, upper);
    assertEquals(expected, actual);
  }
}
