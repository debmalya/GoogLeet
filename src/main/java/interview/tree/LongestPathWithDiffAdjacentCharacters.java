package interview.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestPathWithDiffAdjacentCharacters {
	/**
	 * You are given a tree (i.e. a connected, undirected graph that has no cycles)
	 * rooted at node 0 consisting of n nodes numbered from 0 to n - 1. The tree is
	 * represented by a 0-indexed array parent of size n, where parent[i] is the
	 * parent of node i. Since node 0 is the root, parent[0] == -1.
	 * 
	 * You are also given a string s of length n, where s[i] is the character
	 * assigned to node i.
	 * 
	 * Return the length of the longest path in the tree such that no pair of
	 * adjacent nodes on the path have the same character assigned to them.
	 * 
	 * @param parent
	 * @param s
	 * @return
	 */

	private int longestPath = 1;

	public int dfs(int currentNode, Map<Integer, List<Integer>> children, String s) {
		// If the node is the only child, return 1 for the currentNode itself.
		if (!children.containsKey(currentNode)) {
			return 1;
		}

		// Longest and second longest path starting from currentNode (does not count the
		// currentNode itself).
		int longestChain = 0, secondLongestChain = 0;
		for (int child : children.get(currentNode)) {
			// Get the number of nodes in the longest chain starting from the child,
			// including the child.
			int longestChainStartingFromChild = dfs(child, children, s);
			// We won't move to the child if it has the same character as the currentNode.
			if (s.charAt(currentNode) == s.charAt(child)) {
				continue;
			}
			// Modify the longestChain and secondLongestChain if
			// longestChainStartingFromChild
			// is bigger.
			if (longestChainStartingFromChild > longestChain) {
				secondLongestChain = longestChain;
				longestChain = longestChainStartingFromChild;
			} else if (longestChainStartingFromChild > secondLongestChain) {
				secondLongestChain = longestChainStartingFromChild;
			}
		}

		// Add "1" for the node itself.
		longestPath = Math.max(longestPath, longestChain + secondLongestChain + 1);
		return longestChain + 1;
	}

	public int longestPath(int[] parent, String s) {
		int n = parent.length;
		Map<Integer, List<Integer>> children = new HashMap<>();
		// Start from node 1, since root node 0 does not have a parent.
		for (int i = 1; i < n; i++) {
			children.computeIfAbsent(parent[i], value -> new ArrayList<Integer>()).add(i);
		}

		dfs(0, children, s);

		return longestPath;
	}

}
