package daily.medium;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class RemoveDuplicateLetters {
    /**
     * Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is
     * the smallest in lexicographical order
     * among all possible results.
     *
     * @param s string to be searched for duplicate letter.
     * @return the result without duplicate letters and smallest in lexicographical order.
     */
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        boolean[] seen = new boolean[26];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            int currentChar = s.charAt(i) - 'a';
            if (seen[currentChar]) continue;
            while (!stack.isEmpty() && stack.peek() > currentChar && i < lastIndex[stack.peek()]) {
                seen[stack.pop()] = false;
            }

            stack.push(currentChar);
            seen[currentChar] = true;
        }
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append((char) (stack.pop() + 'a'));
        }
        return result.reverse().toString();
    }

    public String removeDuplicateLetters0(String s) {
        char lowest = 'z';
        int lowestPosiiton = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c < lowest) {
                lowest = c;
                lowestPosiiton = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        Set<Character> unique = new HashSet<>();
        for (int i = lowestPosiiton; i < s.length(); i++) {
            char c = s.charAt(i);
            if (unique.add(c)) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
