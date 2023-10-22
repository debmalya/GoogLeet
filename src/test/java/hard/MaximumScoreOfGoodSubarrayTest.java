package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumScoreOfGoodSubarrayTest {

    MaximumScoreOfGoodSubarray maximumScoreOfGoodSubarray = new MaximumScoreOfGoodSubarray();

    @Test
    void maximumScore() {
        assertEquals(15, maximumScoreOfGoodSubarray.maximumScore(new int[]{1, 4, 3, 7, 4, 5}, 3));
    }
}