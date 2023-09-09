package daily;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {


    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) return triangle;

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = triangle.get(i - 1);
            List<Integer> new_row = new ArrayList<>();
            new_row.add(1);

            for (int j = 1; j < prev_row.size(); j++) {
                new_row.add(prev_row.get(j - 1) + prev_row.get(j));
            }

            new_row.add(1);
            triangle.add(new_row);
        }

        return triangle;
    }


    public List<List<Integer>> generate0(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>(numRows);

        for (int i = 0; i < numRows; i++) {
            List<Integer> eachRow = new ArrayList<>();
            eachRow.add(1);
            if (!pascalTriangle.isEmpty()) {
                // not first row
                var previousRow = pascalTriangle.get(i - 1);
                for (int j = 0; j < previousRow.size() - 1; j++) {
                    int current = previousRow.get(j) + previousRow.get(j + 1);
                    eachRow.add(current);
                }
                eachRow.add(1);
            }
            pascalTriangle.add(eachRow);
        }

        return pascalTriangle;
    }
}
