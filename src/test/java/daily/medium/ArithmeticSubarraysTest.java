package daily.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArithmeticSubarraysTest {

    ArithmeticSubarrays arithmeticSubarrays = new ArithmeticSubarrays();

    @Test
    void checkArithmeticSubarrays() {
        var actual = arithmeticSubarrays.checkArithmeticSubarrays(new int[]{4, 6, 5, 9, 3, 7}, new int[]{0, 0, 2}, new int[]{2, 3, 5});
        var expected = List.of(true, false, true);
        assertEquals(expected, actual);
    }
}