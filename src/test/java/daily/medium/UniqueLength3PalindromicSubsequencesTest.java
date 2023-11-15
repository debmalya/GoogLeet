package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class UniqueLength3PalindromicSubsequencesTest {

    UniqueLength3PalindromicSubsequences uniqueLength3PalindromicSubsequences = new UniqueLength3PalindromicSubsequences();

    @Test
    void countPalindromicSubsequence() {
        assertEquals(4, uniqueLength3PalindromicSubsequences.countPalindromicSubsequence0("bbcbaba"));
        assertEquals(0, uniqueLength3PalindromicSubsequences.countPalindromicSubsequence0("adc"));
        assertEquals(3, uniqueLength3PalindromicSubsequences.countPalindromicSubsequence0("aabca"));
    }

    @Test
    void countPalindromicSubsequenceTest() {
        assertEquals(1, uniqueLength3PalindromicSubsequences.countPalindromicSubsequence0("uuuuu"));
    }
}