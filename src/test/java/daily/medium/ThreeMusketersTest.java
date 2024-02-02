package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ThreeMusketersTest {

    ThreeMusketers threeMusketers = new ThreeMusketers();


    @Test
    void divideArray() {
        var actual = threeMusketers.divideArray(new int[]{15, 13, 12, 13, 12, 14, 12, 2, 3, 13, 12, 14, 14, 13, 5, 12, 12, 2, 13, 2, 2}, 2);
        assertEquals(0, actual.length);
        actual = threeMusketers.divideArray(new int[]{1, 3, 4, 8, 7, 9, 3, 5, 1}, 3);
        assertEquals(3, actual.length);
    }
}