package hard;

import java.util.ArrayList;
import java.util.List;

public class MinimumWindowSubstring {
    /**
     * Given two strings s and t of lengths m and n respectively, return the minimum window
     * substring of s such that every character in t (including duplicates) is included in the window.
     * If there is no such substring, return the empty string "".
     * <p>
     * The testcases will be generated such that the answer is unique.
     *
     * @param s
     * @param t
     * @return
     */
    public String minWindow(String s, String t) {
        if (s.length() <= t.length()) {
            boolean[] found = new boolean[t.length()];
            List<int[]> positions = new ArrayList<>();
        }

        return "";
    }
}
