package googleeet.medium;

import java.util.Arrays;

public class FindUniqueBinaryString {
  /**
   * This method finds a unique binary string that differs from all the given binary strings.
   *
   * @param nums An array of binary strings.
   * @return A unique binary string that differs from all the given binary strings.
   */
  public String findDifferentBinaryString(String[] nums) {
    // Create a StringBuilder to build the unique binary string
      String sb = "";
    // get the length of the binary string
    int n = nums[0].length();
    // Get all possible binary strings of length n
    String[] allPossible = new String[(int) Math.pow(2, n)];
    // Iterate over all possible binary strings
    for (int i = 0; i < allPossible.length; i++) {
      // Convert the integer to a binary string of length n
      String binary = Integer.toBinaryString(i);
      // Pad the binary string with leading zeros if necessary
      while (binary.length() < n) {
        binary = "0" + binary;
      }
      // Add the binary string to the allPossible array
      allPossible[i] = binary;
    }
   // Create a set to store the given binary strings for efficient lookup
    var set = Arrays.asList(nums);
    // iterate over num
      for (int i = 0; i < allPossible.length; i++) {
        // If the current binary string is not in the set, it is a unique binary string
        if (!set.contains(allPossible[i])) {
          // Return the unique binary string
          return allPossible[i];
        }
      }

    // Convert the StringBuilder to a String and return it
    return sb;
  }
}
