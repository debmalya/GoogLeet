package daily;

import java.util.*;

public class MinimumDeletionsToMakeCharacterFrequenciesUnique {
    /**
     * A string s is called good if there are no two different characters in s that have the same frequency.
     *
     * @param s string to be made a good one. s contains only lowercase English letters. 1 <= s.length <= 10^5
     * @return the minimum number of characters you need to delete to make s good.
     */
    public int minDeletions(String s) {
        HashMap<Character, Integer> cnt = new HashMap<>();
        int deletions = 0;
        HashSet<Integer> used_frequencies = new HashSet<>();

        for (char c : s.toCharArray()) {
            cnt.put(c, cnt.getOrDefault(c, 0) + 1);
        }

        for (int freq : cnt.values()) {
            while (freq > 0 && used_frequencies.contains(freq)) {
                freq--;
                deletions++;
            }
            used_frequencies.add(freq);
        }

        return deletions;
    }

    public int minDeletions0(String s) {
        int[] occurrences = new int[26];


        for (int i = 0; i < s.length(); i++) {
            occurrences[s.charAt(i) - 'a']++;
        }

        Set<Integer> unique = new HashSet<>();
        int changesRequired = 0;
        List<Integer> toBeChanged = new ArrayList<>();
        for (int i = 0; i < occurrences.length; i++) {
            if (occurrences[i] > 0 && !unique.add(occurrences[i])) {
                changesRequired++;
                toBeChanged.add(i);

            }
        }

        if (changesRequired == 0) {
            return 0;
        }

        changesRequired = 0;
        for (int i = 0; i < toBeChanged.size(); i++) {
            while (true) {
                occurrences[toBeChanged.get(i)]--;
                changesRequired++;
                if (!unique.contains(occurrences[toBeChanged.get(i)]) || occurrences[toBeChanged.get(i)] == 0) {
                    unique.add(occurrences[toBeChanged.get(i)]);
                    break;
                }
            }
        }
        return changesRequired;
    }
}
