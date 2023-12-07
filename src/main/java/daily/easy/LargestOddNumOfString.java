package daily.easy;

public class LargestOddNumOfString {
    /**
     * You are given a string num, representing a large integer.
     * <p>
     * A substring is a contiguous sequence of characters within a string.
     *
     * @param num number as a string.
     * @return the largest-valued odd integer (as a string) that is a non-empty substring of num,
     * * or an empty string "" if no odd integer exists.
     */
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i > -1; i--) {
            if ((num.charAt(i) - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }


}
