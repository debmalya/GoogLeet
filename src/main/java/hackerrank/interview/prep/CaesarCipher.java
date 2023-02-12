package hackerrank.interview.prep;

public class CaesarCipher {

	/**
	 * 
	 * @param s
	 * @param k
	 * @return
	 */
	public static String caesarCipher(String s, int k) {
		// Write your code here
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				int a = c - 'a' + k;
				if (a > 25) {
					a %= 26;
				}
				char ciphered = (char) ('a' + a);
				sb.append(ciphered);
			} else if (c >= 'A' && c <= 'Z') {
				int a = c - 'A' + k;
				if (a > 25) {
					a %= 26;
				}
				char ciphered = (char) ('A' + a);
				sb.append(ciphered);
			}else {
				sb.append(c);
			}
		}

		return sb.toString();

	}

}
