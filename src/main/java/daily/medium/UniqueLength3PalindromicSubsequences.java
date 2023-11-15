package daily.medium;

import java.util.Arrays;

public class UniqueLength3PalindromicSubsequences {
    /**
     * Given a string s, return the number of unique palindromes of length three that are a subsequence of s.
     * <p>
     * Note that even if there are multiple ways to obtain the same subsequence, it is still only counted once.
     * <p>
     * A palindrome is a string that reads the same forwards and backwards.
     * <p>
     * A subsequence of a string is a new string generated from the original string with some characters (can be none)
     * deleted without changing the relative order of the remaining characters.
     * <p>
     * For example, "ace" is a subsequence of "abcde".
     *
     * @param s string to be checked.
     * @return number of unique palindromes of length three that are a subsequence of s.
     */


    public int countPalindromicSubsequence(String inputString) {
        int[] firstIndex = new int[26];
        int[] lastIndex = new int[26];
        int result = 0;
        Arrays.fill(firstIndex, Integer.MAX_VALUE);
        for (int i = 0; i < inputString.length(); ++i) {
            firstIndex[inputString.charAt(i) - 'a'] = Math.min(firstIndex[inputString.charAt(i) - 'a'], i);
            lastIndex[inputString.charAt(i) - 'a'] = i;
        }
        for (int i = 0; i < 26; ++i)
            if (firstIndex[i] < lastIndex[i])
                result += inputString.substring(firstIndex[i] + 1, lastIndex[i]).chars().distinct().count();
        return result;
    }

    public int countPalindromicSubsequence0(String s) {
        int[] f = new int[26];
        int count = 0;
        int noOfCharsMoreThanOnce = 0;
        int noOfDistinctChars = 0;

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';
            f[index]++;
            if (f[index] > 1) {
                noOfCharsMoreThanOnce++;
                if (f[index] == 3 && noOfDistinctChars == 1) {
                    count++;
                }
                if (noOfDistinctChars > 1) {
                    count += noOfDistinctChars;
                    noOfDistinctChars = 1;
                }


            }
            if (f[index] == 1) {
                noOfDistinctChars++;
            }
        }

        if (noOfCharsMoreThanOnce == 0) {
            return 0;
        }
        return count;
    }
}
