package daily;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class JumpGameTest {
	JumpGame jumpGame = new JumpGame();

	@Test
	void yesCanJump() {
		assertTrue(jumpGame.canJump(new int[] { 2, 3, 1, 1, 4 }));
		assertTrue(jumpGame.canJump(new int[] { 2, 0, 0 }));
		assertTrue(jumpGame.canJump(new int[] { 1, 1, 1 }));
		assertTrue(jumpGame.canJump(new int[] { 2, 5, 0, 0 }));
	}

	@Test
	void noCanNotJump() {
		assertFalse(jumpGame.canJump(new int[] { 3, 2, 1, 0, 4 }));
		assertFalse(jumpGame.canJump(new int[] { 1, 0, 0 }));
	}

	@Test
	void stressTest() {
		int[] arr = new int[10000];
		Arrays.fill(arr, 100000);
		assertTrue(jumpGame.canJump(arr));
	}

	@Test
	void stressTestOne() {
		int[] arr = new int[10000];
		Arrays.fill(arr, 1);
		assertTrue(jumpGame.canJump(arr));
	}

	@Test
	void stressTestZero() {
		int[] arr = new int[10000];
		Arrays.fill(arr, 0);
		assertFalse(jumpGame.canJump(arr));
	}

}
