package daily;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class IfPathExistsTest {
	IfPathExists ifPathExists = new IfPathExists();

	@Test
	void testValidPath() {
		assertTrue(ifPathExists.validPath(3, new int[][] { { 0, 1 }, { 1, 2 }, { 2, 0 } }, 0, 2));
		assertFalse(ifPathExists.validPath(6, new int[][] { { 0, 1 }, { 0, 2 }, { 3, 5 }, { 5, 4 }, { 4, 3 } }, 0, 5));
	}

	@Test
	void testIndirectPath() {
		assertTrue(ifPathExists.validPath(5, new int[][] { { 0, 1 }, { 0, 2 }, { 2, 3 }, { 3, 4 } }, 1, 3));
	}

}
