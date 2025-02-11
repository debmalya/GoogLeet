package daily.medium;

public class RemoveAllOccurrencesOfASubstring {
  /**
   * You are given a string s and a string part. You want to remove all occurrences of part in s.
   *
   * <p>You will remove the part by following the next rules:
   *
   * <p>Find the occurrence of the part in s. If you find the occurrence, remove the part and repeat
   * the process until you can't find the part.
   *
   * <p>Return the final string after all the occurrences have been removed. It is guaranteed that
   * the answer is unique.
   *
   * @param s - String.
   * @param part - Substring.
   * @return result after removing all occurrences of part in s.
   */
  public String removeOccurrences(String s, String part) {
    StringBuilder sb = new StringBuilder(s);
    int partLength = part.length();
    int index;

    while ((index = sb.indexOf(part)) != -1) {
      sb.delete(index, index + partLength);
    }

    return sb.toString();
  }
}
