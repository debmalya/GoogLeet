package hard;

import java.util.Arrays;

public class Candy {

    /**
     * There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
     * <p>
     * You are giving candies to these children subjected to the following requirements:
     * <p>
     * Each child must have at least one candy.
     * Children with a higher rating get more candies than their neighbors.
     * Return the minimum number of candies you need to have to distribute the candies to the children.
     *
     * @param ratings of children.
     * @return the minimum number of candies you need to have to distribute the candies to the children.
     */
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        Arrays.fill(candies, 1);

        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }

        int totalCandies = 0;
        for (int candy : candies) {
            totalCandies += candy;
        }

        return totalCandies;
    }

    public int candy0(int[] ratings) {
        int lowestRatings = Integer.MAX_VALUE;
        int lowestIndex = 0;

        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] < lowestRatings) {
                lowestRatings = ratings[i];
                lowestIndex = i;
            }
        }

        int candyCount = 1;
        int[] candyDistribution = new int[ratings.length];
        candyDistribution[lowestIndex] = 1;

        int index = lowestIndex - 1;
        int prev = lowestIndex;
        while (index > -1) {
            candyDistribution[index] = candyDistribution[prev];
            if (ratings[index] > ratings[prev]) {
                candyDistribution[index]++;
            }
            candyCount += candyDistribution[index];
            prev = index;
            index--;
        }

        index = lowestIndex + 1;
        prev = lowestIndex;
        while (index < ratings.length) {
            candyDistribution[index] = candyDistribution[prev];
            if (ratings[index] > ratings[prev]) {
                candyDistribution[index]++;
            } else {
                candyDistribution[index]--;
            }
            candyCount += candyDistribution[index];
            prev = index;
            index++;
        }

        return candyCount;
    }
}
