package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountNicePairTest {

    CountNicePair countNicePair = new CountNicePair();

    @Test
    void countNicePairs() {
        assertEquals(2, countNicePair.countNicePairs(new int[]{42, 11, 1, 97}));
        assertEquals(4, countNicePair.countNicePairs(new int[]{13, 10, 35, 24, 76}));
    }

    @Test
    void rev() {
        assertEquals(24, countNicePair.rev(42));
        assertEquals(79, countNicePair.rev(97));
    }
}