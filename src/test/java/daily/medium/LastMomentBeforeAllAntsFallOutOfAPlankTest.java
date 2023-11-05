package daily.medium;

import org.junit.jupiter.api.Test;

class LastMomentBeforeAllAntsFallOutOfAPlankTest {

    LastMomentBeforeAllAntsFallOutOfAPlank lastMomentBeforeAllAntsFallOutOfAPlank = new LastMomentBeforeAllAntsFallOutOfAPlank();

    @Test
    void getLastMoment() {
        lastMomentBeforeAllAntsFallOutOfAPlank.getLastMoment0(4, new int[]{4, 3}, new int[]{0, 1});
    }
}