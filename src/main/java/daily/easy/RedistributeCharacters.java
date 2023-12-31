package daily.easy;

public class RedistributeCharacters {
    /**
     * You are given an array of strings words (0-indexed).
     * <p>
     * In one operation, pick two distinct indices i and j, where words[i] is a non-empty string,
     * and move any character from words[i] to any position in words[j].
     *
     * @param words an array of Strings.
     * @return true if you can make every string in words equal using any number of operations, and false otherwise.
     * <p>
     * Constraints:
     * <p>
     * 1 <= words.length <= 100
     * 1 <= words[i].length <= 100
     * words[i] consists of lowercase English letters.
     */
    public boolean makeEqual(String[] words) {
        int[] frequency = new int[26];
        for (String word : words) {
            char[] arr = word.toCharArray();
            for (int index = 0; index < arr.length; index++) {
                frequency[arr[index] - 'a']++;
            }
        }

        int n = words.length;
        for (int index = 0; index < 26; index++) {
            if (frequency[index] % n != 0) {
                return false;
            }
        }

        return true;
    }
}
