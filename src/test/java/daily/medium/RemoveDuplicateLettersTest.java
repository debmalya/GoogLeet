package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveDuplicateLettersTest {

    RemoveDuplicateLetters removeDuplicateLetters = new RemoveDuplicateLetters();

    @Test
    void removeDuplicateLetters() {
        assertEquals("za", removeDuplicateLetters.removeDuplicateLetters("zzzza"));
    }

    @Test
    void removeDuplicateLetters0() {
        assertEquals("abc", removeDuplicateLetters.removeDuplicateLetters0("bcabc"));
        assertEquals("acdb", removeDuplicateLetters.removeDuplicateLetters0("cbacdcbc"));
    }
}