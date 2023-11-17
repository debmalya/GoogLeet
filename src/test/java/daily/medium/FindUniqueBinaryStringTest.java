package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindUniqueBinaryStringTest {
    FindUniqueBinaryString findUniqueBinaryString = new FindUniqueBinaryString();

    @Test
    void findDifferentBinaryString0() {
        assertEquals("00", findUniqueBinaryString.findDifferentBinaryString0(new String[]{"01", "10"}));
        assertEquals("10", findUniqueBinaryString.findDifferentBinaryString0(new String[]{"00", "01"}));
        assertEquals("000", findUniqueBinaryString.findDifferentBinaryString0(new String[]{"111", "011", "001"}));
        assertEquals("00", findUniqueBinaryString.findDifferentBinaryString0(new String[]{"11", "10"}));
        assertEquals("01", findUniqueBinaryString.findDifferentBinaryString0(new String[]{"00", "10"}));
        assertEquals("010", findUniqueBinaryString.findDifferentBinaryString0(new String[]{"001", "000", "100"}));
    }

    @Test
    void findDifferentBinaryString() {
        assertEquals("11", findUniqueBinaryString.findDifferentBinaryString(new String[]{"01", "10"}));
        assertEquals("10", findUniqueBinaryString.findDifferentBinaryString(new String[]{"00", "01"}));
        assertEquals("000", findUniqueBinaryString.findDifferentBinaryString(new String[]{"111", "011", "001"}));
        assertEquals("01", findUniqueBinaryString.findDifferentBinaryString(new String[]{"11", "10"}));
        assertEquals("11", findUniqueBinaryString.findDifferentBinaryString(new String[]{"00", "10"}));
        assertEquals("111", findUniqueBinaryString.findDifferentBinaryString(new String[]{"001", "000", "100"}));
    }

    @Test
    void convert() {
        assertEquals(1, findUniqueBinaryString.convert("01"));
        assertEquals(1, findUniqueBinaryString.convert("001"));
        assertEquals(2, findUniqueBinaryString.convert("10"));
        assertEquals(3, findUniqueBinaryString.convert("011"));
        assertEquals(7, findUniqueBinaryString.convert("111"));
        assertEquals(8, findUniqueBinaryString.convert("1000"));
        assertEquals(9, findUniqueBinaryString.convert("1001"));
        assertEquals(16, findUniqueBinaryString.convert("10000"));
        assertEquals(32, findUniqueBinaryString.convert("100000"));
        assertEquals(64, findUniqueBinaryString.convert("1000000"));
        assertEquals(65535, findUniqueBinaryString.convert("1111111111111111"));
    }
}