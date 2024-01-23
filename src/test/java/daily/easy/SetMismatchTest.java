package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SetMismatchTest {

    SetMismatch setMismatch = new SetMismatch();

    @Test
    void findErrorNums() {
        var actual = setMismatch.findErrorNums(new int[]{1, 2, 2, 4});
        assertArrayEquals(new int[]{2, 3}, actual);
        actual = setMismatch.findErrorNums(new int[]{1, 1});
        assertArrayEquals(new int[]{1, 2}, actual);
    }
}