package googleeet.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindUniqueBinaryStringTest {

  @Test
  void findDifferentBinaryString() {
    var nums = new String[] {"111", "011", "001"};
    var expected = "000";
    assertEquals(expected, new FindUniqueBinaryString().findDifferentBinaryString(nums));

    nums = new String[] {"01", "10"};
    expected = "00";
    assertEquals(expected, new FindUniqueBinaryString().findDifferentBinaryString(nums));
  }
}
