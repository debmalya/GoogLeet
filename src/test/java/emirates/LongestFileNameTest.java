package emirates;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import real.LongestFileName;

class LongestFileNameTest {

	LongestFileName longestFileName = new LongestFileName();

	@Test
	void testLengthLongestPath() {
		assertEquals(20, longestFileName.lengthLongestPath(
				"dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext"));
		assertEquals(32, longestFileName.lengthLongestPath(
				"dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"));
	}

}
