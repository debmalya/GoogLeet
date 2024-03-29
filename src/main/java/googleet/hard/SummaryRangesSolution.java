package googleet.hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SummaryRangesSolution {
	private Set<Integer> values;

	public SummaryRangesSolution() {
		values = new TreeSet<>();
	}

	public void addNum(int value) {
		values.add(value);
	}

	public int[][] getIntervals() {
		if (values.isEmpty()) {
			return new int[0][2];
		}
		List<int[]> intervals = new ArrayList<>();
		int left = -1, right = -1;
		for (Integer value : values) {
			if (left < 0) {
				left = right = value;
			} else if (value == right + 1) {
				right = value;
			} else {
				intervals.add(new int[] { left, right });
				left = right = value;
			}
		}
		intervals.add(new int[] { left, right });
		return intervals.toArray(new int[0][]);
	}
}
