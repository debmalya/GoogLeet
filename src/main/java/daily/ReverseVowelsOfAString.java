package daily;

import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsOfAString {
	/**
	 * Given a string s, reverse only all the vowels in the string and return it.
	 * 
	 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower
	 * and upper cases, more than once.
	 * 
	 * Input: s = "hello" Output: "holle"
	 * 
	 * 
	 * Input: s = "leetcode" Output: "leotcede"
	 * 
	 * @param s
	 * @return
	 */
	public String reverseVowels(String s) {
		char[] result = s.toCharArray();
		List<Integer> vowelList = new ArrayList<>();
		// prepare list of position where we found a vowel
		for (int index = 0; index < s.length(); index++) {
			char c = s.charAt(index);
			if (c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c == 'u'
					|| c == 'U') {
				vowelList.add(index);

			}
		}

		for (int index = 0; index < vowelList.size() / 2; index++) {
			char temp = s.charAt(vowelList.get(index));
			result[vowelList.get(index)] = s.charAt(vowelList.get(vowelList.size() - index - 1));
			result[vowelList.get(vowelList.size() - index - 1)] = temp;

		}

		return String.valueOf(result);

	}

}
