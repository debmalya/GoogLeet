package daily.medium;

public class MinimumTimeToCollectGarbage {
    /**
     * @param garbage 0-indexed array of strings garbage where garbage[i] represents the assortment of garbage at the ith house.
     *                garbage[i] consists only of the characters 'M', 'P' and 'G' representing one unit of metal,
     *                paper and glass garbage respectively. Picking up one unit of any type of garbage takes 1 minute.
     * @param travel  0-indexed integer array travel where travel[i] is the number of minutes needed to go from house i to house i + 1.
     * @return
     */

    public int garbageCollection(String[] garbage, int[] travel) {
        int[] last = new int[128];
        int res = 0;
        for (int i = 0; i < garbage.length; ++i) {
            res += garbage[i].length();
            for (int j = 0; j < garbage[i].length(); ++j)
                last[garbage[i].charAt(j)] = i;
        }
        for (int j = 1; j < travel.length; ++j)
            travel[j] += travel[j - 1];
        for (int c : "PGM".toCharArray())
            if (last[c] > 0)
                res += travel[last[c] - 1];
        return res;
    }
}
