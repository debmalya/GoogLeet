package daily.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveElementTest {

  @Test
  void removeElement() {
    RemoveElement removeElement = new RemoveElement();
    int[] nums = {3, 2, 2, 3};
    int val = 3;
    int expected = 2;
    int actual = removeElement.removeElement(nums, val);
    assertEquals(expected, actual);
    assertAll(
        () -> assertEquals(2, nums[0], "index 0 does not match. expected 2."),
        () -> assertEquals(2, nums[1], "index 1 does not match. expected 2."));
  }

  @Test
  void removeElement1() {
    RemoveElement removeElement = new RemoveElement();
    int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
    int val = 2;
    int expected = 5;
    int actual = removeElement.removeElement(nums, val);
    assertEquals(expected, actual);
    assertAll(
        () -> assertEquals(0, nums[0], "index 0 does not match. expected 0."),
        () -> assertEquals(1, nums[1], "index 1 does not match. expected 1"),
        () -> assertEquals(3, nums[2], "index 2 does not match. expected 3"),
        () -> assertEquals(0, nums[3], "index 3 does not match. expected 0"),
        () -> assertEquals(4, nums[4], "index 4 does not match. expected 4"));
  }
}
