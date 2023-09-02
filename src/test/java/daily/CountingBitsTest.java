package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class CountingBitsTest {

    CountingBits countingBits = new CountingBits();

    @Test
    void countBits() {
        int[] ans = countingBits.countBits(2);
        int[] expected = new int[]{0, 1, 1};
        assertArrayEquals(expected, countingBits.countBits(2));
    }
}