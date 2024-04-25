package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestIdealSubsequenceTest {

    LongestIdealSubsequence longestIdealSubsequence = new LongestIdealSubsequence();

    @Test
    void longestIdealString() {
        assertEquals(2, longestIdealSubsequence.longestIdealString("pvjcci", 4));
        assertEquals(4, longestIdealSubsequence.longestIdealString("acfgbd", 2));
    }
}