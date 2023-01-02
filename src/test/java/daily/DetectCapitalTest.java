package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DetectCapitalTest {

	DetectCapital detectCapital = new DetectCapital();

	@Test
	void allCapital() {
		assertTrue(detectCapital.detectCapitalUse("CODE"));
	}
	
	@Test
	void allSmall() {
		assertTrue(detectCapital.detectCapitalUse("code"));
	}
	
	@Test
	void allFirstCapital() {
		assertTrue(detectCapital.detectCapitalUse("Code"));
	}
	
	@Test
	void nonCapital() {
		assertFalse(detectCapital.detectCapitalUse("cOde"));
		assertFalse(detectCapital.detectCapitalUse("codE"));
	}

}
