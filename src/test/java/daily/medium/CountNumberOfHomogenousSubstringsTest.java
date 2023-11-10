package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountNumberOfHomogenousSubstringsTest {

    CountNumberOfHomogenousSubstrings countNumberOfHomogenousSubstrings = new CountNumberOfHomogenousSubstrings();

    @Test
    void countHomogenous() {
        assertEquals(13, countNumberOfHomogenousSubstrings.countHomogenous("abbcccaa"));
        assertEquals(2, countNumberOfHomogenousSubstrings.countHomogenous("xy"));
    }
}