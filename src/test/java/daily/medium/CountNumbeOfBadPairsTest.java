package daily.medium;


import static org.junit.jupiter.api.Assertions.*;

import org.testng.annotations.Test;

class CountNumbeOfBadPairsTest {


  @Test
  public void testCountBadPairs() {
    CountNumbeOfBadPairs counter = new CountNumbeOfBadPairs();

    int[] nums1 = {4, 1, 3, 3};
    assertEquals(5, counter.countBadPairs(nums1));

    int[] nums2 = {1, 2, 3, 4, 5};
    assertEquals(0, counter.countBadPairs(nums2));

    int[] nums3 = {5, 4, 3, 2, 1};
    assertEquals(10, counter.countBadPairs(nums3));

    int[] nums4 = {1, 1, 1, 1};
    assertEquals(6, counter.countBadPairs(nums4));
  }
}
