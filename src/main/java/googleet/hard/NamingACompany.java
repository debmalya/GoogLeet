package googleet.hard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NamingACompany {

	/**
	 * You are given an array of strings ideas that represents a list of names to be
	 * used in the process of naming a company. The process of naming a company is
	 * as follows:
	 * 
	 * Choose 2 distinct names from ideas, call them ideaA and ideaB. Swap the first
	 * letters of ideaA and ideaB with each other. If both of the new names are not
	 * found in the original ideas, then the name ideaA ideaB (the concatenation of
	 * ideaA and ideaB, separated by a space) is a valid company name. Otherwise, it
	 * is not a valid name. Return the number of distinct valid names for the
	 * company.
	 * 
	 * @param ideas
	 * @return number of distinct valid names
	 */

	public long distinctNames(String[] ideas) {
		// Group idea by their initials.
		HashSet<String>[] initialGroup = new HashSet[26];
		for (int i = 0; i < 26; ++i) {
			initialGroup[i] = new HashSet<>();
		}
		for (String idea : ideas) {
			initialGroup[idea.charAt(0) - 'a'].add(idea.substring(1));
		}

		// Calculate number of valid names from every pair of groups.
		long answer = 0;
		for (int i = 0; i < 25; ++i) {
			for (int j = i + 1; j < 26; ++j) {
				// Get the number of mutual suffixes.
				long numOfMutual = 0;
				for (String ideaA : initialGroup[i]) {
					if (initialGroup[j].contains(ideaA)) {
						numOfMutual++;
					}
				}

				// Valid names are only from distinct suffixes in both groups.
				// Since we can swap a with b and swap b with a to create two valid names,
				// multiple answer by 2.
				answer += 2 * (initialGroup[i].size() - numOfMutual) * (initialGroup[j].size() - numOfMutual);
			}
		}

		return answer;
	}

	public long distinctNames0(String[] ideas) {

		Set<String> original = new HashSet<>();
		Set<String> newNames = new HashSet<>();
		char[] firstLetter = new char[ideas.length];
		String[] remaining = new String[ideas.length];

		for (int i = 0; i < ideas.length; i++) {
			original.add(ideas[i]);
			firstLetter[i] = ideas[i].charAt(0);
			remaining[i] = ideas[i].substring(1);
		}

		for (int i = 0; i < ideas.length; i++) {
			for (int j = 0; j < ideas.length; j++) {

				if (i != j) {
					String one = firstLetter[i] + remaining[j];
					if (!original.contains(one)) {
						String two = firstLetter[j] + remaining[i];
						if (!original.contains(two)) {
							newNames.add(one + " " + two);
							newNames.add(two + " " + one);
						}
					}
				}
			}

		}

		return newNames.size();
	}

}
