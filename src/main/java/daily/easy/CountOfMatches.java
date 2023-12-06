package daily.easy;

public class CountOfMatches {
    /**
     * You are given an integer n, the number of teams in a tournament that has strange rules:
     * <p>
     * If the current number of teams is even, each team gets paired with another team.
     * A total of n / 2 matches are played, and n / 2 teams advance to the next round.
     * <p>
     * If the current number of teams is odd, one team randomly advances in the tournament,
     * and the rest gets paired. A total of (n - 1) / 2 matches are played, and (n - 1) / 2 + 1 teams advance to the next round.
     *
     * @param n number of teams.
     * @return the number of matches played in the tournament until a winner is decided.
     */
    public int numberOfMatches(int n) {
        int noOfMatches = 0;
        while (n > 1) {
            noOfMatches = noOfMatches + (n / 2);
            int oddTeam = 0;
            if (n % 2 == 1) {
                oddTeam++;
            }
            n /= 2;
            n += oddTeam;
        }
        return noOfMatches;
    }
}
