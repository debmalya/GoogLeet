package codility;

import java.util.Stack;

public class ProperString {

	public int solution(String S) {
        // Implement your solution here
		Stack<Character> chStack = new Stack<>();
		
		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (c == '(' || c == '{' || c == '[') {
				chStack.push(c);
			}else {
				if (chStack.isEmpty()) {
					return 0;
				}else {
					char p = chStack.peek();
					if ((p == '(' && c == ')') || (p == '{' && c == '}') || (p == '[' && c == ']')) {
						chStack.pop();
					}
				}
			}
		}
		return chStack.size() == 0 ? 1 : 0;
    }

}
