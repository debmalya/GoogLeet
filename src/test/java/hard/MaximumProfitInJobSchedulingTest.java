package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumProfitInJobSchedulingTest {
    MaximumProfitInJobScheduling maximumProfitInJobScheduling = new MaximumProfitInJobScheduling();

    @Test
    void jobScheduling() {
        assertEquals(150, maximumProfitInJobScheduling.jobScheduling(new int[]{1, 2, 3, 4, 6}, new int[]{3, 5, 10, 6, 9}, new int[]{20, 20, 100, 70, 60}));
    }
}