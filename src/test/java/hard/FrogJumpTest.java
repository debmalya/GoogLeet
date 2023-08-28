package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FrogJumpTest {

    FrogJump frogJump = new FrogJump();

    @Test
    void canCross() {
        assertTrue(frogJump.canCross(new int[]{0, 1, 3, 5, 6, 8, 12, 17}));
        assertFalse(frogJump.canCross(new int[]{0, 1, 2, 3, 4, 8, 9, 11}));
    }
}