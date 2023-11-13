package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BusRoutesTest {
    BusRoutes busRoutes = new BusRoutes();

    @Test
    void numBusesToDestination() {
        assertEquals(2, busRoutes.numBusesToDestination0(new int[][]{{1, 2, 7}, {3, 6, 7}}, 1, 6));
        assertEquals(-1, busRoutes.numBusesToDestination0(new int[][]{{7, 12}, {4, 5, 15}, {6}, {15, 19}, {9, 12, 13}}, 15, 12));
    }

    @Test
    void numBusesToDestinationOneBus() {
        assertEquals(1, busRoutes.numBusesToDestination0(new int[][]{{1, 2, 6, 7}, {3, 6, 7}}, 1, 6));
    }

    @Test
    void numBusesToDestinationMultipleBuses() {
        assertEquals(3, busRoutes.numBusesToDestination(new int[][]{{1, 2, 7}, {3, 6}, {3, 7}}, 1, 6));
    }
}