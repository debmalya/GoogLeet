package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximizeConfusionTest {

    MaximizeConfusion maximizeConfusion = new MaximizeConfusion();

    @Test
    void maxConsecutiveAnswers() {
        assertEquals(8, maximizeConfusion.maxConsecutiveAnswers("FTTFTTFTT", 2));
        assertEquals(4, maximizeConfusion.maxConsecutiveAnswers("TTFF", 2));
        assertEquals(3, maximizeConfusion.maxConsecutiveAnswers("TFFT", 1));
        assertEquals(5, maximizeConfusion.maxConsecutiveAnswers("TTFTTFTT", 1));
    }
}