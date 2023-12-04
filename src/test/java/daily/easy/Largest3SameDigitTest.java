package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Largest3SameDigitTest {
    Largest3SameDigit largest3SameDigit = new Largest3SameDigit();

    @Test
    void largestGoodInteger() {
        assertEquals("777", largest3SameDigit.largestGoodInteger("6777133339"));
        assertEquals("000", largest3SameDigit.largestGoodInteger("2300019"));
        assertEquals("", largest3SameDigit.largestGoodInteger("42352338"));
    }

    @Test
    void largestGoodIntegerReal() {
        assertEquals("222", largest3SameDigit.largestGoodInteger("222"));

    }
}