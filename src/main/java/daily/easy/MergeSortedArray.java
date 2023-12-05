package daily.easy;

public class MergeSortedArray {
    /**
     * You are given two integer arrays nums1 and nums2, sorted in non-decreasing order,
     * and two integers m and n, representing the number of elements in nums1 and nums2 respectively.
     * <p>
     * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
     * <p>
     * The final sorted array should not be returned by the function, but instead be stored inside the array nums1.
     * To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
     * and the last n elements are set to 0 and should be ignored. nums2 has a length of n.
     *
     * @param nums1 sorted (ascending order) array 1.
     * @param m     - length of array 1.
     * @param nums2 sorted (ascending order) array 2.
     * @param n     length of array 2.
     */


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];
        for (int i = 0, j = 0, k = 0; j < m || k < n; i++) {
            if (j < m && k < n) {
                if (nums1[j] < nums2[k]) {
                    arr[i] = nums1[j];
                    j++;
                } else {
                    arr[i] = nums2[k];
                    k++;
                }
            } else if (j < m) {
                arr[i] = nums1[j];
                j++;
            } else if (k < n) {
                arr[i] = nums2[k];
                k++;
            }
        }
        if (m + n >= 0) System.arraycopy(arr, 0, nums1, 0, m + n);

    }
}
