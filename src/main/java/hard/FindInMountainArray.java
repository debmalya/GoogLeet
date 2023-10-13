package hard;

public class FindInMountainArray {
    interface MountainArray {
        int get(int index);

        int length();
    }

    static class MountainArrayImpl implements MountainArray {

        int[] arr = null;
        int size = 0;

        MountainArrayImpl(int[] arr) {
            this.arr = arr;
            this.size = arr.length;
        }

        @Override
        public int get(int index) {
            if (index < size) {
                return arr[index];
            }
            return -1;
        }

        @Override
        public int length() {
            return size;
        }
    }

    /**
     * An array arr is a mountain array if and only if:
     * <p>
     * arr.length >= 3
     * There exists some i with 0 < i < arr.length - 1 such that:
     * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
     * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
     * Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target.
     * If such an index does not exist, return -1.
     * <p>
     * You cannot access the mountain array directly. You may only access the array using a MountainArray interface:
     * <p>
     * MountainArray.get(k) returns the element of the array at index k (0-indexed).
     * MountainArray.length() returns the length of the array.
     * Submissions making more than 100 calls to MountainArray.get will be judged Wrong Answer.
     * Also, any solutions that attempt to circumvent the judge will result in disqualification.
     *
     * @param target
     * @param mountainArr
     * @return the minimum index such that mountainArr.get(index) == target.
     *
     * <p></p>
     * Example 1:
     * <p>
     * Input: array = [1,2,3,4,5,3,1], target = 3
     * Output: 2
     * Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.
     * Example 2:
     * <p>
     * Input: array = [0,1,2,4,2,1], target = 3
     * Output: -1
     * Explanation: 3 does not exist in the array, so we return -1.
     */
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int low = 0;
        int high = n - 1;
        int peak = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (low < mid && mountainArr.get(mid) < mountainArr.get(mid - 1)) {
                high = mid - 1;
            } else if (high > mid && mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                low = mid + 1;
            } else {
                peak = mid;
                break;
            }
        }
        if (peak == -1) {
            peak = high;
        }
        int peakEle = mountainArr.get(peak);
        if (peakEle == target) {
            return peak;
        }
        if (peakEle < target) {
            return -1;
        }
        int index = find(0, peak - 1, target, mountainArr, true);
        if (index != -1) {
            return index;
        }
        index = find(peak + 1, n - 1, target, mountainArr, false);
        return index;
    }

    private int find(int low, int high, int target, MountainArray nums, boolean up) {
        if (up) {
            while (low <= high) {
                int mid = (low + high) / 2;
                if (nums.get(mid) == target) {
                    return mid;
                } else if (nums.get(mid) < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return -1;
        } else {
            while (low <= high) {
                int mid = (low + high) / 2;
                if (nums.get(mid) == target) {
                    return mid;
                } else if (nums.get(mid) > target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return -1;
        }
    }

    public int findInMountainArray0(int target, MountainArray mountainArr) {
        int minIndex = Integer.MAX_VALUE;
        int n = mountainArr.length();
        int low = 0;
        int middle = n / 2;
        int high = n - 1;
        int callCount = 0;

        if (n < 100) {
            for (int i = 0; i < n; i++) {
                if (mountainArr.get(i) == target) {
                    minIndex = Math.min(i, minIndex);
                    break;
                }
            }

        } else {
            while (low < high) {
                if (callCount > 99) {
                    break;
                }
                int middleValue = mountainArr.get(middle);
                if (middleValue == target) {
                    minIndex = Math.min(middle, minIndex);
                } else if (target > middleValue) {
                    low = middle;
                } else {
                    high = middle;
                }
                middle = (low + high) / 2;
                callCount++;
            }
        }

        return minIndex == Integer.MAX_VALUE ? -1 : minIndex;
    }
}
