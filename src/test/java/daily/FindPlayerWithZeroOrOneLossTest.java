package daily;

import java.util.List;

import org.junit.jupiter.api.Test;

class FindPlayerWithZeroOrOneLossTest {
	FindPlayerWithZeroOrOneLoss findPlayerWithZeroOrOneLoss = new FindPlayerWithZeroOrOneLoss();

	@Test
	void testFindWinners() {
		List<List<Integer>> result = findPlayerWithZeroOrOneLoss.findWinners(new int[][] { { 1, 3 }, { 2, 3 }, { 3, 6 },
				{ 5, 6 }, { 5, 7 }, { 4, 5 }, { 4, 8 }, { 4, 9 }, { 10, 4 }, { 10, 9 } });
		System.out.println(result);
	}

}
