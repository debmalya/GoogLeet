package daily.easy;

public class MinimumChanges {
    /**
     * You are given a string s consisting only of the characters '0' and '1'. In one operation,
     * you can change any '0' to '1' or vice versa.
     * <p>
     * The string is called alternating if no two adjacent characters are equal.
     * For example, the string "010" is alternating, while the string "0100" is not.
     *
     * @param s
     * @return
     */
    public int minOperations(String s) {
        int swaps = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0)
                swaps += s.charAt(i) == '0' ? 0 : 1;
            else
                swaps += s.charAt(i) == '1' ? 0 : 1;
        }
        return Math.min(swaps, s.length() - swaps);
    }

    public int minOperations0(String s) {
        return Math.min(fromStart(s), fromEnd(s));
    }

    private int fromEnd(String s) {
        int changeCount = 0;
        char prev = s.charAt(s.length() - 1);
        for (int index = s.length() - 2; index > -1; index--) {
            char currentChar = s.charAt(index);
            if (prev == s.charAt(index)) {
                changeCount++;
                currentChar = currentChar == '0' ? '1' : '0';
            }
            prev = currentChar;
        }
        return changeCount;
    }

    private static int fromStart(String s) {
        int changeCount = 0;
        char prev = s.charAt(0);
        for (int index = 1; index < s.length(); index++) {
            char currentChar = s.charAt(index);
            if (prev == s.charAt(index)) {
                changeCount++;
                currentChar = currentChar == '0' ? '1' : '0';
            }
            prev = currentChar;
        }
        return changeCount;
    }
}
