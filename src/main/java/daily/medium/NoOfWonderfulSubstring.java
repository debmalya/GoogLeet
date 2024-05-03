package daily.medium;

public class NoOfWonderfulSubstring {
    /**
     * A wonderful string is a string where at most one letter appears an odd number of times.
     * <p>
     * For example, "ccjjc" and "abab" are wonderful, but "ab" is not.
     * Given a string word that consists of the first ten lowercase English letters ('a' through 'j'),
     * return the number of wonderful non-empty substrings in word.
     * If the same substring appears multiple times in word, then count each occurrence separately.
     * <p>
     * A substring is a contiguous sequence of characters in a string.
     *
     * @param word to be considered for wonderful substring
     * @return total number of wonderful substrings.
     */

    public long wonderfulSubstrings(String word) {
        long[] count = new long[1024]; // 2^10 to store XOR values
        long result = 0;
        int prefixXor = 0;
        count[prefixXor] = 1;

        for (char ch : word.toCharArray()) {
            int charIndex = ch - 'a';
            prefixXor ^= 1 << charIndex;
            result += count[prefixXor];
            for (int i = 0; i < 10; i++) {
                result += count[prefixXor ^ (1 << i)];
            }
            count[prefixXor]++;
        }

        return result;
    }
 
}
