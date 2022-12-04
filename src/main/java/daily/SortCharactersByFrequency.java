package daily;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortCharactersByFrequency {
	public String frequencySort(String s) {
		Map<Character, Integer> cf = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			cf.putIfAbsent(c, 0);
			int count = cf.get(c);
			count++;
			cf.put(c, count);
		}

		SortedMap<Integer, Set<Character>> cs = new TreeMap<>();
		StringBuilder sb = new StringBuilder();

		cf.forEach((key, value) -> {
			cs.putIfAbsent(value, new HashSet<Character>());
			Set<Character> characters = cs.get(value);
			characters.add(key);
			cs.put(value, characters);
		});

		cs.forEach((key, value) -> {

			value.forEach(each -> {
				int count = 0;
				while (count < key) {
					sb.append(each);
					count++;
				}
			});

		});

		System.out.println(cs);
		return sb.reverse().toString();
	}

}
