package twitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumGeneticMutation {
	public int minMutation(String start, String end, String[] bank) {
		int diffCount = 0;
		Arrays.sort(bank);
		char[] first = start.toCharArray();
		List<Integer> positions = new ArrayList<>();
		List<String> intermittentStrings = new ArrayList<>();

		for (int i = 0; i < start.length(); i++) {
			char c = end.charAt(i);
			if (start.charAt(i) != c) {
				first[i] = c;
				if (Arrays.binarySearch(bank, String.valueOf(first)) < 0) {
					if (!checkIntermittentStrings(intermittentStrings, bank, i, c)) {
						positions.add(i);
						first[i] = start.charAt(i);
					}
				} else {
					intermittentStrings.add(String.valueOf(first));
				}
				diffCount++;
			}

		}

		boolean[] found = new boolean[positions.size()];
		for (int j = 0; j < positions.size(); j++) {
			if (checkIntermittentStrings(intermittentStrings, bank, positions.get(j), end.charAt(j))) {
				found[j] = true;
			}
		}
		
		for (int j = found.length - 1; j > -1; j--) {
			if (found[j]) {
				positions.remove(j);
			}
		}

		System.out.println(intermittentStrings);

		if (Arrays.binarySearch(bank, end) > -1 && positions.isEmpty()) {
			return diffCount;
		}
		return -1;

	}

	private boolean checkIntermittentStrings(List<String> intermittentStrings, String[] bank, int i, char c) {
		for (int j = 0; j < intermittentStrings.size(); j++) {
			char[] searchString = intermittentStrings.get(j).toCharArray();
			searchString[i] = c;
			if (Arrays.binarySearch(bank, String.valueOf(searchString)) > -1) {
				intermittentStrings.add(String.valueOf(searchString));
				return true;
			}
		}
		return false;
	}

}
