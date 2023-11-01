package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindTheOriginalArrayOfPrefixXorTest {

    FindTheOriginalArrayOfPrefixXor findTheOriginalArrayOfPrefixXor = new FindTheOriginalArrayOfPrefixXor();

    @Test
    void findArray() {
        int[] actual = findTheOriginalArrayOfPrefixXor.findArray(new int[]{5, 2, 0, 3, 1});
        int[] expected = new int[]{5, 7, 2, 3, 2};
        assertArrayEquals(expected, actual);
    }
}