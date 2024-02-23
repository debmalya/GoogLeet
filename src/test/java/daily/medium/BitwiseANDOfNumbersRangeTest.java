package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BitwiseANDOfNumbersRangeTest {

    BitwiseANDOfNumbersRange bitwiseANDOfNumbersRange = new BitwiseANDOfNumbersRange();

    @Test
    void rangeBitwiseAnd() {
        assertEquals(4, bitwiseANDOfNumbersRange.rangeBitwiseAnd(5, 7));
        assertEquals(0, bitwiseANDOfNumbersRange.rangeBitwiseAnd(0, 0));
        assertEquals(0, bitwiseANDOfNumbersRange.rangeBitwiseAnd(1, 2));
        assertEquals(0, bitwiseANDOfNumbersRange.rangeBitwiseAnd(1, 3));
        assertEquals(0, bitwiseANDOfNumbersRange.rangeBitwiseAnd(2, 4));
        assertEquals(0, bitwiseANDOfNumbersRange.rangeBitwiseAnd(1, 2147483647));
        assertEquals(0, bitwiseANDOfNumbersRange.rangeBitwiseAnd(1073741824, 2147483647));
    }
}