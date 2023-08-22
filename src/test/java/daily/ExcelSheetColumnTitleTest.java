package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ExcelSheetColumnTitleTest {

    ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();

    @Test
    void convertToTitle() {
        assertEquals("A", excelSheetColumnTitle.convertToTitle(1));
        assertEquals("Y", excelSheetColumnTitle.convertToTitle(25));
        assertEquals("Z", excelSheetColumnTitle.convertToTitle(26));
        assertEquals("AA", excelSheetColumnTitle.convertToTitle(27));
        assertEquals("AB", excelSheetColumnTitle.convertToTitle(28));
        assertEquals("ZY", excelSheetColumnTitle.convertToTitle(701));
        assertEquals("FXSHRXW", excelSheetColumnTitle.convertToTitle(Integer.MAX_VALUE));
    }
}