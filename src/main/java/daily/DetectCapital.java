package daily;

public class DetectCapital {
	/**
	 * 
	 * @param word 
	 * @return
	 */
	public boolean detectCapitalUse(String word) {
		boolean firstLetterCap = false;
		int capCount = 0;
		int smallCount = 0;

		for (int i = 0; i < word.length(); i++) {
			if (Character.isUpperCase(word.charAt(i))) {
				if (i > 0) {
					firstLetterCap = false;
				} else {
					firstLetterCap = true;
				}
				capCount++;
			} else if (Character.isLowerCase(word.charAt(i))) {
				smallCount++;
				if (i == 0) {
					firstLetterCap = false;
				}
			}
		}
		return firstLetterCap || smallCount == word.length() || capCount == word.length();
	}
}
