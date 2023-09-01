package hard;

public class TrappingRainWater {
    /**
     * Given n non-negative integers representing an elevation map where the width of each bar is 1,
     * compute how much water it can trap after raining.
     *
     * @param height elevation map.
     * @return how much water it can be trapped.
     */

    public int trap(int[] height) {
        int size = height.length;
        int[] leftMax = new int[size];
        int[] rightMax = new int[size];

        leftMax[0] = height[0];
        for (int i = 1; i < size; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        rightMax[size - 1] = height[size - 1];
        for (int i = size - 2; i > -1; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int ans = 0;
        for (int i = 1; i < size - 1; i++) {
            ans += (Math.min(leftMax[i], rightMax[i]) - height[i]);
        }

        return ans;
    }

}
