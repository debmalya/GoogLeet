package hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinimumOneBitOperationstoMakeIntegersZeroTest {
    MinimumOneBitOperationstoMakeIntegersZero minimumOneBitOperationstoMakeIntegersZero = new MinimumOneBitOperationstoMakeIntegersZero();

    @Test
    void minimumOneBitOperations() {
        assertEquals(2, minimumOneBitOperationstoMakeIntegersZero.minimumOneBitOperations(3));
    }
}