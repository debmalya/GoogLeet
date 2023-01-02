package googleet.hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UniquePathsTest {

	UniquePaths uniquePaths = new UniquePaths();

	@Test
	void testUniquePathsIII() {
		assertEquals(2, uniquePaths.uniquePathsIII(new int[][] { { 1, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 2, -1 } }));
	}

}
