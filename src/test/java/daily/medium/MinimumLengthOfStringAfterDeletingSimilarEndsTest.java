package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumLengthOfStringAfterDeletingSimilarEndsTest {

    MinimumLengthOfStringAfterDeletingSimilarEnds minimumLengthOfStringAfterDeletingSimilarEnds = new MinimumLengthOfStringAfterDeletingSimilarEnds();

    @Test
    void minimumLength() {
        assertEquals(2, minimumLengthOfStringAfterDeletingSimilarEnds.minimumLength("ca"));
        assertEquals(0, minimumLengthOfStringAfterDeletingSimilarEnds.minimumLength("cabaabac"));
        assertEquals(3, minimumLengthOfStringAfterDeletingSimilarEnds.minimumLength("aabccabba"));
    }

    @Test
    void fromRealTestCase() {
        assertEquals(1, minimumLengthOfStringAfterDeletingSimilarEnds.minimumLength("bbbbbbbbbbbbbbbbbbbbbbbbbbbabbbbbbbbbbbbbbbccbcbcbccbbabbb"));
    }

}