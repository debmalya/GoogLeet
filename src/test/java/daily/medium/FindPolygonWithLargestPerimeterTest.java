package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPolygonWithLargestPerimeterTest {

    FindPolygonWithLargestPerimeter findPolygonWithLargestPerimeter = new FindPolygonWithLargestPerimeter();

    @Test
    void largestPerimeter() {
        assertEquals(15, findPolygonWithLargestPerimeter.largestPerimeter(new int[]{5, 5, 5}));
        assertEquals(-1, findPolygonWithLargestPerimeter.largestPerimeter(new int[]{5, 5, 50}));
    }
}