package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class MinimumChangesTest {
    MinimumChanges minimumChanges = new MinimumChanges();

    @Test
    void minOperations() {
        assertEquals(1, minimumChanges.minOperations0("0100"));
    }

    @Test
    void minOperationsReal() {
        assertEquals(3, minimumChanges.minOperations("10010100"));
    }

    @Test
    void minOperationsOwn() {
        assertEquals(1, minimumChanges.minOperations0("0010"));
    }
}