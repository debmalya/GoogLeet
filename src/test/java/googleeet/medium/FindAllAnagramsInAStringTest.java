package googleeet.medium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

class FindAllAnagramsInAStringTest {

	FindAllAnagramsInAString findAllAnagramsInAString = new FindAllAnagramsInAString();

	@Test
	void sample1() {
		List<Integer> actual = findAllAnagramsInAString.findAnagrams("cbaebabacd", "abc");
		assertAll(() -> assertEquals(2, actual.size()), () -> assertEquals(0, (int) actual.get(0)),
				() -> assertEquals(6, (int) actual.get(1)));
	}

	@Test
	void sample2() {
		List<Integer> actual = findAllAnagramsInAString.findAnagrams("abab", "ab");
		assertAll(() -> assertEquals(3, actual.size()), () -> assertEquals(0, (int) actual.get(0)),
				() -> assertEquals(1, (int) actual.get(1)), () -> assertEquals(2, (int) actual.get(2)));
	}

}
