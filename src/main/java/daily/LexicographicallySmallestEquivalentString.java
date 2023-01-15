package daily;

import java.util.ArrayList;
import java.util.List;

public class LexicographicallySmallestEquivalentString {
	/**
	 * You are given two strings of the same length s1 and s2 and a string baseStr.
	 * We say s1[i] and s2[i] are equivalent characters. For example, if s1 = "abc"
	 * and s2 = "cde", then we have 'a' == 'c', 'b' == 'd', and 'c' == 'e'.
	 * Equivalent characters follow the usual rules of any equivalence relation:
	 * 
	 * Reflexivity: 'a' == 'a'.
	 * 
	 * Symmetry: 'a' == 'b' implies 'b' == 'a'.
	 * 
	 * Transitivity: 'a' == 'b' and 'b' == 'c' implies 'a' == 'c'.
	 * 
	 * Example 1:
	 * 
	 * Input: s1 = "parker", s2 = "morris", baseStr = "parser" Output: "makkek"
	 * Explanation: Based on the equivalency information in s1 and s2, we can group
	 * their characters as [m,p], [a,o], [k,r,s], [e,i]. The characters in each
	 * group are equivalent and sorted in lexicographical order. So the answer is
	 * "makkek".
	 * 
	 * 
	 * Example 2:
	 * 
	 * Input: s1 = "hello", s2 = "world", baseStr = "hold" Output: "hdld"
	 * Explanation: Based on the equivalency information in s1 and s2, we can group
	 * their characters as [h,w], [d,e,o], [l,r]. So only the second letter 'o' in
	 * baseStr is changed to 'd', the answer is "hdld".
	 * 
	 * Example 3:
	 * 
	 * Input: s1 = "leetcode", s2 = "programs", baseStr = "sourcecode" Output:
	 * "aauaaaaada" Explanation: We group the equivalent characters in s1 and s2 as
	 * [a,o,e,r,s,c], [l,p], [g,t] and [d,m], thus all letters in baseStr except 'u'
	 * and 'd' are transformed to 'a', the answer is "aauaaaaada".
	 * 
	 * @param s1
	 * @param s2
	 * @param baseStr
	 * @return the lexicographically smallest equivalent string of baseStr by using
	 *         the equivalency information from s1 and s2.
	 */

	int minChar;

	void DFS(int src, Integer[][] adjMatrix, Integer visited[], List<Integer> component) {
		// Mark the character as visited.
		visited[src] = 1;
		// Add it to the list.
		component.add(src);
		// Update the minimum character in the component.
		minChar = Math.min(minChar, src);

		for (int i = 0; i < 26; i++) {
			// Perform DFS if the edge exists and the node isn't visited yet.
			if (adjMatrix[src][i] != null && visited[i] == null) {
				DFS(i, adjMatrix, visited, component);
			}
		}
	}

	public String smallestEquivalentString(String s1, String s2, String baseStr) {
		// Adjacency matrix to store edges.
		Integer adjMatrix[][] = new Integer[26][26];
		for (int i = 0; i < s1.length(); i++) {
			adjMatrix[s1.charAt(i) - 'a'][s2.charAt(i) - 'a'] = 1;
			adjMatrix[s2.charAt(i) - 'a'][s1.charAt(i) - 'a'] = 1;
		}

		// Array to store the final character mappings.
		int mappingChar[] = new int[26];
		for (int i = 0; i < 26; i++) {
			mappingChar[i] = i;
		}

		// Array to keep visited nodes during DFS.
		Integer visited[] = new Integer[26];
		for (int c = 0; c < 26; c++) {
			if (visited[c] == null) {
				// Store the characters in the current component.
				List<Integer> component = new ArrayList<>();
				// Variable to store the minimum character in the component.
				minChar = 27;

				DFS(c, adjMatrix, visited, component);

				// Map the characters in the component to the minimum character.
				for (int vertex : component) {
					mappingChar[vertex] = minChar;
				}
			}
		}

		String ans = "";
		// Create the answer string.
		for (char c : baseStr.toCharArray()) {
			ans += (char) (mappingChar[c - 'a'] + 'a');
		}

		return ans;
	}

}
