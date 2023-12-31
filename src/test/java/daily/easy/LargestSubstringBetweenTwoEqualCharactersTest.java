package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestSubstringBetweenTwoEqualCharactersTest {
    LargestSubstringBetweenTwoEqualCharacters largestSubstringBetweenTwoEqualCharacters = new LargestSubstringBetweenTwoEqualCharacters();


    @Test
    void maxLengthBetweenEqualCharacters() {
        assertEquals(2, largestSubstringBetweenTwoEqualCharacters.maxLengthBetweenEqualCharacters("abca"));
        assertEquals(-1, largestSubstringBetweenTwoEqualCharacters.maxLengthBetweenEqualCharacters("a"));
    }
}