package googleet.hard;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Given a data stream input of non-negative integers a1, a2, ..., an, summarize
 * the numbers seen so far as a list of disjoint intervals.
 * 
 * Implement the SummaryRanges class:
 * 
 * SummaryRanges() Initializes the object with an empty stream. void addNum(int
 * value) Adds the integer value to the stream. int[][] getIntervals() Returns a
 * summary of the integers in the stream currently as a list of disjoint
 * intervals [starti, endi]. The answer should be sorted by starti.
 * 
 * @author DJash
 *
 */
public class SummaryRanges {
	SortedMap<Integer, Integer> rangeMap;

	public SummaryRanges() {
		rangeMap = new TreeMap<>();
	}


	public void addNum(int value) {
		SortedMap<Integer, Integer> tailMap = rangeMap.tailMap(value);
		SortedMap<Integer, Integer> headMap = rangeMap.headMap(value);

		if (!canMerge(tailMap, headMap, value) && !ableToAdd(tailMap, false, value)
				&& !ableToAdd(headMap, true, value)) {
			rangeMap.put(value, value);
		}
	}

	private boolean canMerge(SortedMap<Integer, Integer> tailMap, SortedMap<Integer, Integer> headMap, int value) {
		boolean adjusted = false;
		if (!tailMap.isEmpty() && !headMap.isEmpty()) {
			Integer headLastValue = rangeMap.get(headMap.lastKey());
			Integer tailFirstKey = tailMap.firstKey();
			if (headLastValue + 1 == value && value + 1 == tailMap.firstKey()) {
				rangeMap.put(headMap.lastKey(), rangeMap.get(tailMap.firstKey()));
				rangeMap.remove(tailFirstKey);
				adjusted = true;
			}
		}
		return adjusted;
	}

	private boolean ableToAdd(SortedMap<Integer, Integer> map, boolean isHead, int value) {
		boolean adjusted = false;
		Integer existingKey = null;
		Integer existingValue = null;
		if (!map.isEmpty()) {
			if (isHead) {
				existingKey = map.lastKey();
				existingValue = rangeMap.get(existingKey);
			} else {
				existingKey = map.firstKey();
				existingValue = rangeMap.get(existingKey);
			}

			if (value == existingValue + 1) {
				rangeMap.put(existingKey, value);
				adjusted = true;
			} else if (value == existingKey - 1) {
				rangeMap.put(value, existingValue);
				rangeMap.remove(existingKey);
				adjusted = true;
			}else if (existingKey <= value && value <= existingValue) {
				adjusted = true;
			}
		}

		return adjusted;
	}

	public int[][] getIntervals() {
		int[][] rangeArr = new int[rangeMap.size()][2];

		Set<Entry<Integer, Integer>> entries = rangeMap.entrySet();
		Iterator<Entry<Integer, Integer>> entryIterator = entries.iterator();
		int index = 0;
		while (entryIterator.hasNext()) {
			Entry<Integer, Integer> nextEntry = entryIterator.next();
			rangeArr[index][0] = nextEntry.getKey();
			rangeArr[index][1] = nextEntry.getValue();
			index++;
		}

		return rangeArr;

	}

}
