package googleeet.medium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class PalindromePartitioningTest {

	PalindromePartitioning palindromePartitioning = new PalindromePartitioning();

	@Test
	void testPartition() {
		List<List<String>> actual = palindromePartitioning.partition("aab");
		assertEquals(2, actual.size());
//		assertThat(actual.size()).isEqualTo(2);
	}

	@Test
	void moreThanOnCharacter() {
		List<String> actual = palindromePartitioning.moreThanOneCharacter("aab", 1);
		assertAll(() -> assertEquals(2, actual.size()), () -> assertEquals("aa", actual.get(0)),
				() -> assertEquals("b", actual.get(1)));
	}

	@Test
	void palindromeString() {
		List<List<String>> actual = palindromePartitioning.partition("aabaab");
		System.out.println(actual);
		assertEquals(8, actual.size());
	}
}
