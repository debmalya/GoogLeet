package daily.medium;

public class FindTheOriginalArrayOfPrefixXor {
    /**
     * You are given an integer array pref of size n. Find and return the array arr of size n that satisfies:
     * <p>
     * pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i]
     *
     * @param pref integer array.
     * @return
     */
    public int[] findArray(int[] pref) {
        int[] arr = new int[pref.length];
        int index = 0;
        arr[index] = pref[index];
        for (index = 1; index < pref.length; index++) {
            arr[index] = pref[index] ^ pref[index - 1];
        }
        return arr;
    }
}
