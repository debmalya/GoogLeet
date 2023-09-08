package daily;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
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
