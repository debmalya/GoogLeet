package daily.medium;

public class MinimumLengthOfStringAfterDeletingSimilarEnds {
    /**
     * Given a string s consisting only of characters 'a', 'b', and 'c'.
     * You are asked to apply the following algorithm on the string any number of times:
     * <p>
     * Pick a non-empty prefix from the string s where all the characters in the prefix are equal.
     * Pick a non-empty suffix from the string s where all the characters in this suffix are equal.
     * The prefix and the suffix should not intersect at any index.
     * The characters from the prefix and suffix must be the same.
     * Delete both the prefix and the suffix.
     * Return the minimum length of s after performing the above operation any number of times (possibly zero times).
     *
     * @param s given a string.
     * @return the minimum length of s after performing the above operation any number of times.
     */
    public int minimumLength(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char fromStart = s.charAt(start);
            char fromEnd = s.charAt(end);
            if (fromStart != fromEnd) {
                return end - start + 1;
            }
            start++;
            while (s.charAt(start) == fromStart && start < end) {
                start++;
            }

            end--;
            while (s.charAt(end) == fromEnd && start < end) {
                end--;
            }

        }

        if (start == end) {
            return 1;
        }
        return (start - end) - 1;
    }
}
