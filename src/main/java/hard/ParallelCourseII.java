package hard;

import java.util.*;

public class ParallelCourseII {
    /**
     * You are given an integer n, which indicates that there are n courses labeled from 1 to n.
     * You are also given a 2D integer array relations where relations[j] = [prevCourse[j], nextCourse[j]
     * denotes that course prevCourse[j] has to be completed before course nextCourse[j] (prerequisite relationship).
     * <p>
     * You must find the minimum number of months needed to complete all the courses following these rules:
     *
     * @param n         - number of courses.
     * @param relations - relationship between the course. Previous course must be completed as prerequisites.
     * @param time
     * @return minimum number of months required to complete all the courses.
     */

    public int minimumTime(int n, int[][] relations, int[] time) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int[] in_degree = new int[n + 1];
        for (int[] relation : relations) {
            graph.computeIfAbsent(relation[0], k -> new ArrayList<>()).add(relation[1]);
            in_degree[relation[1]]++;
        }

        int[] dist = new int[n + 1];
        System.arraycopy(time, 0, dist, 1, n);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            if (in_degree[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int course = q.poll();
            if (graph.containsKey(course)) {
                for (int next_course : graph.get(course)) {
                    dist[next_course] = Math.max(dist[next_course], dist[course] + time[next_course - 1]);
                    in_degree[next_course]--;
                    if (in_degree[next_course] == 0) {
                        q.add(next_course);
                    }
                }
            }
        }

        int maxVal = 0;
        for (int val : dist) {
            maxVal = Math.max(maxVal, val);
        }
        return maxVal;
    }

}
