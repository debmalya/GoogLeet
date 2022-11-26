package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UglyNumberTest {

	@Test
	void testIsUgly() {
		assertTrue(UglyNumber.isUgly(6));
		assertTrue(UglyNumber.isUgly(1));
		assertFalse(UglyNumber.isUgly(14));
		assertFalse(UglyNumber.isUgly(-2147483648));
	}

}
