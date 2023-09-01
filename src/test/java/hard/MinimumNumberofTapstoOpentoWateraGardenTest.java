package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumNumberofTapstoOpentoWateraGardenTest {
    MinimumNumberofTapstoOpentoWateraGarden minimumNumberofTapstoOpentoWateraGarden = new MinimumNumberofTapstoOpentoWateraGarden();

    @Test
    void minTaps() {
        assertEquals(1, minimumNumberofTapstoOpentoWateraGarden.minTaps(5, new int[]{3, 4, 1, 1, 0, 0}));
        assertEquals(-1, minimumNumberofTapstoOpentoWateraGarden.minTaps(3, new int[]{0, 0, 0, 0}));
    }

    @Test
    void minTapsOwn() {
        assertEquals(3, minimumNumberofTapstoOpentoWateraGarden.minTaps(5, new int[]{1, 0, 1, 0, 1, 0}));
//        assertEquals(1, minimumNumberofTapstoOpentoWateraGarden.minTaps(-1, new int[]{0, 0, 0, 0}));
    }
}