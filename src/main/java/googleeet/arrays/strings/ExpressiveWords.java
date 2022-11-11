package googleeet.arrays.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class ExpressiveWords {
	/**
	 * Sometimes people repeat letters to represent extra feeling. For example:
	 * 
	 * "hello" -> "heeellooo" "hi" -> "hiiii" In these strings like "heeellooo", we
	 * have groups of adjacent letters that are all the same: "h", "eee", "ll",
	 * "ooo".
	 * 
	 * You are given a string s and an array of query strings words. A query word is
	 * stretchy if it can be made to be equal to s by any number of applications of
	 * the following extension operation: choose a group consisting of characters c,
	 * and add some number of characters c to the group so that the size of the
	 * group is three or more.
	 * 
	 * For example, starting with "hello", we could do an extension on the group "o"
	 * to get "hellooo", but we cannot get "helloo" since the group "oo" has a size
	 * less than three. Also, we could do another extension like "ll" -> "lllll" to
	 * get "helllllooo". If s = "helllllooo", then the query word "hello" would be
	 * stretchy because of these two extension operations: query = "hello" ->
	 * "hellooo" -> "helllllooo" = s. Return the number of query strings that are
	 * stretchy.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "heeellooo", words = ["hello", "hi", "helo"] Output: 1
	 * Explanation: We can extend "e" and "o" in the word "hello" to get
	 * "heeellooo". We can't extend "helo" to get "heeellooo" because the group "ll"
	 * is not size 3 or more. Example 2:
	 * 
	 * Input: s = "zzzzzyyyyy", words = ["zzyy","zy","zyy"] Output: 3
	 * 
	 * @param s
	 * @param words
	 * @return
	 */
	   public int expressiveWords(String S, String[] words) {
	        if (S == null || words == null) {
	            return 0;
	        }
	        int count = 0;
	        for (String word : words) {
	            if (stretchy(S, word)) {
	                count++;
	            }
	        }
	        return count;
	    }
	    
	    public boolean stretchy(String S, String word) {
	        if (word == null) {
	            return false;
	        }
	        int i = 0;
	        int j = 0;
	        while (i < S.length() && j < word.length()) {
	            if (S.charAt(i) == word.charAt(j)) {
	                int len1 = getRepeatedLength(S, i);
	                int len2 = getRepeatedLength(word, j);
	                if (len1 < 3 && len1 != len2 || len1 >= 3 && len1 < len2) {
	                    return false;
	                }
	                i += len1;
	                j += len2;
	            } else {
	                return false;
	            }
	        }
	        return i == S.length() && j == word.length();
	    }
	    
	    public int getRepeatedLength(String str, int i) {
	        int j = i;
	        while (j < str.length() && str.charAt(j) == str.charAt(i)) {
	            j++;
	        }
	        return j - i;
	    }
	
	public int expressiveWords0(String s, String[] words) {
		int matchCount = 0;
		for (String word : words) {
			if (matches(s, word)) {
//				System.out.println(word);
				matchCount++;
			}
		}
		return matchCount;
	}

	private boolean matches(String s, String word) {
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
//		System.out.println("s :" + s + " word : " + word);
//		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		Map<Character, Integer> original = new HashMap<>();
		Map<Character, Integer> second = new HashMap<>();
		createCharacterMap(s, original);
		createCharacterMap(word, second);

		AtomicBoolean matches = new AtomicBoolean(true);
		original.forEach((key, value) -> {
//			System.out.println("Key :" + key + " value : " + value + " second count : " + second.get(key));
			if (!second.containsKey(key)) {
				matches.set(false);
//				System.out.println("Turns sour 1");
			} else if (value != second.get(key) && value - second.get(key) < 2) {
				matches.set(false);
//				System.out.println("Turns sour 2");
			}
		});

		return matches.get();
	}

	private void createCharacterMap(String s, Map<Character, Integer> original) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			original.putIfAbsent(c, 0);
			int count = original.get(c);
			count++;
			original.put(c, count);
		}
	}

}
