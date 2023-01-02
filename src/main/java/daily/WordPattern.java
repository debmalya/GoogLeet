package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;

public class WordPattern {
	public boolean wordPattern(String pattern, String s) {
		LinkedHashMap<String, List<Integer>> firstMap = createSequenceIndex(createStrWithSpaceInBetween(pattern));
		LinkedHashMap<String, List<Integer>> secondMap = createSequenceIndex(s);
		
		if (firstMap.size() == secondMap.size()) {
			Collection<List<Integer>> firstCollection = firstMap.values();
			Collection<List<Integer>> secondCollection = secondMap.values();

			return firstCollection.containsAll(secondCollection);
		}
		return false;
	}

	public String createStrWithSpaceInBetween(String s) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			sb.append(s.charAt(i));
			sb.append(" ");
		}
		return sb.toString().trim();
	}

	public LinkedHashMap<String, List<Integer>> createSequenceIndex(String s) {
		String[] words = s.split(" ");

		LinkedHashMap<String, List<Integer>> sequence = new LinkedHashMap<>();
		for (int i = 0; i < words.length; i++) {
			List<Integer> currentCount = sequence.getOrDefault(words[i], new ArrayList<>());
			currentCount.add(i);
			sequence.put(words[i], currentCount);
		}
		return sequence;

	}

	public int[] createSearchIndex(String s) {
		String[] words = s.split(" ");
		Arrays.sort(words);
		int[] wordPattern = new int[words.length];

		String[] wordInActualSequence = s.split(" ");
		for (int index = 0; index < words.length; index++) {
			int searchIndex = Arrays.binarySearch(words, wordInActualSequence[index]);
			wordPattern[index] = searchIndex;
		}

		return wordPattern;
	}

}
