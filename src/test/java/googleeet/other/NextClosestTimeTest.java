package googleeet.other;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class NextClosestTimeTest {

	NextClosestTime nextClosestTime = new NextClosestTime();

	@Test
	void testNextClosestTime() {
		assertEquals("19:39", nextClosestTime.nextClosestTime("19:34"));
		assertEquals("22:22", nextClosestTime.nextClosestTime("23:59"));
		assertEquals("00:10", nextClosestTime.nextClosestTime("00:01"));
		assertEquals("00:11", nextClosestTime.nextClosestTime("00:10"));
		assertEquals("01:01", nextClosestTime.nextClosestTime("01:00"));
	}

}
