package daily;

import java.util.HashSet;
import java.util.Set;

public class LongestCommonSubsequence {

	/**
	 * Given two strings text1 and text2, return the length of their longest common
	 * subsequence. If there is no common subsequence, return 0.
	 * 
	 * A subsequence of a string is a new string generated from the original string
	 * with some characters (can be none) deleted without changing the relative
	 * order of the remaining characters.
	 * 
	 * For example, "ace" is a subsequence of "abcde". A common subsequence of two
	 * strings is a subsequence that is common to both strings.
	 * 
	 * @param text1
	 * @param text2
	 * @return
	 */
	public int longestCommonSubsequence(String text1, String text2) {
		
		Set<Character> searchSet = new HashSet<>();
		for (int i = 0; i < text2.length(); i++) {
			searchSet.add(text2.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < text1.length(); i++) {
			char ch = text1.charAt(i);
			if (searchSet.contains(ch)) {
				sb.append(ch);
			}
		}
		
		String afterRemoval = sb.toString();
		int position = 0;
		int count = 0;
		while (true) {
			position = afterRemoval.indexOf(text2, position);
			if (position > -1) {
				count+= text2.length();
				position++;
			}else {
				
				break;
			}
		}
		
		return count;
	}

}
