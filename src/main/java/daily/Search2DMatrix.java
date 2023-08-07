package daily;

import java.util.Arrays;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        return getRow(matrix, target);
    }

    public boolean getRow(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        if (target > matrix[rows - 1][cols - 1] || target < matrix[0][0]) {
            return false;
        }

        int mid = rows / 2;
        int high = rows - 1;
        int low = 0;

        while (true) {
            if (target == matrix[mid][0]) {
                return true;
            }
            if (target == matrix[mid][cols - 1]) {
                return true;
            }
            if (target < matrix[mid][0]) {
                high = mid - 1;
            } else if (target > matrix[mid][cols - 1]) {
                low = mid + 1;
            } else if (target > matrix[mid][0] && target < matrix[mid][cols - 1]) {
                return checkColumns(matrix, mid, target);
            }
            mid = (high + low) / 2;
            if (low > high) {
                return false;
            }
        }
    }

    private boolean checkColumns(int[][] matrix, int mid, int target) {
        int[] arr = new int[matrix[0].length];
        int index = 0;
        for (int each : matrix[mid]) {
            arr[index++] = each;
        }
        return Arrays.binarySearch(arr, target) > -1;
    }
}
