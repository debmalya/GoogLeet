package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReorganizeStringTest {

    ReorganizeString reorganizeString = new ReorganizeString();

    @Test
    void reorganizeString() {
        assertEquals("", reorganizeString.reorganizeString("aaab"));
        assertEquals("aba", reorganizeString.reorganizeString("aab"));
        assertEquals("ababab", reorganizeString.reorganizeString("ababab"));
    }
}