package daily.easy;

public class LargestSubstringBetweenTwoEqualCharacters {
    /**
     * Given a string s, return the length of the longest substring between two equal characters, excluding the two characters.
     * If there is no such substring return -1.
     * <p>
     * A substring is a contiguous sequence of characters within a string.
     *
     * @param s given string.
     * @return length of the longest substring between two equal characters.
     * @Constraints 1 <= s.length <= 300
     * s contains only lowercase English letters.
     */
    public int maxLengthBetweenEqualCharacters(String s) {
        int maxLength = -1;
        int[] frequency = new int[26];

        for (int index = 0; index < s.length(); index++) {
            int i = (s.charAt(index) - 'a');
            if (frequency[i] != 0) {
                maxLength = Math.max(maxLength, index - frequency[i]);

            }
            if (frequency[i] == 0) {
                frequency[i] = index + 1;
            }

        }
        return maxLength;
    }
}
