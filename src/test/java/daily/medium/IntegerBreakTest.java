package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IntegerBreakTest {

    IntegerBreak integerBreak = new IntegerBreak();

    @Test
    void integerBreak() {
        assertEquals(1, integerBreak.integerBreak(2));
        assertEquals(36, integerBreak.integerBreak(10));
    }
}