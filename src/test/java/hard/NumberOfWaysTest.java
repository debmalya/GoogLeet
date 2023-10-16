package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfWaysTest {

    NumberOfWays numberOfWays = new NumberOfWays();

    @Test
    void numWays() {
        assertEquals(4, numberOfWays.numWays(3, 2));
    }
}