package daily;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class IfPathExists {
	/**
	 * There is a bi-directional graph with n vertices, where each vertex is labeled
	 * from 0 to n - 1 (inclusive). The edges in the graph are represented as a 2D
	 * integer array edges, where each edges[i] = [ui, vi] denotes a bi-directional
	 * edge between vertex ui and vertex vi. Every vertex pair is connected by at
	 * most one edge, and no vertex has an edge to itself.
	 * 
	 * You want to determine if there is a valid path that exists from vertex source
	 * to vertex destination.
	 * 
	 * Given edges and the integers n, source, and destination, return true if there
	 * is a valid path from source to destination, or false otherwise.
	 * 
	 * @param n           - number of vertices
	 * @param edges       - bidirectional edges
	 * @param source      -
	 * @param destination
	 * @return
	 */
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        //Store all edges in 'graph'.
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            int a = edge[0], b = edge[1];
            graph.computeIfAbsent(a, val -> new ArrayList<Integer>()).add(b);
            graph.computeIfAbsent(b, val -> new ArrayList<Integer>()).add(a);
        }
        
        // Store all the nodes to be visited in 'queue'.
        boolean[] seen = new boolean[n];
        seen[source] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(source);
        
        while (!queue.isEmpty()) {
            int currNode = queue.poll();
            if (currNode == destination) {
                return true; 
            }

            // For all the neighbors of the current node, if we haven't visit it before,            
            // add it to 'queue' and mark it as visited.
            for (int nextNode : graph.get(currNode)) {
                if (!seen[nextNode]) {
                    seen[nextNode] = true;
                    queue.offer(nextNode);
                }
            }
        }
        
        return false;
    }

}
