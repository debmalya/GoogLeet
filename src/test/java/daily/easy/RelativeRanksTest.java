package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class RelativeRanksTest {

    RelativeRanks relativeRanks = new RelativeRanks();

    @Test
    void findRelativeRanks() {
        var ranks = relativeRanks.findRelativeRanks(new int[]{5, 4, 3, 2, 1});
        assertEquals("Gold Medal", ranks[0]);
        assertEquals("Silver Medal", ranks[1]);
        assertEquals("Bronze Medal", ranks[2]);
        assertEquals("4", ranks[3]);
        assertEquals("5", ranks[4]);
    }
}