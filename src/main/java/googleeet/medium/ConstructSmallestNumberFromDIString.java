package googleeet.medium;

public class ConstructSmallestNumberFromDIString {
  /**
   * You are given a 0-indexed string pattern of length n consisting of the characters 'I' meaning
   * increasing and 'D' meaning decreasing.
   *
   * <p>A 0-indexed string num of length n + 1 is created using the following conditions:
   *
   * <p>num consists of the digits '1' to '9', where each digit is used at most once. If pattern[i]
   * == 'I', then num[i] < num[i + 1]. If pattern[i] == 'D', then num[i] > num[i + 1]. Return the
   * lexicographically smallest possible string num that meets the conditions.
   *
   * @param pattern
   * @return
   */
  public String smallestNumber(String pattern) {
    int n = pattern.length();
    StringBuilder result = new StringBuilder();
    int[] stack = new int[n + 1];
    int index = 0;

    for (int i = 0; i <= n; i++) {
      stack[index++] = i + 1;

      if (i == n || pattern.charAt(i) == 'I') {
        while (index > 0) {
          result.append(stack[--index]);
        }
      }
    }

    return result.toString();
  }
}
