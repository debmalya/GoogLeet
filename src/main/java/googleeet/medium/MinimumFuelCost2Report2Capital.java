package googleeet.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumFuelCost2Report2Capital {

	/**
	 * There is a tree (i.e., a connected, undirected graph with no cycles)
	 * structure country network consisting of n cities numbered from 0 to n - 1 and
	 * exactly n - 1 roads. The capital city is city 0. You are given a 2D integer
	 * array roads where roads[i] = [ai, bi] denotes that there exists a
	 * bidirectional road connecting cities ai and bi.
	 * 
	 * There is a meeting for the representatives of each city. The meeting is in
	 * the capital city.
	 * 
	 * There is a car in each city. You are given an integer seats that indicates
	 * the number of seats in each car.
	 * 
	 * A representative can use the car in their city to travel or change the car
	 * and ride with another representative. The cost of traveling between two
	 * cities is one liter of fuel.
	 * 
	 * Return the minimum number of liters of fuel to reach the capital city.
	 * 
	 * @param roads - bidirectional road connectivity.
	 * @param seats - number of seats in each car.
	 * @return minimum fuel cost.
	 */

	long fuel;

	public long dfs(int node, int parent, Map<Integer, List<Integer>> adj, int seats) {
		// The node itself has one representative.
		int representatives = 1;
		if (!adj.containsKey(node)) {
			return representatives;
		}
		for (int child : adj.get(node)) {
			if (child != parent) {
				// Add count of representatives in each child subtree to the parent subtree.
				representatives += dfs(child, node, adj, seats);
			}
		}
		if (node != 0) {
			// Count the fuel it takes to move to the parent node.
			// Root node does not have any parent so we ignore it.
			fuel += Math.ceil((double) representatives / seats);
		}
		return representatives;
	}

	public long minimumFuelCost(int[][] roads, int seats) {
		Map<Integer, List<Integer>> adj = new HashMap<>();
		for (int[] road : roads) {
			adj.computeIfAbsent(road[0], k -> new ArrayList<Integer>()).add(road[1]);
			adj.computeIfAbsent(road[1], k -> new ArrayList<Integer>()).add(road[0]);
		}
		dfs(0, -1, adj, seats);
		return fuel;
	}

}
