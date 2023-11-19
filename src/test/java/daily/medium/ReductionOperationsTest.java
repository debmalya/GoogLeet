package daily.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReductionOperationsTest {

    ReductionOperations reductionOperations = new ReductionOperations();

    @Test
    void reductionOperations0() {
        assertEquals(3, reductionOperations.reductionOperations0(new int[]{5, 1, 3}));
        assertEquals(4, reductionOperations.reductionOperations0(new int[]{1, 1, 2, 2, 3}));
        assertEquals(0, reductionOperations.reductionOperations0(new int[]{1, 1, 1}));
    }

    @Test
    void reductionOperations1() {
        assertEquals(3, reductionOperations.reductionOperations1(new int[]{5, 1, 3}));
        assertEquals(4, reductionOperations.reductionOperations1(new int[]{1, 1, 2, 2, 3}));
        assertEquals(0, reductionOperations.reductionOperations1(new int[]{1, 1, 1}));
    }

    @Test
    void reductionOperations() {
        assertEquals(3, reductionOperations.reductionOperations(new int[]{5, 1, 3}));
        assertEquals(4, reductionOperations.reductionOperations(new int[]{1, 1, 2, 2, 3}));
        assertEquals(0, reductionOperations.reductionOperations(new int[]{1, 1, 1}));
    }
}