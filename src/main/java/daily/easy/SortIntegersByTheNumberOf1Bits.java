package daily.easy;

import java.util.*;

public class SortIntegersByTheNumberOf1Bits {
    public int[] sortByBits(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = countBitOne(arr[i]) * 10001 + arr[i];
        }

        Arrays.sort(res);
        for (int i = 0; i < n; i++) {
            res[i] %= 10001;
        }

        return res;
    }

    private int countBitOne(int n) {
        int res = 0;
        while (n != 0) {
            res += (n & 1);
            n >>= 1;
        }
        return res;
    }

    public int[] sortByBits0(int[] arr) {
        int[] sorted = new int[arr.length];
        Map<Integer, List<Integer>> bitMap = new HashMap<>();

        for (int i : arr) {
            var binaryStr = Integer.toBinaryString(i);
            var oneCount = countOne(binaryStr);
            bitMap.putIfAbsent(oneCount, new ArrayList<>());
            bitMap.get(oneCount).add(i);
        }

        var keySet = bitMap.keySet().toArray(new Integer[0]);
        Arrays.sort(keySet);
        int index = 0;
        for (int a : keySet) {
            var nums = bitMap.get(a);
            Collections.sort(nums);
            for (int num : nums) {
                sorted[index++] = num;
            }
        }
        return sorted;
    }

    private int countOne(String binaryStr) {
        return binaryStr.length() - binaryStr.replace("1", "").length();
    }
}
