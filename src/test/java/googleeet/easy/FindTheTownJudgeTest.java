package googleeet.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindTheTownJudgeTest {

	FindTheTownJudge findTheTownJudge = new FindTheTownJudge();

	@Test
	void testFindJudge() {
		assertEquals(2, findTheTownJudge.findJudge(2, new int[][] { { 1, 2 } }));
		assertEquals(3, findTheTownJudge.findJudge(3, new int[][] { { 1, 3 }, { 2, 3 } }));

	}

	void everyBodyTrustsSomeOne() {
		assertEquals(-1, findTheTownJudge.findJudge(3, new int[][] { { 1, 3 }, { 2, 3 }, { 3, 1 } }));
	}

	void notTrustedByAll() {
		assertEquals(-1, findTheTownJudge.findJudge(3, new int[][] { { 1, 2 }, { 2, 3 } }));
	}

}
