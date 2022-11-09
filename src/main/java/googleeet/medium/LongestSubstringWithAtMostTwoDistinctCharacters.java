package googleeet.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithAtMostTwoDistinctCharacters {
	/**
	 * Given a string s, return the length of the longest substring that contains at
	 * most two distinct characters.
	 * 
	 * 1 <= s.length <= 10**5 s consists of English letters (both upper case and
	 * lower case).
	 * 
	 * @param s
	 * @return
	 */
	public int lengthOfLongestSubstringTwoDistinct(String s) {
		int max = Integer.MIN_VALUE;
		int start = 0;
		for (int end = 2; end <= s.length(); end++) {
			String ss = s.substring(start, end);
			
			if (matchingCriteria(ss)) {
				max = Math.max(max, end - start);
				System.out.println(ss);
			} else {
				start++;
			}

		}
		return max;

	}

	/**
	 * 
	 * @param str to be checked.
	 * @return true if distinct characters are less than equal to 2.
	 */
	public boolean matchingCriteria(String str) {
		Set<Character> distinct = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			if (distinct.add(str.charAt(i))) {
				if (distinct.size() > 2) {
					return false;
				}
			}

		}
		return distinct.size() <= 2;
	}

}
