package googleeet.medium;

public class JumpGameII {
	/**
	 * You are given a 0-indexed array of integers nums of length n. You are
	 * initially positioned at nums[0].
	 * 
	 * Each element nums[i] represents the maximum length of a forward jump from
	 * index i. In other words, if you are at nums[i], you can jump to any nums[i +
	 * j] where:
	 * 
	 * 0 <= j <= nums[i] and i + j < n Return the minimum number of jumps to reach
	 * nums[n - 1]. The test cases are generated such that you can reach nums[n -
	 * 1].
	 * 
	 * @param nums
	 * @return
	 */
	
	    public int jump(int[] nums) {
	        // The starting range of the first jump is [0, 0]
	        int answer = 0, n = nums.length;
	        int curEnd = 0, curFar = 0;
	        
	        for (int i = 0; i < n - 1; ++i) {
	            // Update the farthest reachable index of this jump.
	            curFar = Math.max(curFar, i + nums[i]);

	            // If we finish the starting range of this jump,
	            // Move on to the starting range of the next jump.
	            if (i == curEnd) {
	                answer++;
	                curEnd = curFar;
	            }
	        }
	        
	        return answer;
	    }
	
}
