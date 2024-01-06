package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestIncreasingSubsequenceTest {
    LongestIncreasingSubsequence longestIncreasingSubsequence = new LongestIncreasingSubsequence();

    @Test
    void lengthOfLIS0() {
        assertEquals(4, longestIncreasingSubsequence.lengthOfLIS0(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        assertEquals(1, longestIncreasingSubsequence.lengthOfLIS0(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }

    @Test
    void lengthOfLIS1() {
        assertEquals(4, longestIncreasingSubsequence.lengthOfLIS1(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        assertEquals(4, longestIncreasingSubsequence.lengthOfLIS1(new int[]{0, 1, 0, 3, 2, 3}));
        assertEquals(1, longestIncreasingSubsequence.lengthOfLIS1(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }

    @Test
    void lengthOfLIS() {
        assertEquals(4, longestIncreasingSubsequence.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
        assertEquals(4, longestIncreasingSubsequence.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
        assertEquals(1, longestIncreasingSubsequence.lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }
}