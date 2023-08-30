package daily;

public class MinimumPenaltyForAShop {
    /**
     * You are given the customer visit log of a shop represented by a 0-indexed string customers consisting only of characters 'N' and 'Y':
     * if the ith character is 'Y', it means that customers come at the ith hour.
     * whereas 'N' indicates that no customers come at the ith hour.
     * If the shop closes at the jth hour (0 <= j <= n), the penalty is calculated as follows:
     * For every hour when the shop is open and no customers come, the penalty increases by 1.
     * For every hour when the shop is closed and customers come, the penalty increases by 1.
     *
     * @param customers visit log of a shop represented by a 0-indexed string customers consisting only of characters 'N' and 'Y'.
     * @return the earliest hour at which the shop must be closed to incur a minimum penalty.
     */
    public int bestClosingTime(String customers) {
        int max_score = 0, score = 0, best_hour = -1;
        for (int i = 0; i < customers.length(); ++i) {
            score += (customers.charAt(i) == 'Y') ? 1 : -1;
            if (score > max_score) {
                max_score = score;
                best_hour = i;
            }
        }
        return best_hour + 1;
    }
}
