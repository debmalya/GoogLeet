package googleet.process;

public class ToeplitzMatrix {
	public boolean isToeplitzMatrix(int[][] matrix) {
		for (int row = 1; row < matrix.length; row++)
			for (int col = 0; col < matrix[0].length - 1; col++)
				if (matrix[row - 1][col] != matrix[row][col + 1])
					return false;

		return true;
	}
}
