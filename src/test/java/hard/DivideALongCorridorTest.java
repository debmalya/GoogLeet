package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DivideALongCorridorTest {
    DivideALongCorridor divideALongCorridor = new DivideALongCorridor();

    @Test
    void numberOfWays() {
        assertEquals(3, divideALongCorridor.numberOfWays("SSPPSPS"));
        assertEquals(1, divideALongCorridor.numberOfWays("PPSPSP"));
        assertEquals(0, divideALongCorridor.numberOfWays("S"));
    }

    @Test
    void numberOfWaysReal() {
        assertEquals(1, divideALongCorridor.numberOfWays("SPPSSSSPPS"));
    }
}