package daily.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumTimeToMakeRopeColourful {
    /**
     * Alice has n balloons arranged on a rope. You are given a 0-indexed string colors where colors[i] is the color of the ith balloon.
     * <p>
     * Alice wants the rope to be colorful. She does not want two consecutive balloons to be of the same color, so she asks Bob for help.
     * Bob can remove some balloons from the rope to make it colorful.
     * You are given a 0-indexed integer array neededTime where neededTime[i] is the time (in seconds) that Bob needs
     * to remove the ith balloon from the rope.
     *
     * @param colors     0-indexed string colors
     * @param neededTime 0-indexed integer array neededTime
     * @return the minimum time Bob needs to make the rope colorful.
     */
    public int minCost(String colors, int[] neededTime) {
        int cost = 0;
        int size = colors.length();
        char prev = colors.charAt(0);
        List<Integer> costList = new ArrayList<>();
        for (int index = 1; index < size; index++) {
            char current = colors.charAt(index);
            if (prev == current) {
                // need to remove
                if (costList.isEmpty()) {
                    costList.add(neededTime[index - 1]);
                }
                costList.add(neededTime[index]);
            } else if (prev != current) {
                cost += getCost(costList);
            }
            prev = colors.charAt(index);
        }
        cost += getCost(costList);
        return cost;
    }

    private static int getCost(List<Integer> costList) {
        int cost = 0;
        if (!costList.isEmpty()) {
            Collections.sort(costList);
            int size = costList.size() - 1;
            for (int costIndex = 0; costIndex < size; costIndex++) {
                cost += costList.get(costIndex);
            }
            costList.clear();
        }
        return cost;
    }

    public int minCost0(String colors, int[] neededTime) {
        char[] colourfulCharacters = colors.toCharArray();
        char prev = colourfulCharacters[0];
        int size = colourfulCharacters.length;
        int cost = 0;
        for (int index = 1; index < size; index++) {
            boolean changed = false;
            if (prev == colourfulCharacters[index]) {
                // need to remove
                if (neededTime[index - 1] > neededTime[index]) {
                    cost += neededTime[index];
                } else {
                    cost += neededTime[index - 1];
                }
            }
            prev = colourfulCharacters[index];
        }
        return cost;
    }
}
