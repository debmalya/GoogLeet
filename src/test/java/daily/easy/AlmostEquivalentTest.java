package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AlmostEquivalentTest {
    AlmostEquivalent almostEquivalent = new AlmostEquivalent();

    @Test
    void checkAlmostEquivalent() {
        assertFalse(almostEquivalent.checkAlmostEquivalent("aaaa", "bccb"));
        assertTrue(almostEquivalent.checkAlmostEquivalent("abcdeef", "abaaacc"));
        assertTrue(almostEquivalent.checkAlmostEquivalent("cccddabba", "babababab"));
    }
}