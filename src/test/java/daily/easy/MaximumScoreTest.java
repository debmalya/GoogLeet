package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumScoreTest {
    MaximumScore maximumScore = new MaximumScore();

    @Test
    void maxScore() {
        assertEquals(5, maximumScore.maxScore("011101"));
        assertEquals(5, maximumScore.maxScore("00111"));
    }

    @Test
    void maxScoreReal() {
        assertEquals(1, maximumScore.maxScore("00"));
    }
}