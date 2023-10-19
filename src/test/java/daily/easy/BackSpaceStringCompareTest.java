package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackSpaceStringCompareTest {

    BackSpaceStringCompare backSpaceStringCompare = new BackSpaceStringCompare();

    @Test
    void backspaceCompare() {
        assertTrue(backSpaceStringCompare.backspaceCompare("ab#c", "ad#c"));
        assertTrue(backSpaceStringCompare.backspaceCompare("ab##", "c#d#"));
        assertFalse(backSpaceStringCompare.backspaceCompare("a#c", "b"));
    }

    @Test
    void handleBackSpace() {
        assertEquals("ac", backSpaceStringCompare.handleBackSpace("ad#c"));
        assertEquals("", backSpaceStringCompare.handleBackSpace("ab##"));
        assertEquals("c", backSpaceStringCompare.handleBackSpace("a#c"));
    }
}