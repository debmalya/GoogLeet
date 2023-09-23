package daily.easy;

import java.util.HashSet;
import java.util.Set;

public class Subsequence {
    /**
     * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
     *
     * <p>Constraints</p>
     * <li>s and t consist only of lowercase English letters.</li>
     * <li>0 <= t.length <= 104</li>
     *
     * <p>
     * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters
     * without disturbing the relative positions of the remaining characters.
     * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
     *
     * @param s string to be checked for subsequence?
     * @param t main string.
     * @return true if s is a subsequence of t, or false otherwise.
     */
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public boolean isSubsequence0(String s, String t) {
        int[] occurrences = new int[26];

        for (int i = 0; i < s.length(); i++) {
            occurrences[s.charAt(i) - 'a']++;
        }

        Set<Character> characterToBeRemovedFromT = new HashSet<>(t.length());
        for (int i = 0; i < t.length(); i++) {
            char sc = t.charAt(i);
            int letterIndex = sc - 'a';
            if (occurrences[letterIndex] == 0) {
                // not occurred in s
                characterToBeRemovedFromT.add(sc);
            }
        }

        var characters = characterToBeRemovedFromT.toArray(new Character[0]);
        for (Character each : characters) {
            t = t.replace(String.format("%s", each), "");
        }

        return t.contains(s);
    }
}
