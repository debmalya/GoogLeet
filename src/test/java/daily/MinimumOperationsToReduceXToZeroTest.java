package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumOperationsToReduceXToZeroTest {
    MinimumOperationsToReduceXToZero minimumOperationsToReduceXToZero = new MinimumOperationsToReduceXToZero();

    @Test
    void minOperations() {
        assertEquals(-1, minimumOperationsToReduceXToZero.minOperations(new int[]{5, 6, 7, 8, 9}, 4));
        assertEquals(2, minimumOperationsToReduceXToZero.minOperations(new int[]{1, 1, 4, 2, 3}, 5));
        assertEquals(5, minimumOperationsToReduceXToZero.minOperations(new int[]{3, 2, 20, 1, 1, 3}, 10));
    }

    @Test
    void minOperationsOwnTestCase() {
        assertEquals(5, minimumOperationsToReduceXToZero.minOperations(new int[]{1, 1, 1, 1, 1}, 5));
        assertEquals(4, minimumOperationsToReduceXToZero.minOperations(new int[]{1, 1, 2, 1, 1}, 5));
        assertEquals(4, minimumOperationsToReduceXToZero.minOperations(new int[]{1, 2, 1, 1, 1}, 5));
        assertEquals(4, minimumOperationsToReduceXToZero.minOperations(new int[]{1, 2, 1, 1, 1, 1}, 5));
    }

    @Test
    void minOperations0() {
        assertEquals(-1, minimumOperationsToReduceXToZero.minOperations0(new int[]{5, 6, 7, 8, 9}, 4));
        assertEquals(2, minimumOperationsToReduceXToZero.minOperations0(new int[]{1, 1, 4, 2, 3}, 5));
        assertEquals(5, minimumOperationsToReduceXToZero.minOperations0(new int[]{3, 2, 20, 1, 1, 3}, 10));
    }

    @Test
    void minOperationsOwnTestCase0() {
        assertEquals(5, minimumOperationsToReduceXToZero.minOperations0(new int[]{1, 1, 1, 1, 1}, 5));
        assertEquals(4, minimumOperationsToReduceXToZero.minOperations0(new int[]{1, 1, 2, 1, 1}, 5));
        assertEquals(4, minimumOperationsToReduceXToZero.minOperations0(new int[]{1, 2, 1, 1, 1}, 5));
        assertEquals(4, minimumOperationsToReduceXToZero.minOperations0(new int[]{1, 2, 1, 1, 1, 1}, 5));
    }
}