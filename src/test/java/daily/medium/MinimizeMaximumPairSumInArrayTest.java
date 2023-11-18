package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimizeMaximumPairSumInArrayTest {
    MinimizeMaximumPairSumInArray minimizeMaximumPairSumInArray = new MinimizeMaximumPairSumInArray();

    @Test
    void minPairSum() {
        assertEquals(7, minimizeMaximumPairSumInArray.minPairSum(new int[]{3, 5, 2, 3}));
    }
}