package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindAllGroupsOfFarmlandTest {

    FindAllGroupsOfFarmland findAllGroupsOfFarmland = new FindAllGroupsOfFarmland();

    @Test
    void findFarmLand() {
        var lands = findAllGroupsOfFarmland.findFarmland(new int[][]{{1, 0, 0}, {0, 1, 1}, {0, 1, 1}});

        assertNotNull(lands);
        assertEquals(0, lands[0][0]);
        assertEquals(0, lands[0][1]);
        assertEquals(0, lands[0][2]);
        assertEquals(0, lands[0][3]);
        assertEquals(1, lands[1][0]);
        assertEquals(1, lands[1][1]);
        assertEquals(2, lands[1][2]);
        assertEquals(2, lands[1][3]);

        lands = findAllGroupsOfFarmland.findFarmland(new int[][]{{1, 1}, {1, 1}});

        assertNotNull(lands);
        assertEquals(0, lands[0][0]);
        assertEquals(0, lands[0][1]);
        assertEquals(1, lands[0][2]);
        assertEquals(1, lands[0][3]);

    }
}