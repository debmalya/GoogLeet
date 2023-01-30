package daily;

import java.util.HashMap;
import java.util.Map;

public class Tribonacci {

	Map<Integer, Integer> valueMap = new HashMap<>();

	public int tribonacci(int n) {
		for (int i = 0; i <= n; i++) {
			if (i <= 0) {
				valueMap.put(0, 0);
			} else if (i == 1) {
				valueMap.put(1, 1);
			} else if (i == 2) {
				valueMap.put(2, 1);
			} else {
				valueMap.put(i, valueMap.get(i - 1) + valueMap.get(i - 2) + valueMap.get(i - 3));
			}
		}
		return valueMap.get(n);
	}
}
