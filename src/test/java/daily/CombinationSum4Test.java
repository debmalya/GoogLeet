package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CombinationSum4Test {

    CombinationSum4 combinationSum4 = new CombinationSum4();

    @Test
    void combinationSum4() {
        int actual = combinationSum4.combinationSum4(new int[]{1, 2, 3}, 4);
        assertEquals(7, actual);
    }
}