package googleeet.other;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseIntegerTest {

	ReverseInteger reverseInteger = new ReverseInteger();

	@Test
	void testReverse() {
		assertEquals(0, reverseInteger.reverse(Integer.MAX_VALUE));
		assertEquals(321, reverseInteger.reverse(123));
		assertEquals(-321, reverseInteger.reverse(-123));
		assertEquals(21, reverseInteger.reverse(120));
		assertEquals(201, reverseInteger.reverse(102));
		assertEquals(0, reverseInteger.reverse(1534236469));
	}

}
