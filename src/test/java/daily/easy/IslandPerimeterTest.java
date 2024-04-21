package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IslandPerimeterTest {

    IslandPerimeter islandPerimeter = new IslandPerimeter();

    @Test
    void islandPerimeter() {
        assertEquals(16, islandPerimeter.islandPerimeter(new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}}));
    }
}