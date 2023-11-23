package daily.medium;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DiagonalTraverseiiTest {

    DiagonalTraverseii diagonalTraverseii = new DiagonalTraverseii();

    @Test
    void findDiagonalOrder() {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(List.of(1, 2, 3));
        matrix.add(List.of(4, 5, 6));
        matrix.add(List.of(7, 8, 9));
        int[] expected = new int[]{1, 4, 2, 7, 5, 3, 8, 6, 9};
        assertArrayEquals(expected, diagonalTraverseii.findDiagonalOrder(matrix));
    }
}