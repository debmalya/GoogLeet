package googleet.process;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ToeplitzMatrixTest {
	ToeplitzMatrix toeplitzMatrix = new ToeplitzMatrix();

	@Test
	void testIsToeplitzMatrix() {
		int[][] matrix = new int[][] {};
		assertTrue(toeplitzMatrix.isToeplitzMatrix(matrix));
		matrix = new int[][] { { 1, 2 }, { 2, 2 } };
		assertFalse(toeplitzMatrix.isToeplitzMatrix(matrix));
		matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 1, 2, 3 }, { 9, 5, 1, 2 } };
		assertTrue(toeplitzMatrix.isToeplitzMatrix(matrix));
	}

}
