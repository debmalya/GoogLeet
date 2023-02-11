package hackerrank.interview.prep;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeConversionTest {
	
	

	@Test
	void testTimeConversion() {
		assertEquals("00:00:00",TimeConversion.timeConversion("00:00:00AM"));
		assertEquals("00:00:00",TimeConversion.timeConversion("12:00:00AM"));
		assertEquals("00:00:01",TimeConversion.timeConversion("12:00:01AM"));
		assertEquals("00:00:01",TimeConversion.timeConversion("12:00:01AM"));
		assertEquals("01:00:00",TimeConversion.timeConversion("01:00:00AM"));
		assertEquals("12:00:00",TimeConversion.timeConversion("12:00:00PM"));
		assertEquals("12:00:01",TimeConversion.timeConversion("12:00:01PM"));
		assertEquals("13:00:00",TimeConversion.timeConversion("01:00:00PM"));
		assertEquals("19:05:45",TimeConversion.timeConversion("07:05:45PM"));
		assertEquals("23:59:59",TimeConversion.timeConversion("11:59:59PM"));
	}

}
