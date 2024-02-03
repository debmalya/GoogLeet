package googleeet.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PartitioningArr4MaxSumTest {

    PartitioningArr4MaxSum partitioningArr4MaxSum = new PartitioningArr4MaxSum();

    @Test
    void maxSumAfterPartitioning() {
        assertEquals(84, partitioningArr4MaxSum.maxSumAfterPartitioning(new int[]{1, 15, 7, 9, 2, 5, 10}, 3));
    }
}