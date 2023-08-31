package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumReplacementstoSorttheArrayTest {

    MinimumReplacementstoSorttheArray minimumReplacementstoSorttheArray = new MinimumReplacementstoSorttheArray();

    @Test
    void minimumReplacement() {
        assertEquals(2, minimumReplacementstoSorttheArray.minimumReplacement(new int[]{3, 9, 3}));
        assertEquals(0, minimumReplacementstoSorttheArray.minimumReplacement(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void ownTestCase() {
        assertEquals(3, minimumReplacementstoSorttheArray.minimumReplacement(new int[]{3, 3, 2}));
        assertEquals(1, minimumReplacementstoSorttheArray.minimumReplacement(new int[]{3, 2, 3}));
    }


}