package daily.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortVowel {
    /**
     * Given a 0-indexed string s, permute s to get a new string t such that:
     * <p>
     * All consonants remain in their original places. More formally, if there is an index i with 0 <= i < s.length
     * such that s[i] is a consonant, then t[i] = s[i].
     * <p>
     * The vowels must be sorted in the non-decreasing order of their ASCII values.
     * More formally, for pairs of indices i, j with 0 <= i < j < s.length such that s[i] and s[j] are vowels,
     * then t[i] must not have a higher ASCII value than t[j].
     *
     * @param s String.
     * @return the resulting string.
     * <p>
     * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in lowercase or uppercase.
     * Consonants comprise all letters that are not vowels.
     */
    public String sortVowels0(String s) {
        char[] arr = s.toCharArray();
        List<Integer> vowelList = new ArrayList<>();
        List<Integer> positionList = new ArrayList<>();
        int a = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
                    || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                a = c;
                vowelList.add(a);
                positionList.add(i);
            }
        }
        Collections.sort(vowelList);
        Integer[] asciiSortedVowel = vowelList.toArray(new Integer[0]);
        for (int i = 0; i < positionList.size(); i++) {
            a = asciiSortedVowel[i];
            arr[positionList.get(i)] = (char) a;
        }

        return String.valueOf(arr);
    }
}
