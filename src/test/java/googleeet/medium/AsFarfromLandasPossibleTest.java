package googleeet.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AsFarfromLandasPossibleTest {

	AsFarfromLandasPossible asFarfromLandasPossible = new AsFarfromLandasPossible();

	@Test
	void testMaxDistance() {
		assertEquals(2, asFarfromLandasPossible.maxDistance(new int[][] { { 1, 0, 1 }, { 0, 0, 0 }, { 1, 0, 1 } }));
		assertEquals(4, asFarfromLandasPossible.maxDistance(new int[][] { { 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }));
		assertEquals(-1, asFarfromLandasPossible.maxDistance(new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }));
		
	}
	
	@Test
	void testMaxDistance0() {
		assertEquals(2, asFarfromLandasPossible.maxDistance0(new int[][] { { 1, 0, 1 }, { 0, 0, 0 }, { 1, 0, 1 } }));
		assertEquals(4, asFarfromLandasPossible.maxDistance0(new int[][] { { 1, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }));
		assertEquals(-1, asFarfromLandasPossible.maxDistance0(new int[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } }));
		
	}


}
