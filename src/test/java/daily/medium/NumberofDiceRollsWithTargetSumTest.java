package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberofDiceRollsWithTargetSumTest {
    NumberofDiceRollsWithTargetSum numberofDiceRollsWithTargetSum = new NumberofDiceRollsWithTargetSum();

    @Test
    void numRollsToTarget() {
        assertEquals(1, numberofDiceRollsWithTargetSum.numRollsToTarget(1, 6, 3));
        // 1 + 6, 2 + 5, 3 + 4, 4 + 3,5 + 2
        assertEquals(6, numberofDiceRollsWithTargetSum.numRollsToTarget(2, 6, 7));
        // 2 + 6, 3 + 5, 4 + 4, 5 + 3, 6 + 2
        assertEquals(5, numberofDiceRollsWithTargetSum.numRollsToTarget(2, 6, 8));
        assertEquals(222616187, numberofDiceRollsWithTargetSum.numRollsToTarget(30, 30, 500));
    }
}