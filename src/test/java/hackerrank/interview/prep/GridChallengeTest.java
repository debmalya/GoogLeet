package hackerrank.interview.prep;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class GridChallengeTest {

	@Test
	void yes() {
		assertEquals("YES", GridChallenge.gridChallenge(Arrays.asList(new String[] { "abc", "ade", "efg" })));
		assertEquals("YES", GridChallenge.gridChallenge(Arrays.asList(new String[] { "abc", "lmp", "qrt" })));
		assertEquals("YES", GridChallenge
				.gridChallenge(Arrays.asList(new String[] { "ebacd", "fghij", "olmkn", "trpqs", "xywuv" })));

		assertEquals("YES", GridChallenge.gridChallenge(Arrays.asList(new String[] { "abc", "hjk", "mpq", "rtv" })));
	}

	@Test
	void no() {
		assertEquals("NO", GridChallenge.gridChallenge(Arrays.asList(new String[] { "mpxz", "abcd", "wlmf" })));
	}

}
