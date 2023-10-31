package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortIntegersByTheNumberOf1BitsTest {

    SortIntegersByTheNumberOf1Bits sortIntegersByTheNumberOf1Bits = new SortIntegersByTheNumberOf1Bits();

    @Test
    void sortByBits() {
        int[] expected = new int[]{0, 1, 2, 4, 8, 3, 5, 6, 7};
        assertArrayEquals(expected, sortIntegersByTheNumberOf1Bits.sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}));
        expected = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        assertArrayEquals(expected, sortIntegersByTheNumberOf1Bits.sortByBits(new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1}));
    }

    @Test
    void sortByBits0() {
        int[] expected = new int[]{0, 1, 2, 4, 8, 3, 5, 6, 7};
        assertArrayEquals(expected, sortIntegersByTheNumberOf1Bits.sortByBits0(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}));
        expected = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};
        assertArrayEquals(expected, sortIntegersByTheNumberOf1Bits.sortByBits0(new int[]{1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1}));
    }

}