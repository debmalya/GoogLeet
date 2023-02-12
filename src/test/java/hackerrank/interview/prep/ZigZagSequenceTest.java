package hackerrank.interview.prep;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ZigZagSequenceTest {

	@Test
	void testFindZigZagSequence() {
		// TODO: check result from the system output
		int[] expected = new int[] { 1, 2, 3, 7, 6, 5, 4 };
		int[] actual = ZigZagSequence.findZigZagSequence(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 7);
		assertArrayEquals(expected, actual);
	}

}
