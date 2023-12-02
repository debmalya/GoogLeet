package daily.easy;

public class FindWords {
    /**
     * A string is good if it can be formed by characters from chars (each character can only be used once).
     *
     * @param words - an array of strings.
     * @param chars - a string.
     * @return the sum of lengths of all good strings in words.
     */
    public int countCharacters(String[] words, String chars) {
        int sum = 0;
        int[] values = new int[26];
        for (int index = 0; index < chars.length(); index++) {
            values[chars.charAt(index) - 'a']++;
        }
        for (String word : words) {
            boolean matches = true;
            int[] copiedValues = new int[26];
            System.arraycopy(values, 0, copiedValues, 0, 26);
            for (int index = 0; index < word.length(); index++) {
                if (copiedValues[word.charAt(index) - 'a'] == 0) {
                    matches = false;
                    break;
                } else {
                    copiedValues[word.charAt(index) - 'a']--;
                }
            }
            if (matches) {
                sum += word.length();
            }
        }
        return sum;
    }
}
