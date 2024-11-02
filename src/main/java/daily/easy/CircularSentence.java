package daily.easy;

public class CircularSentence {
  /**
   * A sentence is a list of words that are separated by a single space with no leading or trailing
   * spaces.
   *
   * <p>For example, "Hello World", "HELLO", "hello world hello world" are all sentences. Words
   * consist of only uppercase and lowercase English letters. Uppercase and lowercase English
   * letters are considered different.
   *
   * <p>A sentence is circular if:
   *
   * <p>The last character of a word is equal to the first character of the next word. The last
   * character of the last word is equal to the first character of the first word. For example,
   * "leetcode exercises sound delightful", "eetcode", "leetcode eats soul" are all circular
   * sentences. However, "Leetcode is cool", "happy Leetcode", "Leetcode" and "I like Leetcode" are
   * not circular sentences.
   *
   * <p>Given a string sentence, return true if it is circular. Otherwise, return false.
   *
   * @param sentence is a list of words.
   * @return true if circular, false otherwise.
   */
  public boolean isCircularSentence(String sentence) {
    var words = sentence.split("\\s");
    var lastChar = words[0].charAt(words[0].length() - 1);

    for (var index = 1; index < words.length; index++) {
      var firstChar = words[index].charAt(0);
      if (lastChar != firstChar) return false;
      lastChar = words[index].charAt(words[index].length() - 1);
    }

    return lastChar == words[0].charAt(0);
  }
}
