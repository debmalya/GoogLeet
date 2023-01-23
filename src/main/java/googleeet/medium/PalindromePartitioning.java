package googleeet.medium;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

	/**
	 * Given a string s, partition s such that every substring of the partition is a
	 * palindrome . Return all possible palindrome partitioning of s.
	 * 
	 * @param s provided string.
	 * @return all possible palindrome partition.
	 */

	public List<List<String>> partition(String s) {
		List<List<String>> result = new ArrayList<List<String>>();
		dfs(0, result, new ArrayList<String>(), s);
		return result;
	}

	void dfs(int start, List<List<String>> result, List<String> currentList, String s) {
		if (start >= s.length())
			result.add(new ArrayList<String>(currentList));
		for (int end = start; end < s.length(); end++) {
			if (isPalindrome(s, start, end)) {
				// add current substring in the currentList
				currentList.add(s.substring(start, end + 1));
				dfs(end + 1, result, currentList, s);
				// backtrack and remove the current substring from currentList
				currentList.remove(currentList.size() - 1);
			}
		}
	}

	boolean isPalindrome(String s, int low, int high) {
		while (low < high) {
			if (s.charAt(low++) != s.charAt(high--))
				return false;
		}
		return true;
	}

	public List<String> moreThanOneCharacter(String s, int index) {
		List<String> palindromList = new ArrayList<>();
		String subString = s.substring(0, index + 1);
		String remainingSubString = s.substring(index + 1);
		if (isPalindrome(subString) && isPalindrome(remainingSubString)) {
			palindromList.add(subString);
			palindromList.add(remainingSubString);
		}
		return palindromList;
	}

	private boolean isPalindrome(String subString) {
		boolean isPlaindrom = true;
		int len = subString.length();
		int halfLen = len / 2;

		for (int i = 0; i < halfLen; i++) {
			if (subString.charAt(i) != subString.charAt(len - i - 1)) {
				isPlaindrom = false;
				break;
			}

		}
		return isPlaindrom;
	}

}
