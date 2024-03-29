package daily;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class ExtraCharactersInAString {
    /**
     * You are given a 0-indexed string s and a dictionary of words dictionary. You have to break s into one or more non-overlapping substrings such that each substring is present in dictionary. There may be some extra characters in s which are not present in any of the substrings.
     *
     * @param s          string.
     * @param dictionary all the words in dictionary.
     * @return the minimum number of extra characters left over if you break up s optimally.
     */
    public int minExtraChar(String s, String[] dictionary) {
        Map<Integer, Integer> cache = new HashMap<>();

        int result = dfs(s, dictionary, cache);
        return result;
    }

    private int dfs(String text, String[] dictionary, Map<Integer, Integer> cache) {
        if (text.isEmpty()) {
            return 0;
        }

        if (cache.containsKey(text.length())) {
            return cache.get(text.length());
        }

        int minimum = text.length();

        for (String word : dictionary) {
            if (text.equals(word)) {
                minimum = 0;
                cache.put(text.length(), minimum);
                return minimum;
            } else if (text.startsWith(word)) {
                int result = dfs(text.substring(word.length()), dictionary, cache);
                minimum = Math.min(minimum, result);
            }
        }

        int result = 1 + dfs(text.substring(1), dictionary, cache);
        minimum = Math.min(minimum, result);

        cache.put(text.length(), minimum);
        return minimum;
    }

    public int minExtraChar0(String s, String[] dictionary) {
        Arrays.sort(dictionary, Comparator.comparingInt(String::length));
        for (int i = dictionary.length - 1; i > -1; i--) {
            if (s.contains(dictionary[i])) {
                s = s.replace(dictionary[i], "");
            }
        }
        return s.length();
    }
}
