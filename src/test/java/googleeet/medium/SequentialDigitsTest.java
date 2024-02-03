package googleeet.medium;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class SequentialDigitsTest {
    SequentialDigits sequentialDigits = new SequentialDigits();

    @Test
    void sequentialDigits() {
        var seqList = sequentialDigits.sequentialDigits(100, 200);
        assertEquals(1, seqList.size());
        assertEquals(123, seqList.get(0).intValue());
    }

    @Test
    void sequentialDigits1() {
        var seqList = sequentialDigits.sequentialDigits(1000, 13000);
        System.out.println(seqList);
        assertEquals(7, seqList.size());
        assertEquals(1234, seqList.get(0).intValue());
    }
}