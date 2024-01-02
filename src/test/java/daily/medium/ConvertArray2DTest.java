package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class ConvertArray2DTest {
    ConvertArray2D convertArray2D = new ConvertArray2D();

    @Test
    void findMatrixExample1() {
        var result = convertArray2D.findMatrix(new int[]{1, 3, 4, 1, 2, 3, 1});
        System.out.println(result);
        assertAll(() -> assertEquals(3, result.size()),
                () -> assertEquals(4, result.get(0).size()),
                () -> assertTrue(result.get(0).contains(1)),
                () -> assertTrue(result.get(0).contains(3)),
                () -> assertTrue(result.get(0).contains(4)),
                () -> assertTrue(result.get(0).contains(2)),
                () -> assertEquals(2, result.get(1).size()),
                () -> assertEquals(1, result.get(2).size()));
    }
}