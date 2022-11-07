package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SixtyNineTest {

	SixtyNine sixtyNine = new SixtyNine();

	@Test
	void testMaximum69Number() {
		assertEquals(9, sixtyNine.maximum69Number(6));
		assertEquals(96, sixtyNine.maximum69Number(66));
		assertEquals(99, sixtyNine.maximum69Number(96));
		assertEquals(99, sixtyNine.maximum69Number(99));
		assertEquals(966, sixtyNine.maximum69Number(666));
		assertEquals(996, sixtyNine.maximum69Number(966));
		assertEquals(999, sixtyNine.maximum69Number(969));
		assertEquals(999, sixtyNine.maximum69Number(996));
		assertEquals(9969, sixtyNine.maximum69Number(9669));
		assertEquals(9999, sixtyNine.maximum69Number(9999));
		assertEquals(9999, sixtyNine.maximum69Number(9996));
	}

}
