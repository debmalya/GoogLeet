package real;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Task1 {

	/**
	 * 
	 * @param T
	 * @param R
	 * @return
	 */
	public int solution(String[] T, String[] R) {
		// Implement your solution here
		int noOk = 0;
		Set<Integer> group = new HashSet<>();
		Map<Integer, int[]> groupScore = new HashMap<>();
		for (int i = 0; i < T.length; i++) {
			int groupNo = getGroup(T[i]);
			if (group.add(groupNo)) {
				groupScore.put(groupNo, new int[2]);
			}
			if (R[i].equals("OK")) {
				groupScore.get(groupNo)[0]++;
			}
			groupScore.get(groupNo)[1]++;
		}
		if (group.isEmpty()) {
			return noOk / group.size();
		} else {
			AtomicInteger groupsPassed = new AtomicInteger(0);
			groupScore.forEach((key, value) -> {
				if (value[0] == value[1]) {
					groupsPassed.incrementAndGet();
				}
			});
			return groupsPassed.get()*100 / group.size();
		}
	}

	public int getGroup(String test) {
		int group = 0;

		for (int i = 0; i < test.length(); i++) {
			char c = test.charAt(i);
			if (c >= '0' && c <= '9') {
				if (group > 0) {
					group *= 10;
				}
				group += c - '0';
			}
		}

		return group;
	}

}
