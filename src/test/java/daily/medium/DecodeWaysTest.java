package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecodeWaysTest {
    DecodeWays decodeWays = new DecodeWays();

    @Test
    void numDecodings() {
        assertEquals(2, decodeWays.numDecodings("12"));
        assertEquals(3, decodeWays.numDecodings("226"));
        assertEquals(0, decodeWays.numDecodings("06"));
    }
}