package real;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParanthesis {
	/**
	 * A valid parentheses string is either empty "", "(" + A + ")", or A + B, where
	 * A and B are valid parentheses strings, and + represents string concatenation.
	 * 
	 * For example, "", "()", "(())()", and "(()(()))" are all valid parentheses
	 * strings. A valid parentheses string s is primitive if it is nonempty, and
	 * there does not exist a way to split it into s = A + B, with A and B nonempty
	 * valid parentheses strings.
	 * 
	 * Given a valid parentheses string s, consider its primitive decomposition: s =
	 * P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.
	 * 
	 * Return s after removing the outermost parentheses of every primitive string
	 * in the primitive decomposition of s.
	 * 
	 * Example 1:
	 * 
	 * Input: s = "(()())(())" Output: "()()()" Explanation: The input string is
	 * "(()())(())", with primitive decomposition "(()())" + "(())". After removing
	 * outer parentheses of each part, this is "()()" + "()" = "()()()".
	 * 
	 * Example 2:
	 * 
	 * Input: s = "(()())(())(()(()))" Output: "()()()()(())" Explanation: The input
	 * string is "(()())(())(()(()))", with primitive decomposition "(()())" +
	 * "(())" + "(()(()))". After removing outer parentheses of each part, this is
	 * "()()" + "()" + "()(())" = "()()()()(())".
	 * 
	 * @param s
	 * @return
	 */
	public String removeOuterParentheses(String s) {
		return remove(primitiveDecomposition(s));
	}

	public String remove(List<String> primitiveDecomposition) {
        StringBuilder sb = new StringBuilder();
        for (String each:primitiveDecomposition) {
        	sb.append(each);
        }
		return sb.toString();
	}

	public List<String> primitiveDecomposition(String s) {
		Stack<Character> paranStack = new Stack<>();
		List<String> parts = new ArrayList<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '(') {
				if (!paranStack.isEmpty()) {
					sb.append(c);
				}
				paranStack.push(c);
			} else if (c == ')') {
				if (paranStack.size() > 1) {
					sb.append(c);
					paranStack.pop();
				} else {
					// outer
					parts.add(sb.toString());
					sb.delete(0, sb.length());
					while (!paranStack.empty()) {
						paranStack.pop();
					}
				}

			}
		}

		return parts;
	}

}
