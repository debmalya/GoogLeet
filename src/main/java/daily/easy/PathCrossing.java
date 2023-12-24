package daily.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PathCrossing {
    /**
     * Given a string path, where path[i] = 'N', 'S', 'E' or 'W', each representing moving one unit north, south, east, or west, respectively.
     * You start at the origin (0, 0) on a 2D plane and walk on the path specified by path.
     * <p>
     * Return true if the path crosses itself at any point, that is, if at any time you are on a location you have previously visited.
     * Return false otherwise.
     *
     * @param path
     * @return
     */
    public boolean isPathCrossing(String path) {
        Map<Integer, Set<Integer>> previouslyVisited = new HashMap<>();
        int row = 0;
        int col = 0;
        Set<Integer> visitedCols = new HashSet<>();
        visitedCols.add(col);
        previouslyVisited.put(row, visitedCols);

        for (int index = 0; index < path.length(); index++) {
            switch (path.charAt(index)) {
                case 'N' -> col--;
                case 'S' -> col++;
                case 'E' -> row--;
                case 'W' -> row++;
            }
            var existingCols = previouslyVisited.getOrDefault(row, new HashSet<>());
            if (existingCols.contains(col)) {
                return true;
            }
            existingCols.add(col);
            previouslyVisited.put(row, existingCols);
        }
        return false;
    }

    public boolean isPathCrossing0(String path) {
        Map<Integer, Set<Integer>> previouslyVisited = new HashMap<>();
        int row = 0;
        int col = 0;
        Set<Integer> visitedCols = new HashSet<>();
        visitedCols.add(col);
        previouslyVisited.put(row, visitedCols);

        for (int index = 0; index < path.length(); index++) {
            switch (path.charAt(index)) {
                case 'N' -> col--;
                case 'S' -> col++;
                case 'E' -> row--;
                case 'W' -> row++;
            }
            var existingCols = previouslyVisited.getOrDefault(row, new HashSet<>());
            if (existingCols.contains(col)) {
                return true;
            }
            existingCols.add(col);
            previouslyVisited.put(row, existingCols);
        }
        return false;
    }
}
