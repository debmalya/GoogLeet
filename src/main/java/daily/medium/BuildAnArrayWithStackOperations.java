package daily.medium;

import java.util.ArrayList;
import java.util.List;

public class BuildAnArrayWithStackOperations {
    /**
     * You are given an integer array target and an integer n.
     * <p>
     * You have an empty stack with the two following operations:
     * <p>
     * "Push": pushes an integer to the top of the stack.
     * "Pop": removes the integer on the top of the stack.
     * You also have a stream of the integers in the range [1, n].
     * <p>
     * Use the two stack operations to make the numbers in the stack (from the bottom to the top) equal to target.
     * You should follow the following rules:
     * <p>
     * If the stream of the integers is not empty, pick the next integer from the stream and push it to the top of the stack.
     * If the stack is not empty, pop the integer at the top of the stack.
     * If, at any moment, the elements in the stack (from the bottom to the top) are equal to target,
     * do not read new integers from the stream and do not do more operations on the stack.
     *
     * @param target
     * @param n
     * @return the stack operations needed to build target following the mentioned rules.
     * If there are multiple valid answers, return any of them.
     */
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (count == target.length) {
                break;
            }
            list.add("Push");
            if (target[count++] != i) {
                list.add("Pop");
                count--;
            }
        }
        return list;
    }
}
