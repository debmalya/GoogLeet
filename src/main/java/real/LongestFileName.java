package real;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class LongestFileName {
	public int lengthLongestPath(String input) {
		Stack<Integer> stack = new Stack<>();
		stack.push(0); // "dummy" length
		int maxLen = 0;
		for (String s : input.split("\n")) {
			int lev = s.lastIndexOf("\t") + 1; // number of "\t"
			while (lev + 1 < stack.size())
				stack.pop(); // find parent
			int len = stack.peek() + s.length() - lev + 1; // remove "/t", add"/"
			stack.push(len);
			// check if it is file
			if (s.contains("."))
				maxLen = Math.max(maxLen, len - 1);
		}
		return maxLen;
	}
	
	public int lengthLongestPath0(String input) {
		Deque<Integer> stack = new ArrayDeque<>();
		stack.push(0); // "dummy" length
		int maxLen = 0;
		for (String s : input.split("\n")) {
			int lev = s.lastIndexOf("\t") + 1; // number of "\t"
			while (lev + 1 < stack.size())
				stack.pop(); // find parent
			int len = stack.peek() + s.length() - lev + 1; // remove "/t", add"/"
			stack.push(len);
			// check if it is file
			if (s.contains("."))
				maxLen = Math.max(maxLen, len - 1);
		}
		return maxLen;
	}

}
