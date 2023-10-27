package daily.medium;

public class LongestPalindromicSubstring {
    /**
     * Given a string s, return the longest
     * palindromic
     * <p>
     * substring
     * in s.
     *
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {

        if (s == null || "".equals(s)) {
            return s;
        }

        int len = s.length();

        String ans = "";
        int max = 0;

        boolean[][] dp = new boolean[len][len];

        for (int j = 0; j < len; j++) {

            for (int i = 0; i <= j; i++) {

                boolean judge = s.charAt(i) == s.charAt(j);

                dp[i][j] = j - i > 2 ? dp[i + 1][j - 1] && judge : judge;

                if (dp[i][j] && j - i + 1 > max) {
                    max = j - i + 1;
                    ans = s.substring(i, j + 1);
                }
            }
        }
        return ans;
    }

    public String longestPalindrome0(String s) {
        for (int index = 0; index < s.length(); index++) {
            if (isPalindrome(s.substring(index))) {
                return s.substring(index);
            }
            String fromEnd = s.substring(0, s.length() - index - 1);
            if (isPalindrome(fromEnd)) {
                return fromEnd;
            }
            String fromBothEnd = s.substring(index + 1, s.length() - index - 1);
            if (isPalindrome(fromBothEnd)) {
                return fromBothEnd;
            }

        }
        return null;
    }

    private boolean isPalindrome(String s) {
        boolean palindromic = true;
        int last = s.length();
        for (int index = 0; index < last / 2; index++) {
            char c = s.charAt(index);
            if (s.charAt(index) != s.charAt(last - index - 1)) {
                palindromic = false;
                break;
            }
        }
        return palindromic;
    }
}
