package googleet.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaxPointInALine {

	/**
	 * 
	 * @param points - Given an array of points where points[i] = [xi, yi]
	 *               represents a point on the X-Y plane
	 * @return - return the maximum number of points that lie on the same straight
	 *         line.
	 * 
	 *         Example 1 - Input: points = [[1,1],[2,2],[3,3]] Output: 3
	 * 
	 *         Example 2 - Input: points = [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
	 *         Output: 4
	 */
	public int maxPointsOwn(int[][] points) {
		Map<Double, List<Integer>> gradientMap = new HashMap<>();
		int max = Integer.MIN_VALUE;
		int prevX = points[0][0];
		int prevY = points[0][1];

		for (int i = 1; i < points.length; i++) {
			double gradient = (points[i][1] - prevY);
			if (points[i][0] - prevX != 0) {
				gradient /= (points[i][0] - prevX);
			}
			
			List<Integer> entries = gradientMap.getOrDefault(gradient, new ArrayList<>());
			if (i == 1 || entries.isEmpty()) {
				entries.add(prevX);
				entries.add(prevY);
			}

			entries.add(points[i][0]);
			entries.add(points[i][1]);
			int currentSize = entries.size() / 2;
			if (currentSize > max) {
				max = currentSize;
			}
			gradientMap.put(gradient, entries);
			prevX = points[i][0];
			prevY = points[i][1];

		}
		System.out.println(String.format("gradient map : %s", gradientMap));
		return max;
	}
}
