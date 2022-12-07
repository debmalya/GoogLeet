package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JobSchedulingMaxProfit {

	/**
	 * We have n jobs, where every job is scheduled to be done from startTime[i] to
	 * endTime[i], obtaining a profit of profit[i].
	 * 
	 * You're given the startTime, endTime and profit arrays, return the maximum
	 * profit you can take such that there are no two jobs in the subset with
	 * overlapping time range.
	 * 
	 * If you choose a job that ends at time X you will be able to start another job
	 * that starts at time X.
	 * 
	 * @param startTime
	 * @param endTime
	 * @param profit
	 * @return
	 */
	// maximum number of jobs are 50000

	int[] memo = new int[50001];

	private int findNextJob(int[] startTime, int lastEndingTime) {
		int start = 0, end = startTime.length - 1, nextIndex = startTime.length;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (startTime[mid] >= lastEndingTime) {
				nextIndex = mid;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return nextIndex;
	}

	private int findMaxProfit(List<List<Integer>> jobs, int[] startTime, int n, int position) {
		// 0 profit if we have already iterated over all the jobs
		if (position == n) {
			return 0;
		}

		// return result directly if it's calculated
		if (memo[position] != -1) {
			return memo[position];
		}

		// nextIndex is the index of next non-conflicting job
		int nextIndex = findNextJob(startTime, jobs.get(position).get(1));

		// find the maximum profit of our two options: skipping or scheduling the
		// current job
		int maxProfit = Math.max(findMaxProfit(jobs, startTime, n, position + 1),
				jobs.get(position).get(2) + findMaxProfit(jobs, startTime, n, nextIndex));

		// return maximum profit and also store it for future reference (memoization)
		return memo[position] = maxProfit;
	}

	public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
		List<List<Integer>> jobs = new ArrayList<>();

		// marking all values to -1 so that we can differentiate
		// if we have already calculated the answer or not
		Arrays.fill(memo, -1);

		// storing job's details into one list
		// this will help in sorting the jobs while maintaining the other parameters
		int length = profit.length;
		for (int i = 0; i < length; i++) {
			ArrayList<Integer> currJob = new ArrayList<>();
			currJob.add(startTime[i]);
			currJob.add(endTime[i]);
			currJob.add(profit[i]);
			jobs.add(currJob);
		}
		jobs.sort(Comparator.comparingInt(a -> a.get(0)));

		// binary search will be used in startTime so store it as separate list
		for (int i = 0; i < length; i++) {
			startTime[i] = jobs.get(i).get(0);
		}

		return findMaxProfit(jobs, startTime, length, 0);
	}

}
