package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PascalsTriangleTest {
    PascalsTriangle pascalsTriangle = new PascalsTriangle();

    @Test
    void generateFirstRow() {
        var result = pascalsTriangle.generate(1);
        assertAll(() -> assertNotNull(result),
                () -> assertEquals(1, result.size()),
                () -> assertEquals(1, result.get(0).size()),
                () -> assertEquals(1, result.get(0).get(0).intValue()));
    }

    @Test
    void generateSecondRow() {
        var result = pascalsTriangle.generate(2);
        assertAll(() -> assertNotNull(result),
                () -> assertEquals(2, result.size()),
                () -> assertEquals(1, result.get(0).size()),
                () -> assertEquals(1, result.get(0).get(0).intValue()),
                () -> assertEquals(2, result.get(1).size()),
                () -> assertEquals(1, result.get(1).get(0).intValue()),
                () -> assertEquals(1, result.get(1).get(1).intValue()));
    }

    @Test
    void generateThirdRow() {
        var result = pascalsTriangle.generate(3);
        assertAll(() -> assertNotNull(result),
                () -> assertEquals(3, result.size()),
                () -> assertEquals(1, result.get(0).size()),
                () -> assertEquals(1, result.get(0).get(0).intValue()),
                () -> assertEquals(2, result.get(1).size()),
                () -> assertEquals(1, result.get(1).get(0).intValue()),
                () -> assertEquals(1, result.get(1).get(1).intValue()),
                () -> assertEquals(3, result.get(2).size()),
                () -> assertEquals(1, result.get(2).get(0).intValue()),
                () -> assertEquals(2, result.get(2).get(1).intValue()),
                () -> assertEquals(1, result.get(2).get(2).intValue()));
    }

}