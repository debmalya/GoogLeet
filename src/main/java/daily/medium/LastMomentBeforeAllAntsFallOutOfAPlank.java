package daily.medium;

import java.util.Arrays;

public class LastMomentBeforeAllAntsFallOutOfAPlank {
    /**
     * We have a wooden plank of the length n units. Some ants are walking on the plank, each ant moves with a speed of 1 unit per second.
     * Some of the ants move to the left, the other move to the right.
     * <p>
     * When two ants moving in two different directions meet at some point, they change their directions and continue moving again.
     * Assume changing directions does not take any additional time.
     * <p>
     * When an ant reaches one end of the plank at a time t, it falls out of the plank immediately.
     * <p>
     * Given an integer n and two integer arrays left and right,
     * the positions of the ants moving to the left and the right, return the moment when the last ant(s) fall out of the plank.
     *
     * @param n     length of a wooden plank.
     * @param left  integer array positions of the ants moving to the left.
     * @param right integer array positions of the ants moving to the right.
     * @return the moment when the last ant(s) fall out of the plank.
     */
    public int getLastMoment(int n, int[] left, int[] right) {
        int totalDistanceLeft;
        int totalDistanceRight;
        if (left.length == 0)
            totalDistanceLeft = 0;
        else
            totalDistanceLeft = Arrays.stream(left).max().getAsInt();
        if (right.length == 0)
            totalDistanceRight = n;
        else
            totalDistanceRight = Arrays.stream(right).min().getAsInt();
        return Math.max(totalDistanceLeft, n - totalDistanceRight);

    }

    public int getLastMoment0(int n, int[] left, int[] right) {
        int max = Integer.MIN_VALUE;
        for (int each : left) {
            max = Math.max(max, each);
        }

        for (int each : right) {
            max = Math.max(max, each);
        }
        return max;
    }
}
