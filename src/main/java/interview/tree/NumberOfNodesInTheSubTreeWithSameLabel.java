package interview.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NumberOfNodesInTheSubTreeWithSameLabel {

	/**
	 * You are given a tree (i.e. a connected, undirected graph that has no cycles)
	 * consisting of n nodes numbered from 0 to n - 1 and exactly n - 1 edges. The
	 * root of the tree is the node 0, and each node of the tree has a label which
	 * is a lower-case character given in the string labels (i.e. The node with the
	 * number i has the label labels[i]).
	 * 
	 * The edges array is given on the form edges[i] = [ai, bi], which means there
	 * is an edge between nodes ai and bi in the tree.
	 * 
	 * Return an array of size n where ans[i] is the number of nodes in the subtree
	 * of the ith node which have the same label as node i.
	 * 
	 * A subtree of a tree T is the tree consisting of a node in T and all of its
	 * descendant nodes.
	 * 
	 * @param n      - number of edges.
	 * @param edges  - link between vertices.
	 * @param labels - associated with vertices.
	 * @return array of size n where ans[i] is the number of nodes in the subtree
	 *         having the same label.
	 */

	public int[] dfs(int node, int parent, Map<Integer, List<Integer>> adj, char[] labels, int[] ans) {
		// Store count of all alphabets in the subtree of the node.
		int[] nodeCounts = new int[26];
		nodeCounts[labels[node] - 'a'] = 1;

		if (!adj.containsKey(node))
			return nodeCounts;
		for (int child : adj.get(node)) {
			if (child == parent) {
				continue;
			}
			int[] childCounts = dfs(child, node, adj, labels, ans);
			// Add frequencies of the child node in the parent node's frequency array.
			for (int i = 0; i < 26; i++) {
				nodeCounts[i] += childCounts[i];
			}
		}

		ans[node] = nodeCounts[labels[node] - 'a'];
		return nodeCounts;
	}

	public int[] countSubTrees(int n, int[][] edges, String labels) {
		Map<Integer, List<Integer>> adj = new HashMap<>();
		for (int[] edge : edges) {
			int a = edge[0], b = edge[1];
			adj.computeIfAbsent(a, value -> new ArrayList<Integer>()).add(b);
			adj.computeIfAbsent(b, value -> new ArrayList<Integer>()).add(a);
		}

		int[] ans = new int[n];
		char[] label = labels.toCharArray();
		dfs(0, -1, adj, label, ans);
		return ans;
	}

}
