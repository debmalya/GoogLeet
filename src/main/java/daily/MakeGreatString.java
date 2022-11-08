package daily;

public class MakeGreatString {
	/**
	 * Given a string s of lower and upper case English letters.
	 * 
	 * A good string is a string which doesn't have two adjacent characters s[i] and
	 * s[i + 1] where: 0 <= i <= s.length - 2 s[i] is a lower-case letter and s[i +
	 * 1] is the same letter but in upper-case or vice-versa. To make the string
	 * good, you can choose two adjacent characters that make the string bad and
	 * remove them. You can keep doing this until the string becomes good.
	 * 
	 * Return the string after making it good. The answer is guaranteed to be unique
	 * under the given constraints.
	 * 
	 * Notice that an empty string is also good.
	 * 
	 * Example 1: Input: s = "leEeetcode" Output: "leetcode" Explanation: In the
	 * first step, either you choose i = 1 or i = 2, both will result "leEeetcode"
	 * to be reduced to "leetcode".
	 * 
	 * Example 2: Input: s = "abBAcC" Output: "" Explanation: We have many possible
	 * scenarios, and all lead to the same answer. For example: "abBAcC" --> "aAcC"
	 * --> "cC" --> "" "abBAcC" --> "abBA" --> "aA" --> ""
	 * 
	 * 
	 * Example 3:Input: s = "s" Output: "s"
	 * 
	 * @param s
	 * @return
	 */
	public String makeGood(String s) {
		StringBuilder sb = new StringBuilder();

		while (true) {

			if (removeBadCharacters(s, sb)) {
				break;
			}
			s = sb.toString();
			sb.delete(0, sb.length());
		}
		return sb.toString();
	}

	private boolean removeBadCharacters(String s, StringBuilder sb) {
		int badCount = 0;
		if (s != null && s.length() > 0) {
			boolean[] badCharacter = new boolean[s.length()];
			char prev = s.charAt(0);

			for (int i = 1; i < s.length(); i++) {
				char current = s.charAt(i);
				if (prev != current) {
					String temp1 = prev + "";
					String temp2 = current + "";
					if (temp1.equalsIgnoreCase(temp2) && Character.isUpperCase(current)) {
						badCharacter[i] = true;
						badCharacter[i - 1] = true;
						badCount += 2;
					}
				}
				prev = current;
			}

			for (int i = 0; i < s.length(); i++) {
				if (!badCharacter[i]) {
					sb.append(s.charAt(i));
				}
			}
		}
		return badCount == 0;
	}

}
