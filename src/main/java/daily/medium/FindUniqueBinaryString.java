package daily.medium;

import java.util.Arrays;

public class FindUniqueBinaryString {
    /**
     * Given an array of strings nums containing n unique binary strings each of length n,
     * return a binary string of length n that does not appear in nums. If there are multiple answers, you may return any of them.
     *
     * @param nums array of strings.
     * @return a binary string of length n.
     */

    public String findDifferentBinaryString(String[] nums) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i].charAt(i) == '0' ? "1" : "0");
        }
        return new String(sb);
    }

    public String findDifferentBinaryString0(String[] nums) {
        Arrays.sort(nums);
        int n = nums[0].length();
        StringBuilder missing = new StringBuilder();
        String replaced = nums[0].replace("0", "");
        if (!replaced.isEmpty()) {
            missing = new StringBuilder(nums[0].replace("1", "0"));
            return missing.toString();
        }
        int prev = convert(nums[0]);
        for (int index = 1; index < nums.length; index++) {
            int current = convert(nums[index]);
            if (Math.abs(current - prev) > 1) {
                missing = new StringBuilder(Integer.toBinaryString(prev + 1));
            }
            prev = current;
        }
        if (missing.isEmpty()) {
            missing = new StringBuilder(Integer.toBinaryString(prev + 1));
        }
        while (missing.length() < n) {
            missing.insert(0, "0");
        }
        return missing.toString();
    }

    public int convert(String strNum) {
        int n = 0;
        int power = 0;
        StringBuilder sb = new StringBuilder(strNum);
        var reversed = sb.reverse().toString();
        for (int i = 0; i < reversed.length(); i++) {
            char c = reversed.charAt(i);

            if (c == '0') {
                if (i == reversed.length() - 1) {
                    break;
                }
                n += (int) (Math.pow(2, power) * 0);
            } else {
                n += (int) (Math.pow(2, power) * 1);
            }
            power++;
        }
        return n;
    }
}
