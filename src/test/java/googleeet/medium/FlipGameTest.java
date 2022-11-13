package googleeet.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FlipGameTest {
	FlipGame flipGame = new FlipGame();

	@Test
	void testCanWin() {
		assertTrue(flipGame.canWin("++++"));
		assertTrue(flipGame.canWin("++"));
		assertTrue(flipGame.canWin("+++"));
		assertFalse(flipGame.canWin("+"));
		assertFalse(flipGame.canWin("--"));
		assertFalse(flipGame.canWin("-+-"));
		assertFalse(flipGame.canWin("-+-+"));
		assertFalse(flipGame.canWin("-+"));
		assertFalse(flipGame.canWin("+++++"));
	}

}
