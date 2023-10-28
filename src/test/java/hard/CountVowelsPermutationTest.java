package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountVowelsPermutationTest {

    CountVowelsPermutation countVowelsPermutation = new CountVowelsPermutation();

    @Test
    void countVowelPermutation() {
        assertEquals(5, countVowelsPermutation.countVowelPermutation(1));
        assertEquals(10, countVowelsPermutation.countVowelPermutation(2));
        assertEquals(19, countVowelsPermutation.countVowelPermutation(3));
        assertEquals(68, countVowelsPermutation.countVowelPermutation(5));
    }
}