package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AnagramInMinimumStepsTest {

    AnagramInMinimumSteps anagramInMinimumSteps = new AnagramInMinimumSteps();

    @Test
    void minSteps() {
        assertEquals(1, anagramInMinimumSteps.minSteps("bab", "aba"));
        assertEquals(5, anagramInMinimumSteps.minSteps("leetcode", "practice"));
        assertEquals(0, anagramInMinimumSteps.minSteps("anagram", "mangaar"));
    }

    @Test
    void minStepsOwn() {
        assertEquals(1, anagramInMinimumSteps.minSteps("jash", "dash"));
    }
}