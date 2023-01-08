package daily;

import java.util.ArrayList;
import java.util.List;

public class GasStation {
	/**
	 * There are n gas stations along a circular route, where the amount of gas at
	 * the ith station is gas[i].
	 * 
	 * You have a car with an unlimited gas tank and it costs cost[i] of gas to
	 * travel from the ith station to its next (i + 1)th station. You begin the
	 * journey with an empty tank at one of the gas stations.
	 * 
	 * Given two integer arrays gas and cost, return the starting gas station's
	 * index if you can travel around the circuit once in the clockwise direction,
	 * otherwise return -1. If there exists a solution, it is guaranteed to be
	 * unique.
	 * 
	 * Examples:
	 * 
	 * Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2] Output: 3 Explanation: Start at
	 * station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 + 4 = 4
	 * Travel to station 4. Your tank = 4 - 1 + 5 = 8 Travel to station 0. Your tank
	 * = 8 - 2 + 1 = 7 Travel to station 1. Your tank = 7 - 3 + 2 = 6 Travel to
	 * station 2. Your tank = 6 - 4 + 3 = 5 Travel to station 3. The cost is 5. Your
	 * gas is just enough to travel back to station 3. Therefore, return 3 as the
	 * starting index.
	 * 
	 * @param gas  - stations with amount of gas.
	 * @param cost - cost of gas to travel from ith stations to its next.
	 * @return starting gas station's index.
	 *
	 */
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int sum = 0;

		int size = gas.length;
		int ptr = 0;
		int total_sum = 0;

		for (int i = 0; i < size; i++) {
			sum += gas[i] - cost[i];
			total_sum += gas[i] - cost[i];
			if (sum < 0) {
				sum = 0;
				ptr = i + 1;
			}
		}

		if (ptr == size || total_sum < 0)
			return -1;

		return ptr;

	}

	public boolean ableToComplete(int[] gas, int[] cost, int currentIndex) {
		int startIndex = currentIndex;
		int previousIndex = currentIndex;
		int tank = gas[currentIndex];
		boolean[] visited = new boolean[gas.length];
		visited[startIndex] = true;

		while (true) {
			previousIndex = currentIndex;
			currentIndex++;
			currentIndex %= gas.length;
			if (tank < cost[previousIndex]) {
				return false;
			}
			if (visited[currentIndex]) {
				break;
			}
			visited[currentIndex] = true;
			tank = tank + gas[currentIndex] - cost[previousIndex];
		}
		return true;
	}

	public List<Integer> getFeasibleIndexes(int[] gas, int[] cost) {
		List<Integer> feasibleIndexes = new ArrayList<>();
		int totalGasAmount = 0;
		int totalCost = 0;
		for (int i = 0; i < gas.length; i++) {
			totalGasAmount += gas[i];
			totalCost += cost[i];
			if (gas[i] >= cost[i]) {
				feasibleIndexes.add(i);
			}
		}
		System.out.println(String.format("Total gas amount : %d total cost: %d", totalGasAmount, totalCost));
		return feasibleIndexes;
	}
}
