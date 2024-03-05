package daily.medium;

import java.util.Arrays;

public class BagOfToken {
    /**
     * You start with an initial power of power, an initial score of 0, and a bag of tokens given as an integer array tokens,
     * where each tokens[i] donates the value of token[i].
     * <p>
     * Your goal is to maximize the total score by strategically playing these tokens.
     * In one move, you can play an unplayed token in one of the two ways (but not both for the same token):
     * <p>
     * Face-up: If your current power is at least tokens[i], you may play tokeni, losing tokens[i] power and gaining 1 score.
     * Face-down: If your current score is at least 1, you may play tokeni, gaining tokens[i] power and losing 1 score.
     * Return the maximum possible score you can achieve after playing any number of tokens.
     *
     * @param tokens - an integer array tokens.
     * @param power
     * @return
     */
    
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int s = 0;
        int maxi = 0;
        int l = 0, r = tokens.length - 1;

        while (l <= r) {
            if (power >= tokens[l]) {
                power -= tokens[l];
                s++;
                l++;
                maxi = Math.max(maxi, s);
            } else if (s > 0) {
                power += tokens[r];
                s--;
                r--;
            } else {
                break;
            }
        }

        return maxi;
    }

}
