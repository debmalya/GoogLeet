package googleeet.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInAString {

	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> indexes = new ArrayList<>();

		char[] pchar = p.toCharArray();
		Arrays.sort(pchar);

		int slen = s.length();
		int plen = p.length();
		for (int i = 0; i < slen - plen + 1; i++) {
			char[] schar = s.substring(i, i + plen).toCharArray();
			Arrays.sort(schar);
			if (Arrays.equals(pchar, schar)) {
				indexes.add(i);
			}
		}

		return indexes;
	}

}
