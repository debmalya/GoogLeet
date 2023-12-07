package daily.easy;

public class CalculateMoney {
    /**
     * Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
     * <p>
     * He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday,
     * he will put in $1 more than the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.
     * Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.
     *
     * @param n
     * @return the total amount of money
     */
    public int totalMoney(int n) {
        int total = 0;
        int day = 0;
        int week = 1;
        int daySaving = week;
        while (day < n) {
            day++;
            total += daySaving;
            daySaving++;

            if ((day) % 7 == 0) {
                week++;
                daySaving = week;
            }

        }
        return total;
    }

    public int totalMoney0(int n) {
        int total = 0;
        int day = 0;
        int week = 1;
        int daySaving = week;
        while (day < n) {
            day++;
            total += daySaving;
            daySaving++;

            if ((day) % 7 == 0) {
                week++;
                daySaving = week;
            }

        }
        return total;
    }
}
