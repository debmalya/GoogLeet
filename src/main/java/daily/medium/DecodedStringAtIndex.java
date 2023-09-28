package daily.medium;

public class DecodedStringAtIndex {
    /**
     * You are given an encoded string s.
     * To decode the string to a tape, the encoded string is read one character at a time and the following steps are taken:
     * <li>If the character read is a letter, that letter is written onto the tape.</li>
     * <li>If the character read is a digit d, the entire current tape is repeatedly written d - 1 more times in total.</li>
     *
     * @param s encoded string.
     * @param k Given an integer k.
     * @return the kth letter (1-indexed) in the decoded string.
     * <p>
     * Constraints:
     * <p>
     * 2 <= s.length <= 100
     * s consists of lowercase English letters and digits 2 through 9.
     * s starts with a letter.
     * 1 <= k <= 109
     * It is guaranteed that k is less than or equal to the length of the decoded string.
     * The decoded string is guaranteed to have less than 263 letters.
     */
    public String decodeAtIndex(String s, int k) {
        long length = 0;
        int i = 0;

        while (length < k) {
            if (Character.isDigit(s.charAt(i))) {
                length *= s.charAt(i) - '0';
            } else {
                length++;
            }
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {
            if (Character.isDigit(s.charAt(j))) {
                length /= s.charAt(j) - '0';
                k %= length;
            } else {
                if (k == 0 || k == length) {
                    return Character.toString(s.charAt(j));
                }
                length--;
            }
        }

        return "";
    }

    public String decodeAtIndex0(String s, int k) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (stringBuilder.length() >= k) {
                return String.valueOf(stringBuilder.charAt(k - 1));
            }
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                stringBuilder.append(c);
            } else if (c >= '1' && c <= '9') {
                int count = 1;
                String mainString = stringBuilder.toString();
                int times = c - '0';
                while (count < times) {
                    stringBuilder.append(mainString);
                    if (stringBuilder.length() >= k) {
                        return String.valueOf(stringBuilder.charAt(k - 1));
                    }
                    count++;
                }
            }
        }
        if (stringBuilder.length() >= k) {
            return String.valueOf(stringBuilder.charAt(k - 1));
        }
        return "";
    }
}
