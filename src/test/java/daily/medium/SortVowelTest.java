package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SortVowelTest {

    SortVowel sortVowel = new SortVowel();

    @Test
    void sortVowels() {
        assertEquals("lEOtcede", sortVowel.sortVowels0("lEetcOde"));
        assertEquals("lYmpH", sortVowel.sortVowels0("lYmpH"));
        assertEquals("xXAEIIOUaeioBCDGHuJKLMNPRSTVZWQ", sortVowel.sortVowels0("xXaeiouAEIOUBCDGHIJKLMNPRSTVZWQ"));
    }
}