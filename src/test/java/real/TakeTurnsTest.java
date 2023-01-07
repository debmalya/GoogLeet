package real;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TakeTurnsTest {
	TakeTurns takeTurns = new TakeTurns();

	@Test
	void first() {
		assertTrue(takeTurns.divisorGame(2));
	}

	@Test
	void three() {
		assertFalse(takeTurns.divisorGame(3));
	}

	@Test
	void four() {
		assertTrue(takeTurns.divisorGame(4));
	}

}
