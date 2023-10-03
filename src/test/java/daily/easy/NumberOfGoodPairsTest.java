package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfGoodPairsTest {
    NumberOfGoodPairs numberOfGoodPairs = new NumberOfGoodPairs();

    @Test
    void numIdenticalPairs() {
        assertEquals(4, numberOfGoodPairs.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}));
        assertEquals(6, numberOfGoodPairs.numIdenticalPairs(new int[]{1, 1, 1, 1}));
        assertEquals(0, numberOfGoodPairs.numIdenticalPairs(new int[]{1, 2, 3}));
    }
}