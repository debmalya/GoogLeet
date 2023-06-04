package daily;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveZerosTest {

    MoveZeros moveZeros = new MoveZeros();
    @Test
    void moveZeroes() {
        int[] arr = new int[]{0,1,0,3,12};
        int[] expected = new int[]{1,3,12,0,0};

        moveZeros.moveZeroes(arr);
       assertArrayEquals(expected,arr);
    }
}