package googleet.process;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FruitIntoBasketsTest {

	FruitIntoBaskets fruitIntoBaskets = new FruitIntoBaskets();

	@Test
	void testTotalFruit() {
		assertEquals(6, fruitIntoBaskets.totalFruit(new int[] { 1, 2, 3, 2, 2, 4, 4, 4, 4 }));
		assertEquals(3, fruitIntoBaskets.totalFruit(new int[] { 1, 1, 1 }));
		assertEquals(3, fruitIntoBaskets.totalFruit(new int[] { 1, 2, 1 }));
		assertEquals(3, fruitIntoBaskets.totalFruit(new int[] { 0, 1, 2, 2 }));
		assertEquals(3, fruitIntoBaskets.totalFruit(new int[] { 1, 2, 3, 4, 4 }));
		assertEquals(3, fruitIntoBaskets.totalFruit(new int[] { 1, 4, 3, 2, 2 }));
		assertEquals(4, fruitIntoBaskets.totalFruit(new int[] { 1, 2, 3, 2, 2 }));
	}

}
