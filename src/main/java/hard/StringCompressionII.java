package hard;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringCompressionII {
    /**
     * Run-length encoding is a string compression method that works by replacing consecutive identical characters
     * (repeated 2 or more times) with the concatenation of the character and the number marking the count of the characters
     * (length of the run). For example, to compress the string "aabccc" we replace "aa" by "a2" and replace "ccc" by "c3".
     * Thus the compressed string becomes "a2bc3".
     * <p>
     * Notice that in this problem, we are not adding '1' after single characters.
     * <p>
     * Given a string s and an integer k. You need to delete at most k characters from s such that the run-length encoded version
     * of s has minimum length.
     * <p>
     * Find the minimum length of the run-length encoded version of s after deleting at most k characters.
     *
     * @param s String to be compressed.
     * @param k number of characters to be deleted.
     * @return minimum length of the run-length encoded version of s after deleting at most k characters.
     */
    public int getLengthOfOptimalCompression(String s, int k) {
        int n = s.length();
        int[][] dp = new int[110][110];
        for (int i = 0; i <= n; i++)
            for (int j = 0; j <= n; j++)
                dp[i][j] = 9999;
        dp[0][0] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                int cnt = 0, del = 0;
                for (int l = i; l >= 1; l--) {
                    if (s.charAt(l - 1) == s.charAt(i - 1))
                        cnt++;
                    else
                        del++;

                    if (j - del >= 0) {
                        dp[i][j] = Math.min(dp[i][j], dp[l - 1][j - del] + 1 + (cnt >= 100 ? 3 : cnt >= 10 ? 2 : cnt >= 2 ? 1 : 0));
                    }
                }
                if (j > 0)
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - 1]);
            }
        }
        return dp[n][k];
    }

    public int getLengthOfOptimalCompression0(String s, int k) {

        char prev = s.charAt(0);
        Set<Character> unique = new HashSet<>();
        Set<Character> multiple = new HashSet<>();

        int count = 1;
        List<Integer> frequency = new ArrayList<>();
        List<Character> chars = new ArrayList<>();
        char current = ' ';

        for (int index = 1; index < s.length(); index++) {
            current = s.charAt(index);

            if (current != prev) {
                if (!unique.add(prev)) {
                    multiple.add(prev);
                }
                chars.add(prev);
                frequency.add(count);
                if (count > 1) {
                    count = 1;
                }
            } else {
                count++;
            }
            prev = current;
        }

        frequency.add(count);
        if (current != ' ')
            chars.add(current);
        else
            chars.add(prev);

        if (!unique.add(prev)) {
            multiple.add(prev);
        }

        Character[] duplicates = multiple.toArray(new Character[0]);
        for (int index = 0; index < duplicates.length; index++) {
            unique.remove(duplicates[index]);
        }


        count = 1;
        while (k > 0) {
            for (int index = frequency.size() - 1; index > -1 && k > 0; index--) {
                if (frequency.get(index) == count) {
                    if (unique.isEmpty() || unique.contains(chars.get(index))) {
                        unique.remove(chars.get(index));
                        chars.remove(index);
                        frequency.remove(index);
                        k -= count;
                        if (chars.size() > 0 && index < chars.size() && index > 0) {
                            if (chars.get(index) == chars.get(index - 1)) {
                                int previous = frequency.get(index);
                                frequency.set(index - 1, frequency.get(index - 1) + previous);
                                frequency.remove(index);
                                chars.remove(index);
                            }
                        }
                    }
                }
            }
            count++;
        }
        // System.out.println("After replacing :"+frequency+" "+chars);
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < frequency.size(); index++) {
            sb.append(chars.get(index));
            if (frequency.get(index) > 1) {
                sb.append(frequency.get(index));
            }
        }
        String compressed = sb.toString();
        // System.out.println("After replacing :"+compressed);
        return compressed.length();
    }
}
