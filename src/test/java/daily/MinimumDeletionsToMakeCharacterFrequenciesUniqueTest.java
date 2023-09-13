package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumDeletionsToMakeCharacterFrequenciesUniqueTest {
    MinimumDeletionsToMakeCharacterFrequenciesUnique minimumDeletionsToMakeCharacterFrequenciesUnique = new MinimumDeletionsToMakeCharacterFrequenciesUnique();

    @Test
    void minDeletions() {
        assertEquals(0, minimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions("aab"));
        assertEquals(2, minimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions("aaabbbcc"));
        assertEquals(2, minimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions("ceabaacb"));
        assertEquals(6, minimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions("aaaabbbbccccdddd"));
    }

    @Test
    void minDeletions0() {
        assertEquals(0, minimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions0("aab"));
        assertEquals(2, minimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions0("aaabbbcc"));
        assertEquals(2, minimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions0("ceabaacb"));
        assertEquals(6, minimumDeletionsToMakeCharacterFrequenciesUnique.minDeletions0("aaaabbbbccccdddd"));
    }
}