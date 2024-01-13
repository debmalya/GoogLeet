package daily.medium;


public class AnagramInMinimumSteps {
    /**
     * You are given two strings of the same length s and t.
     * In one step you can choose any character of t and replace it with another character.
     * <p>
     * An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.
     *
     * @param s first string.
     * @param t second string.
     * @return the minimum number of steps to make t an anagram of s.
     * <p>
     * Constraints
     * 1 <= s.length <= 5 * 10^4
     * s.length == t.length
     * s and t consist of lowercase English letters only.
     */
    public int minSteps(String s, String t) {
        int[] sArr = new int[26];
        int[] tArr = new int[26];

        for (int index = 0; index < s.length(); index++) {
            sArr[s.charAt(index) - 'a']++;
            tArr[t.charAt(index) - 'a']++;
        }

        int count = 0;


        for (int index = 0; index < 26; index++) {
            count += Math.abs(sArr[index] - tArr[index]);

        }

        return count / 2;
    }


}
