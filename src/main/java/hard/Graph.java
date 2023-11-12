package hard;

import java.util.*;

/**
 * There is a directed weighted graph that consists of n nodes numbered from 0 to n - 1.
 * The edges of the graph are initially represented by the given array edges where edges[i] = [from-i, to-i, edgeCost-i]
 * meaning that there is an edge from from-i to toi with the cost edgeCost-i.
 */
public class Graph {
    private final List<List<int[]>> adjacencyList;

    /**
     * Graph(int n, int[][] edges) initializes the object with n nodes and the given edges.
     *
     * @param n     number of nodes.
     * @param edges connections ( source , destination, cost).
     */
    public Graph(int n, int[][] edges) {
        adjacencyList = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            adjacencyList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            addEdge(edge);
        }
    }

    /**
     * addEdge(int[] edge) adds an edge to the list of edges where edge = [from, to, edgeCost].
     * It is guaranteed that there is no edge between the two nodes before adding this one.
     *
     * @param edge parameter.
     */
    public void addEdge(int[] edge) {
        int[] edgeArray = {edge[1], edge[2]};
        adjacencyList.get(edge[0]).add(edgeArray);
    }

    /**
     * The cost of a path is the sum of the costs of the edges in the path.
     *
     * @param node1 source.
     * @param node2 destination.
     * @return the minimum cost of a path from node1 to node2. If no path exists, return -1.
     */
    public int shortestPath(int node1, int node2) {
        return dijkstra(node1, node2);
    }

    private int dijkstra(int start, int end) {
        int n = adjacencyList.size();
        int[] distances = new int[n];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[start] = 0;

        // Priority queue to efficiently retrieve the node with the minimum distance
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        priorityQueue.add(new int[]{0, start});

        while (!priorityQueue.isEmpty()) {
            int[] current = priorityQueue.poll();
            int currentNode = current[1], currentCost = current[0];

            // Skip if a shorter path has already been found
            if (currentCost > distances[currentNode])
                continue;

            // If found the target return the cost
            if (currentNode == end)
                return currentCost;

            // Explore neighbors and update distances
            for (int[] edge : adjacencyList.get(currentNode)) {
                int neighbor = edge[0], edgeLength = edge[1];
                int newRouteCost = edgeLength + distances[currentNode];

                // Update distance if a shorter route is found
                if (distances[neighbor] > newRouteCost) {
                    distances[neighbor] = newRouteCost;
                    priorityQueue.add(new int[]{newRouteCost, neighbor});
                }
            }
        }

        // Return the minimum distance or -1 if no path exists
        return ((distances[end] == Integer.MAX_VALUE) ? -1 : distances[end]);
    }

}
