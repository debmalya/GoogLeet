package hard;

import java.util.Arrays;

public class MinimumNumberofTapstoOpentoWateraGarden {
    /**
     * There is a one-dimensional garden on the x-axis. The garden starts at the point 0 and ends at the point n.
     * (i.e. The length of the garden is n).
     * <p>
     * There are n + 1 taps located at points [0, 1, ..., n] in the garden.
     * <p>
     *
     * @param n      length of the garden.
     * @param ranges an integer array ranges of length n + 1 where ranges[i] (0-indexed) means
     *               the i-th tap can water the area [i - ranges[i], i + ranges[i]] if it was open.
     * @return the minimum number of taps that should be open to water the whole garden, If the garden cannot be watered return -1.
     * @Hint Create intervals of the area covered by each tap, sort intervals by the left end.
     * We need to cover the interval [0, n]. we can start with the first interval and out of all intervals
     * that intersect with it we choose the one that covers the farthest point to the right.
     * What if there is a gap between intervals that is not covered ?
     * we should stop and return -1 as there is some interval that cannot be covered.
     */
    public int minTaps(int n, int[] ranges) {
        int[] arr = new int[n + 1];
        Arrays.fill(arr, 0);

        for (int i = 0; i < ranges.length; i++) {
            if (ranges[i] == 0) continue;
            int left = Math.max(0, i - ranges[i]);
            arr[left] = Math.max(arr[left], i + ranges[i]);
        }

        int end = 0, far_can_reach = 0, cnt = 0;
        for (int i = 0; i <= n; i++) {
            if (i > end) {
                if (far_can_reach <= end) return -1;
                end = far_can_reach;
                cnt++;
            }
            far_can_reach = Math.max(far_can_reach, arr[i]);
        }

        return cnt + (end < n ? 1 : 0);
    }
}
