package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FarthestCanReachTest {

    FarthestCanReach farthestCanReach = new FarthestCanReach();

    @Test
    void furthestBuilding() {
        assertEquals(4, farthestCanReach.furthestBuilding(new int[]{4, 2, 7, 6, 9, 14, 12}, 5, 1));
        assertEquals(7, farthestCanReach.furthestBuilding(new int[]{4, 12, 2, 7, 3, 18, 20, 3, 19}, 10, 2));
        assertEquals(3, farthestCanReach.furthestBuilding(new int[]{14, 3, 19, 3}, 17, 0));
    }
}