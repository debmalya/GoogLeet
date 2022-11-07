package daily;

import java.util.Stack;

public class SixtyNine {

	/**
	 * You are given a positive integer num consisting only of digits 6 and 9.
	 * 
	 * Return the maximum number you can get by changing at most one digit (6
	 * becomes 9, and 9 becomes 6).
	 * 
	 * @param num
	 * @return
	 */
	public int maximum69Number(int num) {
		int changedNum = -1;
		Stack<Integer> reverse = new Stack<>();
		while (num > 0) {
			reverse.push(num % 10);
			num /= 10;
		}

		boolean changed = false;
		while (!reverse.isEmpty()) {
			if (changedNum != -1) {
				changedNum *= 10;
			}else {
				changedNum = 0;
			}

			if (!changed && reverse.peek() == 6) {
				changedNum += 9;
				changed = true;
				reverse.pop();
			} else {
				changedNum += reverse.pop();
			}

		}
		return changedNum;
	}

}
