package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShortestPathVisitingAllNodesTest {

    ShortestPathVisitingAllNodes shortestPathVisitingAllNodes = new ShortestPathVisitingAllNodes();

    @Test
    void shortestPathLength() {
        assertEquals(4, shortestPathVisitingAllNodes.shortestPathLength(new int[][]{{1, 2, 3}, {0}, {0}, {0}}));
    }
}