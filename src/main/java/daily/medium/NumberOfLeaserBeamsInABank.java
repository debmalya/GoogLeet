package daily.medium;

import java.util.Stack;

public class NumberOfLeaserBeamsInABank {
    /**
     * Anti-theft security devices are activated inside a bank.
     * You are given a 0-indexed binary string array bank representing the floor plan of the bank,
     * which is an m x n 2D matrix. bank[i] represents the ith row, consisting of '0's and '1's. '0'
     * means the cell is empty, while'1' means the cell has a security device.
     * <p>
     * There is one laser beam between any two security devices if both conditions are met:
     * <p>
     * The two devices are located on two different rows: r1 and r2, where r1 < r2.
     * For each row i where r1 < i < r2, there are no security devices in the ith row.
     * Laser beams are independent, i.e., one beam does not interfere nor join with another.
     *
     * @param bank 0-indexed binary string array.
     * @return
     */
    public int numberOfBeams(String[] bank) {
        int count = 0;
        int prevCount = 0;
        int total = 0;
        Stack<Integer> laserStack = new Stack<>();
        for (String row : bank) {
            count = 0;
            for (int i = 0; i < row.length(); i++) {
                if (row.charAt(i) == '1') {
                    count++;
                }
            }
            if (count > 0) {
                laserStack.push(count);
            }
        }
        count = 0;
        int current = 0;
        while (!laserStack.isEmpty()) {
            current = laserStack.pop();
            if (count > 0) {
                total += current * count;
            }
            count = current;
        }
        
        return total;
    }

}
