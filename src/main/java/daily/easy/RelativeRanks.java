package daily.easy;

import java.util.Arrays;
import java.util.Collections;

public class RelativeRanks {
    /**
     * You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition.
     * All the scores are guaranteed to be unique.
     * <p>
     * The athletes are placed based on their scores, where the 1st place athlete has the highest score,
     * the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:
     * <p>
     * The 1st place athlete's rank is "Gold Medal".
     * The 2nd place athlete's rank is "Silver Medal".
     * The 3rd place athlete's rank is "Bronze Medal".
     * For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
     * Return an array answer of size n where answer[i] is the rank of the ith athlete.
     *
     * @param score
     * @return
     */
    public String[] findRelativeRanks(int[] score) {
        int len = score.length;

        Integer[] arr = new Integer[len];
        String[] ranks = new String[len];
        
        for (var index = 0; index < len; index++) {
            arr[index] = score[index];
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for (var index = 0; index < len; index++) {
            var position = getPosition(arr, score[index]);
            switch (position) {
                case 0:
                    ranks[index] = "Gold Medal";
                    break;
                case 1:
                    ranks[index] = "Silver Medal";
                    break;
                case 2:
                    ranks[index] = "Bronze Medal";
                    break;
                default:
                    ranks[index] = String.valueOf(position + 1);
                    break;
            }
        }

        return ranks;
    }

    private int getPosition(Integer[] arr, int i) {
        int position = -1;
        for (var index = 0; index < arr.length; index++) {
            if (i == arr[index]) {
                position = index;
                break;
            }
        }
        return position;
    }
}
