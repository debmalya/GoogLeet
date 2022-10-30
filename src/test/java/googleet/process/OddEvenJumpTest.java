package googleet.process;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OddEvenJumpTest {
	OddEvenJump oddEvenJump = new OddEvenJump();

	@Test
	void testOddEvenJumps() {
		int[] arr = new int[] { 10, 13, 12, 14, 15 };
		assertEquals(2, oddEvenJump.oddEvenJumps(arr));

		arr = new int[] { 2, 3, 1, 1, 4 };
		assertEquals(3, oddEvenJump.oddEvenJumps(arr));

		arr = new int[] { 5, 1, 3, 4, 2 };
		assertEquals(3, oddEvenJump.oddEvenJumps(arr));
	}

	@Test
	void testOddEvenJumpsOwn() {
		int[] arr = new int[] { 10, 13, 12, 14, 15 };
		assertEquals(2, oddEvenJump.oddEvenJumpsOwn(arr));

		arr = new int[] { 2, 3, 1, 1, 4 };
		assertEquals(3, oddEvenJump.oddEvenJumpsOwn(arr));

		arr = new int[] { 5, 1, 3, 4, 2 };
		assertEquals(3, oddEvenJump.oddEvenJumpsOwn(arr));
	}

}
