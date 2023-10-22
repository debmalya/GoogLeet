package daily.easy;

public class AlmostEquivalent {
    /**
     * Two strings word1 and word2 are considered almost equivalent if the differences between the frequencies
     * of each letter from 'a' to 'z' between word1 and word2 is at most 3.
     * <p>
     * Given two strings word1 and word2, each of length n, return true if word1 and word2 are almost equivalent, or false otherwise.
     * <p>
     * The frequency of a letter x is the number of times it occurs in the string.
     *
     * @param word1 first string.
     * @param word2 second string.
     * @return
     */
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int diffCount = 0;
        int[] l = new int[26];
        int[] m = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            l[word1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < word2.length(); i++) {
            m[word2.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            diffCount = Math.abs(m[i] - l[i]);
            if (diffCount > 3) {
                break;
            }
        }


        return diffCount < 4;
    }
}
