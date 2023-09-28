package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecodedStringAtIndexTest {

    DecodedStringAtIndex decodedStringAtIndex = new DecodedStringAtIndex();

    @Test
    void decodeAtIndexSample() {
        assertEquals("o", decodedStringAtIndex.decodeAtIndex("leet2code3", 10));
        assertEquals("h", decodedStringAtIndex.decodeAtIndex("ha22", 5));
        assertEquals("a", decodedStringAtIndex.decodeAtIndex("a2345678999999999999999", 1));
    }

    @Test
    void decodeAtIndexPerformance() {
        assertEquals("y", decodedStringAtIndex.decodeAtIndex("y959q969u3hb22odq595", 222280369));
    }
}