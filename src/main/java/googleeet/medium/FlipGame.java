package googleeet.medium;

public class FlipGame {

	/**
	 * You are playing a Flip Game with your friend.
	 * 
	 * You are given a string currentState that contains only '+' and '-'. You and
	 * your friend take turns to flip two consecutive "++" into "--". The game ends
	 * when a person can no longer make a move, and therefore the other person will
	 * be the winner.
	 * 
	 * Return true if the starting player can guarantee a win, and false otherwise.
	 * 
	 * Example 1:
	 * 
	 * Input: currentState = "++++" Output: true Explanation: The starting player
	 * can guarantee a win by flipping the middle "++" to become "+--+". Example 2:
	 * 
	 * Input: currentState = "+" Output: false
	 * 
	 * @param currentState that contains only '+' and '-'.
	 * @return true if the starting player can guarantee a win, and false otherwise.
	 */
	public boolean canWin(String s) {
		if (s == null || s.length() < 2) {
			return false;
		}

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.startsWith("++", i)) {
				String t = s.substring(0, i) + "--" + s.substring(i + 2);

				if (!canWin(t)) {
					return true;
				}
			}
		}

		return false;
	}

}
