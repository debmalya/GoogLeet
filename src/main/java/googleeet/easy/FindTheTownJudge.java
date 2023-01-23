package googleeet.easy;

public class FindTheTownJudge {

	/**
	 * In a town, there are n people labeled from 1 to n. There is a rumor that one
	 * of these people is secretly the town judge.
	 * 
	 * If the town judge exists, then:
	 * 
	 * The town judge trusts nobody. Everybody (except for the town judge) trusts
	 * the town judge. There is exactly one person that satisfies properties 1 and
	 * 2. You are given an array trust where trust[i] = [ai, bi] representing that
	 * the person labeled ai trusts the person labeled bi.
	 * 
	 * Return the label of the town judge if the town judge exists and can be
	 * identified, or return -1 otherwise.
	 * 
	 * @param n
	 * @param trust
	 * @return
	 */
	public int findJudge(int n, int[][] trust) {
		boolean[] trusty = new boolean[n];
		int[] trusted = new int[n];
		int judgeIndex = -1;
		for (int i = 0; i < trust.length; i++) {
			trusty[trust[i][0] - 1] = true;
			trusted[trust[i][1] - 1]++;
		}

		for (int i = 0; i < n; i++) {
			if (!trusty[i] && trusted[i] == n - 1) {
				judgeIndex = i + 1;
			}
		}
		return judgeIndex;
	}

}
