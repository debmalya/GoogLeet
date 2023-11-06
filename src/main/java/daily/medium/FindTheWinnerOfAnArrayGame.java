package daily.medium;

import java.util.*;

public class FindTheWinnerOfAnArrayGame {
    /**
     * Given an integer array arr of distinct integers and an integer k.
     * <p>
     * A game will be played between the first two elements of the array (i.e. arr[0] and arr[1]).
     * In each round of the game, we compare arr[0] with arr[1], the larger integer wins and remains at position 0,
     * and the smaller integer moves to the end of the array. The game ends when an integer wins k consecutive rounds.
     * <p>
     * Return the integer which will win the game.
     * <p>
     * It is guaranteed that there will be a winner of the game.
     *
     * @param arr integer array.
     * @param k   consecutive round.
     * @return winner of the game.
     * <p>
     * Input: arr = [2,1,3,5,4,6,7], k = 2
     * Output: 5
     * Explanation: Let's see the rounds of the game:
     * Round |       arr       | winner | win_count
     * 1   | [2,1,3,5,4,6,7] | 2      | 1
     * 2   | [2,3,5,4,6,7,1] | 3      | 1
     * 3   | [3,5,4,6,7,1,2] | 5      | 1
     * 4   | [5,4,6,7,1,2,3] | 5      | 2
     * So we can see that 4 rounds will be played and 5 is the winner because it wins 2 consecutive games.
     */
    public int getWinner(int[] arr, int k) {
        if (k == 1) {
            return Math.max(arr[0], arr[1]);
        }
        if (k >= arr.length) {
            return Arrays.stream(arr).max().getAsInt();
        }

        int current_winner = arr[0];
        int consecutive_wins = 0;

        for (int i = 1; i < arr.length; i++) {
            if (current_winner > arr[i]) {
                consecutive_wins++;
            } else {
                current_winner = arr[i];
                consecutive_wins = 1;
            }

            if (consecutive_wins == k) {
                return current_winner;
            }
        }

        return current_winner;
    }

    public int getWinner0(int[] arr, int k) {
        int winner = 0;
        Queue<Integer> losers = new LinkedList<>();
        Map<Integer, Integer> winnerCount = new HashMap<>();
        int max = arr[0];
        for (int index = 1; index < arr.length; index++) {
            max = Math.max(max, arr[index]);
            int winningIndex = arr[0] > arr[index] ? 0 : index;
            int losingIndex = arr[0] < arr[index] ? 0 : index;
            losers.offer(arr[losingIndex]);
            arr[0] = arr[winningIndex];
            winnerCount.putIfAbsent(arr[0], 0);
            int count = winnerCount.get(arr[0]);
            count++;
            if (count == k) {
                winner = arr[0];
                break;
            }
            winnerCount.put(arr[0], count);
        }

        if (k > max) {
            return max;
        }

        while (!losers.isEmpty()) {
            int existingLosers = losers.poll();
            int currentWinner = Math.max(arr[0], existingLosers);
            int currentLoser = Math.min(arr[0], existingLosers);
            losers.offer(currentLoser);
            arr[0] = currentWinner;
            winnerCount.putIfAbsent(arr[0], 0);
            int count = winnerCount.get(arr[0]);
            count++;
            if (count == k) {
                winner = arr[0];
                break;
            }
            winnerCount.put(arr[0], count);
        }
        return winner;
    }
}
