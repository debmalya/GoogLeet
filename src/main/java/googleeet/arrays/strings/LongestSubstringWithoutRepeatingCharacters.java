package googleeet.arrays.strings;

import java.util.LinkedHashSet;

/**
 * 
 * @author DJash
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {
	/**
	 * Given a string s, find the length of the longest substring without repeating
	 * characters.
	 * 
	 * Example 1:
	 * 
	 * Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc", with the
	 * length of 3.
	 * 
	 * 
	 * 
	 * @param s 0 <= s.length <= 5 * 10**4 s consists of English letters, digits,
	 *          symbols and spaces.
	 * @return length of the longest substring without repeating characters.
	 */
	public int lengthOfLongestSubstring(String s) {
		LinkedHashSet<Character> longest = new LinkedHashSet<>();
		int max = 0;
		if (s != null && s.length() > 0) {
			for (int i = 0; i < s.length(); i++) {
				char c = s.charAt(i);
				if (longest.add(c)) {
					if (longest.size() > max) {
						max = longest.size();
					}
				} else {
					// repeated character
					Character[] existingCharacters = longest.toArray(new Character[0]);
					int index = 0;
					while (!longest.add(c)) {
						if (index < existingCharacters.length) {
							longest.remove(existingCharacters[index]);
						} else {
							break;
						}
						index++;
					}
				}
			}

		}
		return max;

	}

}
