package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class CompareVersionNumbersTest {

    CompareVersionNumbers compareVersionNumbers = new CompareVersionNumbers();

    @Test
    void compareVersion() {
        assertEquals(-1, compareVersionNumbers.compareVersion("0.1", "1.1"));
        assertEquals(1, compareVersionNumbers.compareVersion("1.0.1", "1.0"));
        assertEquals(0, compareVersionNumbers.compareVersion("1.0", "1.0.0"));
    }
}