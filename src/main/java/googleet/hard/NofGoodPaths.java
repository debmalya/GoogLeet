package googleet.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class NofGoodPaths {

	/**
	 * There is a tree (i.e. a connected, undirected graph with no cycles)
	 * consisting of n nodes numbered from 0 to n - 1 and exactly n - 1 edges.
	 * 
	 * You are given a 0-indexed integer array vals of length n where vals[i]
	 * denotes the value of the ith node. You are also given a 2D integer array
	 * edges where edges[i] = [ai, bi] denotes that there exists an undirected edge
	 * connecting nodes ai and bi.
	 * 
	 * A good path is a simple path that satisfies the following conditions:
	 * 
	 * The starting node and the ending node have the same value. All nodes between
	 * the starting node and the ending node have values less than or equal to the
	 * starting node (i.e. the starting node's value should be the maximum value
	 * along the path). Return the number of distinct good paths.
	 * 
	 * Note that a path and its reverse are counted as the same path. For example, 0
	 * -> 1 is considered to be the same as 1 -> 0. A single node is also considered
	 * as a valid path.
	 * 
	 * @param vals
	 * @param edges
	 * @return
	 */
	class UnionFind {
	    int[] parent;
	    int[] rank;

	    public UnionFind(int size) {
	        parent = new int[size];
	        for (int i = 0; i < size; i++)
	            parent[i] = i;
	        rank = new int[size];
	    }

	    public int find(int x) {
	        if (parent[x] != x)
	            parent[x] = find(parent[x]);
	        return parent[x];
	    }

	    public void union_set(int x, int y) {
	        int xset = find(x), yset = find(y);
	        if (xset == yset) {
	            return;
	        } else if (rank[xset] < rank[yset]) {
	            parent[xset] = yset;
	        } else if (rank[xset] > rank[yset]) {
	            parent[yset] = xset;
	        } else {
	            parent[yset] = xset;
	            rank[xset]++;
	        }
	    }
	}

	
	    public int numberOfGoodPaths(int[] vals, int[][] edges) {
	        Map<Integer, List<Integer>> adj = new HashMap<>();
	        for (int[] edge : edges) {
	            int a = edge[0], b = edge[1];
	            adj.computeIfAbsent(a, value -> new ArrayList<Integer>()).add(b);
	            adj.computeIfAbsent(b, value -> new ArrayList<Integer>()).add(a);
	        }

	        int n = vals.length;
	        // Mapping from value to all the nodes having the same value in sorted order of
	        // values.
	        TreeMap<Integer, List<Integer>> valuesToNodes = new TreeMap<>();
	        for (int i = 0; i < n; i++) {
	            valuesToNodes.computeIfAbsent(vals[i], value -> new ArrayList<Integer>()).add(i);
	        }

	        UnionFind dsu = new UnionFind(n);
	        int goodPaths = 0;

	        // Iterate over all the nodes with the same value in sorted order, starting from
	        // the lowest value.
	        for (int value : valuesToNodes.keySet()) {
	            // For every node in nodes, combine the sets of the node and its neighbors into
	            // one set.
	            for (int node : valuesToNodes.get(value)) {
	                if (!adj.containsKey(node))
	                    continue;
	                for (int neighbor : adj.get(node)) {
	                    // Only choose neighbors with a smaller value, as there is no point in
	                    // traversing to other neighbors.
	                    if (vals[node] >= vals[neighbor]) {
	                        dsu.union_set(node, neighbor);
	                    }
	                }
	            }
	            // Map to compute the number of nodes under observation (with the same values)
	            // in each of the sets.
	            Map<Integer, Integer> group = new HashMap<>();
	            // Iterate over all the nodes. Get the set of each node and increase the count
	            // of the set by 1.
	            for (int u : valuesToNodes.get(value)) {
	                group.put(dsu.find(u), group.getOrDefault(dsu.find(u), 0) + 1);
	            }
	            // For each set of "size", add size * (size + 1) / 2 to the number of goodPaths.
	            for (int key : group.keySet()) {
	                int size = group.get(key);
	                goodPaths += size * (size + 1) / 2;
	            }
	        }
	        return goodPaths;
	    }
	

}
