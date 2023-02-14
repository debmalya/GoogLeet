package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CountOddNumbersTest {

	CountOddNumbers countOddNumbers = new CountOddNumbers();

	@Test
	void oddOdd() {
		assertEquals(3, countOddNumbers.countOdds(3, 7));
	}

	@Test
	void oddEven() {
		assertEquals(3, countOddNumbers.countOdds(3, 8));
	}

	@Test
	void evenEven() {
		assertEquals(1, countOddNumbers.countOdds(8, 10));
	}

	@Test
	void evenOdd() {
		assertEquals(2, countOddNumbers.countOdds(8, 11));
	}

	@Test
	void maxRange() {
		assertEquals(500000000, countOddNumbers.countOdds(0, 1000000000));
	}

}
