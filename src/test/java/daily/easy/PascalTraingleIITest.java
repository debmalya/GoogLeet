package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PascalTraingleIITest {

    PascalTraingleII pascalTraingleII = new PascalTraingleII();

    @Test
    void getRow0() {
        var rowIndex0 = pascalTraingleII.getRow(0);
        assertAll(() -> assertEquals(1, rowIndex0.size(), "Must have only one element"),
                () -> assertEquals(1, rowIndex0.get(0).intValue(), "Only element is 1"));
    }

    @Test
    void getRow1() {
        var rowIndex0 = pascalTraingleII.getRow(1);
        assertAll(() -> assertEquals(2, rowIndex0.size()),
                () -> assertEquals(1, rowIndex0.get(0).intValue()),
                () -> assertEquals(1, rowIndex0.get(1).intValue()));
    }

    @Test
    void getRow2() {
        var rowIndex0 = pascalTraingleII.getRow(2);
        assertAll(() -> assertEquals(3, rowIndex0.size()),
                () -> assertEquals(1, rowIndex0.get(0).intValue()),
                () -> assertEquals(2, rowIndex0.get(1).intValue()),
                () -> assertEquals(1, rowIndex0.get(2).intValue()));
    }

    @Test
    void getRow33() {
        var rowIndex33 = pascalTraingleII.getRow(33);
        assertAll(() -> assertEquals(34, rowIndex33.size()),
                () -> assertEquals(1, rowIndex33.get(0).intValue()),
                () -> assertEquals(1, rowIndex33.get(33).intValue()));
    }
}