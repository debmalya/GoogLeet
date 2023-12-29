package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumDifficultyScheduleAJobTest {

    MinimumDifficultyScheduleAJob minimumDifficultyScheduleAJob = new MinimumDifficultyScheduleAJob();

    @Test
    void minDifficulty() {
        assertEquals(-1, minimumDifficultyScheduleAJob.minDifficulty0(new int[]{}, 4));
        assertEquals(7, minimumDifficultyScheduleAJob.minDifficulty0(new int[]{6, 5, 4, 3, 2, 1}, 2));
        assertEquals(3, minimumDifficultyScheduleAJob.minDifficulty0(new int[]{1, 1, 1}, 3));
    }

    @Test
    void minDifficultyOwn() {
        assertEquals(7, minimumDifficultyScheduleAJob.minDifficulty1(new int[]{2, 3, 4, 5, 6, 1}, 2));
        assertEquals(7, minimumDifficultyScheduleAJob.minDifficulty1(new int[]{4, 3, 5, 6, 2, 1}, 2));
        assertEquals(8, minimumDifficultyScheduleAJob.minDifficulty1(new int[]{4, 3, 5, 6, 1, 2}, 2));
        assertEquals(9, minimumDifficultyScheduleAJob.minDifficulty1(new int[]{4, 5, 6, 1, 2, 3}, 2));
        assertEquals(3, minimumDifficultyScheduleAJob.minDifficulty1(new int[]{1, 1, 1}, 3));
        assertEquals(4, minimumDifficultyScheduleAJob.minDifficulty1(new int[]{1, 2, 1}, 3));
        assertEquals(7, minimumDifficultyScheduleAJob.minDifficulty1(new int[]{6, 5, 4, 3, 2, 1}, 2));
        assertEquals(9, minimumDifficultyScheduleAJob.minDifficulty1(new int[]{6, 5, 4, 3, 2, 1}, 3));
    }

    @Test
    void minDifficultyMemoization() {
        assertEquals(7, minimumDifficultyScheduleAJob.minDifficulty(new int[]{2, 3, 4, 5, 6, 1}, 2));
        assertEquals(7, minimumDifficultyScheduleAJob.minDifficulty(new int[]{4, 3, 5, 6, 2, 1}, 2));
        assertEquals(8, minimumDifficultyScheduleAJob.minDifficulty(new int[]{4, 3, 5, 6, 1, 2}, 2));
        assertEquals(9, minimumDifficultyScheduleAJob.minDifficulty(new int[]{4, 5, 6, 1, 2, 3}, 2));
        assertEquals(3, minimumDifficultyScheduleAJob.minDifficulty(new int[]{1, 1, 1}, 3));
        assertEquals(4, minimumDifficultyScheduleAJob.minDifficulty(new int[]{1, 2, 1}, 3));
        assertEquals(7, minimumDifficultyScheduleAJob.minDifficulty(new int[]{6, 5, 4, 3, 2, 1}, 2));
        assertEquals(9, minimumDifficultyScheduleAJob.minDifficulty(new int[]{6, 5, 4, 3, 2, 1}, 3));
    }
}