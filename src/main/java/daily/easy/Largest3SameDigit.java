package daily.easy;

public class Largest3SameDigit {
    public String largestGoodInteger(String num) {

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length(); i++) {
            if (i >= 2 && num.charAt(i) == num.charAt(i - 1) && num.charAt(i) == num.charAt(i - 2)) {
                int current = Integer.parseInt(num.substring(i - 2, i + 1));
                if (current > max) {
                    max = current;
                }
            }
        }

        if (max != Integer.MIN_VALUE) {
            return String.format("%03d", max);
        }
        return "";
    }
}
