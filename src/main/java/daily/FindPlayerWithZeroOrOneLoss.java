package daily;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindPlayerWithZeroOrOneLoss {

	/**
	 * 
	 * @param matches
	 * @return
	 */
	public List<List<Integer>> findWinners(int[][] matches) {
		List<List<Integer>> result = new ArrayList<>();
		// player id and an array no of matches won, no of matches lost
		Map<Integer,int[]> playerPerformance = new HashMap<>();
		
		for (int i = 0; i < matches.length; i++) {
			// winner
			int[] count = playerPerformance.getOrDefault(matches[i][0], new int[] {0,0});
			count[0]++;
			playerPerformance.put(matches[i][0], count);
			
			// loser
			count = playerPerformance.getOrDefault(matches[i][1], new int[] {0,0});
			count[1]++;
			playerPerformance.put(matches[i][1], count);
		}
		
		List<Integer> winners = new ArrayList<>();
		List<Integer> oneLosers = new ArrayList<>();
		
		Set<Entry<Integer, int[]>> playerDetails = playerPerformance.entrySet();
		Iterator<Entry<Integer, int[]>> playerIterator = playerDetails.iterator();
		while (playerIterator.hasNext()) {
			Entry<Integer, int[]> nextEntry = playerIterator.next();
			if (nextEntry.getValue()[1] == 0) {
				winners.add(nextEntry.getKey());
			}else if (nextEntry.getValue()[1] == 1) {
				oneLosers.add(nextEntry.getKey());
			}
		}
		
		Collections.sort(winners);
		Collections.sort(oneLosers);
		
		result.add(winners);
		result.add(oneLosers);
		
		return result;

	}

}
