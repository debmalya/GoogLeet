package daily.easy;

import java.util.Arrays;

public class ValidAnagram {
    /**
     * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
     * <p>
     * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isAnagram(String s, String t) {
        return Arrays.equals(getIntArr(s), getIntArr(t));
    }

    private int[] getIntArr(String s) {
        int[] first = new int[26];
        for (int i = 0; i < s.length(); i++) {
            first[s.charAt(i) - 'a']++;
        }
        return first;
    }
}
