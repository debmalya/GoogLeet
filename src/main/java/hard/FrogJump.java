package hard;

import java.util.HashMap;
import java.util.HashSet;

public class FrogJump {
    /**
     * Given a list of stones' positions (in units) in sorted ascending order, determine if the frog can cross the river by landing on the last stone. Initially, the frog is on the first stone and assumes the first jump must be 1 unit.
     * <p>
     * If the frog's last jump was k units, its next jump must be either k - 1, k, or k + 1 units. The frog can only jump in the forward direction.
     *
     * @param stones
     * @return
     */
    public boolean canCross(int[] stones) {
        HashMap<Integer, HashSet<Integer>> map = new HashMap<>();
        int n = stones.length;
        for (int j : stones) {
            map.put(j, new HashSet<>());
        }
        map.get(stones[0]).add(0);
        for (int stone : stones) {
            HashSet<Integer> set = map.get(stone);
            for (int val : set) {
                if (val - 1 > 0 && map.containsKey(stone + val - 1)) {
                    map.get(stone + val - 1).add(val - 1);
                }
                if (val > 0 && map.containsKey(stone + val)) {
                    map.get(stone + val).add(val);

                }
                if (map.containsKey(stone + val + 1)) {
                    map.get(stone + val + 1).add(val + 1);
                }
            }
        }
        return map.get(stones[n - 1]).size() > 0;
    }
}
