package googleeet.medium;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringPermutationTest {
	
	StringPermutation stringPermutation;
	
	@BeforeEach
	void setUp() {
		stringPermutation = new StringPermutation();
	}
	
	

	@Test
	void example() {
		assertTrue(stringPermutation.checkInclusion("ab", "eidbaooo"));
		assertFalse(stringPermutation.checkInclusion("ab", "eidboaoo"));
	}
	
	@Test
	void sampl77() {
		assertTrue(stringPermutation.checkInclusion("adc", "dcda"));
		assertTrue(stringPermutation.checkInclusion("rvwrk", "lznomzggwrvrkxecjaq"));
	}
	
	@Test
	void sample81() {
		assertFalse(stringPermutation.checkInclusion("hello", "ooolleoooleh"));
	}

}
