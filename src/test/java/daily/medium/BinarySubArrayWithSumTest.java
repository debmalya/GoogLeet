package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySubArrayWithSumTest {

    BinarySubArrayWithSum binarySubArrayWithSum = new BinarySubArrayWithSum();

    @Test
    void numSubarraysWithSum() {
        assertEquals(4, binarySubArrayWithSum.numSubarraysWithSum(new int[]{0, 1, 0, 1}, 2));
    }
}