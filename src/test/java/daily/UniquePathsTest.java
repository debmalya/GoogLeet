package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UniquePathsTest {
    UniquePaths uniquePaths = new UniquePaths();

    @Test
    void uniquePaths() {
        assertEquals(28, uniquePaths.uniquePaths(3, 7));
        assertEquals(3, uniquePaths.uniquePaths(3, 2));
    }
}