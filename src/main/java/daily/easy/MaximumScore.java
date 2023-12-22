package daily.easy;

public class MaximumScore {
    /**
     * Given a string s of zeros and ones, return the maximum score after splitting the string into two non-empty substrings
     * (i.e. left substring and right substring).
     *
     * @param s
     * @return the maximum score after splitting the string into two non-empty substrings
     */

    public int maxScore(String s) {
        int maxScore = 0;
        int countZerosLeft = 0;
        int countOnesRight = (int) s.chars().filter(ch -> ch == '1').count();


        for (int i = 0; i < s.length() - 1; i++) {
            countZerosLeft += s.charAt(i) == '0' ? 1 : 0;
            countOnesRight -= s.charAt(i) == '1' ? 1 : 0;
            maxScore = Math.max(maxScore, countZerosLeft + countOnesRight);
        }

        return maxScore;
    }


}
