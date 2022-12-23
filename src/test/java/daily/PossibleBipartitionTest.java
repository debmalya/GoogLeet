package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PossibleBipartitionTest {
	PossibleBipartition possibleBipartition = new PossibleBipartition();

	@Test
	void possibleBipartition() {
		int[][] arr = new int[][] { { 1, 2 }, { 1, 3 }, { 2, 4 } };
		assertTrue(possibleBipartition.possibleBipartition(4, arr));
	}

	@Test
	void impossibleBipartition() {
		int[][] arr = new int[][] { { 1, 2 }, { 1, 3 }, { 2, 3 } };
		assertFalse(possibleBipartition.possibleBipartition(4, arr));

	}

}
