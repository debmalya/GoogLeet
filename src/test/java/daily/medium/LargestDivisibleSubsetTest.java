package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestDivisibleSubsetTest {

    LargestDivisibleSubset largestDivisibleSubset = new LargestDivisibleSubset();

    @Test
    void largestDivisibleSubset() {
        var list = largestDivisibleSubset.largestDivisibleSubset0(new int[]{1, 2, 3});
        assertEquals(2, list.size());
    }

    @Test
    void fromActualTest() {
        var list = largestDivisibleSubset.largestDivisibleSubset(new int[]{5, 9, 18, 54, 108, 540, 90, 180, 360, 720});
        System.out.println(list);
        assertEquals(6, list.size());
    }
}