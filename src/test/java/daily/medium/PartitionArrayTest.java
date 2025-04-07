package daily.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PartitionArrayTest {
  PartitionArray partition = new PartitionArray();

  @Test
  void canPartition() {
    assertTrue(partition.canPartition(new int[] {1, 5, 11, 5}));
    assertFalse(partition.canPartition(new int[] {1, 2, 3, 5}));
  }
}
