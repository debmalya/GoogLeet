package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AlternateGroupsIITest {
  AlternateGroupsII ag = new AlternateGroupsII();

  @Test
  void numberOfAlternatingGroups() {
    int[] colors = {0, 1, 0, 1, 0};
    var k = 3;
    var expected = 3;
    var actual = ag.numberOfAlternatingGroups(colors, k);
    assertEquals(expected, actual);

    colors = new int[] {0, 1, 0, 0, 1, 0, 1};
    k = 6;
    expected = 2;
    actual = ag.numberOfAlternatingGroups(colors, k);
    assertEquals(expected, actual);

    colors = new int[] {1, 1, 0, 1};
    k = 4;
    expected = 0;
    actual = ag.numberOfAlternatingGroups(colors, k);
    assertEquals(expected, actual);
  }
}
