package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChampagneTowerTest {

    ChampagneTower champagneTower = new ChampagneTower();

    @Test
    void champagneTowerExample() {
        assertEquals(0.00000, champagneTower.champagneTower(1, 1, 1));
        assertEquals(0.50000, champagneTower.champagneTower(2, 1, 1));

        assertEquals(1.00000, champagneTower.champagneTower(100000009, 33, 17));
    }
}