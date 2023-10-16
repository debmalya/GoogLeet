package daily.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTraingleII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> rowDetails = new ArrayList<>(rowIndex + 1);
        rowDetails.add(1);
        for (int index = 0; index < rowIndex; index++) {
            List<Integer> previousRow = rowDetails;
            rowDetails = new ArrayList<>(rowIndex + 1);
            rowDetails.add(1);

            for (int eachIndex = 0; eachIndex < index; eachIndex++) {
                int first = previousRow.get(eachIndex);
                int second = previousRow.get(eachIndex + 1);
                rowDetails.add(first + second);
            }

            rowDetails.add(1);
        }
        return rowDetails;
    }
}
