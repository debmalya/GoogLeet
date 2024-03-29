package googleeet.medium;

import java.util.Arrays;

public class FindClosestNodeToGivenTwoNodes {
	/**
	 * You are given a directed graph of n nodes numbered from 0 to n - 1, where
	 * each node has at most one outgoing edge.
	 * 
	 * @param edges - The graph is represented with a given 0-indexed array edges of
	 *              size n, indicating that there is a directed edge from node i to
	 *              node edges[i]. If there is no outgoing edge from i, then
	 *              edges[i] == -1.
	 * @param node1 - index of node 1.
	 * @param node2 - index of node 2.
	 * @return - Return the index of the node that can be reached from both node1
	 *         and node2, such that the maximum between the distance from node1 to
	 *         that node, and from node2 to that node is minimized. If there are
	 *         multiple answers, return the node with the smallest index, and if no
	 *         possible answer exists, return -1.
	 */

	public void dfs(int node, int[] edges, int[] dist, Boolean[] visit) {
		visit[node] = true;
		int neighbor = edges[node];
		if (neighbor != -1 && !visit[neighbor]) {
			dist[neighbor] = 1 + dist[node];
			dfs(neighbor, edges, dist, visit);
		}
	}

	public int closestMeetingNode(int[] edges, int node1, int node2) {
		int n = edges.length;
		int[] dist1 = new int[n], dist2 = new int[n];
		Arrays.fill(dist1, Integer.MAX_VALUE);
		Arrays.fill(dist2, Integer.MAX_VALUE);
		dist1[node1] = 0;
		dist2[node2] = 0;

		Boolean[] visit1 = new Boolean[n], visit2 = new Boolean[n];
		Arrays.fill(visit1, Boolean.FALSE);
		Arrays.fill(visit2, Boolean.FALSE);

		dfs(node1, edges, dist1, visit1);
		dfs(node2, edges, dist2, visit2);

		int minDistNode = -1, minDistTillNow = Integer.MAX_VALUE;
		for (int currNode = 0; currNode < n; currNode++) {
			if (minDistTillNow > Math.max(dist1[currNode], dist2[currNode])) {
				minDistNode = currNode;
				minDistTillNow = Math.max(dist1[currNode], dist2[currNode]);
			}
		}

		return minDistNode;
	}

}
