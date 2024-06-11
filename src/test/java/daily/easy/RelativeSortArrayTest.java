package daily.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RelativeSortArrayTest {

  RelativeSortArray relativeSortArray = new RelativeSortArray();

  @Test
  void relativeSortArray() {
    var expected = new int[] {2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19};
    var actual =
        relativeSortArray.relativeSortArray(
            new int[] {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[] {2, 1, 4, 3, 9, 6});
    assertArrayEquals(expected, actual);

    expected = new int[] {22, 28, 8, 6, 17, 44};
    actual =
        relativeSortArray.relativeSortArray(
            new int[] {28, 6, 22, 8, 44, 17}, new int[] {22, 28, 8, 6});
    assertArrayEquals(expected, actual);
  }
}
