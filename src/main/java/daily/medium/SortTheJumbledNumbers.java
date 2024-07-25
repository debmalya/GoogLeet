package daily.medium;

import java.util.*;

public class SortTheJumbledNumbers {
  /**
   * You are given a 0-indexed integer array mapping which represents the mapping rule of a shuffled
   * decimal system. mapping[i] = j means digit i should be mapped to digit j in this system.
   *
   * <p>The mapped value of an integer is the new integer obtained by replacing each occurrence of
   * digit i in the integer with mapping[i] for all 0 <= i <= 9.
   *
   * <p>You are also given another integer array nums. Return the array nums sorted in
   * non-decreasing order based on the mapped values of its elements.
   *
   * <p>Notes:
   *
   * <p>Elements with the same mapped values should appear in the same relative order as in the
   * input. The elements of nums should only be sorted based on their mapped values and not be
   * replaced by them.
   *
   * @param mapping - 0 indexed integer array.
   * @param nums - integer array containing actual numbers.
   * @return - sorted number after mapping.
   */
  public int[] sortJumbled(int[] mapping, int[] nums) {
    Map<Integer, List<Integer>> mapForSorting = new LinkedHashMap<>();
    var mappedNums = new int[nums.length];
    var index = 0;
    for (int num : nums) {
      mappedNums[index] = getMappedNum(mapping, num);
      var values = mapForSorting.getOrDefault(mappedNums[index], new ArrayList<>());
      values.add(num);
      mapForSorting.put(mappedNums[index], values);
      index++;
    }

    Arrays.sort(mappedNums);

    index = 0;
    for (int mappedIndex = 0; mappedIndex < mappedNums.length; ) {
      var values = mapForSorting.get(mappedNums[mappedIndex]);
      mappedIndex += values.size();
      for (var nume : values) {
        nums[index++] = nume;
      }
    }

    return nums;
  }

  public int getMappedNum(int[] mapping, int num) {
    var str = String.valueOf(num).toCharArray();
    for (var index = 0; index < str.length; index++) {
      char c = str[index];
      str[index] = String.valueOf(mapping[c - '0']).charAt(0);
    }

    return Integer.parseInt(String.valueOf(str));
  }
}
