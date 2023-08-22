package daily;

import java.util.Stack;

public class ExcelSheetColumnTitle {
    /**
     * @param columnNumber - Given an integer columnNumber.
     * @return - its corresponding column title as it appears in an Excel sheet.
     */
    public String convertToTitle(int columnNumber) {
        Stack<Character> stack = new Stack<>();
        while (columnNumber > 0) {
            int mod = columnNumber % 26;
            if (mod == 0) {
                mod = 25;
                columnNumber--;
            } else {
                mod--;
            }
            stack.add((char) (mod + 'A'));
            columnNumber /= 26;
        }

        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.empty()) {
            stringBuilder.append(stack.pop());
        }

        return stringBuilder.toString();
    }
}
