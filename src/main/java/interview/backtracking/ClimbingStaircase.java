package interview.backtracking;

import java.util.ArrayList;

public class ClimbingStaircase {

	/**
	 * You need to climb a staircase that has n steps, and you decide to get some
	 * extra exercise by jumping up the steps. You can cover at most k steps in a
	 * single jump. Return all the possible sequences of jumps that you could take
	 * to climb the staircase, sorted.
	 * 
	 * @param n - number of steps.
	 * @param k - number of steps can be covered in a single jump.
	 * @return - all the possible sequences of jumps that you could take to climb
	 *         the staircase, sorted.
	 */
	int[][] solution(int n, int k) {
		ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
		makeList(n, k, answer, new ArrayList<Integer>());
		return answer.stream().map(u -> u.stream().mapToInt(i -> i).toArray()).toArray(int[][]::new);
	}

	void makeList(int n, int k, ArrayList<ArrayList<Integer>> answer, ArrayList<Integer> steps) {
		if (n == 0) {
			ArrayList<Integer> tmp = new ArrayList<Integer>(steps);
			answer.add(tmp);
		} else {
			for (int i = 1; i < k + 1; i++) {
				if (i <= n) {
					steps.add(i);
					makeList(n - i, k, answer, steps);
					steps.remove(steps.size() - 1);
				}
			}
		}
	}

}
