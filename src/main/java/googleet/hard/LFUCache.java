package googleet.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * To determine the least frequently used key, a use counter is maintained for
 * each key in the cache. The key with the smallest use counter is the least
 * frequently used key.
 * 
 * When a key is first inserted into the cache, its use counter is set to 1 (due
 * to the put operation). The use counter for a key in the cache is incremented
 * either a get or put operation is called on it.
 * 
 * The functions get and put must each run in O(1) average time complexity.
 * 
 * @author DJash
 *
 */
public class LFUCache {

	// Key and value
	Map<Integer, LFUCount> lfuMap;
	// Key is count, value is list of keys having the same count
	SortedMap<Integer, List<Integer>> timeMap = new TreeMap<>();

	int capacity;

	/**
	 * Initializes the object with the capacity of the data structure.
	 * 
	 * @param capacity
	 */
	public LFUCache(int capacity) {
		this.capacity = capacity;
		lfuMap = new HashMap<>();
	}

	/**
	 * Gets the value of the key if the key exists in the cache. Otherwise, returns
	 * -1.
	 * 
	 * @param key
	 * @return
	 */
	public int get(int key) {
		int value = -1;
		LFUCount existingValue = lfuMap.get(key);
		if (existingValue != null) {
			value = existingValue.value;

			// handle timeMap
			handleTimeMap(key, existingValue);

			lfuMap.put(key, existingValue);
		}
		return value;
	}

	/**
	 * Update the value of the key if present, or inserts the key if not already
	 * present. When the cache reaches its capacity, it should invalidate and remove
	 * the least frequently used key before inserting a new item. For this problem,
	 * when there is a tie (i.e., two or more keys with the same frequency), the
	 * least recently used key would be invalidated.
	 * 
	 * @param key
	 * @param value
	 */
	public void put(int key, int value) {
		if (capacity > 0) {
			if (lfuMap.size() >= capacity && !timeMap.isEmpty()) {
				// need to evict LFUKey
//			System.out.println("1."+timeMap);
				List<Integer> existingKeys = timeMap.get(timeMap.firstKey());
				if (!existingKeys.contains(key)) {
					lfuMap.remove(existingKeys.get(0));

					existingKeys.remove(0);
					if (!existingKeys.isEmpty()) {
						timeMap.put(timeMap.firstKey(), existingKeys);
					} else {
						timeMap.remove(timeMap.firstKey());
					}
				}
//			System.out.println("4.(Evict) "+timeMap);
			}

			// May be an existing key
			List<Integer> singleCount = timeMap.getOrDefault(1, new ArrayList<>());
			LFUCount lfuCount = null;
			if (!singleCount.contains(key)) {
				// new key
				singleCount.add(key);
				timeMap.put(1, singleCount);
				// first time any key frequency count will be 1.
				lfuCount = new LFUCount(key, value, 1);
			} else {
				// existing key, update existing count

				lfuCount = lfuMap.get(key);
				singleCount = timeMap.getOrDefault(lfuCount.count, new ArrayList<>());
				singleCount.remove(singleCount.indexOf(key));
				if (!singleCount.isEmpty()) {
					timeMap.put(lfuCount.count, singleCount);
				} else {
					timeMap.remove(lfuCount.count);
				}
				lfuCount.count++;
				List<Integer> countOfTime = timeMap.getOrDefault(lfuCount.count, new ArrayList<>());
				countOfTime.add(key);
				lfuCount.value = value;
				timeMap.put(lfuCount.count, countOfTime);
			}

			lfuMap.put(key, lfuCount);
//		System.out.println("1. (PUT) "+timeMap);
		}
	}

	class LFUCount {
		int key;
		int value;
		int count;

		public LFUCount(int key, int value, int count) {
			super();
			this.key = key;
			this.value = value;
			this.count = count;
		}

	}

	private void handleTimeMap(int key, LFUCount existingValue) {
		List<Integer> existingKeys = timeMap.get(existingValue.count);

		existingKeys.remove(existingKeys.indexOf(key));
		if (!existingKeys.isEmpty()) {
			timeMap.put(existingValue.count, existingKeys);
//			System.out.println("3. (GET) "+timeMap);
		} else {
			timeMap.remove(existingValue.count);
		}
		existingValue.count++;
		existingKeys = timeMap.getOrDefault(existingValue.count, new ArrayList<>());
		existingKeys.add(key);
		timeMap.put(existingValue.count, existingKeys);
//		System.out.println("2. (GEt)"+timeMap);
	}

}
