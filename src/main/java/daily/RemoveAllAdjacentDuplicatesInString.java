package daily;

public class RemoveAllAdjacentDuplicatesInString {
	/*
	 * You are given a string s consisting of lower case English letters. A
	 * duplicate removal consists of choosing two adjacent and equal letters and
	 * removing them.
	 * 
	 * We repeatedly make duplicate removals on s until we no longer can.
	 * 
	 * Return the final string after all such duplicate removals have been made. It
	 * can be proven that the answer is unique.
	 * 
	 * Example 1:
	 * 
	 * Input: s = "abbaca" Output: "ca" Explanation: For example, in "abbaca" we
	 * could remove "bb" since the letters are adjacent and equal, and this is the
	 * only possible move. The result of this move is that the string is "aaca", of
	 * which only "aa" is possible, so the final string is "ca".
	 * 
	 * Example 2:
	 * 
	 * Input: s = "azxxzy" Output: "ay"
	 */
	public String removeDuplicates(String S) {
		StringBuilder sb = new StringBuilder();
		int sbLength = 0;
		for (char character : S.toCharArray()) {
			if (sbLength != 0 && character == sb.charAt(sbLength - 1))
				sb.deleteCharAt(sbLength-- - 1);
			else {
				sb.append(character);
				sbLength++;
			}
		}
		return sb.toString();
	}
	
	

	public String removeDuplicates0(String s) {
		s = removeAdjacentDuplicates(s);
		return s;
	}

	private String removeAdjacentDuplicates(String s) {
		StringBuilder sb = new StringBuilder();
		boolean changed = true;
		if (s != null && s.length() > 0) {
			while (changed && s.length() > 0) {
				changed = false;
				boolean[] changeByPosition = new boolean[s.length()];
				char prev = s.charAt(0);
				for (int i = 1; i < s.length(); i++) {
					char current = s.charAt(i);
					if (prev == current) {
						changeByPosition[i] = true;
						changeByPosition[i - 1] = true;
						changed = true;
					}
					prev = current;
				}

				for (int i = 0; i < changeByPosition.length; i++) {
					if (!changeByPosition[i]) {
						sb.append(s.charAt(i));
					}
				}
				s = sb.toString();
				sb.delete(0, sb.length());
			}
		}
		return s;
	}

}
