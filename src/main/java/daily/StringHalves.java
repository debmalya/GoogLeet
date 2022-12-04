package daily;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class StringHalves {

	/**
	 * You are given a string s of even length. Split this string into two halves of
	 * equal lengths, and let a be the first half and b be the second half.
	 * 
	 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i',
	 * 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and
	 * lowercase letters.
	 * 
	 * Return true if a and b are alike. Otherwise, return false.
	 * 
	 * @param s
	 * @return
	 */
	public boolean halvesAreAlike(String s) {
		int len = s.length();

		Map<Character, Integer> fMap = new HashMap<>();
		Map<Character, Integer> sMap = new HashMap<>();
		for (int i = 0, j = s.length() - 1; i < len / 2; i++, j--) {
			char first = s.charAt(i);
			char second = s.charAt(j);
			if (isVowel(first)) {
				int count = fMap.getOrDefault(first, 0);
				fMap.put(first, ++count);
			}
			if (isVowel(second)) {
				int count = sMap.getOrDefault(second, 0);
				sMap.put(second, ++count);
			}
		}
		
		AtomicBoolean alike = new AtomicBoolean(true);
		fMap.forEach((key,value) -> {
			if (sMap.get(key) != value) {
				alike.set(false);
			}
		});

		return alike.get();
	}

	private boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U';
	}
}
