package daily;

import java.util.*;

public class MaximumVariance {

    /**
     * The variance of a string is defined as the largest difference between the number of occurrences of any 2 characters
     * present in the string. Note the two characters may or may not be the same.
     *
     * @param s consisting of lowercase English letters only. 1 <= s.length <= 10**4
     * @return the largest variance possible among all substrings of s. A substring is a contiguous sequence of characters within a string.
     */
    public int largestVariance(String s) {
        int maxVariance = 0;
        Map<Character, List<Integer>> indexMap = new HashMap<>(26);
        List<Integer> positionsToTry = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char each = s.charAt(i);
            indexMap.putIfAbsent(each, new ArrayList<>(s.length()));
            List<Integer> positionalList = indexMap.get(each);
            if (positionalList.size() > 0 && i - positionalList.get(positionalList.size() - 1) > 1) {
                if (positionalList.size() == 1) {

                    positionsToTry.add(positionalList.get(0) - 1);
                }
                positionsToTry.add(i - 1);
            }
            positionalList.add(i);
        }

        for (int i = 0; i < positionsToTry.size(); i++) {
            int position = positionsToTry.get(i) - 1;
            position = position == 0 ? 1 : position;

            maxVariance = Math.max(maxVariance, variance(s.substring(0, position)));
            maxVariance = Math.max(maxVariance, variance(s.substring(position - 1)));


        }

        return maxVariance;
    }

    private int variance(String s) {
        Map<Character, List<Integer>> indexMap = new HashMap<>(26);

        for (int i = 0; i < s.length(); i++) {
            char each = s.charAt(i);
            indexMap.putIfAbsent(each, new ArrayList<>(s.length()));
            indexMap.get(each).add(i);
        }
        Optional<Map.Entry<Character, List<Integer>>> max = indexMap.entrySet().stream().max(Comparator.comparing(entry -> entry.getValue().size()));
        Optional<Map.Entry<Character, List<Integer>>> min = indexMap.entrySet().stream().min(Comparator.comparing(entry -> entry.getValue().size()));
        return max.map(characterListEntry -> characterListEntry.getValue().size() - min.get().getValue().size()).orElse(0);
    }
}
