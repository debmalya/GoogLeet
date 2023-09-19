package daily;

import java.util.*;

public class KWeakestRowsInAMatrix {
    /**
     * You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians).
     * The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.
     *
     * <p>
     * A row i is weaker than a row j if one of the following is true:
     * <ul>The number of soldiers in row i is less than the number of soldiers in row j.</ul>
     * <ul>Both rows have the same number of soldiers and i < j.</ul>
     * </p>
     *
     * @param mat m x n binary matrix mat of 1's and 0s.
     * @param k   number of rows required to return.
     * @return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
     */
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] weakest2strongest = new int[k];
        int[] rowStrength = new int[mat.length];

        Map<Integer, List<Integer>> rowStrengthMap = new HashMap<>(mat.length);

        for (int index = 0; index < mat.length; index++) {
            int sum = Arrays.stream(mat[index]).sum();
            rowStrengthMap.putIfAbsent(sum, new ArrayList<>());
            rowStrengthMap.get(sum).add(index);
            rowStrength[index] = sum;
        }

        Arrays.sort(rowStrength);

        int count = 0;
        for (int index = 0; count < k; index++) {
            var indexes = rowStrengthMap.get(rowStrength[index]);
            int prevIndex = -1;
            for (int eachIndex : indexes) {
                if (prevIndex != -1 && prevIndex != eachIndex) {
                    index++;
                }
                weakest2strongest[count++] = eachIndex;
                if (count == k) {
                    break;
                }
                prevIndex = eachIndex;
            }
        }


        return weakest2strongest;
    }

    public int[] kWeakestRows1(int[][] mat, int k) {
        int[][] rowStrengths = new int[mat.length][2];

        for (int i = 0; i < mat.length; ++i) {
            int strength = 0;
            for (int val : mat[i]) {
                strength += val;
            }
            rowStrengths[i][0] = strength;
            rowStrengths[i][1] = i;
        }

        Arrays.sort(rowStrengths, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        int[] result = new int[k];
        for (int i = 0; i < k; ++i) {
            result[i] = rowStrengths[i][1];
        }

        return result;
    }
}
