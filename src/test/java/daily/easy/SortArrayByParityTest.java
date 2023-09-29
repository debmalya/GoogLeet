package daily.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortArrayByParityTest {

    SortArrayByParity sortArrayByParity = new SortArrayByParity();

    @Test
    void sortArrayByParity() {
        assertArrayEquals(new int[]{2, 4, 1, 3}, sortArrayByParity.sortArrayByParity(new int[]{3, 1, 2, 4}));
    }
}