package googleeet.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumFuelCost2Report2CapitalTest {

	MinimumFuelCost2Report2Capital minimumFuelCost2Report2Capital = new MinimumFuelCost2Report2Capital();

	@Test
	void example1() {
		assertEquals(3,
				minimumFuelCost2Report2Capital.minimumFuelCost(new int[][] { { 0, 1 }, { 0, 2 }, { 0, 3 } }, 5));
	}

	@Test
	void ownExample1() {
		assertEquals(3,
				minimumFuelCost2Report2Capital.minimumFuelCost(new int[][] { { 0, 1 }, { 0, 2 }, { 0, 3 } }, 1));
	}

	@Test
	void example2() {
		assertEquals(7, minimumFuelCost2Report2Capital
				.minimumFuelCost(new int[][] { { 3, 1 }, { 3, 2 }, { 1, 0 }, { 0, 4 }, { 0, 5 }, { 4, 6 } }, 2));
	}

	@Test
	void ownExample2() {
		assertEquals(6, minimumFuelCost2Report2Capital
				.minimumFuelCost(new int[][] { { 3, 1 }, { 3, 2 }, { 1, 0 }, { 0, 4 }, { 0, 5 }, { 4, 6 } }, 3));
	}

	@Test
	void example3() {
		assertEquals(0, minimumFuelCost2Report2Capital.minimumFuelCost(new int[][] {}, 1));
	}

}
