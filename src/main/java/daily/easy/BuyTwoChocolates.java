package daily.easy;

public class BuyTwoChocolates {
    /**
     * You are given an integer array prices representing the prices of various chocolates in a store.
     * You are also given a single integer money, which represents your initial amount of money.
     * <p>
     * You must buy exactly two chocolates in such a way that you still have some non-negative leftover money.
     * You would like to minimize the sum of the prices of the two chocolates you buy.
     * <p>
     * Return the amount of money you will have leftover after buying the two chocolates.
     * If there is no way for you to buy two chocolates without ending up in debt, return money.
     * Note that the leftover must be non-negative.
     *
     * @param prices representing the prices of various chocolates in a store.
     * @param money  initial amount of money.
     * @return the amount of money you will have leftover after buying the two chocolates.
     */
    public int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE;
        int minNext = Integer.MAX_VALUE;

        for (int index = 0; index < prices.length; index++) {
            if (prices[index] < min) {
                minNext = min;
                min = prices[index];
            } else if (prices[index] < minNext) {
                minNext = prices[index];
            }
        }
        if ((money - min - minNext) > -1) {
            return money - min - minNext;
        }
        return money;
    }
}
