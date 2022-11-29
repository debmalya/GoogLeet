package daily;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ArithmeticSlicesTest {

	ArithmeticSlices arithmaticSlices = new ArithmeticSlices();

	@Test
	void testNumberOfArithmeticSlices() {
		assertEquals(7, arithmaticSlices.numberOfArithmeticSlices(new int[] { 2, 4, 6, 8, 10 }));
		assertEquals(16, arithmaticSlices.numberOfArithmeticSlices(new int[] { 7, 7, 7, 7, 7 }));
	}

}
