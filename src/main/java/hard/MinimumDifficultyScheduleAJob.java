package hard;

public class MinimumDifficultyScheduleAJob {
    /**
     * You want to schedule a list of jobs in d days.
     * Jobs are dependent (i.e. To work on the ith job, you have to finish all the jobs j where 0 <= j < i).
     * <p>
     * You have to finish at least one task every day.
     * The difficulty of a job schedule is the sum of difficulties of each day of the d days.
     * The difficulty of a day is the maximum difficulty of a job done on that day.
     * <p>
     * You are given an integer array jobDifficulty and an integer d. The difficulty of the ith job is jobDifficulty[i].
     *
     * @param jobDifficulty integer array of job difficulty.
     * @param d             integer day.
     * @return the minimum difficulty of a job schedule. If you cannot find a schedule for the jobs return -1.
     * <p>
     * Constraints:
     * <p>
     * 1 <= jobDifficulty.length <= 300
     * 0 <= jobDifficulty[i] <= 1000
     * 1 <= d <= 10
     */
    public int minDifficulty(int[] jobDifficulty, int d) {
        if (jobDifficulty.length < d) {
            return -1;
        }
        int len = jobDifficulty.length;
        int sum = 0;
        for (int i = 0; i < jobDifficulty.length; i++) {
            sum += jobDifficulty[i];
        }
        if (sum == 0) {
            return 0;
        }
        int[][] memo = new int[d + 1][len];
        helper(jobDifficulty, d, 0, memo);

        return memo[d][0];
    }

    private void helper(int[] jd, int daysLeft, int idx, int[][] memo) {
        int len = jd.length;
        if (memo[daysLeft][idx] != 0) {
            return;
        }
        if (daysLeft == 1) {
            int num = 0;
            for (int i = idx; i < len; i++) {
                num = Math.max(num, jd[i]);
            }
            memo[daysLeft][idx] = num;
            return;
        }
        int max = jd[idx];
        daysLeft--;
        int stop = len - idx - daysLeft + 1;

        int res = Integer.MAX_VALUE;
        for (int i = 1; i < stop; i++) {
            max = Math.max(max, jd[idx + i - 1]);
            int other = memo[daysLeft][idx + i];
            if (other == 0) {
                helper(jd, daysLeft, idx + i, memo);
                other = memo[daysLeft][idx + i];
            }
            res = Math.min(res, other + max);
        }
        memo[daysLeft + 1][idx] = res;
    }

    public int minDifficulty1(int[] jobDifficulty, int d) {
        if (d <= jobDifficulty.length) {
            int n = jobDifficulty.length;
            int total = 0;
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int maxIndex = -1;
            int index = 0;
            for (; index < jobDifficulty.length; index++) {
                if (jobDifficulty[index] > max) {
                    max = jobDifficulty[index];
                    maxIndex = index;
                }
                if (jobDifficulty[n - index - 1] < min) {
                    min = jobDifficulty[n - index - 1];
                }
            }

            total += jobDifficulty[maxIndex];
            d--;
            index = n - 1;
            while (d > 0) {
                if (index != maxIndex) {
                    total += jobDifficulty[index];
                    d--;
                }
                index--;
            }
            return total;
        }
        return -1;
    }


    public int minDifficulty0(int[] jobDifficulty, int d) {
        int totalDifficulty = 0;
        int noOfJobs = jobDifficulty.length;
        if (d <= jobDifficulty.length) {
            int max = jobDifficulty[0];
            int index = 0;
            while (d > 0) {
                while (jobDifficulty[index] <= max && noOfJobs - index > d) {
                    index++;
                }
                d--;
                totalDifficulty += max;
                if (index < noOfJobs - 1) {
                    max = jobDifficulty[++index];
                }
            }
            return totalDifficulty;
        }
        return -1;
    }
}
