package daily;

import java.util.HashSet;
import java.util.Set;

public class FindTheDuplicateNumber {


    /**
     * Given an array of integers numbs containing n + 1 integers where each integer is in the range [1, n] inclusive.
     *
     * @param numbs an array of integers.
     * @return There is only one repeated number in numbs, return this repeated number.
     */
    public int findDuplicate(int[] numbs) {
        Set<Integer> unique = new HashSet<>();
        int nonUnique = 0;

        for (int num : numbs) {
            if (!unique.add(num)) {
                nonUnique = num;
                break;
            }
        }

        return nonUnique;
    }
}
