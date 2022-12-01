package daily;

import java.util.HashSet;
import java.util.Set;

public class RandomizedSet {

	Set<Integer> container;

	public RandomizedSet() {
		container = new HashSet<>();
	}

	public boolean insert(int val) {
		return container.add(val);
	}

	public boolean remove(int val) {
		return container.remove(val);
	}

	public int getRandom() {
		return container.toArray(new Integer[0])[((int) (Math.random() * container.size())) % container.size()];
	}
}
