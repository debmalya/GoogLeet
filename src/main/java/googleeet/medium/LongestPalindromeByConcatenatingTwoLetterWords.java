package googleeet.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestPalindromeByConcatenatingTwoLetterWords {
	/**
	 * You are given an array of strings words. Each element of words consists of
	 * two lower case English letters.
	 * 
	 * Create the longest possible palindrome by selecting some elements from words
	 * and concatenating them in any order. Each element can be selected at most
	 * once.
	 * 
	 * Return the length of the longest palindrome that you can create. If it is
	 * impossible to create any palindrome, return 0.
	 * 
	 * A palindrome is a string that reads the same forward and backward.
	 * 
	 * Example:
	 * 
	 * Input: words = ["lc","cl","gg"] Output: 6 Explanation: One longest palindrome
	 * is "lc" + "gg" + "cl" = "lcggcl", of length 6. Note that "clgglc" is another
	 * longest palindrome that can be created.
	 * 
	 * 
	 * Input: words = ["ab","ty","yt","lc","cl","ab"] Output: 8 Explanation: One
	 * longest palindrome is "ty" + "lc" + "cl" + "yt" = "tylcclyt", of length 8.
	 * Note that "lcyttycl" is another longest palindrom that can be created.
	 * 
	 * 
	 * Input: words = ["cc","ll","xx"] Output: 2 Explanation: One longest palindrome
	 * is "cc", of length 2. Note that "ll" is another longest palindrome that can
	 * be created, and so is "xx".
	 * 
	 * Constraints:
	 * 
	 * 1 <= words.length <= 10**5 words[i].length == 2 words[i] consists of lower
	 * case English letters.
	 * 
	 * @param words
	 * @return
	 */
	public int longestPalindrome(String[] words) {
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		for (String word : words) {
			Integer countOfTheWord = count.get(word);
			if (countOfTheWord == null) {
				count.put(word, 1);
			} else {
				count.put(word, countOfTheWord + 1);
			}
		}
		int answer = 0;
		boolean central = false;
		for (Map.Entry<String, Integer> entry : count.entrySet()) {
			String word = entry.getKey();
			int countOfTheWord = entry.getValue();
			// if the word is a palindrome
			if (word.charAt(0) == word.charAt(1)) {
				if (countOfTheWord % 2 == 0) {
					answer += countOfTheWord;
				} else {
					answer += countOfTheWord - 1;
					central = true;
				}
				// consider a pair of non-palindrome words such that one is the reverse of
				// another
			} else if (word.charAt(0) < word.charAt(1)) {
				String reversedWord = "" + word.charAt(1) + word.charAt(0);
				if (count.containsKey(reversedWord)) {
					answer += 2 * Math.min(countOfTheWord, count.get(reversedWord));
				}
			}
		}
		if (central) {
			answer++;
		}
		return 2 * answer;
	}

	public int longestPalindrome0(String[] words) {
		Set<String> existingWords = new HashSet<>();
		int len = 0;
		boolean sameCharacters = true;
		for (String each : words) {
			existingWords.add(each);
		}

		Set<String> palinWords = new HashSet<>();
		for (String each : existingWords) {
			char[] reverse = new char[] { each.charAt(1), each.charAt(0) };

			if (each.charAt(0) == each.charAt(1)) {
				if (sameCharacters) {
					len += 2;
					sameCharacters = false;
				}
			} else {
				if (!palinWords.add(String.valueOf(each))) {
					len += 2;
				}

				if (!palinWords.add(String.valueOf(reverse))) {
					len += 2;
				}
			}
		}
		return len;

	}

}
