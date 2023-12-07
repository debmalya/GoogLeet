package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargestOddNumOfStringTest {
    LargestOddNumOfString largestOddNumOfString = new LargestOddNumOfString();

    @Test
    void largestOddNumber() {
        assertEquals("35427", largestOddNumOfString.largestOddNumber("35427"));
        assertEquals("", largestOddNumOfString.largestOddNumber("4206"));
    }
}