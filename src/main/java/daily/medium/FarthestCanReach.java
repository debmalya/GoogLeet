package daily.medium;

import java.util.PriorityQueue;

public class FarthestCanReach {
    /**
     * You are given an integer array heights representing the heights of buildings, some bricks, and some ladders.
     * <p>
     * You start your journey from building 0 and move to the next building by possibly using bricks or ladders.
     * <p>
     * While moving from building i to building i+1 (0-indexed),
     * <p>
     * If the current building's height is greater than or equal to the next building's height, you do not need a ladder or bricks.
     * If the current building's height is less than the next building's height, you can either use one ladder or (h[i+1] - h[i]) bricks.
     * Return the furthest building index (0-indexed) you can reach if you use the given ladders and bricks optimally.
     *
     * @param heights - an integer array heights representing the heights of buildings.
     * @param bricks  - number of bricks.
     * @param ladders - number of ladders.
     * @return the furthest building index (0-indexed) you can reach.
     */
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> p = new PriorityQueue<>((a, c) -> c - a);

        int i = 0, diff = 0;
        for (i = 0; i < heights.length - 1; i++) {
            diff = heights[i + 1] - heights[i];

            if (diff <= 0) {
                continue;
            }

            bricks -= diff;
            p.offer(diff);

            if (bricks < 0) {
                bricks += p.poll();
                ladders--;
            }

            if (ladders < 0) {
                break;
            }
        }

        return i;
    }
}
