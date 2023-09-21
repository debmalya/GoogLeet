package daily;

public class MinimumOperationsToReduceXToZero {
    /**
     * You are given an integer array numbs and an integer x.
     * In one operation, you can either remove the leftmost or the rightmost element from the array numbs and subtract its value from x.
     * Note that this modifies the array for future operations.
     *
     * @param nums - an integer array.
     * @param x    - an integer
     * @return the minimum number of operations to reduce x to exactly 0 if it is possible, otherwise, return -1.
     */
    public int minOperations(int[] nums, int x) {
        int target = -x, n = nums.length;
        for (int num : nums) target += num;

        if (target == 0) return n;

        int maxLen = 0, curSum = 0, left = 0;

        for (int right = 0; right < n; ++right) {
            curSum += nums[right];
            while (left <= right && curSum > target) {
                curSum -= nums[left];
                left++;
            }
            if (curSum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }

        return maxLen != 0 ? n - maxLen : -1;
    }

    public int minOperations0(int[] nums, int x) {
        int operations = 0;
        int minOperations = Integer.MAX_VALUE;
        if (!(nums[0] > x && nums[nums.length - 1] > x)) {
            minOperations = Math.min(minOperations, getOperationCountFromFront(nums, x));
            minOperations = Math.min(minOperations, getOperationCountFromBack(nums, x));

            int fi = 0;
            int li = nums.length - 1;
            int visitedCount = 0;
            boolean[] visited = new boolean[nums.length];
            while (true) {
                if (x == 0 || visitedCount == nums.length) {
                    break;
                } else if (fi < nums.length && !visited[fi] && nums[fi] > nums[li] && nums[fi] <= x) {
                    visited[fi] = true;
                    x -= nums[fi];
                    fi++;
                    operations++;
                    visitedCount++;
                } else if (li > -1 && !visited[li] && nums[li] <= x) {
                    visited[li] = true;
                    x -= nums[li];
                    li--;
                    operations++;
                    visitedCount++;
                } else if (fi < nums.length && !visited[fi] && nums[fi] <= x) {
                    visited[fi] = true;
                    x -= nums[fi];
                    fi++;
                    operations++;
                    visitedCount++;
                } else {
                    return -1;
                }
            }
        }

        if (x == 0) {
            minOperations = Math.min(minOperations, operations);
        }
        if (minOperations != Integer.MAX_VALUE) {
            return minOperations;
        } else {
            return -1;
        }
    }

    private int getOperationCountFromBack(int[] nums, int x) {
        int sum = x;
        int count = 0;
        for (int i = nums.length - 1; i > 0 && sum > 0; i--) {
            sum -= nums[i];
            count++;
        }
        if (sum == 0) {
            return count;
        } else {
            return Integer.MAX_VALUE;
        }
    }

    private int getOperationCountFromFront(int[] nums, int x) {
        int sum = x;
        int count = 0;
        for (int i = 0; i < nums.length && sum > 0; i++) {
            sum -= nums[i];
            count++;
        }
        if (sum == 0) {
            return count;
        } else {
            return Integer.MAX_VALUE;
        }
    }
}
