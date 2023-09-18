package hard;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;


public class ShortestPathVisitingAllNodes {
    class Node {
        int node;
        int mask;
        int cost;

        Node(int node, int mask, int cost) {
            this.node = node;
            this.mask = mask;
            this.cost = cost;
        }
    }


    /**
     * You have an undirected, connected graph of n nodes labeled from 0 to n - 1.
     * You are given an array graph where graph[i] is a list of all the nodes connected with node i by an edge.
     *
     * @param graph an array graph where graph[i] is a list of all the nodes connected with node i by an edge
     * @return the length of the shortest path that visits every node.
     * You may start and stop at any node, you may revisit nodes multiple times, and you may reuse edges.
     */
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        int all = (1 << n) - 1;
        Set<Pair<Integer, Integer>> vis = new HashSet<>();
        Queue<Node> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int maskValue = (1 << i);
            Node thisNode = new Node(i, maskValue, 1);
            q.add(thisNode);
            vis.add(new Pair<>(i, maskValue));
        }

        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (curr.mask == all) {
                return curr.cost - 1;
            }

            for (int adj : graph[curr.node]) {
                int bothVisitedMask = curr.mask | (1 << adj);
                Node thisNode = new Node(adj, bothVisitedMask, curr.cost + 1);

                if (!vis.contains(new Pair<>(adj, bothVisitedMask))) {
                    vis.add(new Pair<>(adj, bothVisitedMask));
                    q.add(thisNode);
                }
            }
        }

        return -1;
    }

    private class Pair<T, T1> {
        T key;
        T1 value;

        public Pair(T key, T1 value) {
            this.key = key;
            this.value = value;
        }
    }
}
